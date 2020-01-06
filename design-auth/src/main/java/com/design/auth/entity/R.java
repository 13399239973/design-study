package com.design.auth.entity;

import java.util.HashMap;
import java.util.Map;

public class R extends HashMap<String, Object> {

	private static final long serialVersionUID = 1L;
	
	public R() {
		put("code", 0);
		put("msg", "success");
	}
	
	public static R error() {
		return error(500, "未知异常，请联系管理员");
	}
	
	public static R error(String msg) {
		return error(500, msg);
	}
	
	public static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}
	
	public static R ok(Map<String, Object> map) {
		R r = new R();
		r.putAll(map);
		return r;
	}
	
	public static R ok() {
		return new R();
	}


	@Override
	public R put(String key, Object value) {
		super.put(key, value);
		return this;
	}

	public static R error(Exception ex,String de_msg) {
		R r = new R();
		String msg = "未知异常，请联系管理员";
		int code = 500;
		if(ex.getMessage()!=null && ex.getMessage().toLowerCase().indexOf("duplicate entry")>0){
			code=100;
			msg = de_msg;
		}
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}
}
