package fahem.belili.eventmgr;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void test() {
		try {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "appContext.xml" });
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}
	}

}
