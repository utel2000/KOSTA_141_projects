package ex1;

public class MyProfileImple implements MyProfile {
	private String name;
	private int age;
	private float status;
	@Override
	public String myProfile() {
		StringBuffer sb = new StringBuffer();
		sb.append("Name: ").append(name).append("\n")
		.append("Age: ").append(age).append("\n")
		.append("status :").append(status).append("\n");
		return sb.toString();
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setStatus(float status) {
		this.status = status;
	}
}
