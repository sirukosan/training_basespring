package com.vadik.basespring;

import com.vadik.basespring.aop.AspectTestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseSpringApplicationTests {

	@Autowired
	private AspectTestBean aspectTestBean;

	@Test
	public void doSomething() {
		aspectTestBean.doSomething();
	}

	@Test
	public void contextLoads() {
	}

}
