package com.haoxiujie.workA3;

public class Test {
    //创建并初始化一个IPhone 对象phone和一个Song 对象s，
    //        调用phone的 btFunction()、connecting()和
    //        playMusic(Song song)方法
    public static void main(String[] args) {
        IPhone phone = new IPhone("IPhone");
        Run song = new Run("五月天", "倔强");
        phone.btFunction();
        phone.connecting();
        phone.playMusic(song);
    }
}
