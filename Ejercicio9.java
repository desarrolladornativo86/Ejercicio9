public class Ejercicio9 {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    System.out.println("Cliente: ");
    cliente.setEdad(36);
    cliente.setNombre("Onga");
    cliente.setTelefono(634877899);
    cliente.setCredito(1600);
    System.out.println("Nombre: " + cliente.getNombre() + ", Edad:" + cliente.getEdad() + ", Telefono: " + cliente.getTelefono() + ", Credito: " + cliente.getCredito());
    Trabajador trabajador = new Trabajador();
    System.out.println("Trabajador: ");
    cliente.setEdad(37);
    cliente.setNombre("Hueso");
    cliente.setTelefono(64356745);
    cliente.setCredito(800);
    trabajador.setSalario(1500);
    System.out.println("Nombre: " + cliente.getNombre() + ", Edad:" + cliente.getEdad() + ", Telefono: " + cliente.getTelefono() + ", Credito: " + cliente.getCredito() + ", Salario: " + trabajador.getSalario());
    }
}
class Persona{
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono() {return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int edad;
    private int telefono;
    private String nombre;
}
 class Cliente extends Persona{
     private int credito;

     public int getCredito() {
         return credito;
     }
     public void setCredito(int credito) {
         this.credito = credito;
     }
}

class Trabajador extends Persona{
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double salario;
}