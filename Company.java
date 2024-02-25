package Home_Work_7;

import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Company {

    private Random random = new Random();
    private String companyName;
    private double maxSalary;

    private Publisher jobAgency;


    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee() {
        double salary = random.nextDouble(2000, maxSalary);
        Vacancy vacancy = new Vacancy(companyName, salary);
        List<Observer> workers = jobAgency.sendOffer(vacancy);
        if (workers == null || workers.isEmpty()) {
            System.out.printf("Компания %s не нашла соискателя с заработной платой %.2f\n", companyName, salary);
        } else {
            workers.sort(new Comparator<Observer>() {
                @Override
                public int compare(Observer o1, Observer o2) {
                    int grade = Double.compare(o1.getGRADE(), o2.getGRADE());
                    if (grade == 0)
                        return Double.compare(o1.getMinSalary(), o2.getMinSalary());
                    return grade;
                }
            });
            Observer workerToAcceptOffer = workers.get(0);
            System.out.printf("Компания %s нашла соискателя %s с заработной платой %.2f\n",
                    companyName, workerToAcceptOffer.getName(), workerToAcceptOffer.getMinSalary());
            jobAgency.removeObserver(workerToAcceptOffer);
        }
    }
}
