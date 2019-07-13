package Ex1Sms;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void makeSMSShorter_aAlaMaKota() {

        String expected="AlaMaKota";
        String actual=Main.makeSMSShorter("Ala ma Kota");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void makeSMSShorter_aAlaMaKota_2spaces() {

        String expected="AlaMaKota";
        String actual=Main.makeSMSShorter("Ala   ma     Kota");
        Assert.assertEquals(expected,actual);
    }
@Test
    public void makeSMSShorter_aALAMAKOTA_AlaMaKota() {

        String expected="AlaMaKota";
        String actual=Main.makeSMSShorter("ALA MA KOTA");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void makeSMSShorter_Null_AlaMaKota() {

        String expected=null;
        String actual=Main.makeSMSShorter(null);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void makeSMSShorter_Pusty_Empty() {

        String expected=null;
        String actual=Main.makeSMSShorter("");
        Assert.assertEquals(expected,actual);
    }

}