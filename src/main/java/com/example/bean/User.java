package com.example.bean;
import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class User{
	private Integer id;
	private String user_name;
	private Integer age;
	private String addr;
	
}
