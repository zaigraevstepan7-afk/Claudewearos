package c1;

import android.view.KeyEvent;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s6 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f2681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ej.c f2682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kj.d f2683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f2685e;

    public s6(boolean z2, ej.c cVar, kj.d dVar, boolean z10, float f10) {
        this.f2681a = z2;
        this.f2682b = cVar;
        this.f2683c = dVar;
        this.f2684d = z10;
        this.f2685e = f10;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((n2.b) obj).f11892a;
        kj.d dVar = this.f2683c;
        float f10 = dVar.f9664b;
        if (!this.f2681a) {
            return Boolean.FALSE;
        }
        ej.c cVar = this.f2682b;
        if (cVar == null) {
            return Boolean.FALSE;
        }
        int iC = n2.d.c(keyEvent);
        boolean z2 = false;
        if (iC == 2) {
            float f11 = dVar.f9663a;
            float fAbs = Math.abs(f10 - f11) / 100;
            int i10 = this.f2684d ? -1 : 1;
            long jA = n2.d.a(keyEvent.getKeyCode());
            boolean zA = n2.a.a(jA, n2.a.f11870d);
            float f12 = this.f2685e;
            if (zA) {
                cVar.invoke(cg.b.r(Float.valueOf((i10 * fAbs) + f12), dVar));
            } else if (n2.a.a(jA, n2.a.f11871e)) {
                cVar.invoke(cg.b.r(Float.valueOf(f12 - (i10 * fAbs)), dVar));
            } else if (n2.a.a(jA, n2.a.f11873g)) {
                cVar.invoke(cg.b.r(Float.valueOf((i10 * fAbs) + f12), dVar));
            } else if (n2.a.a(jA, n2.a.f11872f)) {
                cVar.invoke(cg.b.r(Float.valueOf(f12 - (i10 * fAbs)), dVar));
            } else if (n2.a.a(jA, n2.a.f11887v)) {
                cVar.invoke(Float.valueOf(f11));
            } else if (n2.a.a(jA, n2.a.f11888w)) {
                cVar.invoke(Float.valueOf(f10));
            } else if (n2.a.a(jA, n2.a.C)) {
                cVar.invoke(cg.b.r(Float.valueOf(f12 - (cg.b.p(10, 1, 10) * fAbs)), dVar));
            } else if (n2.a.a(jA, n2.a.D)) {
                cVar.invoke(cg.b.r(Float.valueOf((cg.b.p(10, 1, 10) * fAbs) + f12), dVar));
            }
            z2 = true;
        } else if (iC == 1) {
            long jA2 = n2.d.a(keyEvent.getKeyCode());
            if (n2.a.a(jA2, n2.a.f11870d) || n2.a.a(jA2, n2.a.f11871e) || n2.a.a(jA2, n2.a.f11873g) || n2.a.a(jA2, n2.a.f11872f) || n2.a.a(jA2, n2.a.f11887v) || n2.a.a(jA2, n2.a.f11888w) || n2.a.a(jA2, n2.a.C) || n2.a.a(jA2, n2.a.D)) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
