public class Bank {

    private String number_count;
    Client client;

    public Bank(String number_count){
        this.number_count = number_count;
    }

    public void insertClient(Client client1){
        client = new Client(client1.getName(), client1.getCpf(), client1.getCount().toString());
    }

    public String getNumber_count() {
        return number_count;
    }

    public Client getClient(){
        return client;
    }

    public void setNumber_count(String number_count) {
        this.number_count = number_count;
    }
}
