package com.test.utils.loginLevel;

import java.util.List;

/**
 * @program:456
 * @description:给前端传的json
 * @author:LiuB
 * @create:2018-07-27 16:18
 */

public class ToLayuiJson {
    private List<ToLayuiJson_l1> data;
    @Override
    public String toString() {
        return "ToLayuiJson{" +
                "data=" + data +
                '}';
    }

    public List<ToLayuiJson_l1> getData() {
        return data;
    }

    public void setData(List<ToLayuiJson_l1> data) {
        this.data = data;
    }
}
