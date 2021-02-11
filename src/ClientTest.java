import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void insertClient() throws ExceptionContExist {

        ArrayList<Count> counts = new ArrayList<>();
        Count count = new Count("Jardielson silva ferreiara","000.111.222-33","0000 000 000000-1",55555);

        counts.add(count);

        Client client = new Client("000.000.000-01","json stringfy");

        client.setCounts(counts);

        Assert.assertEquals(count.getSaldo(),client.getCounts().get(0).getSaldo(),0.1);

    }

}