public class Client{

    private final String name;
    private final String cpf;
    Bank []count = new Bank[5];
    int countig = 0;

    public String verify(String cont) throws ExceptionContExist {
        for(int i = 0; i < countig; i++){
            System.out.println(count[1].getClient());
            if(count[i].getNumber_count().equals(cont)){
                throw new ExceptionContExist(cont);
            }
        }
        return null;
    }
    public void insert(String number_account){
            count[countig] = new Bank(number_account);
            countig++;
    }

    public Client(String name, String cpf,String number_count){
          this.name =  name;
          this.cpf = cpf;
          insert(number_count);
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public Bank[] getCount() {
        return count;
    }

    public void setCount(Bank[] count) {
        this.count = count;
    }



}
