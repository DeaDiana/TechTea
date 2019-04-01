package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "prefix")
public class Properties {
    private String prop1;
    private String prop2;
    InnerProperty inner;

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public InnerProperty getInner() {
        return inner;
    }

    public void setInner(InnerProperty inner) {
        this.inner = inner;
    }
}
