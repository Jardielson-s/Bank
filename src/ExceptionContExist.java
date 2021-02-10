public class ExceptionContExist extends Exception {

    public ExceptionContExist(String count){
          super(count + " account already exist");
     }
}
