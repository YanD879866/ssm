package yand.mapper;
import java.util.*;

/**
 * 
 * @author YanD
 *
 */
public interface EmailMapper {
	 
	 //查询邮件信息列表
     public List<Map<String, Object>> queryEmailList(String accept);
     
}
