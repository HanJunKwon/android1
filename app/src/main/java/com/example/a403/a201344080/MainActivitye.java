package com.example.a403.a201344080;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivitye extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) { // 기본함수로 가장 먼저쓰임
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitye); // setcContentView는 메뉴를보여주겠다는 것이다. R=res를 의미한다. res/layout/activity_main_activitye의 화면을 제일 먼저 보여준다
        // setContentView의 매개변수를 다른파일로 지정하면 메인 화면이 바뀐다.

        b1= (Button)findViewById(R.id.button); // res의 아이디가 button인 버튼을 가지고 와 b1객체과 연결.
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),
                        "Hello",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
