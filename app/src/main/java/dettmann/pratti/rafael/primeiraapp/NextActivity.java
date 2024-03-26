package dettmann.pratti.rafael.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    /*Criação da activity*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        /*Obtendo a intenção que criou a activity*/
        Intent i = getIntent();

        /*Obtendo o texto desta intenção*/
        String textoDigitado = i.getStringExtra("texto");

        /*Obtendo a text view a ser alterada*/
        TextView tvTexto = findViewById(R.id.tvTexto);

        /*Alterando o texto*/
        tvTexto.setText(textoDigitado);
    }
}