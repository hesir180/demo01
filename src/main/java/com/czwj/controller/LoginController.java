package com.czwj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.czwj.domain.User;
import com.czwj.service.UserService;
import com.czwj.util.CipherUtil;
import com.czwj.util.GsonUtil;
import com.google.gson.JsonObject;

@Controller
public class LoginController {
	UserService UserService;
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(HttpServletRequest req, HttpServletResponse rep) throws Exception {
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		JsonObject jsonObject = new JsonObject();
		User user = UserService.findByUserCode(userId);
		if(CipherUtil.decrypt(password).equals(user.getPassword())){
			jsonObject.addProperty("result", "ok");
			jsonObject.addProperty("msg", "µÇÂ¼³É¹¦");
		}
		else
		{
			jsonObject.addProperty("result", "fail");
			jsonObject.addProperty("msg", "µÇÂ¼Ê§°Ü");
		}
		return GsonUtil.objectToJsonStr(jsonObject);

	}

}
