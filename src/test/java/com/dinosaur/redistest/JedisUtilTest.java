package com.dinosaur.redistest;

import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by pan on 2014/5/11.
 */
public class JedisUtilTest {
    JedisPool pool;
    Jedis jedis;

    @Before
    public void setUp(){
        pool = new JedisPool(new JedisPoolConfig(),"localhost");
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
