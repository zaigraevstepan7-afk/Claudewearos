package l3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import c2.e0;
import g3.k0;
import g3.m0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final w2.t f9891a;

    /* renamed from: b, reason: collision with root package name */
    public final ac.d f9892b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9894d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9895e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9896f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9897g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9898h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9899i;
    public t j;

    /* renamed from: k, reason: collision with root package name */
    public k0 f9900k;

    /* renamed from: l, reason: collision with root package name */
    public n f9901l;

    /* renamed from: n, reason: collision with root package name */
    public b2.c f9903n;

    /* renamed from: o, reason: collision with root package name */
    public b2.c f9904o;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9893c = new Object();

    /* renamed from: m, reason: collision with root package name */
    public ej.c f9902m = b.f9884c;

    /* renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f9905p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    public final float[] f9906q = c2.k0.a();

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f9907r = new Matrix();

    public c(w2.t tVar, ac.d dVar) {
        this.f9891a = tVar;
        this.f9892b = dVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pi.e] */
    public final void a() {
        View view;
        CursorAnchorInfo.Builder builder;
        ac.d dVar = this.f9892b;
        ?? r2 = dVar.f374c;
        InputMethodManager inputMethodManager = (InputMethodManager) r2.getValue();
        View view2 = (View) dVar.f373b;
        if (inputMethodManager.isActive(view2)) {
            ej.c cVar = this.f9902m;
            float[] fArr = this.f9906q;
            cVar.invoke(new c2.k0(fArr));
            this.f9891a.v(fArr);
            Matrix matrix = this.f9907r;
            e0.x(matrix, fArr);
            t tVar = this.j;
            fj.l.c(tVar);
            long j = tVar.f9938b;
            n nVar = this.f9901l;
            fj.l.c(nVar);
            k0 k0Var = this.f9900k;
            fj.l.c(k0Var);
            g3.o oVar = k0Var.f7129b;
            b2.c cVar2 = this.f9903n;
            fj.l.c(cVar2);
            float f10 = cVar2.f1505d;
            float f11 = cVar2.f1503b;
            b2.c cVar3 = this.f9904o;
            fj.l.c(cVar3);
            boolean z2 = this.f9896f;
            boolean z10 = this.f9897g;
            boolean z11 = this.f9898h;
            boolean z12 = this.f9899i;
            CursorAnchorInfo.Builder builder2 = this.f9905p;
            builder2.reset();
            builder2.setMatrix(matrix);
            m0 m0Var = tVar.f9939c;
            int iF = m0.f(j);
            builder2.setSelectionRange(iF, m0.e(j));
            if (!z2 || iF < 0) {
                view = view2;
                builder = builder2;
            } else {
                int iB = nVar.b(iF);
                b2.c cVarC = k0Var.c(iB);
                view = view2;
                float fO = cg.b.o(cVarC.f1502a, 0.0f, (int) (k0Var.f7130c >> 32));
                boolean zP = x8.a.p(cVar2, fO, cVarC.f1503b);
                boolean zP2 = x8.a.p(cVar2, fO, cVarC.f1505d);
                boolean z13 = k0Var.a(iB) == r3.j.f13682b;
                int i10 = (zP || zP2) ? 1 : 0;
                if (!zP || !zP2) {
                    i10 |= 2;
                }
                if (z13) {
                    i10 |= 4;
                }
                float f12 = cVarC.f1503b;
                float f13 = cVarC.f1505d;
                builder2.setInsertionMarkerLocation(fO, f12, f13, f13, i10);
                builder = builder2;
            }
            if (z10) {
                int iF2 = m0Var != null ? m0.f(m0Var.f7145a) : -1;
                int iE = m0Var != null ? m0.e(m0Var.f7145a) : -1;
                if (iF2 >= 0 && iF2 < iE) {
                    builder.setComposingText(iF2, tVar.f9937a.f7081b.subSequence(iF2, iE));
                    int iB2 = nVar.b(iF2);
                    int iB3 = nVar.b(iE);
                    float[] fArr2 = new float[(iB3 - iB2) * 4];
                    oVar.a(g3.e0.b(iB2, iB3), fArr2);
                    while (iF2 < iE) {
                        int iB4 = nVar.b(iF2);
                        int i11 = (iB4 - iB2) * 4;
                        float f14 = fArr2[i11];
                        float f15 = fArr2[i11 + 1];
                        CursorAnchorInfo.Builder builder3 = builder;
                        float f16 = fArr2[i11 + 2];
                        float f17 = fArr2[i11 + 3];
                        int i12 = iE;
                        int i13 = (cVar2.f1502a < f16 ? 1 : 0) & (f14 < cVar2.f1504c ? 1 : 0) & (f11 < f17 ? 1 : 0) & (f15 < f10 ? 1 : 0);
                        if (!x8.a.p(cVar2, f14, f15) || !x8.a.p(cVar2, f16, f17)) {
                            i13 |= 2;
                        }
                        if (k0Var.a(iB4) == r3.j.f13682b) {
                            i13 |= 4;
                        }
                        int i14 = iF2;
                        builder3.addCharacterBounds(i14, f14, f15, f16, f17, i13);
                        builder = builder3;
                        iF2 = i14 + 1;
                        iE = i12;
                    }
                }
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 33 && z11) {
                builder.setEditorBoundsInfo(hb.j.f().setEditorBounds(e0.C(cVar3)).setHandwritingBounds(e0.C(cVar3)).build());
            }
            if (i15 >= 34 && z12 && !cVar2.f()) {
                int i16 = oVar.f7159f - 1;
                if (i16 < 0) {
                    i16 = 0;
                }
                int iP = cg.b.p(oVar.e(f11), 0, i16);
                int iP2 = cg.b.p(oVar.e(f10), 0, i16);
                if (iP <= iP2) {
                    while (true) {
                        builder.addVisibleLineBounds(k0Var.d(iP), oVar.f(iP), k0Var.e(iP), oVar.b(iP));
                        if (iP == iP2) {
                            break;
                        } else {
                            iP++;
                        }
                    }
                }
            }
            ((InputMethodManager) r2.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f9895e = false;
        }
    }
}
