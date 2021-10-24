package BlackBox;

import BlackBox.Setups.LruCacheSetup;
import Utils.LruCacheMethod;
import org.junit.Test;

public class LruCacheBlackBoxTest extends LruCacheSetup {

    @Test
    public void dummyTest(){
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                2);
    }

    @Test
    public void test1(){
        //constructor size = 5
        int[] functionParameters = new int[]{5};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                -1);
    }

    public void test2(){
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //put key=1, value = 3
        int[] functionParameters4 = new int[]{1,3};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters4,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                3);
    }

    @Test
    public void test3(){
        //constructor size = 1
        int[] functionParameters = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //put key=2, value = 6
        int[] functionParameters4 = new int[]{2,6};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters4,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                -1);
    }

    @Test
    public void test4(){
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //put key=1, value = 2
        int[] functionParameters4 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters4,
                null);

        //get key = 1
        int[] functionParameters3 = new int[]{1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                2);
    }

    @Test
    public void test5(){
        //constructor size = 2
        int[] functionParameters = new int[]{2};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key= -1, value = 2
        int[] functionParameters2 = new int[]{-1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);

        //get key = -1
        int[] functionParameters3 = new int[]{-1};
        lruCachePUT.run(LruCacheMethod.Get,
                functionParameters3,
                2);
    }

    @Test
    public void test6(){
        //constructor size = 2
        int[] functionParameters = new int[]{0};
        lruCachePUT.run(LruCacheMethod.Constructor,
                functionParameters,
                null);

        //put key=1, value = 2
        int[] functionParameters2 = new int[]{1,2};
        lruCachePUT.run(LruCacheMethod.Put,
                functionParameters2,
                null);
    }
}
