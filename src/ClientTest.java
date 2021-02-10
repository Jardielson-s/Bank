import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void insertClient() throws ExceptionContExist {

        Client client = new Client("Jardielson silva ferreiar","000.111.222-33","0000 000 000000-1");

        client.insertNewAccount("0000 444 0127-7");
        Assert.assertEquals(client.getCount()[0].getNumber_count(),"0000 000 000000-1");
        Assert.assertEquals(client.getCount()[1].getNumber_count(),"0000 444 0127-7");

        try {
            client.insertNewAccount("0000 444 0127-7");
            fail("should give exception");
        }catch (ExceptionContExist e){
            e.printStackTrace();
        }

    }

}