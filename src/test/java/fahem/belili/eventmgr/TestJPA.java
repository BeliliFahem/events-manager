package fahem.belili.eventmgr;

import static org.junit.Assert.assertTrue;

import java.io.Serializable;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fahem.belili.eventmgr.business.impl.GenericServiceImpl;
import fahem.belili.eventmgr.entities.User;

public class TestJPA {

	@Before
	public void setUp() throws Exception {

	}
	

	@Test
	public void test2() {
		try {
			System.out.println("test2");
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "appContext.xml" });
			

			System.out.println("test2");
			GenericServiceImpl<User, Serializable> userService =  (GenericServiceImpl<User, Serializable>) ctx.getBean("genericServiceImpl");
			
			long usersSize1 = userService.readAll().size();
			userService.create(new User("Belili", "password", true));
			long usersSize2 = userService.readAll().size();
			
			assertTrue(usersSize2 - usersSize1 == 1);
//			assertTrue(true);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}
	}

//	@Test
//	public void testCreationDB() {
//		try {
//			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "appContext.xml" });
//			assertTrue(true);
//		} catch (Exception e) {
//			assertTrue(e.getMessage(), false);
//		}
//	}

}
