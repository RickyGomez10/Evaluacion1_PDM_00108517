package com.example.evaluacion1_pdm_00108517;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout LLL1,LLL2,LLL3,LLL4,LLL5,LLL6,LLL7,LLL8,LLL9;
    private EditText etUsuario,etCorreo;
    private Button btnEnviar;
    private TextView p1,p2,p3,p4,p5,p6,p7,p8,p9;
    int producto1 = 0;
    int producto2 = 0;
    int producto3 = 0;
    int producto4 = 0;
    int producto5 = 0;
    int producto6 = 0;
    int producto7 = 0;
    int producto8 = 0;
    int producto9 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LLL1 = findViewById(R.id.Tv_producto1);
        LLL2 = findViewById(R.id.Tv_producto2);
        LLL3 = findViewById(R.id.Tv_producto3);
        LLL4 = findViewById(R.id.Tv_producto4);
        LLL5 = findViewById(R.id.Tv_producto5);
        LLL6 = findViewById(R.id.Tv_producto6);
        LLL7 = findViewById(R.id.Tv_producto7);
        LLL8 = findViewById(R.id.Tv_producto8);
        LLL9 = findViewById(R.id.Tv_producto9);

       LLL1.setOnClickListener(this);
       LLL2.setOnClickListener(this);
       LLL3.setOnClickListener(this);
        LLL4.setOnClickListener(this);
        LLL5.setOnClickListener(this);
        LLL6.setOnClickListener(this);
        LLL7.setOnClickListener(this);
        LLL8.setOnClickListener(this);
        LLL9.setOnClickListener(this);

        p1= findViewById(R.id.t_producto1);
        p2= findViewById(R.id.t_producto2);
        p3= findViewById(R.id.t_producto3);
        p4= findViewById(R.id.t_producto4);
        p5= findViewById(R.id.t_producto5);
        p6= findViewById(R.id.t_producto6);
        p7= findViewById(R.id.t_producto7);
        p8= findViewById(R.id.t_producto8);
        p9= findViewById(R.id.t_producto9);


        etUsuario = findViewById(R.id.et_Usuario);
        etCorreo = findViewById(R.id.et_Correo);
        btnEnviar = findViewById(R.id.btn_enviar);

        btnEnviar.setOnClickListener(v->{

            Intent intent = new Intent(this, MostrarProductos.class);
            intent.putExtra("Usuario", etUsuario.getText().toString() );
            intent.putExtra("Correo",etCorreo.getText().toString());
            intent.putExtra("Producto1", p1.getText().toString());
            intent.putExtra("Producto2", p2.getText().toString());
            intent.putExtra("Producto3", p3.getText().toString());
            intent.putExtra("Producto4", p4.getText().toString());
            intent.putExtra("Producto5", p5.getText().toString());
            intent.putExtra("Producto6", p6.getText().toString());
            intent.putExtra("Producto7", p7.getText().toString());
            intent.putExtra("Producto8", p8.getText().toString());
            intent.putExtra("Producto9", p9.getText().toString());
            int productototal = producto1 + producto2 + producto3 + producto4 + producto5 + producto6 + producto7 + producto8 + producto9;
            Log.i("total:", String.valueOf(productototal));
            intent.putExtra("ptotal",productototal);

            startActivity(intent);

        });

    }

    @Override
    public void onClick(View v) {
        int viewID = v.getId();
        Log.i("id ",viewID+"");
            switch (viewID){
                case R.id.Tv_producto1:
                    producto1++;

                    p1.setText(String.valueOf(producto1));

                    break;
                case R.id.Tv_producto2:
                    producto2++;

                    p2.setText(String.valueOf(producto2));
                    break;
                case R.id.Tv_producto3:
                    producto3++;
                    p3.setText(String.valueOf(producto3));

                    break;
                case R.id.Tv_producto4:
                    producto4++;
                    p4.setText(String.valueOf(producto4));

                    break;
                case R.id.Tv_producto5:
                    producto5++;
                    p5.setText(String.valueOf(producto5));

                    break;
                case R.id.Tv_producto6:
                    producto6++;
                    p6.setText(String.valueOf(producto6));

                    break;
                case R.id.Tv_producto7:
                    producto7++;
                    p7.setText(String.valueOf(producto7));

                    break;
                case R.id.Tv_producto8:
                    producto8++;
                    p8.setText(String.valueOf(producto8));

                    break;
                case R.id.Tv_producto9:
                    producto9++;
                    p9.setText(String.valueOf(producto9));

                    break;
            }

    }
}
