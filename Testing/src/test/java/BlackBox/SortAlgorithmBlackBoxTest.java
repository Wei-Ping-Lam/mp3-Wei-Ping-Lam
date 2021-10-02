package BlackBox;

import BlackBox.Setups.SortSetup;
import org.junit.Test;

public class SortAlgorithmBlackBoxTest extends SortSetup {

    @Test
    public void dummyTest(){
        int[] input = new int[]{2,1};
        int[] expectedOutput = new int[]{1,2};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testOne(){
        int[] input = null;
        int[] expectedOutput = null;
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testTwo(){
        int[] input = new int[]{3,1,5};
        int[] expectedOutput = new int[]{1,3,5};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testThree(){
        int[] input = new int[]{1,2};
        int[] expectedOutput = new int[]{1,2};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testFour(){
        int[] input = new int[]{2,2,1};
        int[] expectedOutput = new int[]{1,2,2};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testFive(){
        int[] input = new int[]{7,6,1,5};
        int[] expectedOutput = new int[]{1,5,6,7};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testSix(){
        int[] input = new int[]{7,6,5,1,5};
        int[] expectedOutput = new int[]{1,5,5,6,7};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testSeven(){
        int[] input = new int[]{2};
        int[] expectedOutput = new int[]{2};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testEight(){
        int[] input = new int[]{2,5,3,7,8,3,1,5,3,7};
        int[] expectedOutput = new int[]{1,2,3,3,3,5,5,7,7,8};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testNine(){
        int[] input = new int[]{12,3,2,5,6,3,8,3,12,14,63,98,36,23};
        int[] expectedOutput = new int[]{2,3,3,3,5,6,8,12,12,14,23,36,63,98};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testTen(){
        int[] input = new int[]{1,2,3,4,6,5,7,8,9};
        int[] expectedOutput = new int[]{1,2,3,4,5,6,7,8,9};
        sortAlgorithmPUT.run(input,expectedOutput);
    }
}
