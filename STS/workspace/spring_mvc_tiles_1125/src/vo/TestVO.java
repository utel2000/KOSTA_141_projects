package vo;
public class TestVO {
	private int num;
	private String name, age, job;
	public TestVO(int num, String name, String age, String job) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.job = job;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}