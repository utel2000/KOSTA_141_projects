package ex1;
// �ٽ� ����Ʈ: LifeCycleBean�� ������ �� ��ü�ε�
// ��)
// class LifeCycleBean {
// private OtherBean oBean;
// public void setOBean(OtherBean oBean) ... ����
// life.xml���� <bean id="other" ..>
// bean id="life1" class="..">
// <property name="obean" ref="other"> </bean>
public class OtherBean {
	private String msg;
	public String getPrintMsg() {
		return "�ȳ��ϼ���.";
	}
}
