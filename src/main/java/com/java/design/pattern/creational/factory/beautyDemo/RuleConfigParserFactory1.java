package com.java.design.pattern.creational.factory.beautyDemo;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/18
 */
public class RuleConfigParserFactory1 {
    public static IRuleConfigParser createParser(String configFormat) throws InvalidRuleConfigException {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        } else {
            throw new InvalidRuleConfigException(
                    "Rule config file format is not supported " + configFormat);
        }
        return  parser;
    }
}
