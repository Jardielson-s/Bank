import java.util.ArrayList;

public class Client {

    private final String name;
    private final String cpf;
    ArrayList<Count> counts = null;

    public Client(String cpf, String name){
        this.name = name;
        this.cpf =cpf;
    }


    public ArrayList<Count> getCounts() {
        return counts;
    }

    public void setCounts(ArrayList<Count> counts) {
        this.counts = counts;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }
}
