package com.example.fiza1.lab2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button btn;
    EditText et11,et22;

    String name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btn=(Button)findViewById(R.id.btn);
        et11=(EditText)findViewById(R.id.et1);
        et22=(EditText)findViewById(R.id.et2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                name=et11.getText().toString();
                password=et22.getText().toString();
                if(name.equals(password))
                {

                    Toast.makeText(MainActivity.this,"Matched",Toast.LENGTH_SHORT).show();
                }
                else if(!name.equals(password)){
                    Toast.makeText(MainActivity.this,"Not Matched",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }



}
