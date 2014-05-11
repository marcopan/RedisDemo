package com.dinosaur.redistest;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by pan on 2014/5/11.
 */
//quanet 电脑喇叭有电流声，怎么解决？ 等待quanet fix.
public class JedisUtilTest {
    JedisPool pool;
    Jedis jedis;

    @Before
    public void setUp(){
        pool = new JedisPool(new JedisPoolConfig(),"localhost",6379);
        jedis = pool.getResource();
    }

    @Test
    public void testBasicString(){
        jedis.set("name","marco");
        System.out.println(">>"+jedis.get("name"));
    }


    @Test public void testGet(){
        System.out.println(jedis.get("foo"));
    }
}
