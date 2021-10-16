package Lesson4;

public class Student {
        int studentID;
        String name;
        String sirname;
        int course;
        double sredOcenkaMatem;
        double sredOcenkaEcconom;
        double sredOcenkaAngl;
    }
    class StudentTest {
        public static void main(String[] args) {
            Student genri = new Student();
            genri.studentID = 1;
            genri.name = "Genry";
            genri.sirname = "Ford";
            genri.course = 4;
            // 5 бальная система образования
            genri.sredOcenkaMatem = 5;
            genri.sredOcenkaEcconom = 5;
            genri.sredOcenkaAngl = 5;

            Student federico = new Student();
            federico.studentID = 2;
            federico.name = "Fedia";
            federico.sirname = "Belo";
            federico.course = 3;
            federico.sredOcenkaMatem = 4.3;
            federico.sredOcenkaEcconom = 4.1;
            federico.sredOcenkaAngl = 4.5;

            Student samuil = new Student();
            samuil.studentID = 3;
            samuil.name = "Samvel";
            samuil.sirname = "Akopian";
            samuil.course = 2;
            samuil.sredOcenkaMatem = 3.2;
            samuil.sredOcenkaEcconom = 4.6;
            samuil.sredOcenkaAngl = 3.8;

            System.out.println("Y student " + genri.name +" "+ genri.sirname + " c " + genri.course + " kursa srednia ocenka = "
                    + (genri.sredOcenkaMatem + genri.sredOcenkaEcconom + genri.sredOcenkaAngl)/3 +" !");
            System.out.println("Y student " + samuil.name +" "+ samuil.sirname + " c " + samuil.course + " kursa srednia ocenka = "
                    + (samuil.sredOcenkaMatem + samuil.sredOcenkaEcconom + samuil.sredOcenkaAngl)/3 +" !");
            System.out.println("Y student " + federico.name +" "+ federico.sirname + " c " + federico.course + " kursa srednia ocenka = "
                    + (federico.sredOcenkaMatem + federico.sredOcenkaEcconom + federico.sredOcenkaAngl)/3 +" !");

        }

    }
