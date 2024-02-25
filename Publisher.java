package Home_Work_7;

import java.util.List;

public interface Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    List<Observer> sendOffer(Vacancy vacancy);

}