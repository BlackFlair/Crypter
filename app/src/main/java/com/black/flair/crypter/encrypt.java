package com.black.flair.crypter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class encrypt extends AppCompatActivity {

    encrypt_final ef;

    EditText etenc,enco;
    Button btnenc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encrypt);

        etenc = (EditText)findViewById(R.id.etenc);
        btnenc = (Button)findViewById(R.id.btnenc2);
        enco=(EditText)findViewById(R.id.etcode);

        btnenc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                char character;
                String result="";
                int ascii,res;

                int code = enco.getText().toString().charAt(3);

                String text = etenc.getText().toString();
                long l = text.length();

                Intent x = new Intent(encrypt.this,encrypt_final.class);

                //x.putExtra("length",l);

                for(int i=0;i<l;i++){

                    character = text.charAt(i);
                    ascii = (int)character;
                    res=code+ascii;
                    result=(String)(result+(char)res);
                    x.putExtra("result",result);

                }


                startActivity(x);
            }
        });

    }

}
