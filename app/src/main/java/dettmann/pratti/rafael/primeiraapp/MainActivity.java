package dettmann.pratti.rafael.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*Classe principal da app*/
public class MainActivity extends AppCompatActivity {

    /*Método chamado sempre que uma tela é criada*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Cria os elementos de interface do arquivo .xml*/
        setContentView(R.layout.activity_main);

        /*Obtendo o botão enviar através do id*/
        Button btnEnviar = findViewById(R.id.btnEnviar);

        /*Ação a ser realizada ao pressionar o botão*/
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            /*onClick -> é executado quando o botão é clicado*/
            @Override
            public void onClick(View v) {
                /*Obtendo a caixa de texto*/
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                /*Obtendo o texto digitado (após converter)*/
                String textoDigitado = etDigiteAqui.getText().toString();

                /*Declaração de intenção para mudar de Activity*/
                Intent i = new Intent(MainActivity.this, NextActivity.class);

                /*Enviar texto digitado para a próxima Activity*/
                i.putExtra("texto",textoDigitado);

                /*Iniciar próxima Activity a partir da intenção*/
                startActivity(i);
            }
        });
    }
}