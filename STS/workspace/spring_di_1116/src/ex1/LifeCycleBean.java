package ex1;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
public class LifeCycleBean implements LifeCheckable, BeanNameAware, BeanFactoryAware {
	private String mType;
	private String beanName; // ���Թ��� ��ü���� ���� !
	private BeanFactory beanFactory;
	// ������
	public LifeCycleBean() {
		System.out.println("������ ȣ��!");
	}
	// Spring�� ���ؼ� ȣ�� �� �޼��� init, destroy
	@Override
	public void init() {
		System.out.println("init �޼��� ȣ��!");
	}
	@Override
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��!");
	}
	@Override
	public void execute() {
		System.out.println("execute �޼��� ȣ��!");
		service.LogFactory.getLogFactory().getLogHeader("LifeCycleBean.java", "public void execute()");
		service.LogFactory.getLogFactory().getLog("beanName", beanName);
		// ���� ���� BeanFactory�� ���� Bean�� �ּҸ� ȹ��.
		OtherBean ob = beanFactory.getBean("other", OtherBean.class);
		service.LogFactory.getLogFactory().getLog("ob.getPrintMsg()", ob.getPrintMsg());
	}
	// DI
	public void setMType(String mType) {
		System.out.println("setter ȣ��!");
		this.mType = mType;
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		this.beanFactory = arg0;
	}
	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
		
	}
}
