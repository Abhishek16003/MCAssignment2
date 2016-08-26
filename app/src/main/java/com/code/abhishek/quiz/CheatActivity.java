package com.code.abhishek.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {
     Button b;
    TextView t;
    int c,k;
    int m=0;
    String cheat11="";
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        if(k==1) {
            cheat11 = "You Cheated!!!!";
            Intent i = new Intent();
            i.putExtra("msg", cheat11);
            setResult(0, i);
            finish();
        }else{
            finish();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        Bundle bundle=getIntent().getExtras();
        b=(Button)findViewById(R.id.button4);
        t=(TextView)findViewById(R.id.textViewcheat);
        c= Integer.parseInt(bundle.getString("NUMBER"));
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m=0;
                for(int i=2;i<c;i++){
                    if(c%i==0){
                        t.setText("It is not a prime number");
                        m=1;
                        k=1;
                        break;
                    }
                }
                if (m==0){
                    t.setText("It is a prime number");
                    k=1;
                }
            }
        });



    }
}
