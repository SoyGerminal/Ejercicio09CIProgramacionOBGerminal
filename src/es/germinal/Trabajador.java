package es.germinal;

public class Trabajador extends Persona {
    int salary;
    public Trabajador(){}

    public Trabajador(int age, String name, int phoneNumber, int salary) {
        super(age, name, phoneNumber);
        this.salary = salary;
    }
}
