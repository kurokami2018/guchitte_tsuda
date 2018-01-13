package com.example.kurokami.guchitte_tsuda;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.AppLaunchChecker;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private int clicked;
    private int count;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;

    Calendar cal = Calendar.getInstance();
    int month = cal.get(Calendar.MONTH)+1; //月を取得


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forBeginner();//アプリを初回起動の時だけ出てくる説明画像を表示する

    }

    void forBeginner() {
        boolean before = AppLaunchChecker.hasStartedFromLauncher(this);
        if (before == false) {
            ImageView imageView = new ImageView(this);//表示する場所と思われるthisか？
            imageView.setImageResource(R.drawable.exp);
            setContentView(imageView);

            //タップされたら画面を閉じるみたいな機能をつけて完了のはず
        }
    }

    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        //preferences fileをロード
        pref = this.getSharedPreferences("count_1",Context.MODE_PRIVATE);
        editor = pref.edit();
        //preferenceからclickedをキーに値を取得 なければ0
        clicked = pref.getInt("clicked", 0);

        //呟きを入力・消えるview
        ImageButton button = (ImageButton) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    clicked++;
                    Toast.makeText(getApplicationContext(), String.valueOf(clicked), Toast.LENGTH_SHORT).show();
                    applyPreference();

                EditText editText = (EditText) findViewById(R.id.editText);
                TextView textView = (TextView) findViewById(R.id.textView);
                AlphaAnimation fadein_image = new AlphaAnimation(0.0f, 1.0f);
                fadein_image.setDuration(1000);
                inputMessage.inputMessage(editText, textView);
                leaf();
            }
        });
        count = Integer.valueOf(clicked);

        //月間ページに移動
        ImageButton monthButton = (ImageButton) findViewById(R.id.b_mon);
        monthButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.kurokami.guchitte_tsuda", "com.example.kurokami.guchitte_tsuda.monthly");
                intent.putExtra("count_1",count);
                startActivity(intent);
            }
        });

        }
    //preferenceを更新
    private void applyPreference()
    {
        editor.putInt("clicked", clicked);
        editor.apply();
    }





    //葉っぱのエフェクト効果設定
    void leaf(){
        AlphaAnimation fadein_image = new AlphaAnimation(0.0f, 1.0f);
        fadein_image.setDuration(1000);

        ImageView img2 = (ImageView) findViewById(R.id.leaf_2);
        img2.setImageResource(R.drawable.leaf_2);
        img2.startAnimation(fadein_image);
        delGrumble.delGrumble(img2);

        ImageView img3 = (ImageView) findViewById(R.id.leaf_3);
        img3.setImageResource(R.drawable.leaf_3);
        img3.startAnimation(fadein_image);
        delGrumble.delGrumble(img3);

        ImageView img4 = (ImageView) findViewById(R.id.leaf_4);
        img4.setImageResource(R.drawable.leaf_4);
        img4.startAnimation(fadein_image);
        delGrumble.delGrumble(img4);

        ImageView img5 = (ImageView) findViewById(R.id.leaf_5);
        img5.setImageResource(R.drawable.leaf_5);
        img5.startAnimation(fadein_image);
        delGrumble.delGrumble(img5);

        ImageView img6 = (ImageView) findViewById(R.id.leaf_6);
        img6.setImageResource(R.drawable.leaf_6);
        img6.startAnimation(fadein_image);
        delGrumble.delGrumble(img6);

        ImageView img7 = (ImageView) findViewById(R.id.leaf_7);
        img7.setImageResource(R.drawable.leaf_7);
        img7.startAnimation(fadein_image);
        delGrumble.delGrumble(img7);

        ImageView img8 = (ImageView) findViewById(R.id.leaf_8);
        img8.setImageResource(R.drawable.leaf_8);
        img8.startAnimation(fadein_image);
        delGrumble.delGrumble(img8);

        ImageView img9 = (ImageView) findViewById(R.id.leaf_9);
        img9.setImageResource(R.drawable.leaf_9);
        img9.startAnimation(fadein_image);
        delGrumble.delGrumble(img9);

        ImageView img10 = (ImageView) findViewById(R.id.leaf_10);
        img10.setImageResource(R.drawable.leaf_10);
        img10.startAnimation(fadein_image);
        delGrumble.delGrumble(img10);

        ImageView img11 = (ImageView) findViewById(R.id.leaf_11);
        img11.setImageResource(R.drawable.leaf_11);
        img11.startAnimation(fadein_image);
        delGrumble.delGrumble(img11);

        ImageView img12 = (ImageView) findViewById(R.id.leaf_12);
        img12.setImageResource(R.drawable.leaf_12);
        img12.startAnimation(fadein_image);
        delGrumble.delGrumble(img12);

        ImageView img13 = (ImageView) findViewById(R.id.leaf_13);
        img13.setImageResource(R.drawable.leaf_13);
        img13.startAnimation(fadein_image);
        delGrumble.delGrumble(img13);

        ImageView img14 = (ImageView) findViewById(R.id.leaf_14);
        img14.setImageResource(R.drawable.leaf_14);
        img14.startAnimation(fadein_image);
        delGrumble.delGrumble(img14);

        ImageView img15 = (ImageView) findViewById(R.id.leaf_15);
        img15.setImageResource(R.drawable.leaf_15);
        img15.startAnimation(fadein_image);
        delGrumble.delGrumble(img15);

        ImageView img16 = (ImageView) findViewById(R.id.leaf_16);
        img16.setImageResource(R.drawable.leaf_16);
        img16.startAnimation(fadein_image);
        delGrumble.delGrumble(img16);

        ImageView img17 = (ImageView) findViewById(R.id.leaf_17);
        img17.setImageResource(R.drawable.leaf_17);
        img17.startAnimation(fadein_image);
        delGrumble.delGrumble(img17);

        ImageView img18 = (ImageView) findViewById(R.id.leaf_18);
        img18.setImageResource(R.drawable.leaf_18);
        img18.startAnimation(fadein_image);
        delGrumble.delGrumble(img18);

        ImageView img19 = (ImageView) findViewById(R.id.leaf_19);
        img19.setImageResource(R.drawable.leaf_19);
        img19.startAnimation(fadein_image);
        delGrumble.delGrumble(img19);

        ImageView img20 = (ImageView) findViewById(R.id.leaf_20);
        img20.setImageResource(R.drawable.leaf_20);
        img20.startAnimation(fadein_image);
        delGrumble.delGrumble(img20);

    }
}
