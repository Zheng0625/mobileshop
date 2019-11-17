package com.zyb.mobileshop.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix = "pageindex")//使用yml文件里的pageSize初始值
public class Page implements Serializable {
    private int current;//第几页
    private int pageSize;//一页几条

    //sql中用#{begin}获取
    public int getBegin() {
        int begin = (current - 1) * pageSize;
        return begin;
    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", pageSize=" + pageSize +
                '}';
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
