package com.example.recyclerviewtitan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtitan.adapter.ParentItemAdapter;
import com.example.recyclerviewtitan.model.ChildItem;
import com.example.recyclerviewtitan.model.ParentItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView ParentRecyclerViewItem = findViewById(R.id.parent_recyclerview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        ParentItemAdapter parentItemAdapter = new ParentItemAdapter(ParentItemList());

        ParentRecyclerViewItem.setAdapter(parentItemAdapter);
        ParentRecyclerViewItem.setLayoutManager(layoutManager);
    }

    private List<ParentItem> ParentItemList()
    {
        List<ParentItem> itemList = new ArrayList<>();

        ParentItem item0 = new ParentItem( "POP", ChildItemList('P'));
        itemList.add(item0);
        ParentItem item1 = new ParentItem("SERTANEJO", ChildItemList('S'));
        itemList.add(item1);
        ParentItem item2 = new ParentItem("R&B", ChildItemList('R'));
        itemList.add(item2);
        ParentItem item3 = new ParentItem("ROCK", ChildItemList('B'));
        itemList.add(item3);
        ParentItem item4 = new ParentItem("INDIE", ChildItemList('I'));
        itemList.add(item4);

        return itemList;

    }

    private List<ChildItem> ChildItemList(char MusicaTipo)
    {
        List<ChildItem> ChildItemList
                = new ArrayList<>();
        switch (MusicaTipo){
            case 'P':
                ChildItemList.add(new ChildItem("LADY GAGA",5));
                ChildItemList.add(new ChildItem("RIHANNA", 4));
                ChildItemList.add(new ChildItem("BEYONCE", 5));
                ChildItemList.add(new ChildItem("KATY PERRY",3));
                ChildItemList.add(new ChildItem("BRUNO MARS",1));
                ChildItemList.add(new ChildItem("DUA LIPA",5));
                break;
            case 'S':
                ChildItemList.add(new ChildItem("VICTOR E LEO",10));
                ChildItemList.add((new ChildItem("HENRIQUE E JULIANO",8)));
                ChildItemList.add(new ChildItem("BRUNO E MARRONE",10));
                ChildItemList.add(new ChildItem("MATEUS E KAUAN",2));
                ChildItemList.add(new ChildItem("JOAO BOSCO E VINICIUS",2));
                ChildItemList.add(new ChildItem("LEANDRO E LEONARDO",8));
                break;
            case 'R':
                ChildItemList.add(new ChildItem("NE-YO",10));
                ChildItemList.add(new ChildItem("AKON",10));
                ChildItemList.add(new ChildItem("CHRIS BROWN",10));
                ChildItemList.add(new ChildItem("LIL WAYNE",10));
                ChildItemList.add(new ChildItem("DRAKE",10));
                ChildItemList.add(new ChildItem("50CENT",10));
                break;
            case 'B':
                ChildItemList.add(new ChildItem("METALLICA",2));
                ChildItemList.add(new ChildItem("IRON MAIDEN",2));
                ChildItemList.add(new ChildItem("AVENGED SEVENFOLD",10));
                ChildItemList.add(new ChildItem("SLIPKNOT",2));
                ChildItemList.add(new ChildItem("RUSH",1));
                break;
            case 'I':
                ChildItemList.add(new ChildItem("THE NEIGHBHOODS",10));
                ChildItemList.add(new ChildItem("THE SMITH",2));
                ChildItemList.add(new ChildItem("BLINK 182",10));
                ChildItemList.add(new ChildItem("THE STROKES",8));
                ChildItemList.add(new ChildItem("THE KILLERS",9));
                ChildItemList.add(new ChildItem("PARAMORE",10));
                break;


        }











        return ChildItemList;
    }
}