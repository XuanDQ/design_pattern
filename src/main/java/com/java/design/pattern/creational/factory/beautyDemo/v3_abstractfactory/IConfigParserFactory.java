package com.java.design.pattern.creational.factory.beautyDemo.v3_abstractfactory;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/20
 */
public interface IConfigParserFactory {
    RuleConfigParser createRuleParser();
    SystemConfigParser createSystemParser();
}
