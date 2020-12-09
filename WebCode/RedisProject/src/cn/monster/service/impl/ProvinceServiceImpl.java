package cn.monster.service.impl;

import cn.monster.dao.ProvinceDao;
import cn.monster.dao.impl.ProvinceDaoImpl;
import cn.monster.domain.Province;
import cn.monster.service.ProvinceService;
import cn.monster.until.JedisPoolUntil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {
    @Override
    public String findProvinceAll() {

        Jedis jedis = JedisPoolUntil.getJedis();
        String province_json = jedis.get("province");
        if(province_json != null) {
            System.out.println("查询redis");
            return province_json;
        }

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("查询数据库");
        ProvinceDao provinceDao = new ProvinceDaoImpl();
        List<Province> provinceAll = provinceDao.findProvinceAll();
        try {
            province_json = objectMapper.writeValueAsString(provinceAll);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        jedis.set("province", province_json);

        return province_json;
    }
}
