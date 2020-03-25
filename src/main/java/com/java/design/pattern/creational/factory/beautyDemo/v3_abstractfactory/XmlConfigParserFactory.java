package com.java.design.pattern.creational.factory.beautyDemo.v3_abstractfactory;

/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/25 5:29 PM
 */
public class XmlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
