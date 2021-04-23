public class Cliente {
    //Atributos
    int Cliente;
    String nombre;
    String primerApellido;
    String segundoApellido;
    String ciudad;

    //Metodo constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    public Cliente(String primerApellido,String segundoApellido){
        this.primerApellido=primerApellido;
        this.segundoApellido=segundoApellido;
    }

}
