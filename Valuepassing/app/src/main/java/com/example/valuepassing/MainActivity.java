package com.example.valuepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.edit1);
        e2=findViewById(R.id.edit2);

    }

    public void submit(View view) {
        String fname=e1.getText().toString();
        String lname=e2.getText().toString();

        if(fname.equals("")||lname.equals("")){
            Toast.makeText(this, "fill all the fills", Toast.LENGTH_SHORT).show();

        }
        else{
            Intent intent= new Intent(this,Main2Activity.class);
            intent.putExtra("FNAME",fname);
            intent.putExtra("LNAME",lname);
            startActivity(intent);

        }



    }
}
