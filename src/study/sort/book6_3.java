package study.sort;

import java.util.*;

public class book6_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getScore() > student2.getScore()) {
                    return 1; //양수면 자리바꿈
                } else {
                    return -1; //음수면 자리 유지
                }
            }
        };

        // N명의 학생 정보를 입력받아 리스트에 저장
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }

        Collections.sort(students, comparator);

        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getName() + " ");
        }
    }

}

class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }
}
