package com.coherentsolutions.trainings.java.auto.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Config {
    private int top;
    private Sort sort;

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
