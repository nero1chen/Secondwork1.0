package com.example.csh.secondwork10;

import java.util.Scanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button)findViewById(R.id.button_1);
        final EditText editText=(EditText)findViewById(R.id.text1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
              //  switch (v.getId()){
                 //   case R.id.button_1:
                        String text = editText.getText().toString();
                        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                        intent.putExtra("message",text);
                        startActivityForResult(intent,1);
                 //       break;
                //    default:
                //        break;
              //  }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case 1:
                if(resultCode==RESULT_OK){
                    Toast.makeText(MainActivity.this,data.getStringExtra("returnMessage"),Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }
}
