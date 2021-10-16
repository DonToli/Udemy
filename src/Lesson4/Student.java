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
        double sredneeArifmet(Student st){
            double sredOcenka =(st.sredOcenkaAngl+st.sredOcenkaEcconom+st.sredOcenkaMatem)/3;
            System.out.println("Srednya arifmeticheskaya ocenka " + st.sirname + " " + st.name + " ravna " + sredOcenka);
            return sredOcenka;
        }
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

            StudentTest stTest = new StudentTest();
            stTest.sredneeArifmet(genri);
            stTest.sredneeArifmet(federico);
            stTest.sredneeArifmet(samuil);
        }

    }
