package com.z.wechatjssdk.webview;

import com.z.wechatjssdk.webview.bean.Request;

import org.json.JSONObject;

/**
 * Created by Administrator on 15-4-22.
 */
public interface IPresenter {
    public void processEvent(Request request);
}
