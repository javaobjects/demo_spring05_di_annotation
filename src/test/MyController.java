package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	@Autowired//自动装配的意思 默认根据类型装配
	private MyServiceIfac service;
	
	/**
	 *  如果有一个类不知道属于哪一层的话就写@Component 表示组件的意思 
	 * <p>Title: login</p>  
	 * <p>Description: </p>
	 */
//	public MyController(MyServiceIfac myService)
//	{
//		this.service = myService;
//	}
	public void login() 
	{
		System.out.println("MyController login........");
		service.serviceLogin();
	}
}
