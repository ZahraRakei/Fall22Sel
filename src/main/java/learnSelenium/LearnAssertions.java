package learnSelenium;

import org.junit.Assert;
import org.junit.Test;

public class LearnAssertions {

    @Test
    public void testStringsEquality(){
        String a = "peter";
        String b = "alex";

        Assert.assertNotEquals(a, b);


    }
}
