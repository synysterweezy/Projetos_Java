 package com.example.lembreteedwardclaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


 public class MainActivity extends AppCompatActivity {

    private Button botaoEntrar;
    private EditText caixaNome;

     public EditText getCaixaNome() {
         return caixaNome;
     }

     public void setCaixaNome(EditText caixaNome) {
         this.caixaNome = caixaNome;
     }

     public Button getBotaoEntrar() {
         return botaoEntrar;
     }

     public void setBotaoEntrar(Button botaoEntrar) {
         this.botaoEntrar = botaoEntrar;
     }

     public void entrarApp(View view){
         Intent nextActivity = new Intent(MainActivity.this, TelaLembrete.class);

         nextActivity.putExtra("nomeUsuario", getCaixaNome().getText().toString());

         startActivity(nextActivity);

     }

     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         this.setBotaoEntrar(findViewById(R.id.botaoEntrar));
         this.setCaixaNome(findViewById(R.id.caixaNome));
         setContentView(R.layout.activity_main);
    }
}