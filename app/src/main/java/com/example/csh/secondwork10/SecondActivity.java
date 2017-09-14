package com.example.csh.secondwork10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button button2 = (Button)findViewById(R.id.button_2);
        Intent intent = getIntent();
        intent.putExtra("returnMessage","SecondActivity");
        String name = intent.getStringExtra("message");
        Toast.makeText(SecondActivity.this,name,Toast.LENGTH_SHORT).show();
        final EditText editText=(EditText)findViewById(R.id.text2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent=new Intent(SecondActivity.this,MainActivity.class);
                returnIntent.putExtra("returnMessage",editText.getText().toString());
                setResult(RESULT_OK,returnIntent);
                finish();
            }
        });
    }
}
