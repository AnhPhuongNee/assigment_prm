package com.example.assigment_pcm.activity;

import java.util.List;

public class ThuocModel {
    boolean success;
    String message;
    List<Thuoc> result;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Thuoc> getResult() {
        return result;
    }

    public void setResult(List<Thuoc> result) {
        this.result = result;
    }
}
