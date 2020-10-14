package com.example.demo.MyController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Repository.addminRepository;
import com.example.demo.Service.AddminUserListService;
import com.example.demo.model.Boan;
import com.example.demo.model.User;

@Controller
public class AddminController {
	
	@Autowired
	addminRepository addminRepository;
	@Autowired
	AddminUserListService addminUserListService;

	User user;
	@GetMapping("/addmin")
	public String AddminPage(Model model,HttpServletResponse response) throws IOException {
		System.out.println(" '/'로 왔습니다 . ");
		List<User> userList = addminUserListService.userListService();
		List<Boan> boanList = addminRepository.addminBoan();
		for(int i=0;i<=boanList.size()-1;i++) {
			if(boanList.get(i).getNumbering() ==1) {
				System.out.println("공격이 감지되엇습니다");
				int numbering = boanList.get(i).getNumbering()+1;
				System.out.println("넘버링  ="+numbering);
				boanList.get(i).setNumbering(numbering);
				response.setContentType("text/html; charset=UTF-8");
			
				 
				PrintWriter out = response.getWriter();
				 
				out.println("<script>alert('공격이 감지되었습니다.');</script>");
				out.println("<script>location.href='/boan'</script>");
				addminRepository.addminBoanUpdate(numbering);
				out.flush();


			
				
				
			}
		}
		System.out.println("봅아온 userList");
//		System.out.println("userLists = "+userList);
		model.addAttribute("userLists",userList);
		
		return "addminIndex";
		// webapp/WEB-INF/views
	}
	
	@GetMapping("/boan")
	public String boanSenter(Model model){
		System.out.println("보안뽑으러옴");
		List<Boan> boanList = addminRepository.addminBoan();
		System.out.println("뽑아온 boanList = "+boanList);
		model.addAttribute(boanList);
		return "addminBoan";
	}

}
