package com.example.valuepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.text1);
        t2=findViewById(R.id.text2);
        Bundle bundle=getIntent().getExtras();
        String fname=bundle.getString("FNAME");
        String lname=bundle.getString("LNAME");
        t1.setText(""+fname);
        t2.setText(""+lname);

    }
}
