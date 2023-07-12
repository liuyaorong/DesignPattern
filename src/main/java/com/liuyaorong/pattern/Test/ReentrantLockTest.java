package com.liuyaorong.pattern.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by liuyaorong on 2023/6/20
 */
public class ReentrantLockTest {
    private static final int WORK_CONDITIONS = 3;
    private static int countIndex = 0;
    private static final ReentrantLock LOCK = new ReentrantLock();

    public static void main(String[] args) {
        List<Condition> conditions = new ArrayList<>();
        for (int i = 0; i < WORK_CONDITIONS; i++) {
            Condition condition = LOCK.newCondition();
            conditions.add(condition);
            Worker worker = new Worker(i, conditions);
            worker.start();
        }
    }

    static class Worker extends Thread {
        private int index;
        private List<Condition> conditions;

        public Worker(int index, List<Condition> conditions) {
            super("Thread-" + index);
            this.index = index;
            this.conditions = conditions;
        }

        // 唤醒下一个线程
        private void signalNext() {
            int nextInt = (index + 1) % conditions.size();
            conditions.get(nextInt).signal();
        }

        @Override
        public void run() {
            while (true) {
                LOCK.lock();
                try {
                    if (countIndex % 3 != index) {
                        conditions.get(index).await();
                    }
                    if (countIndex > 100) {
                        signalNext();
                        return;
                    }
                    System.out.println(this.getName() + " " + countIndex);
                    countIndex++;
                    signalNext();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    LOCK.unlock();
                }
            }
        }
    }
}
