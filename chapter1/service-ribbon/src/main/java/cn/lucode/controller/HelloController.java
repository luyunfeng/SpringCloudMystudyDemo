package cn.lucode.controller;

import cn.lucode.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yunfeng.lu on 2017/9/13.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    /**
     * 测试  ribbon 的负载均衡能力
     * 100 循环访问输出最后的端口号
     * @param name
     * @return
     */
    //@RequestMapping(value = "/hi")
    @GetMapping("/hi")
    public Map<String, Object> hi(@RequestParam String name) {

        Map<String, Object> map = new HashMap<>();
        int two = 0;
        int three = 0;
        int four = 0;
        for (int i = 0; i < 100; i++) {

            String str = helloService.hiService(name + i);
            // 端口号在结尾处所以直接判断以什么结尾就可以
            if (str.endsWith("2")) {
                two++;
            } else if (str.endsWith("3")) {
                three++;
            } else if (str.endsWith("4")) {
                four++;
            }

        }
        map.put("8762", two);
        map.put("8763", three);
        map.put("8764", four);
        return map;
    }

}