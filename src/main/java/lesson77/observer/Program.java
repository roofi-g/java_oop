package lesson77.observer;

public class Program {

    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov", "Программист");
        Master petrov = new Master("Petrov", "Аналитик");
        Student sidorov = new Student("Sidorov");
        Handyman sidorova = new Handyman("Sidorova");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(sidorova);

        for (int i = 0; i < 3; i++){
            geekBrains.needEmployee("Тестировщик");
            google.needEmployee("Программист");
            yandex.needEmployee("Аналитик");
        }
    }

}
