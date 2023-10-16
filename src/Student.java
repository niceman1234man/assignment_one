public class Student {
    String name="abebe";
    int age=18;
    char sex='m';
    int mid=22;
    int final_=38;
    int mark=mid+final_;
    static void s_grade(int mark){
        if(mark<50) {
            System.out.println(mark+"fail");
        }
        else if (mark==50) {
            System.out.println(mark+" "+"it is fair");

        } else if (mark>50) {
            System.out.println(mark+" "+"it is good");

        }
    }
    public static void main(String[] args){
Student stud1=new Student();
s_grade(stud1.mark);
System.out.println(stud1.name);
    }
}
