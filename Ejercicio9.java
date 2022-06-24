public class Ejercicio9 {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    Trabajador trabajador = new Trabajador();
    cliente.setEdad(25);
    cliente.setNombre("Pedro");
    cliente.setTelefono(634877899);
    cliente.setCredito(250);
    trabajador.setSalario(2200);
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
    public int getTelefono() {
        return telefono;
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
    private int salario;
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}