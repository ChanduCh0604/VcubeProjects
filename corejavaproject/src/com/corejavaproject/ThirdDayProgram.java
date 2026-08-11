package com.corejavaproject;

public class ThirdDayProgram {

	static String Dept_name = "Tech";
	static String location  = "Vijayawada";
	int emp_id =1;
	String name = "Chandu";
	int Mobile = 984628872;
	String gmail = "chchandu612@gmail.com";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdDayProgram tp = new ThirdDayProgram();
		System.out.println("--------Object 1---------");
		System.out.println("Emp_name : "+tp.name);
		System.out.println("Emp Id : "+tp.emp_id);
		System.out.println("Mobile Number : "+tp.Mobile);
		System.out.println("Emp Gmail : "+tp.gmail);
		//static data
		System.out.println("Department : "+Dept_name);
		System.out.println("Dept Location : "+location);
		
		ThirdDayProgram tp1 = new ThirdDayProgram();
		tp1.emp_id =2;
		System.out.println("--------Object 2---------");
		System.out.println("Emp_name : "+tp.name);
		System.out.println("Emp Id : "+tp.emp_id);
		System.out.println("Mobile Number : "+tp.Mobile);
		System.out.println("Emp Gmail : "+tp.gmail);
		//static data
		System.out.println("Department : "+Dept_name);
		System.out.println("Dept Location : "+location);

		Dept_name = "Support";
		location  = "Hyderabad";
		ThirdDayProgram tp2 = new ThirdDayProgram();
		tp2.emp_id =3;
		tp2.name ="Deepak";
		tp2.Mobile = 874236987;
		tp2.gmail = "deepak@gmail.com";
		System.out.println("--------Object 3---------");
		System.out.println("Emp_name : "+tp.name);
		System.out.println("Emp Id : "+tp.emp_id);
		System.out.println("Mobile Number : "+tp.Mobile);
		System.out.println("Emp Gmail : "+tp.gmail);
		//static data
		System.out.println("Department : "+Dept_name);
		System.out.println("Dept Location : "+location);

		ThirdDayProgram tp3 = new ThirdDayProgram();
		tp3.emp_id =3;
		System.out.println("--------Object 4---------");
		System.out.println("Emp_name : "+tp.name);
		System.out.println("Emp Id : "+tp.emp_id);
		System.out.println("Mobile Number : "+tp.Mobile);
		System.out.println("Emp Gmail : "+tp.gmail);
		//static data
		System.out.println("Department : "+Dept_name);
		System.out.println("Dept Location : "+location);

		tp3.emp_id =5;
		tp3.name ="Jashu";
		tp3.Mobile = 789842358;
		tp3.gmail = "jashy2@gmail.com";
		
		ThirdDayProgram tp4 = new ThirdDayProgram();
		System.out.println("--------Object 5---------");
		System.out.println("Emp_name : "+tp.name);
		System.out.println("Emp Id : "+tp.emp_id);
		System.out.println("Mobile Number : "+tp.Mobile);
		System.out.println("Emp Gmail : "+tp.gmail);
		//static data
		System.out.println("Department : "+Dept_name);
		System.out.println("Dept Location : "+location);


		
	}

}