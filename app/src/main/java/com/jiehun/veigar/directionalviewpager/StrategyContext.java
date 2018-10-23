package com.jiehun.veigar.directionalviewpager;

/**
 * @description:
 * @author: houwj
 * @date: 2018/10/15
 */

public class StrategyContext {
    private FightingStrategy mFightingStrategy;

    public  StrategyContext(FightingStrategy mFightingStrategy) {
        this.mFightingStrategy = mFightingStrategy;
    }

    public void fighting(){
        mFightingStrategy.fighting();
    }
}
