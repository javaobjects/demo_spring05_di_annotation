package test;

import org.springframework.stereotype.Repository;

//又有接口又有实现类 帽子给实现类带

@Repository
public class MyDao implements MyDaoIfac {

	/* (non-Javadoc)  
	 * <p>Title: queryUserByNameAndPwd</p>  
	 * <p>Description: </p>    
	 * @see test.MyDaoIfac#queryUserByNameAndPwd()  
	 */
	@Override
	public void queryUserByNameAndPwd() 
	{
		System.out.println("MyDao queryUserByNameAndPwd");
	}
}
