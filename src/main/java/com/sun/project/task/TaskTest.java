package com.sun.project.task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sun.project.controller.HtmlController;

/**
 * @author sunchangjunn
 * 2018年11月28日上午11:06:56
 */
@Component
public class TaskTest {
	
	private static final Logger logger = LoggerFactory.getLogger(TaskTest.class);
		/*@
		 * Scheduled(fixedDelay = 5000)
		 * 相同速率 每5秒调用一次
		 * */
		@Scheduled(fixedDelay = 5000) 
	    public void doSomething() throws InterruptedException {
	        Thread.sleep(15000);
	        System.out.println("执行方法:doSomething");
	        logger.info("执行方法:doSomething");
	    }
//	   @Scheduled(cron="0 15 12 28 11 ?") //cron表达式
		@Scheduled(fixedDelay = 5000) 
	   public void doSomethingTest() throws InterruptedException {
			System.out.println("执行方法:doSomethingTest");
			 logger.info("执行方法:doSomethingTest");
		   Thread.sleep(25000);
	   }
//		@Scheduled(fixedDelay = 5000) 
		public void doSomethingTestOne() throws InterruptedException {
			System.out.println("执行方法:doSomethingTest>>>>>>>>>>>>>>>>");
			 logger.info("执行方法:doSomethingTest>>>>>>>>>>>>>>>>");
			 Thread.sleep(25000);
			 
		}

}
