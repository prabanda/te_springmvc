package com.te.springmvc.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class UserBean implements Serializable{
	private int pw;
	private String user;
	

}
