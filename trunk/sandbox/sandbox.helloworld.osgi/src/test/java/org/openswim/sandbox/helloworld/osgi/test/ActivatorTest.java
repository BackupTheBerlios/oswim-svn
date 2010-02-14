package org.openswim.sandbox.helloworld.osgi.test;

import static org.easymock.EasyMock.createNiceMock;

import org.junit.Before;
import org.junit.Test;
import org.openswim.sandbox.helloworld.osgi.Activator;
import org.osgi.framework.BundleContext;

public class ActivatorTest {

	private Activator activator = null;
	private BundleContext ctx = null;

	@Before
	public void setup() {
		this.activator = new Activator();
		this.ctx = createNiceMock(BundleContext.class);

	}

	@Test
	public void startActivation() throws Exception {
		this.activator.start(this.ctx);
	}

	@Test
	public void stopActivation() throws Exception {
		this.activator.start(this.ctx);
		this.activator.stop(this.ctx);
	}

}
