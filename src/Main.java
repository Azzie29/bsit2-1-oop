public class Main {

    static class Student {
        String name;
        int age;
        String course;
        double grade1;
        double grade2;
        double grade3;


        public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
            this.name = name;
            this.age = age;
            this.course = course;
            this.grade1 = grade1;
            this.grade2 = grade2;
            this.grade3 = grade3;
        }


        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Course: " + course);
            System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
        }


        public double calculateAverage() {
            return (grade1 + grade2 + grade3) / 3;
        }


        public String getLetterGrade() {
            double avg = calculateAverage();
            if (avg >= 90) return "A";
            else if (avg >= 80) return "B";
            else if (avg >= 70) return "C";
            else if (avg >= 60) return "D";
            else return "F";
        }


        public boolean isPassing() {
            return calculateAverage() >= 70;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Zing", 21, "BSIT", 95, 89, 88);
        Student s2 = new Student("Catherine",21,"BSIT", 85,87,89);
        Student s3 = new Student("Arweyne", 22, "BSIT", 85, 91, 95);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        for (Student s : students) {

            s.displayInfo();
            double avg = s.calculateAverage();
            String grade = s.getLetterGrade();
            boolean passing = s.isPassing();

            System.out.printf("Average: %.2f\n", avg);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + (passing ? "PASSING" : "FAILING"));
            System.out.println(" ");
            if (passing) {
                passingCount++;
            }
        }


        System.out.println("Total number of passing students: " + passingCount);
    }
}