package yand.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yand.mapper.EmailMapper;
import yand.service.EmailService;

/**
 * 
 * @author YanD
 * 邮件处理逻辑
 */
@Service
public class EmailServiceImpl implements EmailService{
   
   @Autowired
   private EmailMapper emailMapper;


public List<Map<String, Object>> queryEmailList(String accept) {
	// TODO Auto-generated method stub
	return emailMapper.queryEmailList(accept);
}
   
   
}
