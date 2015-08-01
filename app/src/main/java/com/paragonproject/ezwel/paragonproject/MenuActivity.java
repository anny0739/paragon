package com.paragonproject.ezwel.paragonproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by areum on 2015-08-01.
 */
public class MenuActivity extends Activity{
    public static int RESULT_CODE_MENU = 1001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        Button infoVol = (Button)findViewById(R.id.infoVol);
        Button listVol = (Button)findViewById(R.id.listVol);
        Button myVol = (Button)findViewById(R.id.myVol);

        infoVol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), VolScheduleListActivity.class);
                startActivity(intent);
            }
        });
    }
}
