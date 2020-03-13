package com.alibaba.ext;

import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author tianming@alibaba-inc.com
 * @since 2020/3/12
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent>{

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Event:"+JSON.toJSONString(event));
    }
}
