package com.cieep.ejercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VerInfoActivity extends AppCompatActivity {

    private ImageView imgDesc;
    private TextView lblNombre;
    private TextView lblDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_info);

        imgDesc = findViewById(R.id.imgDesc);
        lblDesc = findViewById(R.id.lblDesc);
        lblNombre = findViewById(R.id.lblName);

        if (getIntent().getExtras() != null) {
            imgDesc.setImageResource(getIntent().getExtras().getInt("IMG"));
            lblNombre.setText(getIntent().getExtras().getInt("NAME"));
            lblDesc.setText(getIntent().getExtras().getInt("DESC"));
        }
    }
}