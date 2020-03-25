package com.java.design.pattern.creational.builder.beautydemo;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Xuan
 * @date 2020/3/25 9:39 AM
 * @version 1.0
 */
 class BuilderResourcePoolConfig {
    /**
     * 资源名称 必填 无默认值
     */
    private String name;

    /**
     * 最大总资源数量 非必填 8
     */
    private int maxTotal;

    /**
     * 最大空闲资源数量 非必填 8
     */
    private int maxIdle;

    /**
     * 最小空闲资源数量
     */
    private int minIdle;

    private BuilderResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

     static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 8;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFAULT_MAX_IDLE;
        private int minIdle = DEFAULT_MIN_IDLE;

        BuilderResourcePoolConfig build() {
            //校验逻辑放到这里来做，包括必填项校验，依赖关系校验，约束条件校验
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("..");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("...");
            }
            if (minIdle > maxTotal || minIdle > maxIdle) {
                throw new IllegalArgumentException("..");
            }
            return new BuilderResourcePoolConfig(this);
        }

        Builder setName(String name) {
            if (StringUtils.isBlank(name)) {
                throw new IllegalArgumentException("..");
            }
            this.name = name;
            return this;
        }

        Builder setMaxTotal(int maxTotal) {
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        Builder setMaxIdle(int maxIdle) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        Builder setMinIdle(int minIdle) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("...");
            }
            this.minIdle = minIdle;
            return this;
        }
    }
}
