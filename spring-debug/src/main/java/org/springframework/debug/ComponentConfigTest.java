package org.springframework.debug;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.debug.component.*;

/**
 * @author Mingの
 * @date 2022/6/28 10:05
 * @since 1.0
 */
public class ComponentConfigTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentConfig.class);

		ComponentConfig componentConfigBean = applicationContext.getBean(ComponentConfig.class);
		System.out.println(componentConfigBean);

		ComponentBean componentBean = applicationContext.getBean(ComponentBean.class);
		System.out.println(componentBean);

		ControllerBean controllerBean = applicationContext.getBean(ControllerBean.class);
		System.out.println(controllerBean);

		RepositoryBean repositoryBean = applicationContext.getBean(RepositoryBean.class);
		System.out.println(repositoryBean);

		ServiceBean serviceBean = applicationContext.getBean(ServiceBean.class);
		System.out.println(serviceBean);

		System.out.println("==================[proxyBeanMethods = false]=======================");

		ChildrenBean childrenBean = applicationContext.getBean(ChildrenBean.class);
		System.out.println(childrenBean);

		ParentBean parentBean = applicationContext.getBean(ParentBean.class);
		System.out.println(parentBean.getChildrenBean());
		System.out.println(parentBean);
	}
}
