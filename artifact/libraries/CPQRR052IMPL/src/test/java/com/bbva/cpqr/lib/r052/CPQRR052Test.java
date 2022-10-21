package com.bbva.cpqr.lib.r052;

import com.bbva.cpqr.dto.datos.GrantingTicket;
import com.bbva.cpqr.dto.datos.OutAutehenticationGranting;
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
		"classpath:/META-INF/spring/CPQRR052-app.xml",
		"classpath:/META-INF/spring/CPQRR052-app-test.xml",
		"classpath:/META-INF/spring/CPQRR052-arc.xml",
		"classpath:/META-INF/spring/CPQRR052-arc-test.xml" })
public class CPQRR052Test {

	@Spy
	private Context context;

	@Resource(name = "cpqrR052")
	private CPQRR052 cpqrR052;

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
		Object result = this.cpqrR052;
		if(this.cpqrR052 instanceof Advised){
			Advised advised = (Advised) this.cpqrR052;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		GrantingTicket grantingTicket = cpqrR052.execute("12000038","NDIyNDBmOWI2YjU3");
		OutAutehenticationGranting outAutehenticationGranting = cpqrR052.OutExecute(grantingTicket);
		Assert.assertEquals(0, context.getAdviceList().size());
	}
	
}
