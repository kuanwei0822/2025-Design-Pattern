package com.project.patterns.creational.singleton;
/**
 * Singleton Pattern
 *
 * 單例模式:
 * 1. 在整個系統確保中只會有一個實例，並且可以在所有地方共用這一個類別。
 * 2. 只有一個實體存在。
 * 3. 類別初始化方式:
 *    1. Lazy Loading: 需要時才會初始化，第一次使用時才會建立實體。
 *       Example: 【 LazyInitSingleton 】
 *
 *    2. Eager Loading: 類別載入時就會建立實體。
 *
 * 4. Singleton 的屬性 與一般 static 屬性差別:
 *    共同點:
 *    1. 全域都共用一個屬性，只能有一個實體。
 *    2. 使用不需要每次 new 出新物件。
 *    差異:
 *    1. 初始化時機，static 類別載入 JVM 時立即存在，類別建立時才初始化。
 *    2. static 無法限制讀寫的過程或是限制誰能存取，Singleton 屬性可以用
 *       getter/setter 控制，可入加邏輯檢查，符合封裝的精神。
 *    適合場景:
 *    1. Singleton 屬性: Logger、Cache、Connection 管理、資源共享。
 *    2. static 屬性: 工具方法、常數(簡單的 Value)。
 *
 */