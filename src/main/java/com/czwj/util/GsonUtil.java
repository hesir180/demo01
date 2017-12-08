package com.czwj.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonUtil<T> {

	private static Gson gson = new Gson();

	public static <T> String objectToJsonStr(T object) {
		String jsonStr;
		jsonStr = gson.toJson(object);
		return jsonStr;
	}

	public static <T> String objectsToJsonStr(List<T> objects) {
		String jsonStr;
		jsonStr = gson.toJson(objects);
		return jsonStr;

	}

	public static <T> T jsonStrToObject(String jsonStr, Class<T> cla) {
		T object = gson.fromJson(jsonStr, cla);
		return object;
	}

	public static <T> List<T> jsonStrToObjects(String jsonStr, Class<T> cla) {
		List<T> listT = null;
		try {
			T t = cla.newInstance();
			Class<T> classT = (Class<T>) Class.forName(t.getClass().getName());
			List<Object> listObj = new ArrayList<Object>();
			listObj = new GsonBuilder().create().fromJson(jsonStr, new TypeToken<List<Object>>() {
			}.getType());
			if (listObj == null || listObj.isEmpty())
				return null;
			listT = new ArrayList<T>();
			for (Object obj : listObj) {
				T perT = new GsonBuilder().create().fromJson(obj.toString(), classT);
				listT.add(perT);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listT;
	}

}