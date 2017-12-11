package org.crazyit.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class DemoImpl implements JavaDelegate {
	
	
	public String getString(String str) {
		
		System.out.println("执行DemoImpl.getString方法,参数："+str);
		
		return str;
		
	}

	@Override
	public void execute(DelegateExecution arg0) {
		System.out.println("执行了execute");
		arg0.setVariable("str", "sunshuai");
	}
	
	
}
