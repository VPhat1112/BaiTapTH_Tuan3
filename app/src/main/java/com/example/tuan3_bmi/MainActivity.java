package com.example.tuan3_bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numnang;
    Float numcao;
    Float numkq;
    String str;
    boolean kt=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttinh = (Button) findViewById(R.id.bttinh);
        //Button có id là bttinh bên activity_man.xml
        EditText nang = (EditText) findViewById(R.id.cantext);
        //Text number có id là cantext bên activity_man.xml
        EditText cao = (EditText) findViewById(R.id.caotext);
        //Text number có id là caotext bên activity_man.xml
        TextView kq= (TextView) findViewById(R.id.kqtext);
        //Textview có id là kqtext bên activity_man.xml
        TextView kqc= (TextView) findViewById(R.id.tttext);
        //Textview có id là tttext bên activity_man.xml
        bttinh.setOnClickListener(new View.OnClickListener() {
            @Override
              public void onClick(View view) {
                  numnang = Integer.parseInt(nang.getText().toString());
                  //Gán giá trị chuyển từ string sang integer từ cantext
                  numcao = Float.parseFloat(cao.getText().toString());
                  //Gán giá trị chuyển từ string sang integer từ caotext
                  if (numcao==0){//Kiểm tra giá tri nhập đúng hay không
                      kq.setText("Nhập đúng định dạng".toString());
                      //Sai phải nhập lại
                  }else{
                      str=String.valueOf(numnang*1.0/(numcao*numcao));
                      //Biểu thức tính toán BMI chuyển sang kiểu string
                      kq.setText(str);
                      //Gán kết quả của biến vào textview
                      numkq=Float.parseFloat(kq.getText().toString());
                      //Chuyển lại kiểu float
                      String loai;
                      //Khai báo biến loại và kiểm tra theo điều kiện
                      if ( numkq <18 ) loai="Người gầy";
                      else if (numkq < 25) loai = "Người bình thường";
                      else if (numkq <30) loai = "Người béo phì độ I";
                      else if (numkq <35) loai ="Người béo phì độ II";
                      else loai= "Người béo phì độ III";
                      kqc.setText(loai);
                      //Gán giá trị vào textview
                  }}
                                  }
        );

    }
}