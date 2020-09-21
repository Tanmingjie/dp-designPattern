package com.olivert.statics;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 静态变量是全局的，多个实例共同拥有一份静态变量。
 */
public class RangeLimiter {
    private static AtomicInteger position = new AtomicInteger(0);
    public static final int MAX_LIMIT = 5;
    public static final int MIN_LIMIT = -5;

    public boolean move(int delta) {
        int currentPos = position.addAndGet(delta);
        boolean betweenRange = (currentPos <= MAX_LIMIT) && (currentPos >= MIN_LIMIT);
        return betweenRange;
    }

    public static void main(String[] args) {
        RangeLimiter rangeLimiter = new RangeLimiter();
        rangeLimiter.move(1);
        RangeLimiter rangeLimiter1 = new RangeLimiter();
        System.out.println(rangeLimiter1.position);
    }
}
