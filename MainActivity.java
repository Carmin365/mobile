package com.carmin.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements
View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button olamundo = new Button(this);
        olamundo.setText("EAD Pernambuco! :)");
        olamundo.setOnClickListener(this);
        setContentView(olamundo);
    }

        public void onClick(View v) {
            Intent tela2 = new Intent(this, SegundaTela.class);
            startActivity(tela2);
        }

        public void onRestart() {
            super.onRestart();
            Log.i(getLocalClassName(), "onRestart()");
        }
        @Override
        protected void onResume() {
            super.onResume();
            Log.i(getLocalClassName(), "onResume()");
        }
        @Override
        protected void onPause() {
            super.onPause();
            Log.i(getLocalClassName(), "onPause()");
        }
        @Override
        protected void onStop() {
        super.onStop();
        Log.i(getLocalClassName(), "onStop()");
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.i(getLocalClassName(), "onDestroy()");
        }

    }
}