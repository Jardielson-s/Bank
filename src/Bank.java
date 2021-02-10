public class Bank {

    private String number_count;
    Client client;

    public Bank(String number_count,String name,String cpf){
          this.number_count = number_count;
          client = new Client(name,cpf,getNumber_count());
    }

    public Bank(String number_count){
        this.number_count = number_count;
    }

    public String getNumber_count() {
        return number_count;
    }

    public Client getClient(){
        return client;
    }

}
