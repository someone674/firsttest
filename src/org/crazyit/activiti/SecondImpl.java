package org.crazyit.activiti;

import java.io.Serializable;

import org.activiti.engine.runtime.Execution;

public class SecondImpl implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String print(String str) {  
		if (str !=null) {
			System.out.println("str="+str);
		}
		System.out.println("第一个任务节点");
        System.out.println("This is HellService2 Called by  process "  
                + "who's saying hello ! ");  
        
        return str+"111";
        
    }
	
	
	public String add(String add) {
		
		System.out.println("第二个任务节点，，，add方法 add="+add);
		
		return add+"add";
		
	}
	
	
	public User createUser() {
		System.out.println("第四个任务节点：创建User");
		
		User user = new User();
		user.setName("sun");
		user.setPhone("123");
		
		return user;
	}
	
	
	public void disUser(User user,String str) {
		System.out.println("第五个任务节点：User="+user+"   str="+str);
	}
	
	
}
