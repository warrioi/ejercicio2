import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Cliente danielRojas=new Cliente("daniel Rojas");
    Cliente vanesaCespedes=new Cliente("vanesa Cespedes");

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(danielRojas);
        clientes.add(vanesaCespedes);

        Ciudad santiago=new Ciudad("santiago");
        Ciudad BuenosAires=new Ciudad("Buenos Aires");
        List<Ciudad>origen=new ArrayList<>();
        origen.add(santiago);
        origen.add(BuenosAires);

        Ciudad India = new Ciudad("india");
        Ciudad Barcelon = new Ciudad("Barcelona");

        List<Ciudad>Destino = new ArrayList<>();
        origen.add(India);
        origen.add(Barcelon);
    }

}
