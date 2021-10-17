package Lesson6;

import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class MethodOverLoading {
    int method() {
        return 0;
    }
    int method(int a, int b) {
        return a + b;
    }
    int method(int a, int b, int c) {
        return a + b + c;
    }
    int method(int a, int b, int c, int x) {
        return a + b + c + x;
    }
    int method(int a, int b, int c, int x, int v) {
        return a+b+c+x+v;
    }
}
        class MethodOverLoadingTest{
            public static void main(String[] args) {
                MethodOverLoading result = new MethodOverLoading();
                int f = result.method(1,2,3,4,5);
                System.out.println(f);
            }
        }

    /*void method(int chisloMethoda){
        System.out.println(chisloMethoda*2);
    }

}
    class MethodOverLoadingTest{
        public static void main(String[] args) {
            MethodOverLoading vstavkaMethoda = new MethodOverLoading();
            Scanner zapros = new Scanner(System.in);
            int zaprosChisla = zapros.nextInt();
            vstavkaMethoda.method(zaprosChisla);
        }*/

