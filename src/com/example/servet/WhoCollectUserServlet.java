package com.example.servet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.alibaba.fastjson.JSON;
import com.example.bean.UserBean;
import com.example.dao.RegisterDao;
import com.example.dao.UserInfoDao;

//  谁收藏我接口
public class WhoCollectUserServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ArrayList<UserBean>  list = new ArrayList<UserBean>();
		JSONObject jsonObject = new JSONObject();
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		String uids=req.getParameter("uid");
	    int uid = 0;
	    if(uids==null) {
	    	jsonObject.put("code", -1);
			jsonObject.put("msg", "用户不存在");
			PrintWriter pw = resp.getWriter();
			pw.print(jsonObject);
			pw.close();
	    	return ;
	    }
	    uid = Integer.valueOf(uids);
	    String scwuidstr = UserInfoDao.getSCWUid(uid);
	    if(scwuidstr == null||scwuidstr.equals("")){
	 			jsonObject.put("code", -1);
	 			jsonObject.put("msg", "暂时没有收藏任何人");
	 			jsonObject.put("infoArray", JSON.toJSONString(list,true));
	 			PrintWriter pw = resp.getWriter();
	 			pw.print(jsonObject);
	 			pw.close();
	 	    	return ;
	 		}
		String scwuids[]  = scwuidstr.split(",");
		for (int i = 0; i < scwuids.length; i++) {
			int scwuid = 0;
		    if(scwuids!=null) {
		    	scwuid = Integer.valueOf(scwuids[i]);
		    	UserBean user = RegisterDao.queryByid(scwuid);
		    	list.add(user);
		    }
		}
		if(list!=null&& list.size()>0) {
			jsonObject.put("code", 1);
			jsonObject.put("msg", "获得谁收藏我信息成功");
			jsonObject.put("infoArray", JSON.toJSONString(list,true));
		} else {
			jsonObject.put("code", -1);
			jsonObject.put("msg", "还没有人收藏我");
		}
		PrintWriter pw = resp.getWriter();
		pw.print(jsonObject);
		pw.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
