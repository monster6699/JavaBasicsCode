package cn.monster.until;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JedisPoolUntil {
    private static Jedis jedis;

    static {
        InputStream resourceAsStream = JedisPoolUntil.class.getClassLoader().getResourceAsStream("jedis.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(Integer.parseInt(properties.getProperty("maxTotal")) );
        jedisPoolConfig.setMaxIdle(Integer.parseInt(properties.getProperty("maxIdle")) );
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, properties.getProperty("host"), Integer.parseInt(properties.getProperty("port")));
        jedis = jedisPool.getResource();
        jedis.auth(properties.getProperty("password"));


    }

    public static Jedis getJedis() {
        return jedis;
    }
}
