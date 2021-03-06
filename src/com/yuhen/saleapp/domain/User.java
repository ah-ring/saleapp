/**
 * 
 */
package com.yuhen.saleapp.domain;

/**
 * 用户信息Domain
 * 
 * @author ps
 * 
 */
public class User {
	private int user_id;
	private String name;
	private String password;
	private String mobile;
	private String address;
	private String shop_name;
	private String create_time;
	private String user_type;
	private String qq;
	private String we_chat;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWe_chat() {
		return we_chat;
	}

	public void setWe_chat(String we_chat) {
		this.we_chat = we_chat;
	}

}
