package com.example.aula06;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Calendario extends AppCompatActivity {

    private CalendarView calendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendario);
        calendarView = (CalendarView) findViewById(R.id.calendario);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String data = dayOfMonth+"/"+month+"/"+year;
                Intent intent = new Intent(Calendario.this, TerceiraTela.class);
                intent.putExtra("data",data);
                startActivity(intent);
                finish();
            }
        });
    }
}
