/**
 * 
 */
package org.openswim.sandbox.helloworld.test;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openswim.sandbox.helloworld.HelloWorld;

public class HelloWorldTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Properties p = new Properties();
		try {
			p.load(HelloWorld.class.getResourceAsStream("/log4j.properties")); 
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		PropertyConfigurator.configure(p);
	}

	/**
	 * Test method for
	 * {@link org.openswim.sandbox.helloworld.HelloWorld#main(java.lang.String[])}
	 * .
	 */
	@Test
	public void testMain() {
		HelloWorld.main(null);
	}

}
