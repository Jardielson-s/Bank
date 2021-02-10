import java.util.ArrayList;

public class ControlPanel {

    ArrayList<Client> arrayListClient =new ArrayList<>();

    public void insertClient(Client client) throws ExceptionCpfExist {
        for(Client client1 : arrayListClient){
            if(client1.getCpf().equals(client.getCpf())){
                throw new ExceptionCpfExist(client.getCpf());
            }
        }
        arrayListClient.add(client);
    }
}
