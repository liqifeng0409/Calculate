package com.example.calculator.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.calculator.service.StandardCalculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_standard_layout);
        StandardCalculator standard = new StandardCalculator(this);
    }

    //Menu部分
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help_item:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("这是一个帮助");
                builder.setTitle("HELP");
                builder.show();
                break;
            case R.id.exit_item:
                android.os.Process.killProcess(android.os.Process.myPid());//退出进程
                break;
            case R.id.进制转换_item:
                Intent intent = new Intent(MainActivity.this, JinZhiActivity.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    //弹出的对话框
/*    public void Talking(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(FirstArctivity.this);
        builder.setMessage("这是一个帮助");
        builder.setTitle("HELP");
        builder.show();
    }*/
}
