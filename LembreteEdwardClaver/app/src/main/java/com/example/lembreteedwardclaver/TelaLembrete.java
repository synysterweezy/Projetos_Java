package com.example.lembreteedwardclaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TelaLembrete extends AppCompatActivity {
    private TextView nomeUsuario;
    private String nomeChave;

    public String getNomeChave(){
        return nomeChave;
    }

    public void setNomeChave(String nomeChave) {
        this.nomeChave = nomeChave;
    }

    public TextView getNomeUsuario(){
        return this.nomeUsuario;
    }

    public void setNomeUsuario(TextView nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_lembrete);
        setNomeUsuario(findViewById(R.id.nomeUsuario));
        Intent myIntent = getIntent();
        this.setNomeChave(myIntent.getStringExtra("nomeUsuario"));
        this.getNomeUsuario().setText(this.getNomeChave());


    }
}