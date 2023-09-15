package lesson44;

public interface Accountable<T> {

    T getId();

    double getAmount();

    void setAmount(double amount);

}
