package com.java.design.pattern.creational.factory.beautyDemo;

/**
 * @Author safeXuan
 * @Version 1.0 2020/3/20
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
