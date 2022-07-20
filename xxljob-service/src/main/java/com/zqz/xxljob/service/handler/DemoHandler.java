package com.zqz.xxljob.service.handler;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: ZQZ
 * @Description:
 * @ClassName: DemoHandler
 * @Date: Created in 14:23 2022-7-5
 */
@Component
@Slf4j
public class DemoHandler {


    @XxlJob("demoTestHandler")
    public void testDemoHandler() {
        System.out.println("88888888888888888888");
    }
}
