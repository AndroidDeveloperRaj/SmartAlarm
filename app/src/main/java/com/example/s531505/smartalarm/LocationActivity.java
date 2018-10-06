package com.example.s531505.smartalarm;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
    }
    public void Savebtn(View v){
        Intent intent=new Intent(this,StartActivity.class);
        startActivity(intent);
    }
    public void Resetbtn(View v){
        EditText et1=findViewById(R.id.AlarmNameET);
        EditText et2=findViewById(R.id.AlarmDesET);
        EditText et3=findViewById(R.id.RadiusET);
        EditText et4=findViewById(R.id.DestET);
        et1.setText("");
        et2.setText("");
        et3.setText("");
        et4.setText("");
    }
    public void cancelbtn(View v){
        Intent intent=new Intent(this,StartActivity.class);
        startActivity(intent);
    }
    public void Searchbtn(View v){
        String data="https://www.google.com/maps";
        Intent searchIntent=new Intent(Intent.ACTION_VIEW);
        searchIntent.setData(Uri.parse(data));
        startActivity(searchIntent);
    }
}
