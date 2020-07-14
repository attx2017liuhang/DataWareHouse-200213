package com.atguigu;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author Lh
 * @create 2020-07-13 20:22
 */
public class JedisPoolTest {
    public static void main(String[] args) {

        //创建连接池对象
        JedisPool jedisPool = new JedisPool("hadoop102", 6379);
        //获取Jedis对象连接Redis
        Jedis jedis = jedisPool.getResource();
        //执行具体操作
        System.out.println(jedis.ping());

        //关闭连接
        jedisPool.close();



    }
}
