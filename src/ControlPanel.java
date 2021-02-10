import java.util.ArrayList;

public class ControlPanel {

    ArrayList<Client> arrayListClient = new ArrayList<>();
    ArrayList<Bank> bankArrayList = new ArrayList<>();

    public void insertClient(Client client) throws ExceptionCpfExist, ExceptionContExist {
        for(Client client1 : arrayListClient){
            if(client1.getCpf().equals(client.getCpf())){
                throw new ExceptionCpfExist(client.getCpf());
            }
        }
        for(int i = 0; i < arrayListClient.size(); i++){
            if(arrayListClient.get(i).getCount().get(i).getNumber_count().equals(client.getCount().get(i).getNumber_count())){
                throw new ExceptionContExist(client.getCount().get(i).getNumber_count());
            }
        }
        arrayListClient.add(client);
    }

    public void createAccount(Bank bank) throws ExceptionCpfExist, ExceptionContExist {

        for(Bank bank1 : bankArrayList){
            if(bank1.getClient().getCpf().equals(bank.getClient().getCpf())){
                throw new ExceptionCpfExist(bank.getClient().getCpf());
            }
                if(bank1.getNumber_count().equals(bank.getNumber_count())){
                    throw new ExceptionContExist(bank.getNumber_count());
                }
        }
        bankArrayList.add(bank);

    }

    public ArrayList<Client> recuperarClientes(){
        ArrayList<Client> clients = new ArrayList<>();
        clients.addAll(arrayListClient);
        return clients;
    }

    public ArrayList<Bank> recuperarAccount(){
        ArrayList<Bank> banks = new ArrayList<>();
        banks.addAll(bankArrayList);
        return banks;
    }

   public void transferValue(){
        
   }
}
