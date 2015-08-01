package com.paragonproject.ezwel.paragonproject;

import android.graphics.drawable.Drawable;

/**
 * Created by areum on 2015-08-01.
 */
public class VolListItem {

    private Drawable dayIcon;
    private String[] vData;
    private boolean selectable = true;

    public VolListItem(Drawable dayIcon, String[] obj) {
        this.dayIcon = dayIcon;
        this.vData = obj;
    }

    public VolListItem(Drawable dayIcon, String str1, String str2, String str3) {
        this.dayIcon = dayIcon;
        vData = new String[3];
        vData[0] = str1;
        vData[1] = str2;
        vData[3] = str3;
    }

    public boolean isSelectable() {return selectable;}

    public String[] getData() {return vData;}

    public String getData(int index) {
        if (vData == null || index >= vData.length) {
            return null;
        }
        return vData[index];
    }

    public Drawable getIcon() {return dayIcon;}

    public void setData(String[] obj) {vData = obj;}
    public void setIcon(Drawable dayIcon) {this.dayIcon = dayIcon;}

}
