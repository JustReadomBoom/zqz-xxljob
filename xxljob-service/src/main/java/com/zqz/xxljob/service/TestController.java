package com.zqz.xxljob.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZQZ
 * @Description:
 * @ClassName: TestController
 * @Date: Created in 14:12 2022-7-5
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {


    @GetMapping("/one")
    public String testOne(){
        log.info("start test one.");
        return "TestOne";
    }
}
