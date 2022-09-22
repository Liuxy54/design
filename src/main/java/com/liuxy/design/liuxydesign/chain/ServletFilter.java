package com.liuxy.design.liuxydesign.chain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ServletFilter
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/9/1 14:11
 **/
public class ServletFilter {
    public static void main(String[] args) {
        Request request = new Request();
        request.setStr("大家好:),<script>大家都是996</script>,liuxinyu");

        //todo
        Response response = new Response();
        response.setStr("");

        Request request1 = new Request();
        request1.setStr("大家好:),<script>大家都是996</script>,liuxinyu");

        //todo
        Response response1 = new Response();
        response1.setStr("");

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new SensitveFilter());
        filterChain.doFilter(request,response,filterChain);
        FilterChain filterChain1 = new FilterChain();
        filterChain1.add(new SensitveFilter()).add(new HTMLFilter());
        filterChain1.doFilter(request1,response1,filterChain1);
        System.out.println(request);
        System.out.println(response);
        System.out.println(request1);
        System.out.println(response1);
    }
}

interface Filter {
    void doFilter(Request request, Response response,FilterChain filterChain);
}

class HTMLFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        System.out.println("request:HTMLFilter");
        request.setStr(request.getStr().replaceAll("<","[").replaceAll(">","]"));
        filterChain.doFilter(request,response,filterChain);
        response.setStr(response.getStr()+"--HTMLFilter()");
    }
}

class SensitveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        System.out.println("request:SensitveFilter");
        request.setStr(request.getStr().replaceAll("996","955"));
        filterChain.doFilter(request,response,filterChain);
        response.setStr(response.getStr()+"--SensitveFilter()");
    }
}

class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();
    int index = 0;
    @Override
    public void doFilter(Request request, Response response,FilterChain filterChain) {
        if (index == filters.size()) return;
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request,response,filterChain);
    }

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }
}
@Data
class Request {
    private String str;
}

@Data
class Response {
    private String str;
}
