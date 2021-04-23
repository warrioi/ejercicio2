import java.util.Date;
import java.util.List;

public class Billete {
    //Atributos
    int Billete;
    Date fechaEmision;
    double precioTotal;
    Cliente cliente;
    Ciudad origen;
    Ciudad destino;
    Categoria categoria;
    List<Vuelo> Vuelo;

    public Billete(){

    }

}
