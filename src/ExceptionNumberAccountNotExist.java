public class ExceptionNumberAccountNotExist extends Exception{

    public ExceptionNumberAccountNotExist(String number){
        super(number + " this number already exist");
    }
}
