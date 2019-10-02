package com.gmh.itics.tesoem.edu.p2gmhtesoem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView btnsig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsig = (TextView) findViewById(R.id.btnsiguiente);

        btnsig.setOnClickListener((View.OnClickListener) this);
    }
    public void OnClick(View v){
        Intent frm2 = new Intent(packageContext.this,Ventada2Activity.class);
        starActivity(frm2);
        finish();
    }
}
