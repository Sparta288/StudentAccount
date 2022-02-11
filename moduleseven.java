import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

class Test {

   public static void main(String[] args) {
       /*
       * Creating an Scanner class object which is used to get the inputs
       * entered by the user
       */
       Scanner sc = new Scanner(System.in);

       int cnt=0;

       System.out.print("How many students data you want to enter :");
       cnt=sc.nextInt();

       List<Student> ll=new LinkedList<Student>();

       for(int i=0;i<cnt;i++)
       {
           sc.nextLine();
           System.out.print("Enter Name :");
           String name=sc.nextLine();
           System.out.print("Enter Address :");
           String address=sc.nextLine();
           System.out.print("Enter GPA :");
           double gpa=sc.nextDouble();
           Student s=new Student(name, address, gpa);
       ll.add(s);
       }



       Collections.sort(ll);
       Iterator<Student> li1=ll.iterator();
       try {
           FileWriter fw=new FileWriter("SortedStudentData.txt");
           PrintWriter pw = new PrintWriter(fw);
           while(li1.hasNext())
           {
           fw.write(li1.next().toString()+"\n");
           }
           fw.close();
       } catch (IOException e) {
           e.printStackTrace();
       }

   }

}
