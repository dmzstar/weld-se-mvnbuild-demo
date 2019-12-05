package com.dmzcoding.demo;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.Extension;

public class CdiExtension implements Extension{

	public void afterBeanDiscovery(@Observes AfterBeanDiscovery abd) {
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>> cdiExtension : afterBeanDiscovery");
		
	}
	
}
