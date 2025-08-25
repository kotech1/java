// School.java

class School {
    String name;
    Student[] students;
    Teacher[] teachers;

    School(Student[] students) {
        this.students = students;
    }

    Student[] getStudents(int grade, int classNo) {
        // 빈 학생 배열
        Student[] someStudents = new Student[0];
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i].grade == grade &&
                this.students[i].classNo == classNo) {
                // 기존 배열+ 1 짜리 새배열 생성
                Student[] newStudents = new Student[someStudents.length+1];
                // 기존 학생 복사
                int j;
                for (j = 0; j < someStudents.length; j++) {
                    newStudents[j] = someStudents[j];
                }
                // 새 학생 추가 
                newStudents[j] = this.students[i];
                // 새로운 배열을 기존배열로 설정
                someStudents = newStudents;
            }
        }
        return someStudents;
    }

    public static void main(String[] args) {
        Student[] students = new Student[100];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        students[0].name = "홍길동";
        students[0].grade = 2;
        students[0].classNo = 3;

        students[9].name = "김영희";
        students[9].grade = 2;
        students[9].classNo = 3;

        School s = new School(students);

        Student[] arrStudents = s.getStudents(2, 3);
        for (int i = 0; i < arrStudents.length; i++) {
            System.out.println(arrStudents[i].name);
        }
    }
}

class Person {
    String name;
    String gender;
    String birthDate;
    // ...
}

class Student extends Person {
    int grade;
    int classNo; // class 명칭 사용불가
}

class Teacher extends Person {
    String subject;
    boolean isInClass;
}



