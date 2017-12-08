/*package com.czwj.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import com.czwj.util.HttpUtils;
import com.czwj.util.WebserviceHelp;

import android.util.Log;

public class Webservice extends WebserviceHelp
{
     
    private static final String  Webservice_Tag="网络服务";
    
        /***
     * 用户登陆     
     * @param userPhone 手机号
     * @param password 密码
     * @return
     */
 /*   public static int login(String userPhone,String password)
    {
        JSONObject object;
        
        try     
        {
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            
            params.add(new BasicNameValuePair("userPhone",userPhone));
            params.add(new BasicNameValuePair("password",password));
            
            object = HttpUtils.post(URL, Login, params);
        
               
            return object.optInt("results");
            
        }
        catch(Exception e)
        {
            Log.e(Webservice_Tag+Login, e.toString());
            return -1;
        }
        
    }
}

*/