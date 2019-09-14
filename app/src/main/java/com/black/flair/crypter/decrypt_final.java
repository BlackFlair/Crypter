package com.black.flair.crypter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class decrypt_final extends AppCompatActivity {

    TextView dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt_final);

        String text="";
        int i=0;

        dis = (TextView)findViewById(R.id.tvtext);

        String result = getIntent().getExtras().getString("result");
       // long length = getIntent().getExtras().getLong("length");

//        text=text+result;
//        if(i<=length)
//            i++;
//        else
            dis.setText(result);

    }
}
