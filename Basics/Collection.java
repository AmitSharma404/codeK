
import java.util.*;


class Student{
    Trial name;
    int rollNo;
    int marks;
}

public class Collection {
    
    public static void main(Trial[] args) {
        
        // int nums[] = new int[6];
        Student s1 = new Student();
        s1.name = "Niraj";
        s1.rollNo = 12;
        s1.marks = 16;

        Student s2 = new Student();
        s2.name = "Priya";
        s2.rollNo = 11;
        s2.marks = 12;

        Student s3 = new Student();
        s3.name = "Sanoj";
        s3.rollNo = 14;
        s3.marks = 11;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students){
            System.out.println(student.name + " : " + student.marks);
        }



    //     nums[0] = 10;
    //     nums[2] = 20;
    //     nums[3] = 40;
    //     nums[5] = 60;

    //    

    }
}
