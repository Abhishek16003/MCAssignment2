package com.code.abhishek.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HintActivity extends AppCompatActivity {
     Button b1;
    TextView t1;
    int a;
    String hint11="";
    int f=0;
    int b;
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        if(b==1) {
            hint11 = "Hint Shown";
            Intent i = new Intent();
            i.putExtra("msg", hint11);
            setResult(0, i);
            finish();
        }
        else{
            finish();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hint);
    Bundle bundle=getIntent().getExtras();
    b1=(Button)findViewById(R.id.button3);
    t1=(TextView)findViewById(R.id.textView);
    a= Integer.parseInt(bundle.getString("NUMBER"));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f=0;
                for(int i=2;i<a;i++){
                    if(a%i==0){
                        t1.setText("The number has more than two factors");
                        f=1;
                        b=1;
                        break;
                    }
                }
                if (f==0){
                    t1.setText("The number has exactly two factors: 1 and the number itself");
                b=1;
                }


            }
        });







    }
}
