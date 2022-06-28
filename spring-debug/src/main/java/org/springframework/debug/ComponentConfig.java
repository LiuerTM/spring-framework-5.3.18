package org.springframework.debug;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.debug.component.ChildrenBean;
import org.springframework.debug.component.ParentBean;

/**
 * proxyBeanMethods 配置类是否被代理
 * 代理配置类：调用方法时会检测IoC容器中是否存在该Bean
 * 非代理配置类：调用方法时直接新建对象
 *
 * @author Mingの
 * @date 2022/6/28 10:07
 * @since 1.0
 */
@Configuration(proxyBeanMethods = false)
@ComponentScan(basePackages = {"org.springframework.debug.component"})
public class ComponentConfig {

	public ComponentConfig() {
	}

	@Bean
	public ChildrenBean childrenBean() {
		return new ChildrenBean();
	}

	@Bean
	public ParentBean parentBean() {
		return new ParentBean(childrenBean());
	}
}
