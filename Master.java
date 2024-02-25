package Home_Work_7;

public class Master extends Worker {
    private static final int GRADE = 2;


    public Master(String name) {
        super(name, GRADE);
        minSalary = random.nextDouble(80000);
    }

}
