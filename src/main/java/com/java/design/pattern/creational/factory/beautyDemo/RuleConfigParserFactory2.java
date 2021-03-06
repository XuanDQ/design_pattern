package com.java.design.pattern.creational.factory.beautyDemo;

import org.apache.commons.collections.map.HashedMap;

import java.util.Map;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/18
 */
public class RuleConfigParserFactory2 {
    private static final Map<String,IRuleConfigParser> cachedParsers = new HashedMap();

    static {
        cachedParsers.put("json",new JsonRuleConfigParser());
        cachedParsers.put("xml",new XmlRuleConfigParser());
        cachedParsers.put("yaml",new YamlRuleConfigParser());
        cachedParsers.put("properties",new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat){
        if (configFormat == null || configFormat.isEmpty()){
            return null;
        }
        IRuleConfigParser parser = cachedParsers.get(configFormat.toLowerCase());
        return parser;
    }
}
