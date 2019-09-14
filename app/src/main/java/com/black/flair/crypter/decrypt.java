package com.black.flair.crypter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class decrypt extends AppCompatActivity {

    EditText decode,entext;
    Button btndec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt);

        decode = (EditText)findViewById(R.id.etcode);
        entext = (EditText)findViewById(R.id.editText2);
        btndec = (Button)findViewById(R.id.btndec2);

        char character;
        String result="";
        int ascii,res;


        String text = entext.getText().toString();
        long l = text.length();

        Intent x = new Intent(decrypt.this,decrypt_final.class);

        int code = decode.getText().toString().charAt(3);
        //x.putExtra("length",l);

        for(int i=0;i<l;i++){

            character = text.charAt(i);
            ascii = (int)character;
            res=ascii-code;
            result=result+(char)res;
            x.putExtra("result",result);

        }

        startActivity(x);

    }
}
