package task7;

public class LearnerTester {
    public static void main(String[] args) {
        Learner[] learners = new Learner[4];
        learners[0] = new Schoolboy("Дмитрий");
        learners[1] = new Schoolboy("Александра");
        learners[2] = new Student("Алексей");
        learners[3] = new Student("Елена");

        System.out.println("Школьники: ");
        for (Learner learner : learners) {
            if (learner instanceof Schoolboy) {
                Schoolboy Schoolboy = (Schoolboy) learner;
                System.out.println("Имя: " + Schoolboy.getName());
            }
        }
        System.out.println();
        System.out.println("Студенты: ");
        for (Learner learner : learners) {
            if (learner instanceof Student) {
                Student Student = (Student) learner;
                System.out.println("Имя: " + Student.getName());
            }
        }
    }
}

