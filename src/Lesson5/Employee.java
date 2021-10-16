package Lesson5;

public class Employee {//Создал class Employee с атрибутами
    int id;
    String surname;
    int age;
    double salary;
    String department;
    Employee(int id2,String surname2,int age2,double salary2,String department2){
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double salaryX2() {// метод по увеличению зп в 2 раза
        salary *=2;
        return salary;
    }
}
    class EmployeeTest { //Добавление 2 объекта и увеличение зп с помощью метода
        public static void main(String[] args) {
            Employee object1 = new Employee(1,"Evklid",30,3000,"Filosofi");
            Employee object2 = new Employee(2,"Gerodot",25,5000,"Filolog");

            object1.salaryX2();
            System.out.println("Novaya zarplata rabotnika " + object1.surname + ": " +object1.salary);

            object2.salaryX2();
            System.out.println("Novaya zarplata rabotnika " + object2.surname + ": " +object2.salary);

        }

    }

