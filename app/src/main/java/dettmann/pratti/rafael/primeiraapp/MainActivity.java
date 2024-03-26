package dettmann.pratti.rafael.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /*Criação da activity*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Obtendo id do botão enviar*/
        Button btnEnviar = findViewById(R.id.btnEnviar);

        /*Ação a ser realizada ao pressionar o botão*/
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Obtendo id da caixa de texto*/
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                /*Obtendo o texto digitado (após converter)*/
                String textoDigitado = etDigiteAqui.getText().toString();

                /*Declaração de intenção para mudar de activity*/
                Intent i = new Intent(MainActivity.this, NextActivity.class);

                /*Enviar texto digitado para a próxima activity*/
                i.putExtra("texto",textoDigitado);

                /*Iniciar intenção*/
                startActivity(i);
            }
        });
    }
}