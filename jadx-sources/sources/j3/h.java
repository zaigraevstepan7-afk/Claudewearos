package j3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {
    public int D;
    public int E;

    /* renamed from: a, reason: collision with root package name */
    public final float f8679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8680b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8681c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8682d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8683e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8684f;

    /* renamed from: z, reason: collision with root package name */
    public int f8685z = Integer.MIN_VALUE;
    public int A = Integer.MIN_VALUE;
    public int B = Integer.MIN_VALUE;
    public int C = Integer.MIN_VALUE;

    public h(float f10, int i10, boolean z2, boolean z10, float f11, int i11) {
        this.f8679a = f10;
        this.f8680b = i10;
        this.f8681c = z2;
        this.f8682d = z10;
        this.f8683e = f11;
        this.f8684f = i11;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            m3.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z2 = i10 == 0;
        boolean z10 = i11 == this.f8680b;
        int i16 = this.f8684f;
        boolean z11 = this.f8682d;
        boolean z12 = this.f8681c;
        if (z2 && z10 && z12 && z11 && i16 != 2) {
            return;
        }
        if (this.f8685z == Integer.MIN_VALUE) {
            int i17 = i14 - i15;
            int iCeil = (int) Math.ceil(this.f8679a);
            int i18 = iCeil - i17;
            if (i16 != 1 || i18 > 0) {
                float fAbs = this.f8683e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i18 <= 0 ? Math.ceil(i18 * fAbs) : Math.ceil((1.0f - fAbs) * i18));
                int i19 = fontMetricsInt.descent;
                int i20 = iCeil2 + i19;
                this.B = i20;
                int i21 = i20 - iCeil;
                this.A = i21;
                if (i16 == 0 || i18 >= 0) {
                    if (z12) {
                        i21 = fontMetricsInt.ascent;
                    }
                    this.f8685z = i21;
                    if (z11) {
                        i20 = i19;
                    }
                    this.C = i20;
                    this.D = fontMetricsInt.ascent - i21;
                    this.E = i20 - i19;
                } else if (i16 == 2) {
                    this.f8685z = z12 ? Math.max(fontMetricsInt.ascent, i21) : Math.min(fontMetricsInt.ascent, i21);
                    this.C = z11 ? Math.min(fontMetricsInt.descent, this.B) : Math.max(fontMetricsInt.descent, this.B);
                    this.D = 0;
                    this.E = 0;
                }
            } else {
                int i22 = fontMetricsInt.ascent;
                this.A = i22;
                int i23 = fontMetricsInt.descent;
                this.B = i23;
                this.f8685z = i22;
                this.C = i23;
                this.D = 0;
                this.E = 0;
            }
        }
        fontMetricsInt.ascent = z2 ? this.f8685z : this.A;
        fontMetricsInt.descent = z10 ? this.C : this.B;
    }
}
