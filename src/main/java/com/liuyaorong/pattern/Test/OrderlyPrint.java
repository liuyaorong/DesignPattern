package com.liuyaorong.pattern.Test;

/**
 * Created by liuyaorong on 2023/6/20
 */
public class OrderlyPrint {

    private static int i = 1;

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Print2(i)).start();
        }
    }

    static class Print implements Runnable {
        private int index;

        public Print(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            for (; ; ) {
                synchronized (Print.class) {
                    if (i > 100) {
                        return;
                    }
                    System.out.println("Thread-" + index + " " + i++);
                }
            }
        }
    }

    private static final Object LOCK = new Object();
    private static volatile int count = 0;
    private static final int MAX = 100;

    static class Print2 implements Runnable {

        private final int index;

        public Print2(int index) {
            this.index = index;
        }

        @Override
        public void run() {
            while (count < MAX) {
                synchronized (LOCK) {
                    try {
                        while (count % 3 != index) {
                            LOCK.wait();
                        }
                        if (count > MAX) {
                            return;
                        }
                        System.out.println("Thread-" + index + " " + count);
                        count++;
                        LOCK.notifyAll();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}