package yand.util.jedis;

import redis.clients.jedis.Jedis;
import yand.exception.MyException;

/**
 * Created by yanzz on 2017/4/30.
 * redis 工具帮助类
 * 用于帮助redis存储
 */
public class RedisTemple  {
    //将这个类进行私有化处理
    private static  RedisTemple redisTemple = null;

    /**
     *  redis 客户端
     */
    private  Jedis jedis;

    /**
     * 构建私有化构造器
     * 防止外部
     */
    private RedisTemple(){
        jedis =new Jedis("127.0.0.1",6379);
    }

    /**
     * 将该对象进行
     */
    public static RedisTemple getIntance(){
        if(redisTemple == null){
            redisTemple = new RedisTemple();
        }
        return redisTemple;
    }

    /**
     * 判断该redis 是否连接
     */
    public  boolean isConnected(){
         return jedis.isConnected();
    }

    /**
     * 将对象put进 redis中
     */
    public void put(String key, Object obj){
        /**
         * 首先先通过key获取值，有过有值说明 该key 已存在抛出错误
         */
        if(jedis.get(key.getBytes()) != null){
            throw new MyException("该key值已经存在");
        }
        /**
         * 创建出JedisCacheObj对象
         *
         */
        JedisCacheObj jedisCacheObj = new JedisCacheObj();
        jedisCacheObj.setObj(obj);
        jedis.set(key.getBytes(), SerializationUtil.serialize(jedisCacheObj));
    }

    /**
     * 通过key获取Object 值
     * @param key
     * @return
     */
    public Object get(String key){
        byte[] bytes = jedis.get(key.getBytes());
        if(bytes == null){
          throw new MyException("redis中没有该key值...");
        }
        JedisCacheObj jedisCacheObj = SerializationUtil.deSerialize(bytes);
        return jedisCacheObj.getObj();
    }



}
