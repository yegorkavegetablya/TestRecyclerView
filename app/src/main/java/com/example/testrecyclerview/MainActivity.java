package com.example.testrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Income> incomes = new ArrayList<Income>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.list);
        IncomeAdapter adapter = new IncomeAdapter(this, incomes);
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData() {
        incomes.add(new Income("Билл Гейтс", R.drawable.america, 86));
        incomes.add(new Income("Уоррен Баффет", R.drawable.america, 75.6));
        incomes.add(new Income("Джефф Безос", R.drawable.america, 72.8));
        incomes.add(new Income("Амансио Ортега", R.drawable.spanish, 71.3));
        incomes.add(new Income("Марк Цукерберг", R.drawable.america, 56));
    }
}