package main.problems;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {

        int studentNum = students.length;

        for (int sandwich : sandwiches) {
            boolean foundAStudent = false;

            for (int j = 0; j < students.length; j++) {
                if (students[j] == sandwich) {
                    students[j] = -1;
                    studentNum -= 1;
                    foundAStudent = true;
                    break;
                }
            }

            if (!foundAStudent) {
                break;
            }
        }

        return studentNum;
    }
}
