import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        String[] namesOfStudents = {
                "Manzura", "Azizbek", "Muratbek",
                "Bakhtiyar", "Aziza", "Taalay",
                "Vasiliy", "Kubanych", "Kanykey",
                "Emil", "Nurila", "Rysbek",
                "Eldiyar", "Anarkul", "James",
                "Mary", "Rober", "Patricia",
                "Nurlanbek", "Gulsara", "Timur",
                "Igor", "Oleg", "Ivan",
                "Alina", "Kanat", "Erkin",
                "Asylbek", "Tilek", "Urmat",
                "Madina", "Zhenishbek", "Samat",
                "Mavlyuda", "Bolotbek", "Vera",
                "Ermek", "Kanatbek", "Aleksey",
                "Evgeniy"
        };
        int[] agesOfStudents = {
                16, 17, 16, 18, 20,
                19, 21, 20, 22, 26,
                35, 40, 23, 20, 19,
                41, 25, 26, 23, 22,
                26, 36, 33, 22, 45,
                25, 54, 18, 19, 17,
                19, 26, 18, 16, 24,
                16, 18, 53, 48, 22
        };
        Student student1 = new Student(namesOfStudents[0], agesOfStudents[0] ),
                student2 = new Student(namesOfStudents[1], agesOfStudents[1] ),
                student3 = new Student(namesOfStudents[2], agesOfStudents[2] ),
                student4 = new Student(namesOfStudents[3], agesOfStudents[3] ),
                student5 = new Student(namesOfStudents[4], agesOfStudents[4] ),
                student6 = new Student(namesOfStudents[5], agesOfStudents[5] ),
                student7 = new Student(namesOfStudents[6], agesOfStudents[6] ),
                student8 = new Student(namesOfStudents[7], agesOfStudents[7] ),
                student9 = new Student(namesOfStudents[8], agesOfStudents[8] ),
                student10 = new Student(namesOfStudents[9], agesOfStudents[9] ),
                student11 = new Student(namesOfStudents[10], agesOfStudents[10] ),
                student12 = new Student(namesOfStudents[11], agesOfStudents[11] ),
                student13 = new Student(namesOfStudents[12], agesOfStudents[12] ),
                student14 = new Student(namesOfStudents[13], agesOfStudents[13] ),
                student15 = new Student(namesOfStudents[14], agesOfStudents[14] ),
                student16 = new Student(namesOfStudents[15], agesOfStudents[15] ),
                student17 = new Student(namesOfStudents[16], agesOfStudents[16] ),
                student18 = new Student(namesOfStudents[17], agesOfStudents[17] ),
                student19 = new Student(namesOfStudents[18], agesOfStudents[18] ),
                student20 = new Student(namesOfStudents[19], agesOfStudents[19] ),
                student21 = new Student(namesOfStudents[20], agesOfStudents[20] ),
                student22 = new Student(namesOfStudents[21], agesOfStudents[21] ),
                student23 = new Student(namesOfStudents[22], agesOfStudents[22] ),
                student24 = new Student(namesOfStudents[23], agesOfStudents[23] ),
                student25 = new Student(namesOfStudents[24], agesOfStudents[24] ),
                student26 = new Student(namesOfStudents[25], agesOfStudents[25] ),
                student27 = new Student(namesOfStudents[26], agesOfStudents[26] ),
                student28 = new Student(namesOfStudents[27], agesOfStudents[27] ),
                student29 = new Student(namesOfStudents[28], agesOfStudents[28] ),
                student30 = new Student(namesOfStudents[29], agesOfStudents[29] ),
                student31 = new Student(namesOfStudents[30], agesOfStudents[30] ),
                student32 = new Student(namesOfStudents[31], agesOfStudents[31] ),
                student33 = new Student(namesOfStudents[32], agesOfStudents[32] ),
                student34 = new Student(namesOfStudents[33], agesOfStudents[33] ),
                student35 = new Student(namesOfStudents[34], agesOfStudents[34] ),
                student36 = new Student(namesOfStudents[35], agesOfStudents[35] ),
                student37 = new Student(namesOfStudents[36], agesOfStudents[36] ),
                student38 = new Student(namesOfStudents[37], agesOfStudents[37] ),
                student39 = new Student(namesOfStudents[38], agesOfStudents[38] ),
                student40 = new Student(namesOfStudents[39], agesOfStudents[39] );
        Student[] students = {
                student1, student2, student3, student4,
                student5, student6, student7, student8,
                student9, student10, student11, student12,
                student13, student14, student15, student16,
                student17, student18, student19, student20,
                student21, student22, student23, student24,
                student25, student26, student27, student28,
                student29, student30, student31, student32,
                student33, student34, student35, student36,
                student37, student38, student39, student40
        };
        int[] numbers = {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35, 36, 37, 38, 39
                };


        Mentor mentor1 = new Mentor("Muhammed", 22);
        Mentor mentor2 = new Mentor("Zhanarbek", 22);
        Mentor mentor3 = new Mentor("Samarbek", 19);
        Mentor mentor4 = new Mentor("Zhazgul", 25);
        Mentor[] mentors = {mentor1, mentor2, mentor3, mentor4};
        Collections.shuffle(Arrays.asList(numbers));
        int count = 0;
        for (Mentor m:mentors){
            for (int i = 0; i < 10; i++){
                m.addStudent(students[count]);
                count++;
            }
            System.out.println(m.students);
        }
    }
}
