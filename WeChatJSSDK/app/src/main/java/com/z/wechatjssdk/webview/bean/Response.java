package com.z.wechatjssdk.webview.bean;

import org.json.JSONObject;

/**
 * Created by Administrator on 15-4-22.
 */
public class Response{

    private int queueIndex;
    private String interfaceNm;
    private JSONObject responseJSON;
    private Object tag;

    public Response(String interfaceNm, JSONObject responseJSON,int queueIndex) {
        this.interfaceNm = interfaceNm;
        this.responseJSON = responseJSON;
        this.queueIndex=queueIndex;
    }
    public int getQueueIndex() {
        return queueIndex;
    }

    public void setQueueIndex(int queueIndex) {
        this.queueIndex = queueIndex;
    }

    public String getInterfaceNm() {
        return interfaceNm;
    }

    public void setInterfaceNm(String interfaceNm) {
        this.interfaceNm = interfaceNm;
    }

    public JSONObject getResponseJSON() {
        return responseJSON;
    }

    public void setResponseJSON(JSONObject responseJSON) {
        this.responseJSON = responseJSON;
    }

    public Object getTag() {
        return tag;
    }

    public void setTag(Object tag) {
        this.tag = tag;
    }
}
