package com.example.demo.model;

import java.sql.Timestamp;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	private int id;
	private String username;
	private String password;
	private String email; // 모델만들때 실수로 안넣음.
	private String name;
	private String website;
	private String bio; // 자기 소개
	private String phone;
	private String gender;
	private String profileImage;
	private String role;
	private String provider;
	private String providerId;

	private Timestamp createDate;

}
