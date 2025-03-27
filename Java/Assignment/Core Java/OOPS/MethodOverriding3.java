package com.OOPS;



//Implement method overriding to show polymorphism in action.

class Override{
	String student_name;
	int student_std;
	char section;
	
	public void setData() {
		student_name = "Drasti";
		student_std = 2;
		section='F';
	}
		
		public void Show() {
			System.out.println("Student name is "+student_name);
			System.out.println("Student Standard "+student_std);
			System.out.println("Student Section "+section);
		
		
	}
}
class Override1 extends Override{
	public void setData() {
		super.setData();
		super.Show();
		student_name = "Kishan";
		student_std = 4;
		section='A';
		
}
	public void Show() {
		
		System.out.println("Student name is "+student_name);
		System.out.println("Student Standard "+student_std);
		System.out.println("Student Section "+section);
		
}
}
public class MethodOverriding3 {
	public static void main(String[] args) {
		
        Override1 override1=new Override1();
		
		override1.setData();
		override1.Show();
		
	}

}
