package t1;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: o, reason: collision with root package name */
    public final b f15417o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15418p;

    public c(long j, k kVar, ej.c cVar, ej.c cVar2, b bVar) {
        super(j, kVar, cVar, cVar2);
        this.f15417o = bVar;
        bVar.k();
    }

    @Override // t1.b, t1.g
    public final void c() {
        if (this.f15440c) {
            return;
        }
        super.c();
        if (this.f15418p) {
            return;
        }
        this.f15418p = true;
        this.f15417o.l();
    }

    @Override // t1.b
    public final r w() throws Throwable {
        c cVar;
        b bVar = this.f15417o;
        if (bVar.f15415m || bVar.f15440c) {
            return new h(this);
        }
        q.h0 h0Var = this.f15411h;
        long j = this.f15439b;
        HashMap mapB = h0Var != null ? m.b(bVar.g(), this, this.f15417o.d()) : null;
        Object obj = m.f15471c;
        synchronized (obj) {
            try {
                m.c(this);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (h0Var == null || h0Var.f13084d == 0) {
                    cVar = this;
                    a();
                } else {
                    cVar = this;
                    r rVarZ = cVar.z(this.f15417o.g(), h0Var, mapB, this.f15417o.d());
                    if (!rVarZ.equals(i.f15454d)) {
                        return rVarZ;
                    }
                    q.h0 h0VarX = cVar.f15417o.x();
                    if (h0VarX != null) {
                        h0VarX.k(h0Var);
                    } else {
                        cVar.f15417o.B(h0Var);
                        cVar.f15411h = null;
                    }
                }
                if (fj.l.i(cVar.f15417o.g(), j) < 0) {
                    cVar.f15417o.v();
                }
                b bVar2 = cVar.f15417o;
                bVar2.r(bVar2.d().e(j).b(cVar.j));
                cVar.f15417o.A(j);
                b bVar3 = cVar.f15417o;
                int i10 = cVar.f15441d;
                cVar.f15441d = -1;
                if (i10 >= 0) {
                    int[] iArr = bVar3.f15413k;
                    fj.l.f(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i10;
                    bVar3.f15413k = iArrCopyOf;
                } else {
                    bVar3.getClass();
                }
                b bVar4 = cVar.f15417o;
                k kVar = cVar.j;
                bVar4.getClass();
                synchronized (obj) {
                    bVar4.j = bVar4.j.w(kVar);
                    b bVar5 = cVar.f15417o;
                    int[] iArr2 = cVar.f15413k;
                    bVar5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = bVar5.f15413k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            fj.l.c(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        bVar5.f15413k = iArr2;
                    }
                }
                cVar.f15415m = true;
                if (!cVar.f15418p) {
                    cVar.f15418p = true;
                    cVar.f15417o.l();
                }
                return i.f15454d;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }
}
