package org.crazyit.activiti;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

public class Second {
	
	public static void main(String[] args) {
		
		// 创建流程引擎
		ProcessEngine engine = ProcessEngines.getDefaultProcessEngine();
		// 得到流程存储服务组件
		RepositoryService repositoryService = engine.getRepositoryService();
		// 得到运行时服务组件
		RuntimeService runtimeService = engine.getRuntimeService();
		// 获取流程任务组件
		TaskService taskService = engine.getTaskService();
		// 部署流程文件
		repositoryService.createDeployment()
				.addClasspathResource("bpmn/Second.bpmn").deploy();
		
		//添加参数
		Map<String,Object> map = new HashMap<>();
		map.put("secondImpl", new SecondImpl());
		map.put("str", "13");
		
		System.out.println("================================");
		// 启动流程
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("myProcess",map);
		
		System.out.println("================================");
		
		System.out.println("pi.getId="+pi.getId()); 
		
		List<Task> list = taskService.createTaskQuery().list();
		
		System.out.println("main 方法 list.size = "+list.size());
		
		list = taskService.createTaskQuery().processDefinitionId(pi.getId()).list();
		System.out.println("main 方法 list.size = "+list.size());
		
		
	}
}
