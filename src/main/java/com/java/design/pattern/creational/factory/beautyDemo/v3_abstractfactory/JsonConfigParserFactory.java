package com.java.design.pattern.creational.factory.beautyDemo.v3_abstractfactory;


/**
 * @author safeXuan
 * @version 1.0
 * description：
 * @date 2020/3/25 5:26 PM
 */
public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
