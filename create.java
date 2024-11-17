import java.util.*;
public class create{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			ArrayList<student> stud = new ArrayList<>();
			ArrayList<employee> emp = new ArrayList<>();
			System.out.print("Enter the no. of students:");
			int n = sc.nextInt();
			System.out.print("Enter the no. of employees");
			int m = sc.nextInt();

			for(int i = 0 ; i <= n - 1 ; i++){
				stud.add(new student("Aldous",20,"Male","Science","Computer Science",2202301);

			}

			for(int i = 0 ; i <= m - 1 ; i++){
				emp.add(new employee("Shreyash",20,"Male",101,29000);
			}

			for(student st : stud){
				st.display();
			}

			for(employee e : emp){
				e.display();
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			sc.close();
		}
	}
}
