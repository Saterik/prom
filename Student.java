package Home_Work_7;

public class Student extends Worker {
    private static final int GRADE = 3;

    public Student(String name) {
        super(name, GRADE);
        minSalary = random.nextDouble(5000);
    }

}
