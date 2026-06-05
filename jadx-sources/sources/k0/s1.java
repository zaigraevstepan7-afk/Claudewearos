package k0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final g3.k0 f9254a;

    /* renamed from: b, reason: collision with root package name */
    public t2.w f9255b = null;

    /* renamed from: c, reason: collision with root package name */
    public t2.w f9256c;

    public s1(g3.k0 k0Var, t2.w wVar) {
        this.f9254a = k0Var;
        this.f9256c = wVar;
    }

    public final long a(long j) {
        b2.c cVarZ;
        t2.w wVar = this.f9255b;
        b2.c cVar = b2.c.f1501e;
        if (wVar != null) {
            if (wVar.E()) {
                t2.w wVar2 = this.f9256c;
                cVarZ = wVar2 != null ? wVar2.z(wVar, true) : null;
            } else {
                cVarZ = cVar;
            }
            if (cVarZ != null) {
                cVar = cVarZ;
            }
        }
        int i10 = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i10);
        float fIntBitsToFloat2 = cVar.f1502a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
            fIntBitsToFloat2 = cVar.f1504c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i10);
            }
        }
        int i11 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
        float fIntBitsToFloat5 = cVar.f1503b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i11);
            fIntBitsToFloat5 = cVar.f1505d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i11);
            }
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L);
    }

    public final int b(long j, boolean z2) {
        if (z2) {
            j = a(j);
        }
        return this.f9254a.f7129b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        g3.k0 k0Var = this.f9254a;
        int iE = k0Var.f7129b.e(fIntBitsToFloat);
        int i10 = (int) (jD >> 32);
        return Float.intBitsToFloat(i10) >= k0Var.d(iE) && Float.intBitsToFloat(i10) <= k0Var.e(iE);
    }

    public final long d(long j) {
        t2.w wVar;
        t2.w wVar2 = this.f9255b;
        if (wVar2 == null) {
            return j;
        }
        if (!wVar2.E()) {
            wVar2 = null;
        }
        if (wVar2 == null || (wVar = this.f9256c) == null) {
            return j;
        }
        t2.w wVar3 = wVar.E() ? wVar : null;
        return wVar3 == null ? j : wVar2.i0(wVar3, j);
    }

    public final long e(long j) {
        t2.w wVar;
        t2.w wVar2 = this.f9255b;
        if (wVar2 == null) {
            return j;
        }
        if (!wVar2.E()) {
            wVar2 = null;
        }
        if (wVar2 == null || (wVar = this.f9256c) == null) {
            return j;
        }
        t2.w wVar3 = wVar.E() ? wVar : null;
        return wVar3 == null ? j : wVar3.i0(wVar2, j);
    }
}
