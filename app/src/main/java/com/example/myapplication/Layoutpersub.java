package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Layoutpersub extends AppCompatActivity {
    private Button toSummary;
    private TextView scoreSum;
    private TextView generalClass;
    private TextView scoreStability;
    private TextView mathClass;
    private TextView engClass;
    private TextView compClass;
    private TextView peClass;
    private TextView mathPoint;
    private TextView engPoint;
    private TextView compPoint;
    private TextView pePoint;
    private TextView mathScore;
    private TextView engScore;
    private TextView compScore;
    private TextView peScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_persub);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String math = intent.getStringExtra("math");
        TextView textView_math = (TextView)findViewById(R.id.mathScore);
        textView_math.setText(math);
        String eng = intent.getStringExtra("eng");
        TextView textView_eng = (TextView)findViewById(R.id.engScore);
        textView_eng.setText(eng);
        String comp = intent.getStringExtra("comp");
        TextView textView_comp = (TextView)findViewById(R.id.compScore);
        textView_comp.setText(comp);
        String pe = intent.getStringExtra("pe");
        TextView textView_pe = (TextView)findViewById(R.id.peScore);
        textView_pe.setText(pe);

        int value1=Integer.parseInt(textView_math.getText().toString());
        int value2=Integer.parseInt(textView_eng.getText().toString());
        int value3=Integer.parseInt(textView_comp.getText().toString());
        int value4=Integer.parseInt(textView_pe.getText().toString());

        int sum = value1 + value2 + value3 + value4;
        scoreSum = (TextView)findViewById(R.id.scoreSum);
        mathScore = (TextView)findViewById(R.id.mathScore);
        engScore = (TextView)findViewById(R.id.engScore);
        compScore = (TextView)findViewById(R.id.compScore);
        peScore = (TextView)findViewById(R.id.peScore);

        float var;
        var = ((value1-sum/4)*(value1-sum/4)+(value2-sum/4)*(value2-sum/4)+(value3-sum/4)*(value3-sum/4)+(value4-sum/4)*(value4-sum/4))/4;
        float weiMean;
        weiMean = (value1*6+value2*2+value3*4+value4*2)/14;
//加权平均总分
        scoreSum.setText(""+weiMean+"");
//加权平均评级
        if ( weiMean<=100 && weiMean>90 ){generalClass = (TextView)findViewById(R.id.generalClass);generalClass.setText("优秀");}
        else if ( weiMean<=89 && weiMean>85 ){generalClass = (TextView)findViewById(R.id.generalClass);generalClass.setText("良好");}
        else if ( weiMean<=84 && weiMean>75 ){generalClass = (TextView)findViewById(R.id.generalClass);generalClass.setText("一般");}
        else if ( weiMean<=74 && weiMean>60 ){generalClass = (TextView)findViewById(R.id.generalClass);generalClass.setText("较差");}
        else if ( weiMean<=60 ) {generalClass = (TextView)findViewById(R.id.generalClass);generalClass.setText("不合格");}
//稳定性
        if ( var<=0.99 && var>=0 ){scoreStability = (TextView)findViewById(R.id.scoreStability);scoreStability.setText("优秀");}
        else if ( var<=3.99 && var>=1 ){scoreStability = (TextView)findViewById(R.id.scoreStability);scoreStability.setText("良好");}
        else if ( var<=9.99 && var>=4 ){scoreStability = (TextView)findViewById(R.id.scoreStability);scoreStability.setText("较差");}
        else if ( var>=10 ) {scoreStability = (TextView)findViewById(R.id.scoreStability);scoreStability.setText("差");}


//高数
        //分数评级&绩点
        if (value1<=100 && value1>=90){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("A");
            mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("4.0");}
        else if (value1<=89 && value1>=86){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("A-");
        mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("3.7");}
        else if (value1<=85 && value1>=83){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("B+");
            mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("3.3");}
        else if (value1<=82 && value1>=80){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("B");
            mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("3.0");}
        else if (value1<=79 && value1>=76){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("B-");
            mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("2.7");}
        else if (value1<=75 && value1>=73){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("C+");
            mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("2.3");}
        else if (value1<=72 && value1>=70){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("C");
            mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("2.0");}
        else if (value1<=69 && value1>=66){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("C-");
            mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("1.7");}
        else if (value1<=65 && value1>=63){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("D+");
            mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("1.3");}
        else if (value1<=62 && value1>=60){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("D");
            mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("1.0");}
        else if (value1<=59 && value1>=0){mathClass = (TextView)findViewById(R.id.mathClass);mathClass.setText("F");
            mathPoint = (TextView)findViewById(R.id.mathPoint);mathPoint.setText("0");}

        //分数
        mathScore.setText(""+value1+"");

//大英
        //分数评级&绩点
        if (value2<=100 && value2>=90){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("A");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("4.0");}
        else if (value2<=89 && value2>=86){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("A-");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("3.7");}
        else if (value2<=85 && value2>=83){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("B+");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("3.3");}
        else if (value2<=82 && value2>=80){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("B");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("3.0");}
        else if (value2<=79 && value2>=76){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("B-");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("2.7");}
        else if (value2<=75 && value2>=73){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("C+");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("2.3");}
        else if (value2<=72 && value2>=70){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("C");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("2.0");}
        else if (value2<=69 && value2>=66){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("C-");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("1.7");}
        else if (value2<=65 && value2>=63){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("D+");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("1.3");}
        else if (value2<=62 && value2>=60){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("D");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("1.0");}
        else if (value2<=59 && value2>=0){engClass = (TextView)findViewById(R.id.engClass);engClass.setText("F");
            engPoint = (TextView)findViewById(R.id.engPoint);engPoint.setText("0");}

        //分数
        engScore.setText(""+value2+"");

//计导
        //分数评级&绩点
        if (value3<=100 && value3>=90){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("A");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("4.0");}
        else if (value3<=89 && value3>=86){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("A-");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("3.7");}
        else if (value3<=85 && value3>=83){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("B+");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("3.3");}
        else if (value3<=82 && value3>=80){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("B");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("3.0");}
        else if (value3<=79 && value3>=76){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("B-");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("2.7");}
        else if (value3<=75 && value3>=73){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("C+");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("2.3");}
        else if (value3<=72 && value3>=70){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("C");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("2.0");}
        else if (value3<=69 && value3>=66){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("C-");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("1.7");}
        else if (value3<=65 && value3>=63){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("D+");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("1.3");}
        else if (value3<=62 && value3>=60){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("D");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("1.0");}
        else if (value3<=59 && value3>=0){compClass = (TextView)findViewById(R.id.compClass);compClass.setText("F");
            compPoint = (TextView)findViewById(R.id.compPoint);compPoint.setText("0");}

        //分数
        mathScore.setText(""+value3+"");

//大体
        //分数评级&绩点
        if (value4<=100 && value4>=90){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("A");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("4.0");}
        else if (value4<=89 && value4>=86){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("A-");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("3.7");}
        else if (value4<=85 && value4>=83){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("B+");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("3.3");}
        else if (value4<=82 && value4>=80){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("B");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("3.0");}
        else if (value4<=79 && value4>=76){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("B-");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("2.7");}
        else if (value4<=75 && value4>=73){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("C+");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("2.3");}
        else if (value4<=72 && value4>=70){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("C");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("2.0");}
        else if (value4<=69 && value4>=66){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("C-");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("1.7");}
        else if (value4<=65 && value4>=63){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("D+");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("1.3");}
        else if (value4<=62 && value4>=60){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("D");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("1.0");}
        else if (value4<=59 && value4>=0){peClass = (TextView)findViewById(R.id.peClass);peClass.setText("F");
            pePoint = (TextView)findViewById(R.id.pePoint);pePoint.setText("0");}

        //分数
        mathScore.setText(""+value4+"");



    }
}