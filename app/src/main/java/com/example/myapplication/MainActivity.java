package com.example.myapplication;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import com.example.util.FileUtil;
import com.example.util.MyUtil;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {


    Button btn1 = null,btn2 = null;
    Context context = null;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 20171222);
        btn1 = (Button) findViewById(R.id.btn1);btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("wan", "START");

                MyUtil.startPickUp(MainActivity.this);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NewActivity.class);
                context.startActivity(intent);
            }
        });

    }

    String path = null;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK) {
             Uri uri = data.getData();
             if ("file".equalsIgnoreCase(uri.getScheme())) {//使用第三方应用打开
                 path = uri.getPath();
                 Toast.makeText(this, path + "11111", Toast.LENGTH_SHORT).show();
                 return;

            }

            String filePa = FileUtil.getPath(this,uri);
            Log.e("wan","获取到APK路径===》"+filePa);

            MyUtil.apkFilePath = filePa;

            MyUtil.start(this);
        }

    }
}