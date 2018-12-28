package com.example.bean;
import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements Serializable{
	private Integer id;
	private String user_name;
	private Integer age;
}
