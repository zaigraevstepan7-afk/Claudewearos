package g3;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f7128a;

    /* renamed from: b, reason: collision with root package name */
    public final o f7129b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7130c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7131d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7132e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7133f;

    public k0(j0 j0Var, o oVar, long j) {
        this.f7128a = j0Var;
        this.f7129b = oVar;
        this.f7130c = j;
        ArrayList arrayList = oVar.f7161h;
        float fD = 0.0f;
        this.f7131d = arrayList.isEmpty() ? 0.0f : ((h3.j) ((q) arrayList.get(0)).f7166a.f6828d).d(0);
        if (!arrayList.isEmpty()) {
            q qVar = (q) qi.l.F0(arrayList);
            fD = ((h3.j) qVar.f7166a.f6828d).d(r4.f7608g - 1) + qVar.f7171f;
        }
        this.f7132e = fD;
        this.f7133f = oVar.f7160g;
    }

    public final r3.j a(int i10) {
        o oVar = this.f7129b;
        ArrayList arrayList = oVar.f7161h;
        oVar.l(i10);
        q qVar = (q) arrayList.get(i10 == ((f) oVar.f7154a.f730a).f7081b.length() ? yd.f.B(arrayList) : e0.d(i10, arrayList));
        return ((h3.j) qVar.f7166a.f6828d).f7607f.isRtlCharAt(qVar.d(i10)) ? r3.j.f13682b : r3.j.f13681a;
    }

    public final b2.c b(int i10) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        o oVar = this.f7129b;
        oVar.k(i10);
        ArrayList arrayList = oVar.f7161h;
        q qVar = (q) arrayList.get(e0.d(i10, arrayList));
        fk.g gVar = qVar.f7166a;
        int iD = qVar.d(i10);
        CharSequence charSequence = (CharSequence) gVar.f6829e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbP = gk.b.p(iD, "offset(", ") is out of bounds [0,");
            sbP.append(charSequence.length());
            sbP.append(')');
            m3.a.a(sbP.toString());
        }
        h3.j jVar = (h3.j) gVar.f6828d;
        Layout layout = jVar.f7607f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = jVar.g(lineForOffset);
        float fE = jVar.e(lineForOffset);
        boolean z2 = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z2 || zIsRtlCharAt) {
            if (z2 && zIsRtlCharAt) {
                fH = jVar.i(iD, false);
                fH2 = jVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = jVar.h(iD, false);
                fH2 = jVar.h(iD + 1, true);
            } else {
                fI = jVar.i(iD, false);
                fI2 = jVar.i(iD + 1, true);
            }
            float f10 = fH;
            fI = fH2;
            fI2 = f10;
        } else {
            fI = jVar.h(iD, false);
            fI2 = jVar.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return qVar.a(new b2.c(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final b2.c c(int i10) {
        o oVar = this.f7129b;
        ArrayList arrayList = oVar.f7161h;
        oVar.l(i10);
        q qVar = (q) arrayList.get(i10 == ((f) oVar.f7154a.f730a).f7081b.length() ? yd.f.B(arrayList) : e0.d(i10, arrayList));
        fk.g gVar = qVar.f7166a;
        int iD = qVar.d(i10);
        CharSequence charSequence = (CharSequence) gVar.f6829e;
        h3.j jVar = (h3.j) gVar.f6828d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbP = gk.b.p(iD, "offset(", ") is out of bounds [0,");
            sbP.append(charSequence.length());
            sbP.append(']');
            m3.a.a(sbP.toString());
        }
        float fH = jVar.h(iD, false);
        int lineForOffset = jVar.f7607f.getLineForOffset(iD);
        return qVar.a(new b2.c(fH, jVar.g(lineForOffset), fH, jVar.e(lineForOffset)));
    }

    public final float d(int i10) {
        o oVar = this.f7129b;
        oVar.m(i10);
        ArrayList arrayList = oVar.f7161h;
        q qVar = (q) arrayList.get(e0.e(i10, arrayList));
        fk.g gVar = qVar.f7166a;
        int i11 = i10 - qVar.f7169d;
        h3.j jVar = (h3.j) gVar.f6828d;
        return jVar.f7607f.getLineLeft(i11) + (i11 == jVar.f7608g + (-1) ? jVar.j : 0.0f);
    }

    public final float e(int i10) {
        o oVar = this.f7129b;
        oVar.m(i10);
        ArrayList arrayList = oVar.f7161h;
        q qVar = (q) arrayList.get(e0.e(i10, arrayList));
        fk.g gVar = qVar.f7166a;
        int i11 = i10 - qVar.f7169d;
        h3.j jVar = (h3.j) gVar.f6828d;
        return jVar.f7607f.getLineRight(i11) + (i11 == jVar.f7608g + (-1) ? jVar.f7611k : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return fj.l.b(this.f7128a, k0Var.f7128a) && this.f7129b.equals(k0Var.f7129b) && s3.l.b(this.f7130c, k0Var.f7130c) && this.f7131d == k0Var.f7131d && this.f7132e == k0Var.f7132e && fj.l.b(this.f7133f, k0Var.f7133f);
    }

    public final int f(int i10) {
        o oVar = this.f7129b;
        oVar.m(i10);
        ArrayList arrayList = oVar.f7161h;
        q qVar = (q) arrayList.get(e0.e(i10, arrayList));
        fk.g gVar = qVar.f7166a;
        return ((h3.j) gVar.f6828d).f7607f.getLineStart(i10 - qVar.f7169d) + qVar.f7167b;
    }

    public final r3.j g(int i10) {
        o oVar = this.f7129b;
        ArrayList arrayList = oVar.f7161h;
        oVar.l(i10);
        q qVar = (q) arrayList.get(i10 == ((f) oVar.f7154a.f730a).f7081b.length() ? yd.f.B(arrayList) : e0.d(i10, arrayList));
        fk.g gVar = qVar.f7166a;
        int iD = qVar.d(i10);
        h3.j jVar = (h3.j) gVar.f6828d;
        return jVar.f7607f.getParagraphDirection(jVar.f7607f.getLineForOffset(iD)) == 1 ? r3.j.f13681a : r3.j.f13682b;
    }

    public final c2.j h(int i10, int i11) {
        o oVar = this.f7129b;
        f fVar = (f) oVar.f7154a.f730a;
        if (i10 < 0 || i10 > i11 || i11 > fVar.f7081b.length()) {
            StringBuilder sbQ = gk.b.q("Start(", i10, ") or End(", i11, ") is out of range [0..");
            sbQ.append(fVar.f7081b.length());
            sbQ.append("), or start > end!");
            m3.a.a(sbQ.toString());
        }
        if (i10 == i11) {
            return c2.l.a();
        }
        c2.j jVarA = c2.l.a();
        e0.g(oVar.f7161h, e0.b(i10, i11), new n(jVarA, i10, i11));
        return jVarA;
    }

    public final int hashCode() {
        return this.f7133f.hashCode() + gk.b.f(this.f7132e, gk.b.f(this.f7131d, gk.b.j((this.f7129b.hashCode() + (this.f7128a.hashCode() * 31)) * 31, this.f7130c, 31), 31), 31);
    }

    public final long i(int i10) {
        int iJ;
        int i11;
        int i12;
        o oVar = this.f7129b;
        ArrayList arrayList = oVar.f7161h;
        oVar.l(i10);
        q qVar = (q) arrayList.get(i10 == ((f) oVar.f7154a.f730a).f7081b.length() ? yd.f.B(arrayList) : e0.d(i10, arrayList));
        fk.g gVar = qVar.f7166a;
        int iD = qVar.d(i10);
        hf.p pVarJ = ((h3.j) gVar.f6828d).j();
        if (pVarJ.h(pVarJ.j(iD))) {
            pVarJ.a(iD);
            iJ = iD;
            while (iJ != -1 && (!pVarJ.h(iJ) || pVarJ.d(iJ))) {
                iJ = pVarJ.j(iJ);
            }
        } else {
            pVarJ.a(iD);
            iJ = pVarJ.g(iD) ? (!pVarJ.e(iD) || pVarJ.c(iD)) ? pVarJ.j(iD) : iD : pVarJ.c(iD) ? pVarJ.j(iD) : -1;
        }
        if (iJ == -1) {
            iJ = iD;
        }
        if (pVarJ.d(pVarJ.i(iD))) {
            pVarJ.a(iD);
            i11 = iD;
            while (i11 != -1 && (pVarJ.h(i11) || !pVarJ.d(i11))) {
                i11 = pVarJ.i(i11);
            }
        } else {
            pVarJ.a(iD);
            if (pVarJ.c(iD)) {
                if (!pVarJ.e(iD) || pVarJ.g(iD)) {
                    i12 = pVarJ.i(iD);
                    i11 = i12;
                } else {
                    i11 = iD;
                }
            } else if (pVarJ.g(iD)) {
                i12 = pVarJ.i(iD);
                i11 = i12;
            } else {
                i11 = -1;
            }
        }
        if (i11 != -1) {
            iD = i11;
        }
        return qVar.b(e0.b(iJ, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f7128a + ", multiParagraph=" + this.f7129b + ", size=" + ((Object) s3.l.c(this.f7130c)) + ", firstBaseline=" + this.f7131d + ", lastBaseline=" + this.f7132e + ", placeholderRects=" + this.f7133f + ')';
    }
}
