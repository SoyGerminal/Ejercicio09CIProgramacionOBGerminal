package es.germinal;

public class Cliente extends Persona {
    int credit;
    public Cliente(){}

    public Cliente(int age, String name, int phoneNumber, int credit) {
        super(age, name, phoneNumber);
        this.credit = credit;
    }
}
