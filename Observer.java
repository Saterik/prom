package Home_Work_7;

public interface Observer {

    boolean receiveOffer(Vacancy vacancy);

    public String getName();

    public double getMinSalary();

    public int getGRADE();

}
