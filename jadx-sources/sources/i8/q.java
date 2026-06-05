package i8;

import t.m1;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends h2.b {

    /* renamed from: f, reason: collision with root package name */
    public final h8.j f8399f;

    public q(h8.j jVar) {
        this.f8399f = jVar;
    }

    @Override // h2.b
    public final long h() {
        h8.j jVar = this.f8399f;
        int width = jVar.getWidth();
        float f10 = width > 0 ? width : Float.NaN;
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(jVar.getHeight() > 0 ? r0 : Float.NaN) & 4294967295L);
    }

    @Override // h2.b
    public final void i(h0 h0Var) {
        e2.b bVar = h0Var.f17669a;
        h8.j jVar = this.f8399f;
        int width = jVar.getWidth();
        float fIntBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (bVar.a() >> 32)) / width : 1.0f;
        int height = jVar.getHeight();
        float fIntBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (bVar.a() & 4294967295L)) / height : 1.0f;
        ac.d dVar = bVar.f5738b;
        long jY = dVar.y();
        dVar.h().f();
        try {
            ((ld.i) dVar.f373b).S(fIntBitsToFloat, fIntBitsToFloat2, 0L);
            jVar.b(c2.c.a(bVar.f5738b.h()));
        } finally {
            m1.r(dVar, jY);
        }
    }
}
