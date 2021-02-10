public class ExceptionCpfExist extends Exception{

    public ExceptionCpfExist(String cpf){
        super(cpf + " this number of cpf already exist");
    }
}
