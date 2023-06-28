package clase10;
public class Cuenta {

    // atributos (características/propiedades)
    private String titular;
    private double cantidad;

    // constructores
    public Cuenta() {
    }


    // métodos (comportamients)
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }

    public void mostrarDatos(){
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("cantidad: "+ cantidad);

    }
    public void ingresar(float cantidadIngresar) {
        if(cantidadIngresar>0 ){
            cantidad+=cantidadIngresar;
        }
    }
    public void retirar(double cantidadRetirar) {
        if(cantidadRetirar>0 ){
            cantidad-=cantidadRetirar;
        }
    }
}
