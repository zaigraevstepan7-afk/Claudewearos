package t0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import c2.e0;
import g3.k0;
import g3.m0;
import l3.t;
import lb.p0;
import t2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f15368a;

    /* renamed from: b, reason: collision with root package name */
    public final j f15369b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15371d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15372e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15373f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15374g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15375h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15376i;
    public t j;

    /* renamed from: k, reason: collision with root package name */
    public k0 f15377k;

    /* renamed from: l, reason: collision with root package name */
    public l3.n f15378l;

    /* renamed from: m, reason: collision with root package name */
    public b2.c f15379m;

    /* renamed from: n, reason: collision with root package name */
    public b2.c f15380n;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15370c = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f15381o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    public final float[] f15382p = c2.k0.a();

    /* renamed from: q, reason: collision with root package name */
    public final Matrix f15383q = new Matrix();

    public n(p0 p0Var, j jVar) {
        this.f15368a = p0Var;
        this.f15369b = jVar;
    }

    public final void a() {
        CursorAnchorInfo.Builder builder;
        j jVar = this.f15369b;
        InputMethodManager inputMethodManagerM = jVar.m();
        View view = (View) jVar.f15363b;
        if (!inputMethodManagerM.isActive(view) || this.j == null || this.f15378l == null || this.f15377k == null || this.f15379m == null || this.f15380n == null) {
            return;
        }
        float[] fArr = this.f15382p;
        c2.k0.d(fArr);
        w wVar = (w) ((l) this.f15368a.B).K.getValue();
        if (wVar != null) {
            if (!wVar.E()) {
                wVar = null;
            }
            if (wVar != null) {
                wVar.G(fArr);
            }
        }
        b2.c cVar = this.f15380n;
        fj.l.c(cVar);
        float f10 = -cVar.f1502a;
        b2.c cVar2 = this.f15380n;
        fj.l.c(cVar2);
        c2.k0.f(fArr, f10, -cVar2.f1503b);
        Matrix matrix = this.f15383q;
        e0.x(matrix, fArr);
        t tVar = this.j;
        fj.l.c(tVar);
        long j = tVar.f9938b;
        l3.n nVar = this.f15378l;
        fj.l.c(nVar);
        k0 k0Var = this.f15377k;
        fj.l.c(k0Var);
        g3.o oVar = k0Var.f7129b;
        b2.c cVar3 = this.f15379m;
        fj.l.c(cVar3);
        float f11 = cVar3.f1505d;
        float f12 = cVar3.f1503b;
        b2.c cVar4 = this.f15380n;
        fj.l.c(cVar4);
        boolean z2 = this.f15373f;
        boolean z10 = this.f15374g;
        boolean z11 = this.f15375h;
        boolean z12 = this.f15376i;
        CursorAnchorInfo.Builder builder2 = this.f15381o;
        builder2.reset();
        builder2.setMatrix(matrix);
        m0 m0Var = tVar.f9939c;
        int iF = m0.f(j);
        builder2.setSelectionRange(iF, m0.e(j));
        if (!z2 || iF < 0) {
            builder = builder2;
        } else {
            int iB = nVar.b(iF);
            b2.c cVarC = k0Var.c(iB);
            float fO = cg.b.o(cVarC.f1502a, 0.0f, (int) (k0Var.f7130c >> 32));
            boolean zF = m.f(cVar3, fO, cVarC.f1503b);
            boolean zF2 = m.f(cVar3, fO, cVarC.f1505d);
            boolean z13 = k0Var.a(iB) == r3.j.f13682b;
            int i10 = (zF || zF2) ? 1 : 0;
            if (!zF || !zF2) {
                i10 |= 2;
            }
            if (z13) {
                i10 |= 4;
            }
            float f13 = cVarC.f1503b;
            float f14 = cVarC.f1505d;
            builder2.setInsertionMarkerLocation(fO, f13, f14, f14, i10);
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
                    float f15 = fArr2[i11];
                    CursorAnchorInfo.Builder builder3 = builder;
                    float f16 = fArr2[i11 + 1];
                    int i12 = iE;
                    float f17 = fArr2[i11 + 2];
                    float f18 = fArr2[i11 + 3];
                    int i13 = iB2;
                    int i14 = (cVar3.f1502a < f17 ? 1 : 0) & (f15 < cVar3.f1504c ? 1 : 0) & (f12 < f18 ? 1 : 0) & (f16 < f11 ? 1 : 0);
                    if (!m.f(cVar3, f15, f16) || !m.f(cVar3, f17, f18)) {
                        i14 |= 2;
                    }
                    if (k0Var.a(iB4) == r3.j.f13682b) {
                        i14 |= 4;
                    }
                    int i15 = iF2;
                    builder3.addCharacterBounds(i15, f15, f16, f17, f18, i14);
                    builder = builder3;
                    iF2 = i15 + 1;
                    iE = i12;
                    iB2 = i13;
                }
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 33 && z11) {
            builder.setEditorBoundsInfo(hb.j.f().setEditorBounds(e0.C(cVar4)).setHandwritingBounds(e0.C(cVar4)).build());
        }
        if (i16 >= 34 && z12 && !cVar3.f()) {
            int i17 = oVar.f7159f - 1;
            if (i17 < 0) {
                i17 = 0;
            }
            int iP = cg.b.p(oVar.e(f12), 0, i17);
            int iP2 = cg.b.p(oVar.e(f11), 0, i17);
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
        jVar.m().updateCursorAnchorInfo(view, builder.build());
        this.f15372e = false;
    }
}
