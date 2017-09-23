package jp.techacademy.hanai.saki.javalog2;

import android.util.Log;


class Human extends Animal implements Thinkable {

    String m_hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        m_hobby = hobby;
    }


    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は"+this.name + "です、年は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + m_hobby + "について考える。");
    }
}