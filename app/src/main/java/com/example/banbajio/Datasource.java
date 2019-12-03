package com.example.banbajio;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Datasource {

    SQLiteOpenHelper dbHelper;
    SQLiteDatabase database;

    private static String[] allColumns = {
            ValijaOpenHelper.COLUMN_ID,
            ValijaOpenHelper.COLUMN_DEPENVIO,
            ValijaOpenHelper.COLUMN_DEPRECIBE,
            ValijaOpenHelper.COLUMN_CIUDADENVIO,
            ValijaOpenHelper.COLUMN_CIUDADDESTINO,
            ValijaOpenHelper.COLUMN_FECHACREACION,
            ValijaOpenHelper.COLUMN_FECHAENVIO,
            ValijaOpenHelper.COLUMN_DESCRIPCION
    };

    public Datasource(Context context) {
        dbHelper = new ValijaOpenHelper(context);
    }

    public void open() {
        dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public void create(Valija valija) {
        ContentValues contentValues = new ContentValues();
        //contentValues.put(ValijaOpenHelper.COLUMN_NUMVALIJA, valija.getNumValija());
        contentValues.put(ValijaOpenHelper.COLUMN_DEPENVIO, valija.getDepEnvio());
        contentValues.put(ValijaOpenHelper.COLUMN_DEPRECIBE, valija.getDepRecibe());
        contentValues.put(ValijaOpenHelper.COLUMN_CIUDADENVIO, valija.getCiudadEnvio());
        contentValues.put(ValijaOpenHelper.COLUMN_CIUDADDESTINO, valija.getCiudadDestino());
        contentValues.put(ValijaOpenHelper.COLUMN_FECHACREACION, valija.getFechaCreacion());
        contentValues.put(ValijaOpenHelper.COLUMN_FECHAENVIO, valija.getFechaEnvio());
        contentValues.put(ValijaOpenHelper.COLUMN_DESCRIPCION, valija.getDescripcion());
    }

    public List<Valija> findAll() {
        //Cursor cursor = database.query(ValijaOpenHelper.TABLE_VALIJAS, allColumns,
        //        null, null, null, null, null);
        //List<Valija> valijas = cursorToList(cursor);
        List<Valija> valijas = new ArrayList<Valija>();
        return valijas;
    }

    public List<Valija> cursorToList(Cursor cursor) {
        List<Valija> valijas = new ArrayList<Valija>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                Valija valija = new Valija();
                valija.setId(cursor.getInt(cursor.getColumnIndex(ValijaOpenHelper.COLUMN_ID)));
                valija.setNumValija(cursor.getInt(cursor.getColumnIndex(ValijaOpenHelper.COLUMN_ID)));
                valija.setDepEnvio(cursor.getString(cursor.getColumnIndex(ValijaOpenHelper.COLUMN_DEPENVIO)));
                valija.setDepRecibe(cursor.getString(cursor.getColumnIndex(ValijaOpenHelper.COLUMN_DEPRECIBE)));
                valija.setCiudadEnvio(cursor.getString(cursor.getColumnIndex(ValijaOpenHelper.COLUMN_CIUDADENVIO)));
                valija.setCiudadDestino(cursor.getString(cursor.getColumnIndex(ValijaOpenHelper.COLUMN_CIUDADDESTINO)));
                valija.setFechaCreacion(cursor.getString(cursor.getColumnIndex(ValijaOpenHelper.COLUMN_FECHACREACION)));
                valija.setFechaEnvio(cursor.getString(cursor.getColumnIndex(ValijaOpenHelper.COLUMN_FECHAENVIO)));
                valija.setDescripcion(cursor.getString(cursor.getColumnIndex(ValijaOpenHelper.COLUMN_DESCRIPCION)));
                valijas.add(valija);
            }
        }
        return valijas;
    }
}
