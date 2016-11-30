package ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ex1_AutoWiredService implements Printable {
	// 자동으로 의존관계의 Bean들을 묶어주는 어노테이션
	// byName, byType 등등
	// byName은 프로퍼티와 이름이 동일하면 바로 자동으로 빈을 주입해준다.
	// setter가 없어도 된...다?!
	// byType은 같은 타입이 있으면 자동으로 빈을 주입해준다.
	// byName이 우선순위가 더 높다.
	// byName일 때 이름이 같은 변수를 가진 클래스가 많거나,
	// byType일 때 타입이 같은 변수를 가진 클래스가 많을 때
	// 식별하기 위해 @Qualifier(" ")를 사용한다.
	// @Qualifier를 사용하지 않으면 위 조건에 해당되지 않아도 모든 Bean을 검색하므로
	// 성능이 크게 떨어지기 때문에 Qualifier를 사용해주는 것이 좋다.
	// byName일 때는 @Qualifier의 값과 xml의 Bean의 ID가 비교되고,
	// byType일 때는 @Qualifier의 값과 xml의 Qualifier 값과 비교된다.
	
	// byName
	@Autowired
	@Qualifier("name1")
	private String name1;
	// byType
	@Autowired
	@Qualifier("naming")
	private String named;
	private String name;
	// 기본값: true. 빈이 반드시 있어야 한다면 true, 없으면 없는대로 하자 false.
//	@Autowired(required=false)
	@Autowired
	public Ex1_AutoWiredService(@Qualifier("naming") String name) {
		this.name = name;
	}
	@Override
	public String printName() {
		return "name(생성자로): " + name + "입니다.";
	}
	public String printName1() {
		return "name1(byName): " + name1 + "입니다.";
	}
	public String printNamed() {
		return "named(byType): " + named + "입니다.";
	}
//	setter 안써도 됨.
//	@Autowired
//	public void setName(String name) {
//		this.name = name;
//	}
}
