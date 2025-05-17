package com.project.patterns.creational.singleton;

/**
 * LazyInitSingleton
 *
 * 1. Lazy Loading: 需要時才會初始化，第一次使用時才會建立實體。
 * 2. 類別載入時不會立即建立實體，只有在第一次使用時才會建立實體。
 *
 */
public class LazySingletonDemo {

    public static void main(String[] args) {

        // 取得單例實體
        LazyInitSingleton instance1 = LazyInitSingleton.getInstance();
        LazyInitSingleton instance2 = LazyInitSingleton.getInstance();

        // 1. 印出兩個實體的 hashCode，證明要是相同的
        System.out.println("===LazyInitSingleton Example 1 ===");
        System.out.println("Instance 1 HashCode: " + instance1.hashCode());
        System.out.println("Instance 2 HashCode: " + instance2.hashCode());

        // 判斷兩個實體是否相同
        if (instance1 == instance2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }

        // 2. 設定屬性，證明 instance1、instance2 是相同的
        System.out.println("===LazyInitSingleton Example 2 ===");
        // 從 instance1 設定屬性
        instance1.setMyInfo("example");
        instance1.setMyNo(1);
        System.out.println("instance1 setMyInfo: " + instance1.getMyInfo());
        System.out.println("instance1 setMyNo: " + instance1.getMyNo());
        // 從 instance2 取得屬性(證明 Instance1、Instance2 兩個是共用同一實體)
        System.out.println("Instance2 getInfo: " + instance2.getMyInfo());
        System.out.println("Instance2 getNo: " + instance2.getMyNo());
    }
}
