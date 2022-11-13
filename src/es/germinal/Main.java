package es.germinal;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona(14,"Germinal",666444555);
        System.out.println(persona.age+ " / " + persona.name + " / " + persona.phoneNumber);

        Cliente cliente = new Cliente(23,"luis",555333222,25000);
        System.out.println(cliente.age+ " / " + cliente.name + " / " + cliente.phoneNumber + " / " + cliente.credit);

        Trabajador trabajador = new Trabajador(54, "Fernanda",333888777, 1250);
        System.out.println(trabajador.age + " / " + trabajador.name + " / " + trabajador.phoneNumber + " / " + trabajador.salary);
    }
}
