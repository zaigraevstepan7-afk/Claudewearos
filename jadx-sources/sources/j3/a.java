package j3;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8671a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8672b;

    public /* synthetic */ a(float f10, int i10) {
        this.f8671a = i10;
        this.f8672b = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f8671a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f8672b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f8672b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f8671a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f8672b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f8672b);
                break;
        }
    }
}
