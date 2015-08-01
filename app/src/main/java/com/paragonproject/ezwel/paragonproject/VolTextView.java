package com.paragonproject.ezwel.paragonproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by areum on 2015-08-01.
 */
public class VolTextView extends LinearLayout {
    private ImageView icon;
    private TextView tx;
    private TextView tx2;
    private TextView tx3;
    private TextView title;

    public VolTextView(Context context, VolListItem vItem) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.vollistitem_layout, this, true);

        icon = (ImageView) findViewById(R.id.iconItem);
        icon.setImageDrawable(vItem.getIcon());

        title = (TextView) findViewById(R.id.volContents1);
        title.setText(vItem.getData(0));
        tx2 = (TextView) findViewById(R.id.volContents2);
        tx2.setText(vItem.getData(1));
        tx3 = (TextView) findViewById(R.id.volContents3);
        tx3.setText(vItem.getData(2));
//        title= (TextView) findViewById(R.id.title);
//        title.setText("타이틀 테스트");
    }

    public void setText(int index, String data) {
        if (index == 0) {
            tx.setText(data);
        } else if (index == 1) {
            tx2.setText(data);
        } else if (index == 2) {
            tx3.setText(data);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * set Icon
     *
     * @param icon
     */
//    public void setIcon(Drawable icon) {
//        icon.setImageDrawable(icon);
//    }

}
