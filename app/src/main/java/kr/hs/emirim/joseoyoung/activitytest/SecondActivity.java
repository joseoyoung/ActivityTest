package kr.hs.emirim.joseoyoung.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button butBack = (Button)findViewById(R.id.but_second);
        butBack.setOnClickListener(butBackHandler);
    }
    View.OnClickListener butBackHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();//사용했던 모든 객체들과 함께 secondactivity도 삭제됨.
        }
    };
}
