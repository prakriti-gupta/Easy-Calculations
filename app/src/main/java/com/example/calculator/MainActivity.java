package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static boolean XpowerY  ;
    Button btnback,btnClear,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnneg,btnPlus,btnSubtract,btnMultiply,btnDivide,btnDot,
            btnEqual,btnSqrt,btnFactorial,btnMod,btnXpowerY;
    TextView edResult;
    double var1,var2;
    boolean Plus,Subtract,Multiply,Divide,mod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edResult=(TextView) findViewById(R.id.editText4);
        btnback=(Button)findViewById(R.id.backspace);
        btnClear=(Button)findViewById(R.id.clear);
        btn1=(Button)findViewById(R.id.one);
        btn2=(Button)findViewById(R.id.two);
        btn3=(Button)findViewById(R.id.three);
        btn4=(Button)findViewById(R.id.four);
        btn5=(Button)findViewById(R.id.five);
        btn6=(Button)findViewById(R.id.six);
        btn7=(Button)findViewById(R.id.seven);
        btn8=(Button)findViewById(R.id.eight);
        btn9=(Button)findViewById(R.id.nine);
        btn0=(Button)findViewById(R.id.zero);
        btnPlus=(Button)findViewById(R.id.addition);
        btnneg=(Button)findViewById(R.id.neg);
        btnSubtract=(Button)findViewById(R.id.subtraction);
        btnMultiply=(Button)findViewById(R.id.multiply);
        btnDivide=(Button)findViewById(R.id.divide);
        btnDot=(Button)findViewById(R.id.dot);
        btnEqual=(Button)findViewById(R.id.equal);
        btnSqrt=(Button)findViewById(R.id.sqrt);
        btnFactorial=(Button)findViewById(R.id.factorial);
        btnMod=(Button)findViewById(R.id.mod);
        btnXpowerY=(Button)findViewById(R.id.xpowery);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                edResult.setText(edResult.getText()+ "1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText(edResult.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText(edResult.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText(edResult.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText(edResult.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText(edResult.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText(edResult.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText(edResult.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText(edResult.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText(edResult.getText()+"0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText(edResult.getText()+".");
            }
        });
        btnneg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                edResult.setText(edResult.getText()+"-");

            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (!edResult.getText().toString().equals("")) {
                    var1 = Double.parseDouble(edResult.getText().toString());
                    int fact = 1;
                    for (int i = 1; i <= var1; i++) {
                        fact = fact * i;
                    }
                    edResult.setText(""+fact);
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                edResult.setText("");
            }
        });
        btnSqrt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (!edResult.getText().toString().equals("")) {
                    var1 = Double.parseDouble(edResult.getText().toString() + "");
                    Double r = (Math.sqrt(var1));
                    edResult.setText(""+r);
                }
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (!edResult.getText().toString().equals("")) {
                    var1 = Double.parseDouble( ""+edResult.getText().toString() );
                    mod = true;
                    edResult.setText(null);
                }
            }
        });

        btnback.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                if(!edResult.getText().toString().equals(""))
                {
                    String value=edResult.getText().toString();
                    if(value.length()>0)

                    {
                        value=value.substring(0,value.length()-1);
                        edResult.setText(value);
                    }

                }
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                var1=Double.parseDouble( ""+edResult.getText());
                Plus=true;
                edResult.setText(null);

            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (!edResult.getText().toString().equals("")) {
                    var1 = Double.parseDouble(""+edResult.getText() );
                    Subtract = true;
                    edResult.setText(null);
                }
            }
        });
        btnXpowerY.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (!edResult.getText().toString().equals("")) {
                    var1 = Double.parseDouble(""+edResult.getText().toString() );
                    XpowerY = true;
                    edResult.setText(null);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (!edResult.getText().toString().equals("")) {
                    var1 = Double.parseDouble(""+edResult.getText().toString() );
                    Multiply = true;
                    edResult.setText(null);
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (!edResult.getText().toString().equals("")) {
                    var1 = Double.parseDouble(""+edResult.getText().toString());
                    Divide = true;
                    edResult.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                var2=Double.parseDouble(edResult.getText().toString()+"");
                if(Plus==true)
                {
                    edResult.setText(var1+var2+"");
                    Plus=false;

                }
                else if(Subtract==true)
                {
                    edResult.setText(var1-var2+"");
                    Subtract=false;
                }
                else if(Multiply==true)
                {
                    edResult.setText(var1*var2+"");
                    Multiply=false;
                }
                else if(Divide==true)
                {
                    edResult.setText(var1/var2+"");
                    Divide=false;
                }
                else if(mod==true)
                {
                    edResult.setText(var1%var2+"");
                    Divide=false;
                }
                else if(XpowerY==true)
                {
                    Double rs=(Math.pow(var1,var2));
                    edResult.setText(rs+"");
                    XpowerY=false;
                }

            }
        });

    }

}
