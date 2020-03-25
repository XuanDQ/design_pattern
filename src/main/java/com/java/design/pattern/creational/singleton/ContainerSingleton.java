package com.java.design.pattern.creational.singleton;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  safeXuan
 * @version 1.0 2020/3/19
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String,Object> singletonMap = new HashMap<String,Object>();
    public static void putInstance(String key,Object instance){
        // 保障 key 的合法性和唯一性
        if (StringUtils.isNotBlank(key) && instance != null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
