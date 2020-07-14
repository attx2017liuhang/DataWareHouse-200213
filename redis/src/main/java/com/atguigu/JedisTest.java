package com.atguigu;

import redis.clients.jedis.Jedis;

/**
 * @author Lh
 * @create 2020-07-13 20:18
 */
public class JedisTest {

    public static void main(String[] args) {
        //指定Redis服务器的IP地址和端口号
        Jedis jedis = new Jedis("hadoop102", 6379);
        //执行ping命令
        String ping = jedis.ping();
        System.out.println(ping);
        System.out.println("Git merge!");

        //关闭连接
        jedis.close();

    }
}
