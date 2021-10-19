package Lesson8;

public class Homework2 {
    public static final double pi = 3.14;

    public double ploshKruga(double radius) {
        double ploshad;
        return ploshad = pi * radius * radius;
    }

    public static double dlinaOkrug(double radius2) {
        double dlina = 2 * pi * radius2;
        return dlina;
    }

    public void method3(double radius3) {
        System.out.println("Radius, ploshad i dlina kruga sootvetstvenno = " + radius3 + ", "
                + ploshKruga(radius3) + ", " + dlinaOkrug(radius3));
    }
}

class HomeWorkTest2 {
    public static void main(String[] args) {
        Homework2 h2 = new Homework2();
        h2.ploshKruga(4);
        Homework2.dlinaOkrug(3);
        h2.method3(5);
    }
}
