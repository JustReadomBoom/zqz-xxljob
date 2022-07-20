package com.zqz.xxljob.common.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zqz
 * @Description: xxljob配置初始化
 * @Param:
 * @Return:
 * @Date: 10:56 2020/9/29
 */
@Configuration
@Slf4j
public class XxlJobConfig {

    @Value("${xxl.job.admin.addresses}")
    private String adminAddresses;

    @Value("${xxl.job.executor.appname}")
    private String appName;

    @Value("${xxl.job.executor.ip}")
    private String ip;

    @Value("${xxl.job.executor.port}")
    private int port;

    @Value("${xxl.job.accessToken}")
    private String accessToken;

    @Value("${xxl.job.executor.logpath}")
    private String logPath;

    @Value("${xxl.job.executor.logretentiondays}")
    private int logRetentionDays;

    @Bean
    public XxlJobSpringExecutor xxlJobExecutor() {
        try {
            log.info("=========xxl-job config init start=========");
            XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
            xxlJobSpringExecutor.setAdminAddresses(adminAddresses);
            xxlJobSpringExecutor.setAppname(appName);
            xxlJobSpringExecutor.setIp(ip);
            xxlJobSpringExecutor.setPort(port);
            xxlJobSpringExecutor.setAccessToken(accessToken);
            xxlJobSpringExecutor.setLogPath(logPath);
            xxlJobSpringExecutor.setLogRetentionDays(logRetentionDays);
            log.info("=========xxl-job config init end=========");
            return xxlJobSpringExecutor;
        } catch (Exception e) {
            log.error("xxl-job init error:{}", e.getMessage(), e);
            return null;
        }
    }
}