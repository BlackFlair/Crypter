package com.black.flair.crypter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class encrypt_final extends AppCompatActivity {

    EditText mail;
    TextView tvtext;
    Button btnmail;
    String text="";
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt_final);

        mail = (EditText)findViewById(R.id.etmail);
        tvtext=(TextView)findViewById(R.id.tvtext);
        btnmail=(Button)findViewById(R.id.btnmail);

        String result = getIntent().getExtras().getString("result");
        //long length = getIntent().getExtras().getLong("length");

//        text=text+result;
//        if(i<=length)
//            i++;
//        else
            tvtext.setText(result);

        btnmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);

                email.setData(Uri.parse("mailto:"));
                email.setType("text/plain");

                email.putExtra(Intent.EXTRA_EMAIL , new String[]{mail.getText().toString()});
                email.putExtra(Intent.EXTRA_TEXT , tvtext.toString());
            }
        });
    }

}
