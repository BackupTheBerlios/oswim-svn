package org.openswim.sandbox.helloworld;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloWorld {

	private static Log log = LogFactory.getLog(HelloWorld.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorld.log.info("OpenSWIM:Sandbox:HelloWorld !!!");
	}

}
