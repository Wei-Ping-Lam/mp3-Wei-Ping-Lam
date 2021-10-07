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
    public void testTen() {
        int[] input = new int[]{3,3,3,2,6};
        int[] expectedOutput = new int[]{2,3,3,3,6};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testEleven() {
        int[] input = new int[0];
        int[] expectedOutput = new int[0];
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testTwelve() {
        int[] input = new int[]{1};
        int[] expectedOutput = new int[]{1};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testThirteen() {
        int[] input = new int[]{Integer.MAX_VALUE,1,1};
        int[] expectedOutput = new int[]{1,1,Integer.MAX_VALUE};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testFourteen() {
        int[] input = new int[]{Integer.MIN_VALUE,1,1};
        int[] expectedOutput = new int[]{Integer.MIN_VALUE,1,1};
        sortAlgorithmPUT.run(input,expectedOutput);
    }

    @Test
    public void testFifteen() {
        int[] input = new int[]{3,3,3,2,2,2,-1,-1,-1};
        int[] expectedOutput = new int[] {-1,-1,-1,2,2,2,3,3,3};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testSixteen() {
        int[] input = new int[]{8,7,6,5,1,-1,4,3,2,1};
        int[] expectedOutput = new int[] {-1,1,1,2,3,4,5,6,7,8};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testSeventeen() {
        int[] input = new int[]{8,7,6,-1,5,1,-1,4,3,2,1,-1,-1};
        int[] expectedOutput = new int[] {-1,-1,-1,-1,1,1,2,3,4,5,6,7,8};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testEighteen() {
        int[] input = new int[]{-1,0,1,2,3};
        int[] expectedOutput = new int[]{-1,0,1,2,3};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testNineteen() {
        int[] input = new int[]{-2,-2,8,8,8,7,6,-1,4,5,1,-1,4,4,4,4,4,3,2,1,-1,-1};
        int[] expectedOutput = new int[] {-2,-2,-1,-1,-1,-1,1,1,2,3,4,4,4,4,4,4,5,6,7,8,8,8};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testTwenty() {
        int[] input = new int[]{2,3,7,1,6,3,9,0};
        int[] expectedOutput = new int[]{0,1,2,3,3,6,7,9};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testTwentyOne() {
        int[] input = new int[]{-3,-120,1,63,37,12,-5};
        int[] expectedOutput = new int[]{-120,-5,-3,1,12,37,63};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testTwentyTwo() {
        int[] input = new int[]{81,6,4};
        int[] expectedOutput = new int[]{4,6,81};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testTwentyThree() {
        int[] input = new int[]{69,6,-4,0,-89,3206};
        int[] expectedOutput = new int[]{-89,-4,0,6,69,3206};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testTwentyFour() {
        int[] input = new int[]{25,89,9876,-8956,-66,-123,6849,9876};
        int[] expectedOutput = new int[]{-8956,-123,-66,25,89,6849,9876,9876};
        sortAlgorithmPUT.run(input, expectedOutput);
    }

    @Test
    public void testTwentyFive() {
        int[] input = new int[]{1,2,3,8,6,9,7,4,9,6,2,5,4,8,5};
        int[] expectedOutput = new int[]{1,2,2,3,4,4,5,5,6,6,7,8,8,9,9};
        sortAlgorithmPUT.run(input, expectedOutput);
    }
}
