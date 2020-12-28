package com.example.halyk_recyclerv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<GeneralInform> generalInformList = new ArrayList<>();
    MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        setInformData();

        adapter = new MyAdapter(generalInformList);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }

    private void setInformData() {
        GeneralInform generalInform = new GeneralInform("Номер договора","AUP117300416C003",R.drawable.ic_folder);
        generalInformList.add(generalInform);

        generalInform = new GeneralInform("Статус договора","Активный",R.drawable.ic_folder);
        generalInformList.add(generalInform);

        generalInform = new GeneralInform("Дата заключения","30 апреля 2016",R.drawable.ic_folder);
        generalInformList.add(generalInform);

        generalInform = new GeneralInform("Срок страхования","15 лет",R.drawable.ic_folder);
        generalInformList.add(generalInform);

        generalInform = new GeneralInform("Застрахованный","Ахметова С.К.",R.drawable.ic_folder);
        generalInformList.add(generalInform);

        generalInform = new GeneralInform("Выгодоприобретатель","Ахметова С.К.",R.drawable.ic_folder);
        generalInformList.add(generalInform);

        generalInform = new GeneralInform("Страховая премия","7 000 ₸",R.drawable.ic_folder);
        generalInformList.add(generalInform);

        generalInform = new GeneralInform("Страховая сумма","1 500 000 ₸",R.drawable.ic_folder);
        generalInformList.add(generalInform);

        generalInform = new GeneralInform("Общий долг по оплате","0 ₸",R.drawable.ic_folder);
        generalInformList.add(generalInform);


    }
}