package com.czwj.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.czwj.domain.role_entity;
import com.czwj.service.UserService;
import com.czwj.util.GsonUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
@Controller
public class GetUserRelatedEntityController {
	UserService userService;
	@RequestMapping(value="/userEntity",method = RequestMethod.GET)
	public String GetUserRelatedEntityController(@RequestParam(value = "userId", required = true)String userId) throws Exception {
		int id = Integer.parseInt(userId);
		JsonObject jsonObject = new JsonObject();
		Gson gson = new Gson();
		List<role_entity> userRelatedEntity = userService.GetUserRelatedEntity(id);
		if(userRelatedEntity == null){
			jsonObject.addProperty("result", "fail");
			jsonObject.addProperty("msg", "�û�ID������,��ȡ�û�����ʵ��ʧ��");
		}
		else
		{	
			String information = gson.toJson(userRelatedEntity);//��java����ת��Ϊjson�ַ���
			jsonObject.addProperty("result", "ok");
			jsonObject.addProperty("msg", "��ȡ�û���Ϣ�ɹ�");
			jsonObject.addProperty("data",information );
		}
		return GsonUtil.objectToJsonStr(jsonObject);
	}
}
