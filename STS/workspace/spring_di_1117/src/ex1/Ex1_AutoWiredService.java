package ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ex1_AutoWiredService implements Printable {
	// �ڵ����� ���������� Bean���� �����ִ� ������̼�
	// byName, byType ���
	// byName�� ������Ƽ�� �̸��� �����ϸ� �ٷ� �ڵ����� ���� �������ش�.
	// setter�� ��� ��...��?!
	// byType�� ���� Ÿ���� ������ �ڵ����� ���� �������ش�.
	// byName�� �켱������ �� ����.
	// byName�� �� �̸��� ���� ������ ���� Ŭ������ ���ų�,
	// byType�� �� Ÿ���� ���� ������ ���� Ŭ������ ���� ��
	// �ĺ��ϱ� ���� @Qualifier(" ")�� ����Ѵ�.
	// @Qualifier�� ������� ������ �� ���ǿ� �ش���� �ʾƵ� ��� Bean�� �˻��ϹǷ�
	// ������ ũ�� �������� ������ Qualifier�� ������ִ� ���� ����.
	// byName�� ���� @Qualifier�� ���� xml�� Bean�� ID�� �񱳵ǰ�,
	// byType�� ���� @Qualifier�� ���� xml�� Qualifier ���� �񱳵ȴ�.
	
	// byName
	@Autowired
	@Qualifier("name1")
	private String name1;
	// byType
	@Autowired
	@Qualifier("naming")
	private String named;
	private String name;
	// �⺻��: true. ���� �ݵ�� �־�� �Ѵٸ� true, ������ ���´�� ���� false.
//	@Autowired(required=false)
	@Autowired
	public Ex1_AutoWiredService(@Qualifier("naming") String name) {
		this.name = name;
	}
	@Override
	public String printName() {
		return "name(�����ڷ�): " + name + "�Դϴ�.";
	}
	public String printName1() {
		return "name1(byName): " + name1 + "�Դϴ�.";
	}
	public String printNamed() {
		return "named(byType): " + named + "�Դϴ�.";
	}
//	setter �Ƚᵵ ��.
//	@Autowired
//	public void setName(String name) {
//		this.name = name;
//	}
}
