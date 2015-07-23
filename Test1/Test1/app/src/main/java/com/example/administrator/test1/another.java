package com.example.administrator.test1;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class another extends Activity {
    public static int RESULT_CODE_LIST = 1001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Button aa = (Button)findViewById(R.id.aa);
        Button bb = (Button)findViewById(R.id.bb);
        Button cc = (Button)findViewById(R.id.cc);


        aa.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getBaseContext(), ListView.class);
                startActivityForResult(intent ,RESULT_CODE_LIST);

                setResult(1);
                finish();
            }

        });

        bb.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                setResult(2);
                finish();
            }

        });

        cc.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                setResult(3);
                finish();
            }

        });
    }
}
