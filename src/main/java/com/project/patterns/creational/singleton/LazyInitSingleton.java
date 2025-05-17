package com.project.patterns.creational.singleton;

/**
 * LazyInitSingleton
 * <p>
 * 1. Lazy Loading: 需要時才會初始化，第一次使用時才會建立實體。
 * 2. 類別載入時不會立即建立實體，只有在第一次使用時才會建立實體。
 * 3. 使用 synchronized 關鍵字來確保執行緒安全。
 *
 */
public class LazyInitSingleton {

    // 單例實體，getInstance 是 static 方法，所以這個屬性也必須是 static
    private static LazyInitSingleton instance;

    private String myInfo;
    private int myNo;

    // 建構函數
    private LazyInitSingleton() {
        this.myInfo = "DesignPatternLab";
        this.myNo = 0;
    }

    // 使用 synchronized 關鍵字來確保執行緒安全，
    // 同一時間只有一個執行緒能進入這段方法，避免被 new 出兩個實體
    public static synchronized LazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }

    // Getter/Setter，可以加入邏輯檢查，符合封裝精神
    public String getMyInfo() {
        return myInfo;
    }
    public void setMyInfo(String myInfo) {
        this.myInfo = myInfo;
    }
    public int getMyNo() {
        return myNo;
    }
    public void setMyNo(int myNo) {
        this.myNo = myNo;
    }
}
