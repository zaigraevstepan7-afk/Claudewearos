package h3;

import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f7590a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f7591b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7592c;

    /* renamed from: d, reason: collision with root package name */
    public float f7593d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f7594e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f7595f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7596g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f7597h;

    public f(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f7590a = charSequence;
        this.f7591b = textPaint;
        this.f7592c = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f7596g) {
            TextDirectionHeuristic textDirectionHeuristicB = k.b(this.f7592c);
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f7590a;
            TextPaint textPaint = this.f7591b;
            this.f7595f = i10 >= 33 ? BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicB, true, null) : !textDirectionHeuristicB.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            this.f7596g = true;
        }
        return this.f7595f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f7597h;
        if (charSequence != null) {
            l.c(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.f7590a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (g.f(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f7597h = charSequence2;
        return charSequence2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c() {
        /*
            r6 = this;
            float r0 = r6.f7593d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.f7593d
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f7591b
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.b()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.b()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.f7590a
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<j3.f> r4 = j3.f.class
            boolean r4 = h3.g.f(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<j3.e> r4 = j3.e.class
            boolean r2 = h3.g.f(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.f7593d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.f.c():float");
    }
}
