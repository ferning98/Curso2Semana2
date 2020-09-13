package com.ferncuy.curso2semana2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void siguiente(View view) {
        EditText txtNombre = findViewById(R.id.txtNombre);
        DatePicker datePickerFecha = findViewById(R.id.datePickerNacimiento);
        EditText txtTelefono = findViewById(R.id.txtTelefono);
        EditText txtEmail = findViewById(R.id.txtEmail);
        EditText txtDescripcion = findViewById(R.id.txtDescripcion);

        String strNombre = txtNombre.getText().toString();
        String strTelefono = txtTelefono.getText().toString();
        String strEmail = txtEmail.getText().toString();
        String strDescripcion = txtDescripcion.getText().toString();
        String strFechaNacimiento = datePickerFecha.getDayOfMonth() + "/" + datePickerFecha.getMonth() + "/" + datePickerFecha.getYear() + "";

        if (strNombre.isEmpty() || strTelefono.isEmpty() || strEmail.isEmpty() || strDescripcion.isEmpty()){
            Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(MainActivity.this, ConfirmarDatosActivity.class);
            intent.putExtra("nombre", strNombre);
            intent.putExtra("telefono", strTelefono);
            intent.putExtra("email", strEmail);
            intent.putExtra("descripcion", strDescripcion);
            intent.putExtra("fecha", strFechaNacimiento);
            startActivity(intent);
        }

    }

}