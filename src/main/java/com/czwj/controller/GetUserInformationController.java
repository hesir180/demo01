package com.czwj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.czwj.domain.User;
import com.czwj.service.UserService;
import com.czwj.util.GsonUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Controller
public class GetUserInformationController {
	UserService userService;
	@RequestMapping(value="/userInformation",method = RequestMethod.GET)
	public String getUserInformation(@RequestParam(value = "userId", required = true)String userId) throws Exception {
		int id = Integer.parseInt(userId);
		JsonObject jsonObject = new JsonObject();
		Gson gson = new Gson();
	    User userInformationById = userService.getUserInformationById(id);
		if(userInformationById == null){
			jsonObject.addProperty("result", "fail");
			jsonObject.addProperty("msg", "�û�ID������,��ȡ�û���Ϣʧ��");
		}
		else
		{	
			String information = gson.toJson(userInformationById);//��java����ת��Ϊjson�ַ���
			jsonObject.addProperty("result", "ok");
			jsonObject.addProperty("msg", "��ȡ�û���Ϣ�ɹ�");
			jsonObject.addProperty("data",information );
		}
		return GsonUtil.objectToJsonStr(jsonObject);
	}
}
