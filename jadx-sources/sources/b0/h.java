package b0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements g, i {

    /* renamed from: a, reason: collision with root package name */
    public final float f1343a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1344b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1345c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1346d;

    public h(float f10, boolean z2, b bVar) {
        this.f1343a = f10;
        this.f1344b = z2;
        this.f1345c = bVar;
        this.f1346d = f10;
    }

    @Override // b0.g, b0.i
    public final float a() {
        return this.f1346d;
    }

    @Override // b0.i
    public final void b(int i10, t2.s0 s0Var, int[] iArr, int[] iArr2) {
        c(s0Var, i10, iArr, s3.m.f14752a, iArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[PHI: r2 r10
      0x0084: PHI (r2v3 float) = (r2v1 float), (r2v5 float) binds: [B:32:0x0096, B:27:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r10v8 float) = (r10v5 float), (r10v11 float) binds: [B:32:0x0096, B:27:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(s3.c r10, int r11, int[] r12, s3.m r13, int[] r14) {
        /*
            Method dump skipped, instructions count: 178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.h.c(s3.c, int, int[], s3.m, int[]):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s3.f.e(this.f1343a, hVar.f1343a) && this.f1344b == hVar.f1344b && fj.l.b(this.f1345c, hVar.f1345c);
    }

    public final int hashCode() {
        int i10 = gk.b.i(Float.hashCode(this.f1343a) * 31, 31, this.f1344b);
        b bVar = this.f1345c;
        return i10 + (bVar == null ? 0 : bVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1344b ? "" : "Absolute");
        sb2.append("Arrangement#spacedAligned(");
        sb2.append((Object) s3.f.f(this.f1343a));
        sb2.append(", ");
        sb2.append(this.f1345c);
        sb2.append(')');
        return sb2.toString();
    }
}
