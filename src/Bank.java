public class Bank {

    private String number_count;
    private double saldo;
    private Count count = new Count();

    public Bank(String number_count, String name, String cpf, double saldo){
        this.number_count = number_count;
        this.saldo = saldo;
        count.setName(name);
        count.setCpf(cpf);
    }


    public String getNumber_count() {
        return number_count;
    }

    public Count getClient(){
        return count;
    }

    public void setNumber_count(String number_count) {
        this.number_count = number_count;
    }

    public void setClient(String name, String cpf) throws ExceptionContExist {
        this.count = new Count(name,cpf,getNumber_count(),getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
