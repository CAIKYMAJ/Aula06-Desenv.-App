package com.example.aula06;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class TerceiraTela extends AppCompatActivity {

    private TextView data, data2;

    Button btn4;
    private DatePickerDialog.OnDateSetListener datePicker;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terceira_tela);
        data = (TextView) findViewById(R.id.data);
        data2 = (TextView) findViewById(R.id.data2);
        btn4 = (Button) findViewById(R.id.btn4);
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendario = Calendar.getInstance();
                int dia = calendario.get(Calendar.DAY_OF_MONTH);
                int mes = calendario.get(Calendar.MONTH);
                int ano = calendario.get(Calendar.YEAR);
                DatePickerDialog dialogo = new DatePickerDialog(TerceiraTela.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        datePicker, ano, mes, dia);
                dialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialogo.show();
            }
        });
        datePicker = new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month += 1;
                String texto = dayOfMonth+"/"+month+"/"+year;
                data.setText(texto);
            }
        };

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TerceiraTela.this, Calendario.class);
                startActivity(intent);
            }
        });

        Intent recebendoData = getIntent();
        String dataIntent = recebendoData.getStringExtra("data");
        data2.setText(dataIntent);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TerceiraTela.this, Calendario.class);
                startActivity(intent);
            }
        });
    }
}
