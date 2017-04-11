package kr.hs.emirim.mkkim916.kimdoori;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public final static String TAG = "김두리:Main";
    private ImageView mImageViewFriendVisual;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출~");
        setContentView(R.layout.activity_main);
        mImageViewFriendVisual = (ImageView) findViewById(R.id.friend_visual);
        Log.d(TAG, "Activity_main 레이아웃 세팅~");
        mMediaPlayer = MediaPlayer.create(this, R.raw.a06);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        mMediaPlayer.pause();
        mMediaPlayer.stop();
    }
    @Override
    public void onClick(View view){
        Log.d(TAG,"onClick 메소드 호출~");
        Log.d(TAG,"클릭된 뷰 id : "+view.getId());

        if(mMediaPlayer.isPlaying()){
            mMediaPlayer.pause();
        }
        switch(view.getId()){
            case R.id.button1:
                Log.d(TAG,"버튼1 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.doori_2);
                Toast.makeText(this, "잠깐",Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.a01);
                mMediaPlayer.start();
                break;
            case R.id.button2:
                Log.d(TAG,"버튼2 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.doori_3);
                Toast.makeText(this, "아니 근데에",Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.a02);
                mMediaPlayer.start();
                break;
            case R.id.button3:
                Log.d(TAG,"버튼3 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.doori_2);
                Toast.makeText(this, "있잖아~",Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.a03);
                mMediaPlayer.start();
                break;
            case R.id.button4:
                Log.d(TAG,"버튼4 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.doori_1);
                Toast.makeText(this, "선생니임~!",Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.a04);
                mMediaPlayer.start();
                break;
            case R.id.button5:
                Log.d(TAG,"버튼5 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.doori_3);
                Toast.makeText(this, "야 김민듀",Toast.LENGTH_SHORT).show();
                mMediaPlayer = MediaPlayer.create(this, R.raw.a05);
                mMediaPlayer.start();
                break;
            default:
                Log.d(TAG,"모르는 녀석 클릭");
                Toast.makeText(this, "니 뭐하냐",Toast.LENGTH_SHORT).show(); break;
        }
        Log.d(TAG,"onClick 메소드 무사히 종료");

    }
}
