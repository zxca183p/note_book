package com.lee.note.foundation.common.bean;

public class RestBody<T> {
    
    private T content;

    public RestBody(T content) {
        this.content = content;
    }

    public void setRequestBody(T content) {
        this.content = content;
    }

    public T getContent() {
        return this.content;
    }
}
