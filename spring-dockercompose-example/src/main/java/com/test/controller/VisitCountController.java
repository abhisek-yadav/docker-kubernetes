package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
public class VisitCountController {

    @GetMapping("/ping")
    public String ping() {
        System.err.println("ping call");
        return "Hello World!";
    }

    @GetMapping("/visits")
    public String visitCount() {
        Jedis jedis = new Jedis("redis");

        if (jedis.get("visit") == null)
            jedis.set("visit", String.valueOf(0));

        int visits = Integer.parseInt(jedis.get("visit"));
        jedis.set("visit", String.valueOf(visits + 1));

        return String.valueOf(visits);
    }

}
