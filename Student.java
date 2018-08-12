import java.util.Scanner;
class Student{
    private int eno,fee;
    private String sname,scourse;
        public void getAdmission (){
        Scanner s1=new Scanner(System.in);
            System.out.println("enter enrollment no");
            eno=s1.nextInt();
            System.out.println("enter fee");
            fee=s1.nextInt();
            System.out.println("enter student name");
            sname=s1.next();
            System.out.println("enter student course");
            scourse=s1.next();
        }public void showAdmission(){
                System.out.println("enrollment no.is \t"+eno);
                System.out.println("fee is \t"+fee);
                System.out.println("student name is \t"+sname);
                System.out.println("student course is\t"+scourse);
            }
        }

class DemoObject{
	public static void main(String ar[]){
		Student s1=new Student();
		s1.getAdmission();
		s1.showAdmission();
		Student s2=new Student();
		s2.getAdmission();
		s2.showAdmission();
		if(s1==s2)
		System.out.println("Objects are equal");
		else
		System.out.println("Objects are not equal");
	}
}
