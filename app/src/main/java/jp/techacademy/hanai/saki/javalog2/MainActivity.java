package jp.techacademy.hanai.saki.javalog2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human1 = new Human("はなこ",10,"サッカー");
        Human human2 = new Human("タロ",12,"バスケ");

        human1.say();
        human1.think();
        human2.say();
        human2.think();
    }
}
