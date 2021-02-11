import java.util.ArrayList;

public class Client{

    private  String name;
    private  String cpf;
    private double saldo;
    Bank []count = new Bank[5];
    int countig = 0;

    private String verify(String cont) throws ExceptionContExist {
        for(int i = 0; i < countig; i++){
            if(count[i].getNumber_count().equals(cont)){
                System.out.println(cont);
                throw new ExceptionContExist(cont);
            }
        }
        return null;
    }

    public void insertNewAccount(String number_account, double saldo) throws ExceptionContExist {
            verify(number_account);
            count[countig] = new Bank(number_account, getName(), getCpf(), saldo);
            countig++;
    }

    public Client(String name, String cpf,String number_count, double saldo) throws ExceptionContExist {
          this.name =  name;
          this.cpf = cpf;
          this.saldo = saldo;
          insertNewAccount(number_count, getSaldo());
    }

    public Client(){}

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Bank> getCount() {
        ArrayList<Bank> banks = new ArrayList<>();
        for(int i = 0; i < count.length; i++){
            banks.add(count[i]);
        }
        return banks;
    }

    public void withdrawMoney(double value){
        this.saldo = getSaldo() - value;
    }
    public void depositMoney(double value){
        this.saldo = getSaldo() + value;
    }
}
