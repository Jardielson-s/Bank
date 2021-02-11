import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void insertClient() throws ExceptionContExist {

        Client client = new Client("Jardielson silva ferreiara","000.111.222-33","0000 000 000000-1",55555);

        client.insertNewAccount("0000 444 0127-7", client.getSaldo());
        Assert.assertEquals(client.getCount().get(0).getNumber_count(),"0000 000 000000-1");
        Assert.assertEquals(client.getCount().get(1).getNumber_count(),"0000 444 0127-7");

        try {
            client.insertNewAccount("0000 444 0127-7",10000);
            fail("should give exception");
        }catch (ExceptionContExist e){
            e.printStackTrace();
        }

    }

}