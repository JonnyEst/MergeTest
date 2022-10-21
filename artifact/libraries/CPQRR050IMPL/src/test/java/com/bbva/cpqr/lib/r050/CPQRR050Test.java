package com.bbva.cpqr.lib.r050;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.domain.transaction.Context;
import com.bbva.elara.domain.transaction.ThreadContext;
import javax.annotation.Resource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/CPQRR050-app.xml",
		"classpath:/META-INF/spring/CPQRR050-app-test.xml",
		"classpath:/META-INF/spring/CPQRR050-arc.xml",
		"classpath:/META-INF/spring/CPQRR050-arc-test.xml" })
public class CPQRR050Test {

	@Spy
	private Context context;

	@Resource(name = "cpqrR050")
	private CPQRR050 cpqrR050;

	@Resource(name = "applicationConfigurationService")
	private ApplicationConfigurationService applicationConfigurationService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		context = new Context();
		ThreadContext.set(context);
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.cpqrR050;
		if(this.cpqrR050 instanceof Advised){
			Advised advised = (Advised) this.cpqrR050;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		cpqrR050.execute();
		Assert.assertEquals(0, context.getAdviceList().size());
	}
	
}
