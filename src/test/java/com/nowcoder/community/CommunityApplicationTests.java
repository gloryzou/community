package com.nowcoder.community;

import com.nowcoder.community.dao.Alphadao;
import com.nowcoder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class CommunityApplicationTests implements ApplicationContextAware {

	private  ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}

	@Test
	public void testApplicationContext() {
		System.out.println(applicationContext);

		Alphadao alphadao = applicationContext.getBean(Alphadao.class);
		System.out.println(alphadao.select());

		alphadao = applicationContext.getBean("alphaOne", Alphadao.class);
		System.out.println(alphadao.select());

		AlphaService alphaService=applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);

		 alphaService=applicationContext.getBean(AlphaService.class);
		System.out.println(alphaService);
	}

	@Test
	public void	testconfig(){
		SimpleDateFormat simpleDateFormat=applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
		System.out.println(new Date());
	}

}
