package com.yusufcancakmak.javatekrarprojesi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Veritabani extends SQLiteOpenHelper {

    public Veritabani(@Nullable Context context) {
        super(context, "osmanlıdonemi.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS padisahlar(\n" +
                "\t\"padi_id\"\tINTEGER,\n" +
                "\t\"padi_ad\"\tTEXT,\n" +
                "\t\"padi_yas\"\tINTEGER,\n" +
                "\t\"padi_acıklama\"\tTEXT,\n" +
                "\t\"padi_resim\"\tTEXT,\n" +
                "\tPRIMARY KEY(padi_id)\n" +
                ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS padisahlar");
        onCreate(sqLiteDatabase);

    }
}
