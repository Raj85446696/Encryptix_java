import java.util.Scanner;
class Student_grade{
    double Total_marks;
    double avg_per;
    double gra_cal;
    Student_grade(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your marks of subject1 = ");
        double marks1 = sc.nextDouble();
        System.out.print("enter your marks of subject2 = ");
        double marks2 = sc.nextDouble();
        System.out.print("enter your marks of subject3 = ");
        double marks3 = sc.nextDouble();
        System.out.print("enter your marks of subject4 = ");
        double marks4 = sc.nextDouble();
        System.out.print("enter your marks of subject5 = ");
        double marks5 = sc.nextDouble();
        Total_marks = marks1+marks2+marks3+marks4+marks5;
        avg_per = Total_marks/5 ;
        System.out.println("Total Marks:"+Total_marks);
        System.out.println("Average Marks:"+avg_per);
        if(avg_per>=90 && avg_per<=100){
            System.out.println("Your Grade: Grade A");
        }else if(avg_per>=75 && avg_per<=90){
            System.out.println("Your Grade: Grade B");
        }else if(avg_per>=60 && avg_per<=75){
            System.out.println("Your Grade: Grade C");
        }else{
            System.out.println("Your Grade: Grade D");
        }
    }

}
public class Task2{
    public static void main(String[] args) {
        new Student_grade();
    }
}