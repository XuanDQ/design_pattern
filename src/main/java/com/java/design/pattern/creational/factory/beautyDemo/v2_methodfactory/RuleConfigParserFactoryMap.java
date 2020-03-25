package com.java.design.pattern.creational.factory.beautyDemo.v2_methodfactory;

import com.java.design.pattern.creational.factory.beautyDemo.*;
import org.apache.commons.collections.map.HashedMap;

import java.util.Map;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/20
 */
public  class RuleConfigParserFactoryMap {

    private static final Map<String,IRuleConfigParserFactory> cachedFactories = new HashedMap();

    static {
        cachedFactories.put("json",new JsonRuleConfigParserFactory());
        cachedFactories.put("xml",new XmlRuleConfigParserFactory());
        cachedFactories.put("yaml",new YamlRuleConfigParserFactory());
        cachedFactories.put("properties",new PropertiesRuleConfigParserFactory());
    }

    public  static IRuleConfigParserFactory getParserFactory(String type){
        if (type == null || type.isEmpty()){
            return null;
        }
        IRuleConfigParserFactory parserFactory = cachedFactories.get(type.toLowerCase());
        return parserFactory;
    }
}
