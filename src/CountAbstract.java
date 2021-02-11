public abstract class CountAbstract {

    protected String num;
    protected double balance;
    protected String extract;
    protected Client client;

    public CountAbstract(String num, Client c){
        this.num = num;
        balance = 0;
        extract = "";
        client = c;
        //c.getCounts().add();
    }

    public CountAbstract(String num, Client client, double balance){
        this.num = num;
        this.client = client;
        this.balance = balance;
        extract = "";
    }

    public String getNum() {
        return num;
    }
    public Client getClient() {
        return client;
    }
    public double getBalance() {
        return balance;
    }
    public String getExtract() {
        return extract;
    }

    void credito(double val) {
       balance = getBalance() + val;
        extract = getExtract() + "Crédito: " + val +
                ". Saldo: " + getBalance() + "\n";
    }

    public abstract void debito(double val) throws ExceptionInsufficientFunds;
}
