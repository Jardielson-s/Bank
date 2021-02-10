public class Client{

    private  String name;
    private  String cpf;
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

    public void insertNewAccount(String number_account) throws ExceptionContExist {
            verify(number_account);
            count[countig] = new Bank(number_account, getName(), getCpf());
            countig++;
    }

    public Client(String name, String cpf,String number_count) throws ExceptionContExist {
          this.name =  name;
          this.cpf = cpf;
          insertNewAccount(number_count);
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

    public Bank[] getCount() {
        return count;
    }

    public void setCount(Bank[] count) {
        this.count = count;
    }


}
