package com.java.design.pattern.creational.factory.beautyDemo.v2_methodfactory;

import com.java.design.pattern.creational.factory.beautyDemo.*;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/20
 */
public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);

        //RuleConfigParserFactoryMap 创建工厂对象的工厂类
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null){
            throw  new InvalidRuleConfigException("Rule config file is not supported: "+ruleConfigFilePath);
        }
        IRuleConfigParser parser = parserFactory.createParser();

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        //.... 解析文件名获取扩展名，比如 rule.json,返回json
        return "json";
    }
}







