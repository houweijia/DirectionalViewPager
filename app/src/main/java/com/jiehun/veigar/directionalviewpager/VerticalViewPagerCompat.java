package com.jiehun.veigar.directionalviewpager;

import android.support.v4.view.PagerAdapter;

public final class VerticalViewPagerCompat {
    private VerticalViewPagerCompat() {
    }

    public static void setDataSetObserver(PagerAdapter adapter, DataSetObserver observer) {
        adapter.registerDataSetObserver(observer);
    }

    public static class DataSetObserver extends android.database.DataSetObserver {
    }
}
