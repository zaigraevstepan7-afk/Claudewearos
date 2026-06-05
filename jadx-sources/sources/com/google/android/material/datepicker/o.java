package com.google.android.material.datepicker;

import android.view.View;
import g3.e0;
import g3.m0;
import t4.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o implements t4.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3875a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f3876b;

    /* renamed from: c, reason: collision with root package name */
    public int f3877c;

    /* renamed from: d, reason: collision with root package name */
    public int f3878d;

    /* renamed from: e, reason: collision with root package name */
    public int f3879e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3880f;

    public o(g3.f fVar, long j) {
        String str = fVar.f7081b;
        hf.p pVar = new hf.p();
        pVar.f7937d = str;
        pVar.f7935b = -1;
        pVar.f7936c = -1;
        this.f3880f = pVar;
        this.f3876b = m0.f(j);
        this.f3877c = m0.e(j);
        this.f3878d = -1;
        this.f3879e = -1;
        int iF = m0.f(j);
        int iE = m0.e(j);
        if (iF < 0 || iF > str.length()) {
            StringBuilder sbP = gk.b.p(iF, "start (", ") offset is outside of text region ");
            sbP.append(str.length());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (iE < 0 || iE > str.length()) {
            StringBuilder sbP2 = gk.b.p(iE, "end (", ") offset is outside of text region ");
            sbP2.append(str.length());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (iF > iE) {
            throw new IllegalArgumentException(gk.b.l(iF, iE, "Do not set reversed range: ", " > "));
        }
    }

    public void a(int i10, int i11) {
        long jB = e0.b(i10, i11);
        ((hf.p) this.f3880f).k(i10, i11, "");
        long jN0 = yd.f.n0(e0.b(this.f3876b, this.f3877c), jB);
        h(m0.f(jN0));
        g(m0.e(jN0));
        int i12 = this.f3878d;
        if (i12 != -1) {
            long jN02 = yd.f.n0(e0.b(i12, this.f3879e), jB);
            if (m0.c(jN02)) {
                this.f3878d = -1;
                this.f3879e = -1;
            } else {
                this.f3878d = m0.f(jN02);
                this.f3879e = m0.e(jN02);
            }
        }
    }

    public char b(int i10) {
        hf.p pVar = (hf.p) this.f3880f;
        androidx.datastore.preferences.protobuf.k kVar = (androidx.datastore.preferences.protobuf.k) pVar.f7938e;
        if (kVar == null) {
            return ((String) pVar.f7937d).charAt(i10);
        }
        if (i10 < pVar.f7935b) {
            return ((String) pVar.f7937d).charAt(i10);
        }
        int iD = kVar.f954b - kVar.d();
        int i11 = pVar.f7935b;
        if (i10 >= iD + i11) {
            return ((String) pVar.f7937d).charAt(i10 - ((iD - pVar.f7936c) + i11));
        }
        int i12 = i10 - i11;
        int i13 = kVar.f955c;
        return i12 < i13 ? ((char[]) kVar.f957e)[i12] : ((char[]) kVar.f957e)[(i12 - i13) + kVar.f956d];
    }

    public m0 c() {
        int i10 = this.f3878d;
        if (i10 != -1) {
            return new m0(e0.b(i10, this.f3879e));
        }
        return null;
    }

    public void d(int i10, int i11, String str) {
        hf.p pVar = (hf.p) this.f3880f;
        if (i10 < 0 || i10 > pVar.b()) {
            StringBuilder sbP = gk.b.p(i10, "start (", ") offset is outside of text region ");
            sbP.append(pVar.b());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i11 < 0 || i11 > pVar.b()) {
            StringBuilder sbP2 = gk.b.p(i11, "end (", ") offset is outside of text region ");
            sbP2.append(pVar.b());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(gk.b.l(i10, i11, "Do not set reversed range: ", " > "));
        }
        pVar.k(i10, i11, str);
        h(str.length() + i10);
        g(str.length() + i10);
        this.f3878d = -1;
        this.f3879e = -1;
    }

    public void e(int i10, int i11) {
        hf.p pVar = (hf.p) this.f3880f;
        if (i10 < 0 || i10 > pVar.b()) {
            StringBuilder sbP = gk.b.p(i10, "start (", ") offset is outside of text region ");
            sbP.append(pVar.b());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i11 < 0 || i11 > pVar.b()) {
            StringBuilder sbP2 = gk.b.p(i11, "end (", ") offset is outside of text region ");
            sbP2.append(pVar.b());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (i10 >= i11) {
            throw new IllegalArgumentException(gk.b.l(i10, i11, "Do not set reversed or empty range: ", " > "));
        }
        this.f3878d = i10;
        this.f3879e = i11;
    }

    public void f(int i10, int i11) {
        hf.p pVar = (hf.p) this.f3880f;
        if (i10 < 0 || i10 > pVar.b()) {
            StringBuilder sbP = gk.b.p(i10, "start (", ") offset is outside of text region ");
            sbP.append(pVar.b());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i11 < 0 || i11 > pVar.b()) {
            StringBuilder sbP2 = gk.b.p(i11, "end (", ") offset is outside of text region ");
            sbP2.append(pVar.b());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(gk.b.l(i10, i11, "Do not set reversed range: ", " > "));
        }
        h(i10);
        g(i11);
    }

    public void g(int i10) {
        if (!(i10 >= 0)) {
            m3.a.a("Cannot set selectionEnd to a negative value: " + i10);
        }
        this.f3877c = i10;
    }

    public void h(int i10) {
        if (!(i10 >= 0)) {
            m3.a.a("Cannot set selectionStart to a negative value: " + i10);
        }
        this.f3876b = i10;
    }

    @Override // t4.m
    public m1 i(View view, m1 m1Var) {
        View view2 = (View) this.f3880f;
        l4.b bVarG = m1Var.f15751a.g(519);
        int i10 = this.f3876b;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + bVarG.f9968b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f3877c + bVarG.f9967a, this.f3878d + bVarG.f9968b, this.f3879e + bVarG.f9969c, view2.getPaddingBottom());
        return m1Var;
    }

    public String toString() {
        switch (this.f3875a) {
            case 1:
                return ((hf.p) this.f3880f).toString();
            default:
                return super.toString();
        }
    }

    public o(View view, int i10, int i11, int i12, int i13) {
        this.f3876b = i10;
        this.f3880f = view;
        this.f3877c = i11;
        this.f3878d = i12;
        this.f3879e = i13;
    }
}
