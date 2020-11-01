package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class LayoutSummary extends AppCompatActivity {

    private TextView mathComment;
    private TextView engComment;
    private TextView compComment;
    private TextView peComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_summary);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String math = intent.getStringExtra("math");
        TextView textView_math = (TextView)findViewById(R.id.mathComment);
        textView_math.setText(math);
        String eng = intent.getStringExtra("eng");
        TextView textView_eng = (TextView)findViewById(R.id.engComment);
        textView_eng.setText(eng);
        String comp = intent.getStringExtra("comp");
        TextView textView_comp = (TextView)findViewById(R.id.compComment);
        textView_comp.setText(comp);
        String pe = intent.getStringExtra("pe");
        TextView textView_pe = (TextView)findViewById(R.id.peComment);
        textView_pe.setText(pe);

        int value1 = Integer.parseInt(textView_math.getText().toString());
        int value2 = Integer.parseInt(textView_eng.getText().toString());
        int value3 = Integer.parseInt(textView_comp.getText().toString());
        int value4 = Integer.parseInt(textView_pe.getText().toString());



//高数
        if(80<=value1 && value1<=100){mathComment = (TextView)findViewById(R.id.mathComment);mathComment.setText("做得很好，继续保持");}
        else if(60<=value1 && value1<=79){mathComment = (TextView)findViewById(R.id.mathComment);mathComment.setText("继续努力，争取更好");}
        else if(0<=value1 && value1<=59){mathComment = (TextView)findViewById(R.id.mathComment);mathComment.setText("奋起直追，尽力追赶");}
//大英
        if(80<=value1 && value1<=100){engComment = (TextView)findViewById(R.id.engComment);engComment.setText("做得很好，继续保持");}
        else if(60<=value1 && value1<=79){engComment = (TextView)findViewById(R.id.engComment);engComment.setText("继续努力，争取更好");}
        else if(0<=value1 && value1<=59){engComment = (TextView)findViewById(R.id.engComment);engComment.setText("奋起直追，尽力追赶");}
//计导
        if(80<=value1 && value1<=100){compComment = (TextView)findViewById(R.id.compComment);compComment.setText("做得很好，继续保持");}
        else if(60<=value1 && value1<=79){compComment = (TextView)findViewById(R.id.compComment);compComment.setText("继续努力，争取更好");}
        else if(0<=value1 && value1<=59){compComment = (TextView)findViewById(R.id.compComment);compComment.setText("奋起直追，尽力追赶");}
//大体
        if(80<=value1 && value1<=100){peComment = (TextView)findViewById(R.id.peComment);peComment.setText("做得很好，继续保持");}
        else if(60<=value1 && value1<=79){peComment = (TextView)findViewById(R.id.peComment);peComment.setText("继续努力，争取更好");}
        else if(0<=value1 && value1<=59){peComment = (TextView)findViewById(R.id.peComment);peComment.setText("奋起直追，尽力追赶");}
    }
}