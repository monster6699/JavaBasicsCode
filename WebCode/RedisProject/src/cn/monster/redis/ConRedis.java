package cn.monster.redis;

import cn.monster.until.JedisPoolUntil;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class ConRedis {
    @Test
    public void connRedis() {
        Jedis jedis = JedisPoolUntil.getJedis();
        jedis.set("jedisPool", "helloJedisPool");
        jedis.close();
    }
}
