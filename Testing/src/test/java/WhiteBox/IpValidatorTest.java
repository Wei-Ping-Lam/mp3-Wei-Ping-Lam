package WhiteBox;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IpValidatorTest {

    @Test
    public void dummyTest(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("0"));
    }

    @Test
    public void test1(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("IPv4",tool.validIPAddress("192.168.5.18"));
    }

    @Test
    public void test2(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("IPv6",tool.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:7334"));
    }

    @Test
    public void test3(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("192"));
    }

    @Test
    public void test4(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress(".168.5.18"));
    }

    @Test
    public void test5() {
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither", tool.validIPAddress("192.168.5."));
    }

    @Test
    public void test6() {
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither", tool.validIPAddress("192.168.5.18.98"));
    }

    @Test
    public void test7() {
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither", tool.validIPAddress("192.068.5.18"));
    }

    @Test
    public void test8(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("IPv4",tool.validIPAddress("192.168.0.18"));
    }

    @Test
    public void test9(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("192.555.5.18"));
    }

    @Test
    public void test10(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("192.-168.5.18"));
    }

    @Test
    public void test11(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("192.168.-0.18"));
    }

    @Test
    public void test12(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("192.abc.5.18"));
    }

    @Test
    public void test13(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("2001:0db8:85a3"));
    }

    @Test
    public void test14(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress(":0db8:85a3:0000:0000:8a2e:0370:7334"));
    }

    @Test
    public void test15(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370:"));
    }

    @Test
    public void test16(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("2001:0db8:85a3:0000:0000:8a2e:0370"));
    }

    @Test
    public void test17(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("20201:0db8:85a3:0000:0000:8a2e:0370:7334"));
    }

    @Test
    public void test18(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("2001::85a3:0000:0000:8a2e:0370:7334"));
    }

    @Test
    public void test19(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("2001:0db8:85a3:0r00:0000:8a2e:0370:7334"));
    }

    @Test
    public void test20(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("2001:0db8:85a3:0R00:0000:8a2e:0370:7334"));
    }

    @Test
    public void test21(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("2001:0db8:85a3:0;00:0000:8a2e:0370:7334"));
    }

    @Test
    public void test21(){
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("2001:0db8:85a3:0!00:0000:8a2e:0370:7334"));
    }
}
