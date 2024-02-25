package Home_Work_7;


public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();
        Company google = new Company("Google", 120000, jobAgency);
        Company yandex = new Company("Yandex", 95000, jobAgency);
        Company geekBrains = new Company("GeekBrains", 80000, jobAgency);

        Student student = new Student("Иванов");
        Master master = new Master("Петров");
        Programmer programmer = new Programmer("Кузнецов");

        jobAgency.registerObserver(student);
        jobAgency.registerObserver(master);
        jobAgency.registerObserver(programmer);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            System.out.println();
        }
    }

}
