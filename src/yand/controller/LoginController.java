package yand.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import yand.entity.Result;
import yand.entity.UserBean;
import yand.service.LoginService;

@Controller
@RequestMapping(value="/oa/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/doLogin")
	@ResponseBody
    public Result doLogin(
    		@RequestParam(value="userId") String userId,
    		@RequestParam(value="password") String password,
    		HttpSession session
    		)
    {
		//声明result结果集
		Result result = new Result();
        /**
         * 封装参数
         */
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userId", userId);
		paramMap.put("password", password);
		List<Map<String, Object>> userBeanMap = null;
		if(userBeanMap != null)
		{
			result.setResultCode("0");
			result.setResultObj(userBeanMap);
			session.setAttribute("USER_INFO", userBeanMap);
		}else
		{
			result.setResultCode("1");
			result.setResultObj("工号或者密码错误,请重新输入");
		}
    	return result;
    }

	
}
