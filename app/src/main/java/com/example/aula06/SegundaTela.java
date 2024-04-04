package com.example.aula06;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaTela extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);
        Button btn2 = (Button) findViewById(R.id.button2);
    }
}
