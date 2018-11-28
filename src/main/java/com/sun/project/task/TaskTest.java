package com.sun.project.task;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author sunchangjunn
 * 2018年11月28日上午11:06:56
 */
@Component
public class TaskTest {
	
	   @Scheduled(cron="0 15 12 28 11 ?") //cron表达式
	    public void doSomething() {
	        System.out.println("执行方法:doSomething");
	    }
	   @Scheduled(cron="0 15 12 28 11 ?") //cron表达式
	   public void doSomethingTest() {
		   System.out.println("执行方法:doSomethingTest");
	   }

}
