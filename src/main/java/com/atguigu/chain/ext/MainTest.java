package com.atguigu.chain.ext;
// 1 - 2 - 3 -my -3 -2 -1
public class MainTest {
    public static void main(String[] args) {
        FilterChain filterChain=new FilterChain();

        HttpFilter httpFilter=new HttpFilter();
        CharacterFilter characterFilter=new CharacterFilter();
        EncodingFilter encodingFilter = new EncodingFilter();

        filterChain.addFilter(httpFilter);
        filterChain.addFilter(characterFilter);
        filterChain.addFilter(encodingFilter);

        //filter如何链式执行
        filterChain.setTarget(new My());
        filterChain.doFilter(new Request("hello work"),new Response("adddd"),filterChain);
    }
}
