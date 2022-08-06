package com.example.contacliqueedwardclaver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botaoIncrementa;
    private TextView displayValor;
    private int acumulador;
    int cont;

    public TextView getDisplayValor() {
        return displayValor;
    }

    public void setDisplayValor(TextView displayValor){
        this.displayValor = displayValor;
    }

    public Button getBotaoIncrementa() {
        return botaoIncrementa;
    }

    public void setBotaoIncrementa(Button botaoIncrementa){
        this.botaoIncrementa = botaoIncrementa;

    }

    public int getAcumulador(){
        return acumulador;
    }

    public void setAcumulador(int acumulador){
        this.acumulador = acumulador;
    }

    public void incrementaValor (View view){
        this.getDisplayValor().setText(Integer.toString(this.getAcumulador()+1000));
        this.setAcumulador(this.getAcumulador()+1000);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setBotaoIncrementa(findViewById(R.id.botaoIncrementa));
        this.setDisplayValor(findViewById(R.id.displayValorAcumulado));
        this.setAcumulador(10000);
        this.getDisplayValor().setText(Integer.toString(this.getAcumulador()));
        int cont = 0;
    }
}