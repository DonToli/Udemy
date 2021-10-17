package Lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    /*Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }*/
    public void surname(){
        System.out.println(surname);;
    }
    public void salary(){
        System.out.println(salary);;
    }
    public void id(){
        System.out.println(id);
    }
    public Employee(int id3){
        id=id3;
    }
    private Employee(double salary4) {
         salary = salary4;
    }
    Employee(String surname2) {
        surname = surname2;
    }
    double salaryX2() {// метод по увеличению зп в 2 раза
        salary *= 2;
        return salary;
    }
}

class EmployeeTest { //Добавление 2 объекта и увеличение зп с помощью метода
    public static void main(String[] args) {
        /*Lesson7.Employee object1 = new Lesson7.Employee(1, "Evklid", 30, 3000, "Filosofi");
        Lesson7.Employee object2 = new Lesson7.Employee(2, "Gerodot", 25, 5000, "Filolog");

        object1.salaryX2();
        System.out.println("Novaya zarplata rabotnika " + object1.surname + ": " + object1.salary);

        object2.salaryX2();
        System.out.println("Novaya zarplata rabotnika " + object2.surname + ": " + object2.salary);*/
        Lesson7.Employee object1 = new Lesson7.Employee(2);
        Lesson7.Employee object2 = new Lesson7.Employee("Petrov");
        //Lesson7.Employee object3 = new Lesson7.Employee(55,5);

        System.out.println(object1.id);
        System.out.println(object2.surname);
    }

}

