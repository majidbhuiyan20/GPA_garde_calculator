package com.bhuiyan.gpacounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edBangla, edEnglish, edMathematics, edPhysics, edChemistry, edBiology;
    Button button;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edBangla = findViewById(R.id.edBangla);
        edEnglish = findViewById(R.id.edEnglish);
        edMathematics = findViewById(R.id.edMathematics);
        edPhysics = findViewById(R.id.edPhysics);
        edChemistry = findViewById(R.id.edChemistry);
        edBiology = findViewById(R.id.edBiology);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(edBangla.getText().toString().length()>0 && edEnglish.getText().toString().length()>0 && edMathematics.getText().toString().length()>0 && edPhysics.getText().toString().length()>0 && edChemistry.getText().toString().length()>0 && edBiology.getText().toString().length()>0 )
                {
                    int bangla = Integer.parseInt(edBangla.getText().toString());
                    int english = Integer.parseInt(edEnglish.getText().toString());
                    int mathematics = Integer.parseInt(edMathematics.getText().toString());
                    int physics = Integer.parseInt(edPhysics.getText().toString());
                    int chemistry = Integer.parseInt(edChemistry.getText().toString());
                    int biology = Integer.parseInt(edBiology.getText().toString());

                    if(bangla<33 || english<33 || mathematics<33 || physics<33 || chemistry<33 || biology<33)
                    {
                        tvDisplay.setText("You are Failed");
                    }
                    else
                    {
                        float total = (float) (bangla+english+mathematics+physics+chemistry+biology)/6;


                        if(total>=80)
                        {
                            tvDisplay.setText("You Got A+");
                        }
                        else if(total>=70 && total<80)
                        {
                            tvDisplay.setText("You Got A");
                        }
                        else if(total>=60 && total<70)
                        {
                            tvDisplay.setText("You Got A-");
                        }
                        else if(total>=50 && total<60)
                        {
                            tvDisplay.setText("You Got B");
                        }
                        else if(total>=40 && total<50)
                        {
                            tvDisplay.setText("You Got c");
                        }
                        else if(total>=33 && total<40)
                        {
                            tvDisplay.setText("You Got D");
                        }
                        else
                        {
                            tvDisplay.setText("You Failed");
                        }
                    }


                }

                else
                {
                    Toast.makeText(MainActivity.this, "Please Fill Up All Input", Toast.LENGTH_SHORT).show();
                }



            }
        });






    }
}