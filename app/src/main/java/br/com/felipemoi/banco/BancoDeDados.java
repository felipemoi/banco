package br.com.felipemoi.banco;

/**
 * Created by Felipe Moi on 08/07/2015.
 */

import android.content.Context;
import android.database.sqlite.*;


public class BancoDeDados extends SQLiteOpenHelper{

    public BancoDeDados (Context context)
    {
        super(context, "BANCO", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(ScriptSQL.getCreateContato());


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
