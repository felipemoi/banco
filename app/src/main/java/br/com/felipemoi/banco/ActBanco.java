package br.com.felipemoi.banco;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import android.database.sqlite.*;
import android.database.*;
import android.widget.*;
import android.content.*;



public class ActBanco extends ActionBarActivity implements View.OnClickListener{

    private ImageButton btnAdicionar;



    private BancoDeDados bancoDeDados;

    private SQLiteDatabase conn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_banco);

        btnAdicionar = (ImageButton)findViewById(R.id.btnAdicionar);

        btnAdicionar.setOnClickListener(this);





        try {
            bancoDeDados = new BancoDeDados(this);
            conn = bancoDeDados.getWritableDatabase();
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Conexão criada com sucesso!");
            dlg.setNeutralButton("OK", null);
            dlg.show();


        }catch(SQLException ex)
        {
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setMessage("Erro ao criar o Banco: " + ex.getMessage());
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }


    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_banco, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    */

    @Override
    public void onClick(View v) {

        Intent it = new Intent(this, ActCadContatos.class);
        startActivity(it);

    }
}
