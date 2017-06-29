package yand.mapper;

import java.util.List;
import java.util.Map;

import yand.entity.UserBean;


public interface UserMapper {
    
	/**
	 * 根据工号密码查询是否有该人员
	 * @param paramMap
	 * @return
	 */
	public Map<String, Object> queryUserBean(Map<String, Object> paramMap);

}
