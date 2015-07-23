package com.example.administrator.test1;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class MainActivity extends Activity {
    public static final int REQUEST_CODE_ANOTHER = 1001;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(getBaseContext(),another.class);
                startActivityForResult(intent,REQUEST_CODE_ANOTHER);

            }

        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent Data){
        super.onActivityResult(requestCode, resultCode, Data);

        if(resultCode==1)
        {
//            Toast toast = Toast.makeText(getBaseContext(), "봉사신청", Toast.LENGTH_SHORT);
//            toast.show();
            new AlertDialog.Builder(this).setTitle("팝업").setMessage("팝업1")
                    .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dlg, int sumthin) {
                        }
                    }).show();
        }
        if(resultCode==2)
        {
//            Toast toast = Toast.makeText(getBaseContext(), "시간확인", Toast.LENGTH_SHORT);
//            toast.show();
            new AlertDialog.Builder(this).setTitle("팝업").setMessage("팝업2")
                    .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dlg, int sumthin) {
                        }
                    }).show();
        }

        if(resultCode==3)
        {
//            Toast toast = Toast.makeText(getBaseContext(), "공지사항", Toast.LENGTH_SHORT);
//            toast.show();
            new AlertDialog.Builder(this).setTitle("팝업").setMessage("팝업3")
                    .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dlg, int sumthin) {
                        }
                    }).show();
        }
    }
}
