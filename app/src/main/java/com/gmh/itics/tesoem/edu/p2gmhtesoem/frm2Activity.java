package com.gmh.itics.tesoem.edu.p2gmhtesoem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frm2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
    }
        public void cargarpantalla(View v){
            Intent frm3 = new Intent(packageContext.this, frm3Activity.class);
            startActivity(frm3);
            finish();

    }
}
