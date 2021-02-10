public class Client{

    private final String name;
    private final String cpf;
    Bank []count = new Bank[5];


    public int verify(){
        for(int i = 0; i < count.length; i++){
            if(count[i] != null){
                return i;
            }
        }
        return 0;
    }
    public String verify(String cont) throws ExceptionContExist {
        for(int i = 0; i < count.length; i++){
            if(count[i].equals(cont)){
                System.out.println(cont);
                throw new ExceptionContExist(cont);
            }
        }
        System.out.println(cont);
        return null;
    }
    public void insert(String number_account){
            count[verify()] = new Bank(number_account);
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
