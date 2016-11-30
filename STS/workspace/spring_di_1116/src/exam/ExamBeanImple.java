package exam;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
public class ExamBeanImple implements ExamBeanInter, BeanFactoryAware {
	private BeanFactory beanFactory;
	private ExamTypeInter eti;
	// ���� ���� ������ �� condition(����)�� ���� ���� �����ϵ��� �����ϰ�
	@Override
	public void callExecuteBean(String condition) {
			eti = beanFactory.getBean(condition, ExamTypeInter.class);
	}
	// ���� �޼��带 ȣ���ؼ� ���ڿ��� �����ִ� �޼���
	@Override
	public String getMessageBean() {
		return eti.message();
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		beanFactory = arg0;
	}
	
}
