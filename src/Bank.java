public class Bank {

    private String number_count;
    private double saldo;
    private Client client = new Client();

    public Bank(String number_count, String name, String cpf, double saldo){
        this.number_count = number_count;
        this.saldo = saldo;
        client.setName(name);
        client.setCpf(cpf);
    }

    public Bank(String number_count){
        this.number_count = number_count;
    }

    public Bank(){}

    public void createAccount(String number_count, String name, String cpf, double saldo) throws ExceptionContExist {
        this.number_count = number_count;
        client = new Client(name, cpf, number_count, saldo);
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

    public void setClient(String name, String cpf) throws ExceptionContExist {
        this.client = new Client(name,cpf,getNumber_count(),getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
