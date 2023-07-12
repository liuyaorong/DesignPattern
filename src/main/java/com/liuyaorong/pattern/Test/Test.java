package com.liuyaorong.pattern.Test;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.AviatorEvaluatorInstance;

import java.util.Map;

/**
 * Created by liuyaorong on 2023/6/24
 */
public class Test {
    // 表达式引擎实例
    public static AviatorEvaluatorInstance instance = AviatorEvaluator.newInstance();

    /**
     * 表达式操作(非cache模式易造成AviatorClassLoader类加载器及Express匿名类不断生成, 引发FullGC)
     * @param eleMap 需要替换的表达式参数
     * @param expression 表达式
     * @return 结果
     */
    public static Object process(Map<String, Object> eleMap, String expression) {
        // 计算表达式结果
        return instance.compile(expression).execute(eleMap);
    }

    /**
     * 表达式操作(cache模式)
     * @param cacheKey 缓存key
     * @param expression 表达式
     * @param eleMap 需要替换的表达式参数
     * @return 结果
     */
    public static Object process1(String cacheKey, String expression, Map<String, Object> eleMap) {
        // 计算表达式结果
        return instance.compile(cacheKey, expression, true).execute(eleMap);
    }
}