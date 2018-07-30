package com.test.utils.loginLevel;

import java.util.List;

/**
 * @program:456
 * @description:次内
 * @author:LiuB
 * @create:2018-07-27 16:24
 */
public class ToLayuiJson_l1 {
    private String text;
    private String icon;
    private String href;
    private List<ToLayuiJson_l2> subset;

    @Override
    public String toString() {
        return "ToLayuiJson_l1{" +
                "text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", href='" + href + '\'' +
                ", subset=" + subset +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<ToLayuiJson_l2> getSubset() {
        return subset;
    }

    public void setSubset(List<ToLayuiJson_l2> subset) {
        this.subset = subset;
    }
}
