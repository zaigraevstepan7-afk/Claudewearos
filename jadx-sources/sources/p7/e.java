package p7;

import android.graphics.drawable.AnimatedImageDrawable;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;
import android.webkit.TracingConfig;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof DisplayCutout;
    }

    public static /* synthetic */ PrecomputedText.Params.Builder i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout m(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* synthetic */ void q() {
        new TracingConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ boolean v(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }
}
