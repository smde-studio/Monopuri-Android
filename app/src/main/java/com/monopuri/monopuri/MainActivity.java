package com.monopuri.monopuri;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // リスナーの設定
        this.findViewById(R.id.buttonPopular).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.buttonPopular:
                startActivity(new Intent(getApplication(), EditActivity.class));
                break;
            default:
                    break;
        }

    }
}
