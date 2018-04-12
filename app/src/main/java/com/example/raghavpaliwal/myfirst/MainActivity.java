package com.example.raghavpaliwal.myfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String MY_TAG ="The_custom_Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG,"oncreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MY_TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, "onDestroy");
    }
    public void onButtonClick(View v){
        EditText e1 =(EditText)findViewById(R.id.n1);
        EditText e2 =(EditText)findViewById(R.id.n2);
        TextView t1 =(TextView)findViewById(R.id.t1);
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int s=a+b;
        t1.setText(Integer.toString(s));
    }
    public void onMultiply(View v){
        EditText e1 =(EditText)findViewById(R.id.n1);
        EditText e2 =(EditText)findViewById(R.id.n2);
        TextView t1 =(TextView)findViewById(R.id.t1);
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int s=a*b;
        t1.setText(Integer.toString(s));
    }
    public void onMinus(View v){
        EditText e1 =(EditText)findViewById(R.id.n1);
        EditText e2 =(EditText)findViewById(R.id.n2);
        TextView t1 =(TextView)findViewById(R.id.t1);
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int s=a-b;
        t1.setText(Integer.toString(s));
    }
    public void onDivide(View v){
        EditText e1 =(EditText)findViewById(R.id.n1);
        EditText e2 =(EditText)findViewById(R.id.n2);
        TextView t1 =(TextView)findViewById(R.id.t1);
        float a=Float.parseFloat(e1.getText().toString());
        float b=Float.parseFloat(e2.getText().toString());
        float s=a/b;
        t1.setText(Float.toString(s));
    }
    public void onClear(View v){
        EditText e1 =(EditText)findViewById(R.id.n1);
        EditText e2 =(EditText)findViewById(R.id.n2);
        TextView t1 =(TextView)findViewById(R.id.t1);
        e2.setText("");
        e1.setText("");
        t1.setText("");
    }

}
