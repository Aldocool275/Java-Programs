public class employee extends human{
	int id;
	double salary;

	employee(String name,int age,String gender,int id,double salary){
		super(name,age,gender);
		this.id = id;
		this.salary = salary;
	}

	void display(){
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Gender:" + gender);
		System.out.println("Employee ID:" + id);
		System.out.println("Salary:" + salary);
	}
}
