package com.cieep.ejercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearElProfesor;
    private LinearLayout linearTokio;
    private LinearLayout linearBerlin;
    private LinearLayout linearDenver;
    private LinearLayout linearMoscu;
    private LinearLayout linearRio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializaVistas();
    }



    private void inicializaVistas() {
        linearBerlin = findViewById(R.id.linearBerlin);
        linearElProfesor = findViewById(R.id.linearElProf);
        linearTokio = findViewById(R.id.linearTokio);
        linearDenver = findViewById(R.id.linearDenver);
        linearMoscu = findViewById(R.id.linearMoscu);
        linearRio = findViewById(R.id.linearRio);
    }

    public void abreInfo(View view) {

        LinearLayout linearLayout = (LinearLayout) view;

        int img = 0;
        int desc = 0;
        int name = 0;

        switch (linearLayout.getId()) {
            case R.id.linearBerlin:
                img = R.drawable.berl_n_desc;
                desc = R.string.desc_berlin;
                name = R.string.berlin;
                break;
            case R.id.linearElProf:
                img = R.drawable.el_profesor_desc;
                desc = R.string.desc_profesor;
                name = R.string.profesor;
                break;
            case R.id.linearDenver:
                img = R.drawable.denver_desc;
                desc = R.string.desc_denver;
                name = R.string.denver;
                break;
            case R.id.linearMoscu:
                img = R.drawable.mosc__desc;
                desc = R.string.desc_moscu;
                name = R.string.moscu;
                break;
            case R.id.linearRio:
                img = R.drawable.r_o;
                desc = R.string.desc_rio;
                name = R.string.rio;
                break;
            case R.id.linearTokio:
                img = R.drawable.tokio;
                desc = R.string.desc_tokio;
                name = R.string.tokio;
                break;
        }

        Bundle bundle = new Bundle();
        bundle.putInt("IMG", img);
        bundle.putInt("DESC", desc);
        bundle.putInt("NAME", name);
        Intent intent = new Intent(MainActivity.this, VerInfoActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}