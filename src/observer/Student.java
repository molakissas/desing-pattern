package observer;

public class Student implements Observer {
	private String name;
	 public Student(String name) {
		 this.name=name;
}
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.name +  " has new notification:" + message);
	}
}