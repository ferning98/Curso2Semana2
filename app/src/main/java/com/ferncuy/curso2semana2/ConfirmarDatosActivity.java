package com.ferncuy.curso2semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmarDatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);
        Intent intent = getIntent();

        String strNombre = intent.getStringExtra("nombre");
        String strTelefono = intent.getStringExtra("telefono");
        String strEmail =intent.getStringExtra("email");
        String strDescripcion = intent.getStringExtra("descripcion");
        String strFechaNacimiento = intent.getStringExtra("fecha");

        TextView txtResumen = findViewById(R.id.txtResumen);

        String textoResumen = strNombre + "\n";
        textoResumen += "Fecha Nacimiento: " + strFechaNacimiento + "\n";
        textoResumen += "Tel: " + strTelefono + "\n";
        textoResumen += "Email: " + strEmail + "\n";
        textoResumen += "Descripción: " + strDescripcion + "\n";

        txtResumen.setText(textoResumen);


    }

    public void editar(View view) {
        this.finish();
    }
}