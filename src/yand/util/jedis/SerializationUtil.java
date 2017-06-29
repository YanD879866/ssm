package yand.util.jedis;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by yanzz on 2017/4/30.
 * 序列化工具用于 进行序列化和反序列化
 */
public class SerializationUtil {

    /**
     * 序列化就是把 对象打散成 byte[] 数组
     * 通过ObjectOutputStream 的 writeObject 方法将 object
     * 写进
     * ByteArrayOutputStream 转化成 字节数组对象
     */
    public static byte[] serialize(Object object){
         ObjectOutputStream oos = null;
         ByteArrayOutputStream baos = null;
    try{
         baos = new ByteArrayOutputStream();
         oos = new ObjectOutputStream(baos);
         oos.writeObject(object);
         byte [] bytes = baos.toByteArray();
         return bytes;
        }catch(Exception e){
          e.printStackTrace();
          return null;
        }
    }

    /**
     * 反序列化
     * ByteArrayInputStream 将字节数组抛入该对象中
     * 通过ObjectInputStream 读取出来
     */
    public static JedisCacheObj deSerialize(byte[] bytes) {
        ByteArrayInputStream bais = null;
        try {
            bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object obj = ois.readObject();
            return (JedisCacheObj)obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
