package com.example.propietario.persistenciadb.adapter;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class ClienteAdapter {

    private static final String NAME="cliente";
    private SQLiteDatabase sqlDB;

    public ClienteAdapter(SQLiteDatabase sqlDB) {
        this.sqlDB = sqlDB;
    }


    private class Columns implements BaseColumns {

        public final static String ID="cliente_id";
        public final static String NOMBRE="nombre";
        public final static String APELLIDO="apellido";
        public final static String TELEFONO="telefono";
    }

}