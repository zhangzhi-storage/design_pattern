package com.atguigu.chain.ext;

import lombok.Data;

@Data
public class Response {
    private String content;

    public Response(String content) {
        this.content = content;
    }
}

