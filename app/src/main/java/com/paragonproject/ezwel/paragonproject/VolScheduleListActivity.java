package com.paragonproject.ezwel.paragonproject;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by areum on 2015-08-01.
 */
public class VolScheduleListActivity extends Activity {

    private ListView scheduleListView;
    private VolListAdapter scheduleAdapter;
    private JSONObject jsonObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        String jsonInfo = "{\"schedule\":\"2015년5월\",\"contents1\":\"교남 소망의 집\",\"statue\":\"모집중\"}";
        String[] obj = new String[3];
        try {
            jsonObj = new JSONObject(jsonInfo);
            if(jsonObj != null) {
                obj[0] = jsonObj.getString("schedule");
                obj[1] = jsonObj.getString("contents1");
                obj[2] = jsonObj.getString("statue");
            }
        }catch(Exception ex) {
            ex.printStackTrace();
        }

        scheduleAdapter = new VolListAdapter(this);

        Resources res = getResources();
        scheduleAdapter.addItem(new VolListItem(res.getDrawable(R.drawable.icon01), obj));

        scheduleListView = (ListView) findViewById(R.id.scheduleListView);
//
        scheduleListView.setAdapter(scheduleAdapter);
//
        scheduleListView.setOnItemClickListener(onClickLIstItem);
    }

    private AdapterView.OnItemClickListener onClickLIstItem = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            // 이벤트 발생 시 해당 아이템 위치의 텍스트를 출력
            VolListItem curItem = (VolListItem) scheduleAdapter.getItem(position);
            String[] curData = curItem.getData();

            Toast.makeText(getApplicationContext(), "selected : " + curData[0], Toast.LENGTH_LONG).show();
        }
    };

}
