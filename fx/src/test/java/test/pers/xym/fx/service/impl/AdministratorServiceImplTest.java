package test.pers.xym.fx.service.impl;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import pers.xym.fx.domain.Administrator;
import pers.xym.fx.service.AdministratorService;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class AdministratorServiceImplTest {

	Logger logger = LoggerFactory.getLogger(PermissionServiceImplTest.class);
	public static ObjectMapper objectMapper = new ObjectMapper();

	private AdministratorService administratorService;
	
	public AdministratorService getAdministratorService() {
		return administratorService;
	}

	@Autowired
	public void setAdministratorService(AdministratorService administratorService) {
		this.administratorService = administratorService;
	}

	@Test
	public void testAddAdministrator() {
		try {
			Administrator administrator = new Administrator();
			administrator.setUsername("ming");
			administrator.setPassword("123456");
			administratorService.addAdministrator(administrator);
		} catch (Exception e) {
			logger.error("exception",e);
		}
	}

}
