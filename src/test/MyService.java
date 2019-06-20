package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;//这是一个注解

@Service
public class MyService implements MyServiceIfac {

	@Autowired
	private MyDaoIfac dao;//MyService依赖MyDao
	/**
	 * 为咯给属性赋值 就在属性所在的
	 * 类里面设置一个构造方法
	 * 并且该构造方法接收一个该属性类开的参数
	 * <p>Title: </p>  
	 * <p>Description: </p>  
	 * @param myDao
	 */
//	public MyService(MyDaoIfac myDao)
//	{
//		this.dao = myDao;
//	}
	/* (non-Javadoc)  
	 * <p>Title: serviceLogin</p>  
	 * <p>Description: </p>    
	 * @see test.MyServiceIfac#serviceLogin()  
	 */
	@Override
	public void serviceLogin() {
		System.out.println("MyService serviceLogin()......");
		dao.queryUserByNameAndPwd();
	}
}
