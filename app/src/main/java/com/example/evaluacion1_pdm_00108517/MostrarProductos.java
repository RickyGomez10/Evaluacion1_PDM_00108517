package com.example.evaluacion1_pdm_00108517;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MostrarProductos extends AppCompatActivity {
    private TextView mUsuario,mCorreo, p11,p21,p31,p41,p51,p61,p71,p81,p91, ptotal;
    private Button btnShare;
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
        ptotal = findViewById(R.id.tv_totalProd);

        btnShare = findViewById(R.id.btn_share);


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
            int total = mIntent.getExtras().getInt("ptotal");
            Log.i("total:", String.valueOf(total));
            ptotal.setText(String.valueOf(total));






        }


        btnShare.setOnClickListener(v ->{
            String text =
                    "{ Usuario: "+mUsuario.getText().toString()+
                            ", Correo:"+mCorreo.getText().toString()+
                            ", Producto1 : "+p11.getText().toString()+
                            ", Producto2 : "+p21.getText().toString()+
                            ", Producto3 : "+p31.getText().toString()+
                            ", Producto4 : "+p41.getText().toString()+
                            ", Producto5 : "+p51.getText().toString()+
                            ", Producto6 : "+p61.getText().toString()+
                            ", Producto7 : "+p71.getText().toString()+
                            ", Producto8 : "+p81.getText().toString()+
                            ", Producto9 : "+p91.getText().toString()+
                            ", Total de Productos: "+ptotal.getText().toString()+" }";
            Intent mIntent2 = new Intent();
            mIntent2.setType("text/plain");
            mIntent2.setAction(Intent.ACTION_SEND);
            mIntent2.putExtra(Intent.EXTRA_TEXT, text);
            startActivity(mIntent2);
        });
    }
}
