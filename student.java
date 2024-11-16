public class student extends human{
	String stream;
	String course;
	int rollno;

	student(String name,int age,String gender,String stream,String course,int rollno){
		super(name,age,gender);
		this.stream = stream;
		this.course = course;
		this.rollno = rollno;
	}

	void display(){
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		Sytem.out.println("Gender:" + gender);
		System.out.println("Stream:" + stream);
		System.out.println("Course:" + course);
		System.out.println("Roll No:" + rollno);
	}
}
