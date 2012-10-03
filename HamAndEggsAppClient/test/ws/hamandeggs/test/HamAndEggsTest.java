/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ws.hamandeggs.test;

import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kucharekm
 */
public class HamAndEggsTest {

    private final int EGG_LIMIT = 10;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

     @Test
     public void testHamAndEggs() {

         try {
             ws.hamandeggs.HamAndEggsService service = new ws.hamandeggs.HamAndEggsService();
             ws.hamandeggs.HamAndEggsPortType port = service.getHamAndEggsPort();

             // TODO initialize WS operation arguments here
             Random rand = new Random();
             int input = rand.nextInt(EGG_LIMIT);

             // TODO process result here
             boolean result = port.hamAndEggsOperation(input);

             assertEquals(true, result);
         } catch (Exception ex) {
             fail();
         }

     }

}