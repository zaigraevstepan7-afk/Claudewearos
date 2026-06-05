package j3;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8673a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8674b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f8673a = i10;
        this.f8674b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f8673a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f8674b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f8674b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f8673a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f8674b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f8674b);
                break;
        }
    }
}
