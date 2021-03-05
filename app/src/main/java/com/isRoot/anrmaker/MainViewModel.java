package com.isRoot.anrmaker;

import android.app.Application;
import android.util.Log;


import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {


    public MainViewModel(@NonNull Application application) {
        super(application);
    }


    public void play() {
        boolean flag = true;
        int num = 0;
        while(flag) { // 무한루프 구성
            num++;

            if(num > 20) {
                flag = false; // 무한루프 탈출용
            }

            try {
                Thread.sleep(10000); // 10초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.i("MyLog", "수행 중...");
        }
        Log.i("MyLog", "프로그램 종료");
    }
}
