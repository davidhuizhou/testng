package com.dzhou.testng;

/**
 * Created by huizhou on 11/28/15.
 */
public class Bean {
    private String val;
    private int i;

    public Bean(String val, int i) {
        this.val = val;
        this.i = i;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
