package com.atguigu.redis_springboot.jiaolin.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author johnny
 * @Classname SecKillController
 * @Description
 * @Date 2022/2/9 9:04 上午
 */
@RestController
public class SecKillController {


    @RequestMapping("/seckill")
    public boolean seckill(@RequestParam(value = "prd") String prd, @RequestParam(value = "userid") String userid) {
        if (prd == null || userid == null) {
            return false;
        }

        // 连接redis 获取redis连接池对象
        return false;
    }
}
