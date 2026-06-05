package j3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f8686a;

    /* renamed from: b, reason: collision with root package name */
    public int f8687b;

    /* renamed from: c, reason: collision with root package name */
    public int f8688c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8689d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f8686a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        l.l("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f8689d) {
            m3.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f8688c;
    }

    public final int c() {
        if (!this.f8689d) {
            m3.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f8687b;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        this.f8689d = true;
        paint.getTextSize();
        this.f8686a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            m3.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f8687b = (int) Math.ceil(0.0f);
        this.f8688c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
    }
}
