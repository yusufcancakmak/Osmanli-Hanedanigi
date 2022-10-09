package com.yusufcancakmak.javatekrarprojesi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView rv;
private ArrayList<Padisahlar> padisahlarArrayList;
private Veritabani vt;
private PadiAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rv);
        veritabaniKopyala();
        vt=new Veritabani(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        padisahlarArrayList =new PadiDao().tumpadisahlar(vt);
        adapter= new PadiAdapter(this,padisahlarArrayList);
        rv.setAdapter(adapter);


    }
    public void veritabaniKopyala(){
        DatabaseCopyHelper db =new DatabaseCopyHelper(this);
        try {
            db.createDataBase();
        }catch (IOException e){
            e.printStackTrace();
        }
        db.openDataBase();
    }
}