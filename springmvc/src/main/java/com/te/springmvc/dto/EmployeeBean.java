package com.te.springmvc.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employeeinfo")
public class EmployeeBean implements Serializable{
	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private Date dob;
	@Column
	private String pw;

}
