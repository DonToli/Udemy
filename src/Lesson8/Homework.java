package Lesson8;

public class Homework {
    static int firstMetod(int a,int b,int c) {
        return a*b*c;
    }
    static void secondMethod (int a,int b) {
        System.out.println("Celoe chastnoe ot a razdelit na b = "+ a/b);
        System.out.println("Ostatok ot a razdelenoe na b = " + a%b);
    }
}
    class HomeworkTest{
        public static void main(String[] args) {

            System.out.println(Homework.firstMetod(3,4,5));
            Homework.secondMethod(9,2);
        }
}