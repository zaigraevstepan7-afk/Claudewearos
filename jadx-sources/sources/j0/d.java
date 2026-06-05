package j0;

import c2.e0;
import c2.m0;
import c2.n0;
import c2.w0;
import fj.l;
import s3.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f8601a;

    /* renamed from: b, reason: collision with root package name */
    public final a f8602b;

    /* renamed from: c, reason: collision with root package name */
    public final a f8603c;

    /* renamed from: d, reason: collision with root package name */
    public final a f8604d;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f8601a = aVar;
        this.f8602b = aVar2;
        this.f8603c = aVar3;
        this.f8604d = aVar4;
    }

    public static d c(d dVar, a aVar, a aVar2, a aVar3, a aVar4, int i10) {
        if ((i10 & 1) != 0) {
            aVar = dVar.f8601a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = dVar.f8602b;
        }
        if ((i10 & 4) != 0) {
            aVar3 = dVar.f8603c;
        }
        if ((i10 & 8) != 0) {
            aVar4 = dVar.f8604d;
        }
        dVar.getClass();
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    @Override // c2.w0
    public final e0 b(long j, m mVar, s3.c cVar) {
        float fA = this.f8601a.a(j, cVar);
        float fA2 = this.f8602b.a(j, cVar);
        float fA3 = this.f8603c.a(j, cVar);
        float fA4 = this.f8604d.a(j, cVar);
        float fD = b2.e.d(j);
        float f10 = fA + fA4;
        if (f10 > fD) {
            float f11 = fD / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fD) {
            float f13 = fD / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            a0.a.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new m0(uk.c.g(0L, j));
        }
        b2.c cVarG = uk.c.g(0L, j);
        m mVar2 = m.f14752a;
        float f14 = mVar == mVar2 ? fA : fA2;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
        if (mVar == mVar2) {
            fA = fA2;
        }
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fA) << 32) | (Float.floatToRawIntBits(fA) & 4294967295L);
        float f15 = mVar == mVar2 ? fA3 : fA4;
        long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L);
        if (mVar != mVar2) {
            fA4 = fA3;
        }
        return new n0(new b2.d(cVarG.f1502a, cVarG.f1503b, cVarG.f1504c, cVarG.f1505d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (Float.floatToRawIntBits(fA4) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.b(this.f8601a, dVar.f8601a) && l.b(this.f8602b, dVar.f8602b) && l.b(this.f8603c, dVar.f8603c) && l.b(this.f8604d, dVar.f8604d);
    }

    public final int hashCode() {
        return this.f8604d.hashCode() + ((this.f8603c.hashCode() + ((this.f8602b.hashCode() + (this.f8601a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f8601a + ", topEnd = " + this.f8602b + ", bottomEnd = " + this.f8603c + ", bottomStart = " + this.f8604d + ')';
    }
}
