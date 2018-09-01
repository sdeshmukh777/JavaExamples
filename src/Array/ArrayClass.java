
package Array;
import java.lang.*;

class Student
{
	String sname;
	int marks;
	Student(int marks,String sname)
	{
		this.marks=marks;
		this.sname=sname;
		
	}
}
public class ArrayClass {

	public static void main(String[] args) {

    Student[] arr=new Student[5];
    arr[0]=new Student(10,"swap");
    arr[1]=new Student(20,"niki");
    for(int i=0;i<arr.length;i++)
     System.out.println(arr[i].marks + arr[i].sname);
    

	}

}
