package com.tropogo.assesment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "tbl_user")
public class User {
	
	@Id
	@Column(name = "user_id")
	private long userId;

	@NotBlank(message = "userName can't be blank")
	private String userName;
	
	@NotBlank(message = "email can't be blank")
	@Email(message = "invalid mail format")
	private String email;
	
	@NotBlank(message = "mobileNo can't be blank")
	private String mobileNo;

		
	public User(@NotBlank(message = "userId can't be blank") long userId, @NotBlank(message = "userName can't be blank") String userName,
			@NotBlank(message = "email can't be blank") @Email(message = "invalid mail format") String email,
			@NotBlank(message = "mobileNo can't be blank") String mobileNo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.mobileNo = mobileNo;
	}


	public User() {}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	
}
