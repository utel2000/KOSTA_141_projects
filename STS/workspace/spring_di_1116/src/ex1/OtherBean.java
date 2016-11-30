package ex1;
// 핵심 포인트: LifeCycleBean에 주입이 될 객체인데
// 예)
// class LifeCycleBean {
// private OtherBean oBean;
// public void setOBean(OtherBean oBean) ... 주입
// life.xml에서 <bean id="other" ..>
// bean id="life1" class="..">
// <property name="obean" ref="other"> </bean>
public class OtherBean {
	private String msg;
	public String getPrintMsg() {
		return "안녕하세요.";
	}
}
