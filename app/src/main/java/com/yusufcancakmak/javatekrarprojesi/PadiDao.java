package com.yusufcancakmak.javatekrarprojesi;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class PadiDao {

    @SuppressLint("Range")
    public ArrayList<Padisahlar> tumpadisahlar(Veritabani vt){
        ArrayList<Padisahlar> padisahlarArrayList =new ArrayList<>();
        SQLiteDatabase db =vt.getWritableDatabase();

        Cursor cursor =db.rawQuery("SELECT*FROM padisahlar",null);
        while (cursor.moveToNext()){
            Padisahlar p ;
            p =new Padisahlar(cursor.getInt(cursor.getColumnIndex("padi_id")),
                    cursor.getString(cursor.getColumnIndex("padi_ad")),
                    cursor.getInt(cursor.getColumnIndex("padi_yas")),
                    cursor.getString(cursor.getColumnIndex("padi_acıklama")),
                    cursor.getString(cursor.getColumnIndex("padi_resim")));
            padisahlarArrayList.add(p);
        }
        return padisahlarArrayList;
    }
}
