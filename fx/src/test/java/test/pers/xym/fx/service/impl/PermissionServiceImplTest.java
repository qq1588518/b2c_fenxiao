package test.pers.xym.fx.service.impl;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import pers.xym.fx.domain.Permission;
import pers.xym.fx.service.PermissionService;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class PermissionServiceImplTest {
	Logger logger = LoggerFactory.getLogger(PermissionServiceImplTest.class);
	public static ObjectMapper objectMapper = new ObjectMapper();

	private PermissionService permissionService;

	public PermissionService getPermissionService() {
		return permissionService;
	}

	@Autowired
	public void setPermissionService(PermissionService permissionService) {
		this.permissionService = permissionService;
	}

	@Test
	public void testListPermission() {
		try {
			List<Permission> permissions = permissionService.listPermission();
			logger.error(objectMapper.writeValueAsString(permissions));
		} catch (JsonGenerationException e) {
			logger.error("exception", e);
		} catch (JsonMappingException e) {
			logger.error("exception", e);
		} catch (IOException e) {
			logger.error("exception", e);
		} catch (Exception e) {
			logger.error("exception", e);
		}
	}

}
