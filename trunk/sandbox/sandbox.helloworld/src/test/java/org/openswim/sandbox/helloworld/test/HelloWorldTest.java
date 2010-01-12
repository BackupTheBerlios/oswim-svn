/**
 * 
 */
package org.openswim.sandbox.helloworld.test;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import static org.easymock.EasyMock.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openswim.sandbox.helloworld.HelloWorld;
import org.openswim.sandbox.helloworld.HelloWorldInterface;

public class HelloWorldTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    Properties p = new Properties();
    try {
      p.load(HelloWorld.class.getResourceAsStream("/log4j.properties"));
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
    PropertyConfigurator.configure(p);
  }

  /**
   * Test method for {@link org.openswim.sandbox.helloworld.HelloWorld#main(java.lang.String[])} .
   */
  @Test
  public void testMain() {
    HelloWorld.main(null);
  }

  @Test
  public void testInterfaceSum() throws Exception {
    HelloWorldInterface hwi = createMock(HelloWorldInterface.class);
    expect(hwi.sum(2, 3)).andReturn(5);
    replay(hwi);

    int result = hwi.sum(2, 3);
    Assert.assertEquals(5, result);

  }

  @Test
  public void testInterfaceSumException() {
    Exception ee = null;
    try {
      HelloWorldInterface hwi = createMock(HelloWorldInterface.class);
      expect(hwi.sum(-1, -1)).andThrow(new Exception("not negative"));
      replay(hwi);

      hwi.sum(-1, -1);
    }
    catch (Exception e) {
      ee = e;
    }
    Assert.assertNotNull(ee);
  }

}
