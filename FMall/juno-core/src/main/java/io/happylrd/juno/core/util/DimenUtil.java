package io.happylrd.juno.core.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import io.happylrd.juno.core.app.Juno;

public class DimenUtil {

    public static int getScreenWidth() {
        final Resources resources = Juno.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Juno.getApplication().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
