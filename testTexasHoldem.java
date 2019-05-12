import org.junit.Assert;
import org.junit.Test;

public class testTexasHoldem {
    @Test
    public void test1(){//同花顺
        texasHoldem th = new texasHoldem();
        String result1 = th.compairResult("5S 6S 7S 8S 9S","TH JH QH KH AH");
        Assert.assertEquals("white wins - high card:A",result1);
        String result2 = th.compairResult("5S 6S 7S 8S 9S","TH TD QH KH AH");
        Assert.assertEquals("black wins - StraightFlush",result2);
    }
    @Test
    public void test2(){//铁支
        texasHoldem th = new texasHoldem();
        String result1 = th.compairResult("6D 4H 4C 4D 4S","3H AS AD AC AH");
        Assert.assertEquals("white wins - high card:A",result1);
        String result2 = th.compairResult("5S 9S 9D 9H 9C","TH TD QH KH AH");
        Assert.assertEquals("black wins - FourOfAKind",result2);
    }
    @Test
    public void test3(){//葫芦
        texasHoldem th = new texasHoldem();
        String result1 = th.compairResult("6D 6S 9H 9D 9S","TH TS AC AD AH");
        Assert.assertEquals("white wins - high card:A",result1);
        String result2 = th.compairResult("6D 6S 9H 9D 9S","TH TD QH KH AH");
        Assert.assertEquals("black wins - FullHouse",result2);
    }
    @Test
    public void test4(){//同花
        texasHoldem th = new texasHoldem();
        String result1 = th.compairResult("2S 3S 5S 7S 9S","6H 8H TH KH AH");
        Assert.assertEquals("white wins - high card:A",result1);
        String result2 = th.compairResult("2S 3S 5S 7S 9S","TH TD QH KH AH");
        Assert.assertEquals("black wins - Flush",result2);
    }
    @Test
    public void test5(){//顺子
        texasHoldem th = new texasHoldem();
        String result1 = th.compairResult("5S 6S 7S 8S 9S","TH JH QH KH AH");
        Assert.assertEquals("white wins - high card:A",result1);
        String result2 = th.compairResult("5S 6D 7H 8S 9S","TH TD QH KH AH");
        Assert.assertEquals("black wins - Straight",result2);
    }
    @Test
    public void test6(){//三条
        texasHoldem th = new texasHoldem();
        String result1 = th.compairResult("5S 6S 9C 9D 9S","TH JH AS AC AH");
        Assert.assertEquals("white wins - high card:A",result1);
        String result2 = th.compairResult("5S 6S 9C 9D 9S","TH TD QH KH AH");
        Assert.assertEquals("black wins - ThreeOfAKind",result2);
    }
    @Test
    public void test7(){//两对
        texasHoldem th = new texasHoldem();
        String result1 = th.compairResult("5S 7D 7S 9D 9S","TH QD QH AD AH");
        Assert.assertEquals("white wins - high card:A",result1);
        String result2 = th.compairResult("5S 7D 7S 9D 9S","TH TD QH KH AH");
        Assert.assertEquals("black wins - TwoPair",result2);
    }
    @Test
    public void test8(){//对子
        texasHoldem th = new texasHoldem();
        String result1 = th.compairResult("5S 6S 7S 9D 9S","TH JH QH AD AH");
        Assert.assertEquals("white wins - high card:A",result1);
        String result2 = th.compairResult("5S 6S 7S 9D 9S","TH 3D 2H 4C 9H");
        Assert.assertEquals("black wins - OnePair",result2);
    }
    @Test
    public void test9(){//散牌
        texasHoldem th = new texasHoldem();
        String result1 = th.compairResult("5S 4C JH 7D 9S","7D 5C 8H 2D AH");
        Assert.assertEquals("white wins - high card:A",result1);
    }
    @Test
    public void test10(){//平局
        texasHoldem th = new texasHoldem();
        String result1 = th.compairResult("5S 6S 7S 8S 9S","5S 6S 7S 8S 9S");
        Assert.assertEquals("tie",result1);
    }
}
