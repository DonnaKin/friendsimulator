package kr.hs.emirim.mkkim916.kimdoori;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void onClick(View view){
        switch(view.getId()){
            case R.id.button1: Toast.makeText(this, "잠깐",Toast.LENGTH_SHORT).show(); break;
            case R.id.button2: Toast.makeText(this, "아니 근데에",Toast.LENGTH_SHORT).show(); break;
            case R.id.button3: Toast.makeText(this, "있잖아~",Toast.LENGTH_SHORT).show(); break;
            case R.id.button4: Toast.makeText(this, "선생니임~!",Toast.LENGTH_SHORT).show(); break;
            case R.id.button5: Toast.makeText(this, "야 김민듀",Toast.LENGTH_SHORT).show(); break;
            default: Toast.makeText(this, "니 뭐하냐",Toast.LENGTH_SHORT).show(); break;
        }


    }
}
