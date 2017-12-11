package org.crazyit.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class Second1 implements JavaDelegate {

	@Override
	public void execute(DelegateExecution arg0) {
		// TODO Auto-generated method stub
		System.out.println("Second1方法!!!!");
	}

}
