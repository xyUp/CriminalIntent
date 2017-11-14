package com.xy.android.crininalintent.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.xy.android.crininalintent.db.CrimeDBSchema.CrimeTable;


/**
 * Created by xy on 2017/11/10.
 */

public class CrimeBaseHelper extends SQLiteOpenHelper {

    private static final String DATEBASE_NAME = "crimeBase.db";//库名
    private static final int VERSION = 1;

    public CrimeBaseHelper(Context context) {
        super(context, DATEBASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + CrimeTable.NAME + "(" + "_id integer primary key autoincrement," +
                CrimeTable.Cols.UUID + ", " + CrimeTable.Cols.TITLE + ", " + CrimeTable.Cols.DATE + "," +
                CrimeTable.Cols.SOLVED + ", " + CrimeTable.Cols.SUSPECT + ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
