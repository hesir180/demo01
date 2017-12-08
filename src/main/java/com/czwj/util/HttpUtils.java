package com.czwj.util;
/*
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import android.util.Log;

public class HttpUtils 
{  
    /**��Ϊ�����*/
 /*   private static final String TAG = "HttpUtils������";
    /**�û�ʶ��*/
  /*   public static final String User_Agent="";     

     
     
     private static JSONObject postrequest(String url,List<NameValuePair> params) 
     {
    //��������Խ���һЩ���������ʱ������Բ�����������ȵ�
        
        try 
        {
            //����JSONObject����
             JSONObject object=null;
             //����HttpClient����
             HttpClient httpClient=new DefaultHttpClient();
             //��������·��        
             HttpPost post=new HttpPost(url);  
             //�����������
             post.setEntity(new UrlEncodedFormEntity(params,"UTF-8"));    
             //�����û�ʶ��
             post.addHeader("User-Agent", User_Agent);
             //����HttpParams����
             HttpParams httpParams=post.getParams();
             //���ö�ȡ��ʱ
             httpParams.setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT,10000);
             //��������ʱ
             httpParams.setParameter(CoreConnectionPNames.SO_TIMEOUT, 10000);
             //���������û���
             HttpResponse httpResponse=httpClient.execute(post);
             //ȡ�÷�����Ϣ
             HttpEntity httpEntity=httpResponse.getEntity();
             //���httpEntity��Ϊ��
             if(httpEntity!=null )
             {
                 String result=EntityUtils.toString(httpEntity);
                 object=new JSONObject(result);
                 
                 Log.i(TAG, "post����ɹ�:"+ result);

                 return object;
             }
             else    
             {
                 Log.e(TAG, "post����ʧ��");
                 return null;
             }
        }
        catch (Exception e) 
        {
        
            Log.i(TAG,e.toString());
            return null;
            
        }
    
     }
         
     /**
     * post��������
     * @param url         ip·��
     * @param method      ������
     * @param params      ����
     * @return
     */
 /*   public static JSONObject post(String url,String method,List<NameValuePair> params) throws Exception 
    {        
        
            return postrequest(url+method, params);        
    }
 
}
*/