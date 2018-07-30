package com.test.utils.loginLevel;

/**
 * @program:456
 * @description:最内
 * @author:LiuB
 * @create:2018-07-27 16:23
 */
public class ToLayuiJson_l2 {
    private String text;
    private String icon;
    private String href;
    private Boolean target;

    @Override
    public String toString() {
        return "ToLayuiJson_l2{" +
                "text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", href='" + href + '\'' +
                ", target=" + target +
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

    public Boolean getTarget() {
        return target;
    }

    public void setTarget(Boolean target) {
        this.target = target;
    }
}
