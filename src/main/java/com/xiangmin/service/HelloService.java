package com.xiangmin.service;

import com.xiangmin.bean.Person;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author pingchun@meili-inc.com
 * @since 2019/7/27
 */
@Component
public class HelloService {
    @Resource(name = "person")
    Person person;
}
