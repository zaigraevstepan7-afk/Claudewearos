package i4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.util.List;
import java.util.concurrent.Executor;
import m.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class a {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Bitmap c(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static List d(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] e(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long f(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor g(Context context) {
        return context.getMainExecutor();
    }

    public static int h(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String i(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int k(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static PrecomputedText.Params n(g0 g0Var) {
        return g0Var.getTextMetricsParams();
    }

    public static int o(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri p(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void q(TextView textView, int i10) {
        textView.setFirstBaselineToTopHeight(i10);
    }

    public static boolean r(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
