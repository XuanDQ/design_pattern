package com.java.design.pattern.creational.factory.beautyDemo.v3_abstractfactory;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/20
 */
public class RuleConfigParser implements IConfigParserFactory {

    @Override
    public RuleConfigParser createRuleParser() {
        return new RuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new SystemConfigParser();
    }
}
