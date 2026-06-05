package h2;

import c2.g;
import c2.n;
import e2.d;
import fj.l;
import s3.j;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends b {
    public int A;
    public final long B;
    public float C;
    public n D;

    /* renamed from: f, reason: collision with root package name */
    public final g f7575f;

    /* renamed from: z, reason: collision with root package name */
    public final long f7576z;

    public a(g gVar, long j) {
        int i10;
        int i11;
        this.f7575f = gVar;
        this.f7576z = j;
        this.A = 1;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i10 = (int) (j >> 32)) < 0 || (i11 = (int) (4294967295L & j)) < 0 || i10 > gVar.f2996a.getWidth() || i11 > gVar.f2996a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.B = j;
        this.C = 1.0f;
    }

    @Override // h2.b
    public final boolean b(float f10) {
        this.C = f10;
        return true;
    }

    @Override // h2.b
    public final boolean e(n nVar) {
        this.D = nVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.b(this.f7575f, aVar.f7575f) && j.a(0L, 0L) && s3.l.b(this.f7576z, aVar.f7576z) && this.A == aVar.A;
    }

    @Override // h2.b
    public final long h() {
        return cg.b.S(this.B);
    }

    public final int hashCode() {
        return Integer.hashCode(this.A) + gk.b.j(gk.b.j(this.f7575f.hashCode() * 31, 0L, 31), this.f7576z, 31);
    }

    @Override // h2.b
    public final void i(h0 h0Var) {
        d.K0(h0Var, this.f7575f, this.f7576z, (Math.round(Float.intBitsToFloat((int) (r1.a() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (h0Var.f17669a.a() >> 32))) << 32), this.C, this.D, this.A, 328);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f7575f);
        sb2.append(", srcOffset=");
        sb2.append((Object) j.d(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) s3.l.c(this.f7576z));
        sb2.append(", filterQuality=");
        int i10 = this.A;
        sb2.append((Object) (i10 == 0 ? "None" : i10 == 1 ? "Low" : i10 == 2 ? "Medium" : i10 == 3 ? "High" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }

    public a(g gVar) {
        this(gVar, (gVar.f2996a.getHeight() & 4294967295L) | (gVar.f2996a.getWidth() << 32));
    }
}
