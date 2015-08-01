package com.paragonproject.ezwel.paragonproject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by areum on 2015-08-01.
 */
public class VolListAdapter extends BaseAdapter {

    private Context context;

    private List<VolListItem> vItems = new ArrayList<VolListItem>();

    public VolListAdapter(Context context){ this.context = context;}

    public void addItem(VolListItem vi) {vItems.add(vi);}

    public void setListItems(List<VolListItem> vItems){this.vItems = vItems;}

    public int getCount(){return vItems.size();}

    public Object getItem(int position) {return vItems.get(position);}

    public boolean areAllItemsSelectable() {return false;}

    public boolean isSelectable(int position) {
        try{
            return vItems.get(position).isSelectable();
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    public long getItemId(int position) {return position;}

    public View getView(int position, View convertView, ViewGroup parent) {
        VolTextView volView;
        if(convertView == null) {
            volView = new VolTextView(context, vItems.get(position));
        }else {
            volView = (VolTextView) convertView;

//            volView.setIcon(vItems.get(position).getIcon());
            volView.setText(0, vItems.get(position).getData(0));
            volView.setText(1, vItems.get(position).getData(1));
            volView.setText(2, vItems.get(position).getData(2));
        }
        return volView;
    }

}
