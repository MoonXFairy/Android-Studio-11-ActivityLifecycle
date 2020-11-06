package com.example.android_num_11_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "流程: onCreate");
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("MainActivity", "流程: onStart");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("MainActivity", "流程: onResume");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("MainActivity", "流程: onRestart");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("MainActivity", "流程: onPause");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("MainActivity", "流程: onStop");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("MainActivity", "流程: onDestroy");
    }

    public void click_toB(View v)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        Log.d("MainActivity", "A 頁面button : Press down");
    }
}