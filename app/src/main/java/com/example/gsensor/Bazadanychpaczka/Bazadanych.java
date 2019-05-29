package com.example.gsensor.Bazadanychpaczka;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class Bazadanych extends SQLiteOpenHelper {

    private static final String TAG = "BazaErnesta";
    private static final String NAZWA_BAZY = "bazaGsensor2.db";
    private static final int wersja = 1;


    public Bazadanych(Context context, String name, CursorFactory factory, int version) {
        super(context, NAZWA_BAZY, null, wersja);
    }

    public Bazadanych(Context context) {
        super(context, NAZWA_BAZY, null, wersja);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS " + Bazatabele.TABLE_NAME);
    onCreate(db);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    //String Tablica = "STWOZTABLICE" + Nazwatabeli + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, "  + kolumna1 + " OSX " + kolumna2 + " OSY " + kolumna3 + " OSZ )";
    db.execSQL("CREATE TABLE " + Bazatabele.TABLE_NAME + " ("+ Bazatabele._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+ Bazatabele.TITLE + " TEXT NOT NULL, " + Bazatabele.osxx + " STRING, " + Bazatabele.osyy + " STRING, " + Bazatabele.oszz + " STRING, " + Bazatabele.dlugosc + " STRING, " + Bazatabele.szerokosc +" STRING);");
    }

}
