package com.haoxiujie.test1.test;

import com.haoxiujie.test1.mian.Main;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Before
    public void init() {
        System.out.println("init执行...");
    }


    @Test
    public void testAdd() {
        System.out.println("testAdd执行...");
        Main m = new Main();
        int add = m.add(1, 4);
        Assert.assertEquals(5, add);
    }

    @After
    public void close() {
        System.out.println("close执行...");
    }

}
