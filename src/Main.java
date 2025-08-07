
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