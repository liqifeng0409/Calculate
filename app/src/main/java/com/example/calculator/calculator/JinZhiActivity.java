package com.example.calculator.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import com.example.calculator.Utils.*;
import androidx.appcompat.app.AppCompatActivity;


public class JinZhiActivity extends AppCompatActivity {
    String sp1类型, sp2类型, sp3类型, sp4类型, sp5类型, sp6类型, sp7类型, sp8类型;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jin_zhi);

        //进制转换
        final EditText text1 = findViewById(R.id.text1);
        final EditText text2 = findViewById(R.id.text2);
        Button ok = findViewById(R.id.button确认1);
        Button clear = findViewById(R.id.button清除1);
        Spinner sp1 = findViewById(R.id.sp1);
        Spinner sp2 = findViewById(R.id.sp2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.进制, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter1);
        sp2.setAdapter(adapter1);
        sp1.setOnItemSelectedListener(new OnItemSelectedListener() {//sp1选择item的选择点击监听事件
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                sp1类型 = arg0.getItemAtPosition(arg2).toString();  //捕获sp1
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });


        sp2.setOnItemSelectedListener(new OnItemSelectedListener() {//sp2选择item的选择点击监听事件
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                sp2类型 = arg0.getItemAtPosition(arg2).toString();  //捕获sp2


            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sp1类型.equals(sp2类型)) {
                    text2.setText(text1.getText());
                } else if (sp1类型.equals("十进制") && sp2类型.equals("二进制")) {
                    text2.setText(JinZhi.十转二(Integer.parseInt(text1.getText().toString())));
                } else if (sp1类型.equals("十进制") && sp2类型.equals("八进制")) {
                    text2.setText(JinZhi.十转八(Integer.parseInt(text1.getText().toString())));
                } else if (sp1类型.equals("十进制") && sp2类型.equals("十六进制")) {
                    text2.setText(JinZhi.十转十六(Integer.parseInt(text1.getText().toString())));
                } else if (sp1类型.equals("二进制") && sp2类型.equals("八进制")) {
                    text2.setText(JinZhi.十转八(Integer.parseInt(JinZhi.二转十(text1.getText().toString()))));
                } else if (sp1类型.equals("二进制") && sp2类型.equals("十进制")) {
                    text2.setText(JinZhi.二转十(text1.getText().toString()));
                } else if (sp1类型.equals("二进制") && sp2类型.equals("十六进制")) {
                    text2.setText(JinZhi.十转十六(Integer.parseInt(JinZhi.二转十(text1.getText().toString()))));
                } else if (sp1类型.equals("八进制") && sp2类型.equals("二进制")) {
                    text2.setText(JinZhi.十转二(Integer.parseInt(JinZhi.八转十(text1.getText().toString()))));
                } else if (sp1类型.equals("八进制") && sp2类型.equals("十进制")) {
                    text2.setText(JinZhi.八转十(text1.getText().toString()));
                } else if (sp1类型.equals("八进制") && sp2类型.equals("十六进制")) {
                    text2.setText(JinZhi.十转十六(Integer.parseInt(JinZhi.八转十(text1.getText().toString()))));
                } else if (sp1类型.equals("十六进制") && sp2类型.equals("二进制")) {
                    text2.setText(JinZhi.十转二(Integer.parseInt(JinZhi.十六转十(text1.getText().toString()))));
                } else if (sp1类型.equals("十六进制") && sp2类型.equals("八进制")) {
                    text2.setText(JinZhi.十转八(Integer.parseInt(JinZhi.十六转十(text1.getText().toString()))));
                } else if (sp1类型.equals("十六进制") && sp2类型.equals("十进制")) {
                    text2.setText(JinZhi.十六转十(text1.getText().toString()));
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("");
                text2.setText("");
            }
        });
        final EditText text3 = findViewById(R.id.text3);
        final EditText text4 = findViewById(R.id.text4);
        Button ok2 = findViewById(R.id.button确认2);
        Button clear2 = findViewById(R.id.button清除2);
        Spinner sp3 = findViewById(R.id.sp3);
        Spinner sp4 = findViewById(R.id.sp4);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this, R.array.长度单位, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp3.setAdapter(adapter2);
        sp4.setAdapter(adapter2);
        sp3.setOnItemSelectedListener(new OnItemSelectedListener() {//sp3选择item的选择点击监听事件
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                sp3类型 = arg0.getItemAtPosition(arg2).toString();  //捕获sp3
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });


        sp4.setOnItemSelectedListener(new OnItemSelectedListener() {//sp4选择item的选择点击监听事件
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                sp4类型 = arg0.getItemAtPosition(arg2).toString();  //捕获sp4


            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
        ok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sp3类型.equals(sp4类型)) {
                    text4.setText(text3.getText());
                } else if (sp3类型.equals("mm") && sp4类型.equals("cm")) {
                    text4.setText(Length.mmTocm(text3.getText().toString()));
                } else if (sp3类型.equals("mm") && sp4类型.equals("dm")) {
                    text4.setText(Length.mmTodm(text3.getText().toString()));
                } else if (sp3类型.equals("mm") && sp4类型.equals("m")) {
                    text4.setText(Length.mmTom(text3.getText().toString()));
                } else if (sp3类型.equals("cm") && sp4类型.equals("mm")) {
                    text4.setText(Length.cmTomm(text3.getText().toString()));
                } else if (sp3类型.equals("cm") && sp4类型.equals("dm")) {
                    text4.setText(Length.cmTodm(text3.getText().toString()));
                } else if (sp3类型.equals("cm") && sp4类型.equals("m")) {
                    text4.setText(Length.cmTom(text3.getText().toString()));
                } else if (sp3类型.equals("dm") && sp4类型.equals("mm")) {
                    text4.setText(Length.dmTomm(text3.getText().toString()));
                } else if (sp3类型.equals("dm") && sp4类型.equals("cm")) {
                    text4.setText(Length.dmTocm(text3.getText().toString()));
                } else if (sp3类型.equals("dm") && sp4类型.equals("m")) {
                    text4.setText(Length.dmTom(text3.getText().toString()));
                } else if (sp3类型.equals("m") && sp4类型.equals("mm")) {
                    text4.setText(Length.mTomm(text3.getText().toString()));
                } else if (sp3类型.equals("m") && sp4类型.equals("cm")) {
                    text4.setText(Length.mTocm(text3.getText().toString()));
                } else if (sp3类型.equals("m") && sp4类型.equals("dm")) {
                    text4.setText(Length.mTodm(text3.getText().toString()));
                }
            }
        });
        clear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text3.setText("");
                text4.setText("");
            }
        });
        final EditText text5 = findViewById(R.id.text5);
        final EditText text6 = findViewById(R.id.text6);
        Button ok3 = findViewById(R.id.button确认3);
        Button clear3 = findViewById(R.id.button清除3);
        Spinner sp5 = findViewById(R.id.sp5);
        Spinner sp6 = findViewById(R.id.sp6);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.体积, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp5.setAdapter(adapter3);
        sp6.setAdapter(adapter3);
        sp5.setOnItemSelectedListener(new OnItemSelectedListener() {//sp3选择item的选择点击监听事件
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                sp5类型 = arg0.getItemAtPosition(arg2).toString();  //捕获sp5
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });


        sp6.setOnItemSelectedListener(new OnItemSelectedListener() {//sp4选择item的选择点击监听事件
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                sp6类型 = arg0.getItemAtPosition(arg2).toString();  //捕获sp4


            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
        ok3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sp5类型.equals(sp6类型)) {
                    text6.setText(text5.getText());
                } else if (sp5类型.equals("mm³") && sp6类型.equals("cm³")) {
                    text6.setText(Volume.mmTocm(text5.getText().toString()));
                } else if (sp5类型.equals("mm³") && sp6类型.equals("dm³")) {
                    text6.setText(Volume.mmTodm(text5.getText().toString()));
                } else if (sp5类型.equals("mm³") && sp6类型.equals("m³")) {
                    text6.setText(Volume.mmTom(text5.getText().toString()));
                } else if (sp5类型.equals("cm³") && sp6类型.equals("mm³")) {
                    text6.setText(Volume.cmTomm(text5.getText().toString()));
                } else if (sp5类型.equals("cm³") && sp6类型.equals("dm³")) {
                    text6.setText(Volume.cmTodm(text5.getText().toString()));
                } else if (sp5类型.equals("cm³") && sp6类型.equals("m³")) {
                    text6.setText(Volume.cmTom(text5.getText().toString()));
                } else if (sp5类型.equals("dm³") && sp6类型.equals("mm³")) {
                    text6.setText(Volume.dmTomm(text5.getText().toString()));
                } else if (sp5类型.equals("dm³") && sp6类型.equals("cm³")) {
                    text6.setText(Volume.dmTocm(text5.getText().toString()));
                } else if (sp5类型.equals("dm³") && sp6类型.equals("m³")) {
                    text6.setText(Volume.dmTom(text5.getText().toString()));
                } else if (sp5类型.equals("m³") && sp6类型.equals("mm³")) {
                    text6.setText(Volume.mTomm(text5.getText().toString()));
                } else if (sp5类型.equals("m³") && sp6类型.equals("cm³")) {
                    text6.setText(Volume.mTocm(text5.getText().toString()));
                } else if (sp5类型.equals("m³") && sp6类型.equals("dm³")) {
                    text6.setText(Volume.mTodm(text5.getText().toString()));
                }
            }
        });
        clear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text5.setText("");
                text6.setText("");
            }
        });
        final EditText text7 = findViewById(R.id.text7);
        final EditText text8 = findViewById(R.id.text8);
        Button ok4 = findViewById(R.id.button确认4);
        Button clear4 = findViewById(R.id.button清除4);
        Spinner sp7 = findViewById(R.id.sp7);
        Spinner sp8 = findViewById(R.id.sp8);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this, R.array.汇率, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp7.setAdapter(adapter4);
        sp8.setAdapter(adapter4);
        sp7.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                sp7类型 = arg0.getItemAtPosition(arg2).toString();
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });


        sp8.setOnItemSelectedListener(new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                sp8类型 = arg0.getItemAtPosition(arg2).toString();


            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub
            }
        });
        ok4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sp7类型.equals(sp8类型)) {
                    text8.setText(text7.getText());
                } else if (sp7类型.equals("CNY") && sp8类型.equals("USD")) {
                    text8.setText(ExchangeRate.CNYToUSD(text7.getText().toString()));
                } else if (sp7类型.equals("CNY") && sp8类型.equals("EUR")) {
                    text8.setText(ExchangeRate.CNYToEUR(text7.getText().toString()));
                } else if (sp7类型.equals("CNY") && sp8类型.equals("JPY")) {
                    text8.setText(ExchangeRate.CNYToJPY(text7.getText().toString()));
                } else if (sp7类型.equals("USD") && sp8类型.equals("CNY")) {
                    text8.setText(ExchangeRate.USDToCNY(text7.getText().toString()));
                } else if (sp7类型.equals("USD") && sp8类型.equals("EUR")) {
                    text8.setText(ExchangeRate.CNYToEUR(ExchangeRate.USDToCNY(text7.getText().toString())));
                } else if (sp7类型.equals("USD") && sp8类型.equals("JPY")) {
                    text8.setText(ExchangeRate.CNYToJPY(ExchangeRate.USDToCNY(text7.getText().toString())));
                } else if (sp7类型.equals("EUR") && sp8类型.equals("CNY")) {
                    text8.setText(ExchangeRate.EURToCNY(text7.getText().toString()));
                } else if (sp7类型.equals("EUR") && sp8类型.equals("USD")) {
                    text8.setText(ExchangeRate.CNYToUSD(ExchangeRate.EURToCNY(text7.getText().toString())));
                } else if (sp7类型.equals("EUR") && sp8类型.equals("JPY")) {
                    text8.setText(ExchangeRate.CNYToJPY(ExchangeRate.EURToCNY(text7.getText().toString())));
                } else if (sp7类型.equals("JPY") && sp8类型.equals("CNY")) {
                    text8.setText(ExchangeRate.JPYToCNY(text7.getText().toString()));
                } else if (sp7类型.equals("JPY") && sp8类型.equals("USD")) {
                    text8.setText(ExchangeRate.CNYToUSD(ExchangeRate.JPYToCNY(text7.getText().toString())));
                } else if (sp7类型.equals("JPY") && sp8类型.equals("EUR")) {
                    text8.setText(ExchangeRate.CNYToEUR(ExchangeRate.JPYToCNY(text7.getText().toString())));
                }
            }
        });
        clear4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text7.setText("");
                text8.setText("");
            }
        });
    }
}
