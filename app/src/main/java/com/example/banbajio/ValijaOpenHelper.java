package com.example.banbajio;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ValijaOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "valijas.db";
    private static final int DATABASE_VERSION = 1;

    protected static final String TABLE_VALIJAS = "valijas";
    protected static final String COLUMN_ID = "id";
    //protected static final String COLUMN_NUMVALIJA = "num_valija";
    protected static final String COLUMN_DEPENVIO = "dep_envio";
    protected static final String COLUMN_DEPRECIBE = "dep_recibe";
    protected static final String COLUMN_CIUDADENVIO = "ciudad_envio";
    protected static final String COLUMN_CIUDADDESTINO = "ciudad_destino";
    protected static final String COLUMN_FECHACREACION = "fecha_creacion";
    protected static final String COLUMN_FECHAENVIO = "fecha_envio";
    protected static final String COLUMN_DESCRIPCION = "descripcion";

    private static final String TABLE_USERS = "usuarios";
    private static final String COLUMN_IDUSER = "id";
    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_PASSWORD = "password";

    private static final String CREATE_TABLE =
            "CREATE TABLE "+ TABLE_VALIJAS + " (" +
            COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            //COLUMN_NUMVALIJA + "INTEGER, " +
            COLUMN_CIUDADENVIO + "TEXT, "+
            COLUMN_DEPENVIO + "TEXT, "+
            COLUMN_CIUDADDESTINO + "TEXT, " +
            COLUMN_DEPRECIBE + "TEXT, " +
            COLUMN_FECHACREACION + "TEXT, " +
            COLUMN_FECHAENVIO + "TEXT, "+
            COLUMN_DESCRIPCION + "TEXT " + ")";
/*
    private static final String CREATE_TABLE_USERS =
            "CREATE TABLE "+ TABLE_VALIJAS + " (" +
                    COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COLUMN_NUMVALIJA + "INTEGER, " +
                    COLUMN_CIUDADENVIO + "TEXT, "+
                    COLUMN_DEPENVIO + "TEXT, "+
                    COLUMN_CIUDADDESTINO + "TEXT, " +
                    COLUMN_DEPRECIBE + "TEXT, " +
                    COLUMN_FECHACREACION + "TEXT, " +
                    COLUMN_FECHAENVIO + "TEXT, "+
                    COLUMN_DESCRIPCION + "TEXT " + ")";*/



    public ValijaOpenHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
