package kr.hs.emirim.joseoyoung.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String name, tel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button butBack = (Button)findViewById(R.id.but_second);
        butBack.setOnClickListener(butBackHandler);
        Intent intent = getIntent();
        name=intent.getStringExtra("name");
        tel=intent.getStringExtra("tel");
        TextView textResult=(TextView)findViewById(R.id.text_result);
        textResult.setText("* 성명: "+name+"\n"+"* 전화번호: "+tel);
    }
    View.OnClickListener butBackHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();//사용했던 모든 객체들과 함께 secondactivity도 삭제됨.
        }
    };
}
