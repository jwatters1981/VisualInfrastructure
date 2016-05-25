package com.watters;

/**
 * Created by johnwatters on 28/04/2016.
 */
public class Widget {


    private String str;
    private int i;
    private int x;
    public Widget(String str, int i, int x)
    {
    this.setStr(str);
        this.setI(i);
        this.setX(x);
    }


    public String getStr() {
        return str;
    }

    private void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    private void setI(int i) {
        this.i = i;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
