package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.addminRepository;
import com.example.demo.model.User;

@Service
public class AddminUserListService {

	@Autowired
	addminRepository addminRepository;
	
	User user;
	public List<User> userListService(){
		System.out.println("userListService에 왔습니다");
		List<User> userList = addminRepository.addminUserList();
		for(int i=0; i<=userList.size()-1;i++) {
			System.out.println("for문안에 들어왔습니다");
			if(userList.get(i).getProvider()=="" ||
				userList.get(i).getProvider()==null) {
				System.out.println("userList의 getProvider이 null에왔습니다.");
				userList.get(i).setProvider("일반가입유저");
			}
			
			if(userList.get(i).getProviderId()=="" ||
					userList.get(i).getProviderId()==null) {
					System.out.println("userList의 getProviderId이 null에왔습니다.");
					userList.get(i).setProviderId("Not Provider Id");
					
				}
			
			
		}
		return userList;
	}
}
