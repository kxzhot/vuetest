package com.fh.api.game.interceptor;

public interface ConstantSystem {
	//用户
	//用户存储到redis所用的key
	public static final String CONSTANT_USER="user";
	//浏览器缓存数据
	public static final String CONSTANT_USER_LGON="login";
	//工具类里面的模板路径
	public static final String FILE_UTIL_PATH="/template";

	public static final String CONSTANT_PREMISSION="permission";
	//jwt签名算法以及密匙
	public static final String SECRET_KEY="123456789";
	//jwt签名算法以及密匙
	public static final int SECRET_KEY_EXPIRE=1000*60*60*24;
	//用户权限集合
	//用户所拥有的权限存储到redis所用的key
	public static final String CONSTANT_RESOURCELIST="resourceList";
	//所有权限集合
	//所有的权限存储到redis所用的key
	public static final String CONSTANT_PREMISSIONALLMAP="permissionAllMap";
	//通过接口返回的手机验证码
	public static final String CODE_PHONE="codePhone";
	//手机验证码过期时间
	public static final int CODE_PHONE_EXPIRE=5*60;
	//存储到redis所用是sessionID
	public static final String REDIS_SESSIONID="sessionId";
	public static final String PRODUCTREDISKEY="productRedisKey";//商品类型存入redis的key
	public static final String PRODUCT_KEY="productRedisKey";//商品存入redis的key
	public static final String PRODUCTREDISKEY_LOCKER="productRedisKey";//商品类型存入redis的互斥锁
	//cookie过期时间
	public static final int COOKIE_TIME=60*60*24;
	public static final String QIANTAI_TOKEN_KEY="x-auth";
	public static final String LOGIN_CURRENT_USER="member_information";
	//测试请求
	public static final String QIANTAI_QINGQIU_OPTIONS="options";
	//获取用户的购物车
	public static final String CART_KEY="cartkey";
	//用户收获人存储redis的key
	public static final String CONSIGNEE_KEY="consigneekey";
}
