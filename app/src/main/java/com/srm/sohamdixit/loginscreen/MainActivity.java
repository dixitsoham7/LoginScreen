package com.srm.sohamdixit.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button register,me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register=findViewById(R.id.reg);
        me=findViewById(R.id.about);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Application under Process",Toast.LENGTH_SHORT).show();
            }
        });

        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"email me at dixitinfotek@gmail.com",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
