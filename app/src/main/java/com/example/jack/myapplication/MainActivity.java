package com.example.jack.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Context cxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cxt = this;
        setContentView(R.layout.activity_main);
        /*如果是网络请求   把进度框封装到网络请求里面     仅测试写法*/
        ImageDigPrg mImageDigPrg = new ImageDigPrg(cxt);

    }
}
