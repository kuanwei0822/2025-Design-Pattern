package com.project.patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * LazyInitSingletonTest
 *
 * 測試 LazyInitSingleton 類別
 *
 * 1. 測試是否只有一個實體
 * 2. 測試屬性是否共用
 */
public class LazyInitSingletonTest {

    /**
     * 1. 測試是否只有一個實體
     */
    @Test
    void testOnlyOneInstance() {
        LazyInitSingleton s1 = LazyInitSingleton.getInstance();
        LazyInitSingleton s2 = LazyInitSingleton.getInstance();
        assertSame(s1, s2, "是同一個實體");
    }

    /**
     * 2. 測試屬性是否共用
     */
    @Test
    void testSharedFieldValues() {
        LazyInitSingleton s1 = LazyInitSingleton.getInstance();
        s1.setMyInfo("JUnit");
        s1.setMyNo(42);

        LazyInitSingleton s2 = LazyInitSingleton.getInstance();
        assertEquals("JUnit", s2.getMyInfo());
        assertEquals(42, s2.getMyNo());
    }
}
