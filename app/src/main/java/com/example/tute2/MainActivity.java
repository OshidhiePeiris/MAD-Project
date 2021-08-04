package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declare the five interfaces(UI element)
    EditText et_Temp;
    RadioButton rd_btn_C;
    RadioButton rd_btn_F;
    Button btn_Calculate;
    TextView tv_answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign ids to each and every element
        et_Temp = findViewById(R.id.et_Temp);
        rd_btn_C = findViewById(R.id.rd_btn_C);
        rd_btn_F = findViewById(R.id.rd_btn_F);
        btn_Calculate = findViewById(R.id.btn_Calculate);
        tv_answer = findViewById(R.id.tv_answer);

    }
    //implement a method to call (cal button click then the method will call)

//    @Override
//    protected void onResume() {
//        super.onResume();
//        btn_Calculate.setOnClickListener(new view.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                calculateAnswer();
//            }
//        });
//    }
    //implement calculate answer button
    public void calculateAnswer(View view){
        Calculations cal = new Calculations();
        String value = et_Temp.getText().toString();//assign the value to a string

        //check value empty or not
        if(TextUtils.isEmpty(value)){
            Toast.makeText(this, "Enter the Temp", Toast.LENGTH_SHORT).show();
        }
        else{
            //string to float
            Float temp = Float.parseFloat(value);
            if(rd_btn_F.isChecked()){
                temp = cal.convertFahrenheitToCelcius(temp);
            }
            else if(rd_btn_C.isChecked()){
                temp = cal.convertCelciusToFahrenheit(temp);
            }else{
                Toast.makeText(this, "Select a radio button", Toast.LENGTH_SHORT).show();
                temp = 0.00f;
            }

            tv_answer.setText(new Float(temp).toString());
        }
    }
}
