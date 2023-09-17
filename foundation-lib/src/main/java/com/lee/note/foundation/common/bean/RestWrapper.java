package com.lee.note.foundation.common.bean;

public class RestWrapper<Body> {

    private Header header;

    private Body body;

    public RestWrapper(Header requestHeader, Body body) {
        this.header = requestHeader;
        this.body = body;
    }

    public void setHeader(Header requestHeader) {
        this.header = requestHeader;
    }

    public Header getHeader() {
        return this.header;
    }

    public void setRestBody(Body body) {
        this.body = body;
    }

    public Body getRestBody() {
        return this.body;
    }

}
