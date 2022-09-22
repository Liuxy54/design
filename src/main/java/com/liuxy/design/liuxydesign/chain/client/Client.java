package com.liuxy.design.liuxydesign.chain.client;

import lombok.Data;

import java.util.ArrayList;

/**
 * @ClassName Client
 * @Description TODO
 * @Img <img src=TODO >
 * @Author liuxy
 * @Date 2022/9/1 11:32
 **/
public class Client {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:),<script>大家都是996</script>,liuxinyu");
        msg.setName("liuxy");
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter())
                .add(new SensitveFilter());
        FilterChain filterChain1 = new FilterChain();
        filterChain1.add(filterChain);
        filterChain1.add(new FaceFilter()).add(new UrlFilter());
        filterChain1.doFilter(msg);

        System.out.println(msg);
    }

}

@Data
class Msg {
    private String name;

    private String msg;
}

interface Filter {
    Boolean doFilter(Msg msg);
}

class HTMLFilter implements Filter{

    @Override
    public Boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("<","[");
        r = r.replace(">","]");
        msg.setMsg(r);
        return true;
    }
}

class SensitveFilter implements Filter {

    @Override
    public Boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replaceAll("996","955");
        msg.setMsg(r);
        return false;
    }
}

class FaceFilter implements Filter {

    @Override
    public Boolean doFilter(Msg msg) {
        String r = msg.getMsg();
         r = r.replace(":)", "^v^");
        msg.setMsg(r);
        return true;
    }
}

class UrlFilter implements Filter {

    @Override
    public Boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("liuxinyu","liuxy");
        msg.setMsg(r);
        return true;
    }
}

class FilterChain implements Filter{
    ArrayList<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public Boolean doFilter(Msg msg){
        for (Filter filter : filters) {
            if (!filter.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
