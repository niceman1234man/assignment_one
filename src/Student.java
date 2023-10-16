
// program to perform class mark
public class Student {
    String name="Abele";
    int age=18;
    char sex='M';
    int mid=22;
    int final_=38;
    int T_mark;
    int avg=67;
    static void s_grade(int mark){
        if( mark<50) {
            System.out.println(mark+" "+"fail");
        }
        else if (mark==50) {
            System.out.println(mark+" "+"it is fair");

        } else if (mark>60 && mark<70) {
            System.out.println(mark+" "+"it is good");

        }
    }
    void T_mark(int test1,int test2){
        T_mark=test1+test2;
        System.out.println("total mark is = "+T_mark);
    }

    public static void main(String[] args){
Student stud1=new Student();
stud1.T_mark(stud1.mid,stud1.final_);
s_grade(stud1.avg);
System.out.println("name ="+stud1.name);
        System.out.println("age ="+stud1.age);
        System.out.println("sex ="+stud1.sex);
        System.out.println("Thank you so much");

    }
}
