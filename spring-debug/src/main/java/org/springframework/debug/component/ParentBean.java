package org.springframework.debug.component;

/**
 * @author Mingの
 * @date 2022/6/28 10:16
 * @since 1.0
 */
public class ParentBean {

	public ParentBean(ChildrenBean childrenBean) {
		this.childrenBean = childrenBean;
	}

	private ChildrenBean childrenBean;

	public void setChildrenBean(ChildrenBean childrenBean) {
		this.childrenBean = childrenBean;
	}

	public ChildrenBean getChildrenBean() {
		return childrenBean;
	}
}
