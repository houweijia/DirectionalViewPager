package com.jiehun.veigar.directionalviewpager;

import android.support.annotation.StringDef;
import android.util.Log;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @description:
 * @author: houwj
 * @date: 2018/10/15
 */

public class Normal implements FightingStrategy{
    @Override
    public void fighting() {
        Log.e("main","NormalFighting");
    }

    public static final String TYPE_1 = "1";
    public static final String TYPE_2 = "2";
    @StringDef({TYPE_1, TYPE_2})

    @Retention(RetentionPolicy.SOURCE)//表示注解所存活的时间,在运行时,而不会存在 .class 文件中
    public @interface Type {

    }


}
