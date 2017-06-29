package yand.util.jedis;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by yanzz on 2017/4/30.
 * 序列化redis对象
 * 这个对象必须实现serializable序列化接口
 */
public class JedisCacheObj implements Serializable {
    private static final long serialVersionUID = -1530813282496676263L;
    private Object obj;

    public Object getObj() {
        return obj;
    }



    public void setObj(Object obj) {
        this.obj = obj;
    }



}
