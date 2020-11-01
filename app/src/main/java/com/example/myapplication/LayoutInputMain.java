package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static android.icu.text.DisplayContext.LENGTH_SHORT;

public class LayoutInputMain extends AppCompatActivity {

    private Button toPersub;
    private Button toSummary;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            toPersub = (Button) findViewById(R.id.toPersub);
            toPersub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String mathScore=((EditText)findViewById(R.id.math)).getText().toString();
                    String engScore=((EditText)findViewById(R.id.english)).getText().toString();
                    String compScore=((EditText)findViewById(R.id.compScore)).getText().toString();
                    String peScore=((EditText)findViewById(R.id.peScore)).getText().toString();
                    if(!"".equals(mathScore) && !"".equals(engScore) && !"".equals(compScore) && !"".equals(peScore)){
                        Intent intent=new Intent(LayoutInputMain.this,Layoutpersub.class);
                        Bundle bundle=new Bundle();
                        bundle.putCharSequence("math",mathScore);
                        bundle.putCharSequence("eng",engScore);
                        bundle.putCharSequence("comp",compScore);
                        bundle.putCharSequence("pe",peScore);
                        intent.putExtras(bundle);
                        startActivity(intent);}
                    else {
                        Toast.makeText(LayoutInputMain.this,"请输入完整",Toast.LENGTH_SHORT).show();
                    }

                }
            });

        toSummary = (Button) findViewById(R.id.toSummary);
        toSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mathScore = ((EditText) findViewById(R.id.math)).getText().toString();
                String engScore = ((EditText) findViewById(R.id.english)).getText().toString();
                String compScore = ((EditText) findViewById(R.id.compScore)).getText().toString();
                String peScore = ((EditText) findViewById(R.id.peScore)).getText().toString();
                if (!"".equals(mathScore) && !"".equals(engScore) && !"".equals(compScore) && !"".equals(peScore)) {
                    Pattern p = Pattern.compile("^(100|[1-9]\\d|\\d)$");
                    Matcher math = p.matcher(mathScore);
                    Matcher eng = p.matcher(engScore);
                    Matcher comp = p.matcher(compScore);
                    Matcher pe = p.matcher(peScore);
                    if (math.find() || ("").equals(math) && eng.find() || ("").equals(eng) && comp.find() || ("").equals(comp) && pe.find() || ("").equals(pe)) {
                        Intent intent = new Intent(LayoutInputMain.this, LayoutSummary.class);
                        Bundle bundle = new Bundle();
                        bundle.putCharSequence("math", mathScore);
                        bundle.putCharSequence("eng", engScore);
                        bundle.putCharSequence("comp", compScore);
                        bundle.putCharSequence("pe", peScore);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                 else {
                    Toast.makeText(LayoutInputMain.this, "请输入范围在1-100之间的整数", Toast.LENGTH_SHORT).show();
                }}

                else{
                    Toast.makeText(LayoutInputMain.this, "请输入范围在1-100之间的整数", Toast.LENGTH_SHORT).show();
                }
            }


        });



    }





}