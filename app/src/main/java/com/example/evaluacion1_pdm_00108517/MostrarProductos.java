package com.example.evaluacion1_pdm_00108517;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MostrarProductos extends AppCompatActivity {
    private TextView mUsuario,mCorreo, p11,p21,p31,p41,p51,p61,p71,p81,p91;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_productos);

        Intent mIntent = getIntent();
        mUsuario= findViewById(R.id.tv_Usuario1);
        mCorreo = findViewById(R.id.tv_Correo1);
        p11 = findViewById(R.id.t_producto11);
        p21 = findViewById(R.id.t_producto21);
        p31 = findViewById(R.id.t_producto31);
        p41 = findViewById(R.id.t_producto41);
        p51 = findViewById(R.id.t_producto51);
        p61 = findViewById(R.id.t_producto61);
        p71 = findViewById(R.id.t_producto71);
        p81 = findViewById(R.id.t_producto81);
        p91 = findViewById(R.id.t_producto91);


        if (mIntent != null) {
            mUsuario.setText(mIntent.getStringExtra("Usuario"));
            mCorreo.setText(mIntent.getStringExtra("Correo"));
            mCorreo.setText(mIntent.getStringExtra("Correo"));
            p11.setText(mIntent.getStringExtra("Producto1"));
            p21.setText(mIntent.getStringExtra("Producto2"));
            p31.setText(mIntent.getStringExtra("Producto3"));
            p41.setText(mIntent.getStringExtra("Producto4"));
            p51.setText(mIntent.getStringExtra("Producto5"));
            p61.setText(mIntent.getStringExtra("Producto6"));
            p71.setText(mIntent.getStringExtra("Producto7"));
            p81.setText(mIntent.getStringExtra("Producto8"));
            p91.setText(mIntent.getStringExtra("Producto9"));


        }
    }
}
