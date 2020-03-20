package com.java.design.pattern.creational.factory.beautyDemo.v3_abstractfactory;

import com.java.design.pattern.creational.factory.beautyDemo.IRuleConfigParser;
import com.java.design.pattern.creational.factory.beautyDemo.RuleConfig;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/20
 */
public class SystemConfigParser implements IConfigParserFactory{

    @Override
    public RuleConfigParser createRuleParser() {
        return new RuleConfigParser();
    }

    @Override
    public SystemConfigParser createSystemParser() {
        return new SystemConfigParser();
    }
}
