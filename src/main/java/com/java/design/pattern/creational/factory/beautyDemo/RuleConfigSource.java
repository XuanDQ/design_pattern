package com.java.design.pattern.creational.factory.beautyDemo;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/18
 * ruleConfigFilePath:文件名，形如 rule.json
 */
public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        // 根据传入的文件获取其后缀（文件类型）
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory2.createParser(ruleConfigFilePath);
        if (parser == null){
            throw   new InvalidRuleConfigException(
                    "Rule config file format is not supported " + ruleConfigFilePath);
        }

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath){
        //.... 解析文件名获取扩展名，比如 rule.json,返回json
        return "json";
    }
}
