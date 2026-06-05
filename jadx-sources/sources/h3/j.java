package h3;

import ak.v;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import hf.p;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f7602a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f7603b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7604c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7605d;

    /* renamed from: e, reason: collision with root package name */
    public p f7606e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout f7607f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7608g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7609h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7610i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final float f7611k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7612l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f7613m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7614n;

    /* renamed from: o, reason: collision with root package name */
    public final j3.h[] f7615o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f7616p = new Rect();

    /* renamed from: q, reason: collision with root package name */
    public v f7617q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ac A[PHI: r7
      0x01ac: PHI (r7v7 int) = (r7v6 int), (r7v9 int) binds: [B:105:0x01be, B:98:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, h3.f r35) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.j.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, h3.f):void");
    }

    public final int a() {
        boolean z2 = this.f7605d;
        Layout layout = this.f7607f;
        return (z2 ? layout.getLineBottom(this.f7608g - 1) : layout.getHeight()) + this.f7609h + this.f7610i + this.f7614n;
    }

    public final float b(int i10) {
        if (i10 == this.f7608g - 1) {
            return this.j + this.f7611k;
        }
        return 0.0f;
    }

    public final v c() {
        v vVar = this.f7617q;
        if (vVar != null) {
            return vVar;
        }
        v vVar2 = new v();
        vVar2.f730a = this.f7607f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iH0 = nj.e.H0(((Layout) vVar2.f730a).getText(), '\n', length, 4);
            length = iH0 < 0 ? ((Layout) vVar2.f730a).getText().length() : iH0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) vVar2.f730a).getText().length());
        vVar2.f731b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        vVar2.f732c = arrayList2;
        vVar2.f733d = new boolean[((ArrayList) vVar2.f731b).size()];
        ((ArrayList) vVar2.f731b).size();
        this.f7617q = vVar2;
        return vVar2;
    }

    public final float d(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f7609h + ((i10 != this.f7608g + (-1) || (fontMetricsInt = this.f7613m) == null) ? this.f7607f.getLineBaseline(i10) : g(i10) - fontMetricsInt.ascent);
    }

    public final float e(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f7608g;
        int i12 = i11 - 1;
        Layout layout = this.f7607f;
        if (i10 != i12 || (fontMetricsInt = this.f7613m) == null) {
            return this.f7609h + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f7610i : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i10) {
        ThreadLocal threadLocal = k.f7618a;
        Layout layout = this.f7607f;
        return (layout.getEllipsisCount(i10) <= 0 || this.f7603b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i10) : layout.getText().length();
    }

    public final float g(int i10) {
        return this.f7607f.getLineTop(i10) + (i10 == 0 ? 0 : this.f7609h);
    }

    public final float h(int i10, boolean z2) {
        return b(this.f7607f.getLineForOffset(i10)) + c().s(i10, true, z2);
    }

    public final float i(int i10, boolean z2) {
        return b(this.f7607f.getLineForOffset(i10)) + c().s(i10, false, z2);
    }

    public final p j() {
        p pVar = this.f7606e;
        if (pVar != null) {
            return pVar;
        }
        Layout layout = this.f7607f;
        p pVar2 = new p(layout.getText(), layout.getText().length(), this.f7602a.getTextLocale());
        this.f7606e = pVar2;
        return pVar2;
    }
}
