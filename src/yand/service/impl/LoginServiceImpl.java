package yand.service.impl;

import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yand.entity.UserBean;
import yand.mapper.UserMapper;
import yand.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserMapper userMapper;

	//添加Loger日志
	private static Logger logger = Logger.getLogger(LoginServiceImpl.class);

	public Map<String, Object> queryUserBean(Map<String, Object> paramMap)
	{
		logger.debug("获取登录人的信息...");
		return userMapper.queryUserBean(paramMap);
	}


}
