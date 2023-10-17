
// program to perform class mark
public class Student {
    //initialise variables
    String name="Abele";

    int age=18;
    char sex='M';
    int mid=22;
    int final_=38;
    int T_mark;
    int avg=67;
    //using if condition
    static void s_grade(int mark){
        if( mark<50) {//conditional
            System.out.println(mark+" "+"fail");
        }
        else if (mark==50) {
            System.out.println(mark+" "+"it is fair");

        } else if (mark>60 && mark<70) {
            System.out.println(mark+" "+"it is good");

        }
    }
    //calculating total mark
    void T_mark(int test1,int test2){
        T_mark=test1+test2;
        System.out.println("total mark is = "+T_mark);
    }
    //main method

    public static void main(String[] args){
        //create new object
Student stud1=new Student();
//display name
System.out.println("name ="+stud1.name);
//display age
        System.out.println("age ="+stud1.age);
        //display sex
        System.out.println("sex ="+stud1.sex);
        //calling T_mark
        stud1.T_mark(stud1.mid,stud1.final_);
        //calling s_grade
        s_grade(stud1.avg);
        //for loop
        int i=0;
        while(i<3){
            System.out.println("great!");
            i++;
        }
        System.out.println("Thank you so much");

    }
}
