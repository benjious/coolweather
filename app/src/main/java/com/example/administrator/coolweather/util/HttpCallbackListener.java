package com.example.administrator.coolweather.util;

/**
 * Created by Administrator on 2016/3/23.
 */
public interface HttpCallbackListener {
    public abstract void onFinish(String response);

    public abstract void onError(Exception e);
}
