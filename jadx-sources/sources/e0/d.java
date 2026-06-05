package e0;

import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements f0.s {

    /* renamed from: a, reason: collision with root package name */
    public final v f5224a;

    public d(v vVar) {
        this.f5224a = vVar;
    }

    @Override // f0.s
    public final int a() {
        return this.f5224a.g().f5271p;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // f0.s
    public final int b() {
        return ((m) qi.l.F0(this.f5224a.g().f5268m)).f5275a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // f0.s
    public final int c() {
        int i10;
        boolean z2;
        long j;
        v vVar = this.f5224a;
        int i11 = 0;
        if (vVar.g().f5268m.isEmpty()) {
            return 0;
        }
        l lVarG = vVar.g();
        o1 o1Var = lVarG.f5272q;
        o1 o1Var2 = o1.f19664a;
        int iB = (int) (o1Var == o1Var2 ? lVarG.b() & 4294967295L : lVarG.b() >> 32);
        l lVarG2 = vVar.g();
        boolean z10 = lVarG2.f5272q == o1Var2;
        ?? r52 = lVarG2.f5268m;
        if (!r52.isEmpty()) {
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < r52.size()) {
                int iL0 = u6.v.l0(z10, lVarG2, i12);
                if (iL0 == -1) {
                    i12++;
                } else {
                    int iMax = i11;
                    while (i12 < r52.size() && u6.v.l0(z10, lVarG2, i12) == iL0) {
                        if (z10) {
                            z2 = z10;
                            j = ((m) r52.get(i12)).f5287n & 4294967295L;
                        } else {
                            z2 = z10;
                            j = ((m) r52.get(i12)).f5287n >> 32;
                        }
                        iMax = Math.max(iMax, (int) j);
                        i12++;
                        z10 = z2;
                    }
                    i13 += iMax;
                    i14++;
                    z10 = z10;
                    i11 = 0;
                }
            }
            i11 = (i13 / i14) + lVarG2.f5274s;
        }
        if (i11 != 0 && (i10 = iB / i11) >= 1) {
            return i10;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // f0.s
    public final boolean d() {
        return !this.f5224a.g().f5268m.isEmpty();
    }

    @Override // f0.s
    public final int e() {
        return this.f5224a.f5330d.f4425b.g();
    }
}
