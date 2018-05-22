package org.java.annotaion_2.d20180326.zuoye;

@NoNull(value="org.java.annotaion_2.d20180326.zuoye.User")
public class User {

	
	private int id;
	@Length(min=3,max=8, message = "长度不满足条件")
	
	private String name;
	@Length(min=3,max=8, message = "长度不满足条件")
	
	private String email;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	@Length(min=3,max=8, message = "长度不满足条件")
	
	public String getName() {
		return name;
	}
	@Length(min=3,max=8, message = "长度不满足条件")
	
	public void setName(String name) {
		this.name = name;
	}
	@Length(min=3,max=8, message = "长度不满足条件")
	
	public String getEmail() {
		return email;
	}
	@Length(min=3,max=8, message = "长度不满足条件")

	public void setEmail(String email) {
		this.email = email;
	}
	
}
