package yand.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import yand.entity.Result;
import yand.service.EmailService;


@Controller
@RequestMapping(value="/oa/email")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping(value="/readEamil")
    public String readEmail(Model model, HttpSession session)
    {
		Map<String, Object> userInfoMap = (Map<String, Object>)session.getAttribute("USER_INFO");
		String accept = userInfoMap.get("F_USER_NAME").toString();
		List<Map<String, Object>> emailList = emailService.queryEmailList(accept);
		model.addAttribute("emailList", emailList);
    	return "/emailInfo";
    }
}
