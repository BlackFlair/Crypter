package com.black.flair.crypter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnenc,btndec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnenc= (Button)findViewById(R.id.btnenc);
        btndec= (Button)findViewById(R.id.btndec);

        btnenc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent (MainActivity.this,encrypt.class);
                startActivity(x);
            }
        });

        btndec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent (MainActivity.this,decrypt.class);
                startActivity(y);
            }
        });

    }
}
