/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
/**
 *
 * @author 1161386_1161391_1151708_1151172_1150807_Grupo41
 */
public class ApplicationsListTest {
    
    @Test
    public void EnsureAddApplicationMethodAddsApplicationToList() throws Exception{
        ApplicationsList list = new ApplicationsList();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date beginning = sdf.parse("01/10/2017");
        Date end = sdf.parse("01/30/2017");
        Local local = new Local("Example Street", 500);
        Event event = new Event("Model Example", "Explae string", beginning, end, local);
        Application2 application = new Application2("qwert", event, false);
        Application2 application2 = new Application2("qwerty", event, false);
        list.addApplication(application);
        list.addApplication(application2);
        int size = list.size();
        int expectedResult = 2;
        assertEquals(size,expectedResult);
    }
}