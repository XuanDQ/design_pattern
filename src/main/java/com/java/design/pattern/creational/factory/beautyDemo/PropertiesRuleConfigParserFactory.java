package com.java.design.pattern.creational.factory.beautyDemo;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/20
 */
public class PropertiesRuleConfigParserFactory implements  IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
