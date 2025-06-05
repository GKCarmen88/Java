package obiectConstructor;

import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void testMethod(){
        Student Carmen = new Student("Gerendi-Klimek", "Carmen", 35, "KT", 3);
        Carmen.prezentareStudent();
        System.out.println();

        Student Elena = new Student("Ilies","Elena", 42, "KT", 3);
        Elena.prezentareStudent();
        System.out.println();

        Student Roxana = new Student("Mate", "Roxana", 25, "IT", 1);
        Roxana.prezentareStudent();
        System.out.println();

        Student Mihai = new Student("Toparcian", "Mihai", 31);
        Mihai.prezentareStudent();
        System.out.println();

        Mihai.varsta = 31;
        Mihai.facultate = "IT";
        Mihai.an = 1;
        Mihai.prezentareStudent();





    }


}
