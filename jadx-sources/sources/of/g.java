package of;

import f0.i0;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t.m1;
import zf.a0;
import zf.b0;
import zf.d0;
import zf.e0;
import zf.f0;
import zf.g0;
import zf.h0;
import zf.j0;
import zf.k1;
import zf.l0;
import zf.l1;
import zf.n1;
import zf.o0;
import zf.o1;
import zf.p0;
import zf.p1;
import zf.q0;
import zf.s0;
import zf.s1;
import zf.t1;
import zf.u0;
import zf.u1;
import zf.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12455b = 9;

    public /* synthetic */ g(Class cls) {
        super(cls);
    }

    @Override // f0.i0
    public final com.google.crypto.tink.shaded.protobuf.a f(com.google.crypto.tink.shaded.protobuf.a aVar) {
        switch (this.f12455b) {
            case 0:
                zf.j jVar = (zf.j) aVar;
                f[] fVarArr = {new f(ag.m.class, 1)};
                HashMap map = new HashMap();
                for (f fVar : fVarArr) {
                    Class cls = fVar.f12453a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException(m1.h(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f12453a;
                }
                Collections.unmodifiableMap(map);
                zf.n nVarY = jVar.y();
                zf.k kVarD = zf.l.D();
                zf.p pVarA = nVarY.A();
                kVarD.e();
                zf.l.x((zf.l) kVarD.f4243b, pVarA);
                byte[] bArrA = ag.p.a(nVarY.z());
                com.google.crypto.tink.shaded.protobuf.h hVarI = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA, bArrA.length);
                kVarD.e();
                zf.l.y((zf.l) kVarD.f4243b, hVarI);
                kVarD.e();
                zf.l.w((zf.l) kVarD.f4243b);
                zf.l lVar = (zf.l) kVarD.b();
                f[] fVarArr2 = {new f(nf.j.class, 11)};
                HashMap map2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    Class cls3 = fVar2.f12453a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(m1.h(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, fVar2);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f12453a;
                }
                Collections.unmodifiableMap(map2);
                s0 s0VarZ = jVar.z();
                p0 p0VarD = q0.D();
                p0VarD.e();
                q0.w((q0) p0VarD.f4243b);
                u0 u0VarA = s0VarZ.A();
                p0VarD.e();
                q0.x((q0) p0VarD.f4243b, u0VarA);
                byte[] bArrA2 = ag.p.a(s0VarZ.z());
                com.google.crypto.tink.shaded.protobuf.h hVarI2 = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA2, bArrA2.length);
                p0VarD.e();
                q0.y((q0) p0VarD.f4243b, hVarI2);
                q0 q0Var = (q0) p0VarD.b();
                zf.g gVarC = zf.h.C();
                gVarC.e();
                zf.h.x((zf.h) gVarC.f4243b, lVar);
                gVarC.e();
                zf.h.y((zf.h) gVarC.f4243b, q0Var);
                gVarC.e();
                zf.h.w((zf.h) gVarC.f4243b);
                return (zf.h) gVarC.b();
            case 1:
                zf.t tVar = (zf.t) aVar;
                zf.q qVarC = zf.r.C();
                byte[] bArrA3 = ag.p.a(tVar.y());
                com.google.crypto.tink.shaded.protobuf.h hVarI3 = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA3, bArrA3.length);
                qVarC.e();
                zf.r.y((zf.r) qVarC.f4243b, hVarI3);
                zf.v vVarZ = tVar.z();
                qVarC.e();
                zf.r.x((zf.r) qVarC.f4243b, vVarZ);
                qVarC.e();
                zf.r.w((zf.r) qVarC.f4243b);
                return (zf.r) qVarC.b();
            case 2:
                zf.w wVarA = zf.x.A();
                byte[] bArrA4 = ag.p.a(((z) aVar).x());
                com.google.crypto.tink.shaded.protobuf.h hVarI4 = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA4, bArrA4.length);
                wVarA.e();
                zf.x.x((zf.x) wVarA.f4243b, hVarI4);
                wVarA.e();
                zf.x.w((zf.x) wVarA.f4243b);
                return (zf.x) wVarA.b();
            case 3:
                a0 a0VarA = b0.A();
                byte[] bArrA5 = ag.p.a(((d0) aVar).x());
                com.google.crypto.tink.shaded.protobuf.h hVarI5 = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA5, bArrA5.length);
                a0VarA.e();
                b0.x((b0) a0VarA.f4243b, hVarI5);
                a0VarA.e();
                b0.w((b0) a0VarA.f4243b);
                return (b0) a0VarA.b();
            case 4:
                zf.i0 i0VarA = j0.A();
                i0VarA.e();
                j0.w((j0) i0VarA.f4243b);
                byte[] bArrA6 = ag.p.a(32);
                com.google.crypto.tink.shaded.protobuf.h hVarI6 = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA6, bArrA6.length);
                i0VarA.e();
                j0.x((j0) i0VarA.f4243b, hVarI6);
                return (j0) i0VarA.b();
            case 5:
                k1 k1VarA = l1.A();
                k1VarA.e();
                l1.x((l1) k1VarA.f4243b, (zf.m1) aVar);
                k1VarA.e();
                l1.w((l1) k1VarA.f4243b);
                return (l1) k1VarA.b();
            case 6:
                n1 n1VarA = o1.A();
                n1VarA.e();
                o1.x((o1) n1VarA.f4243b, (p1) aVar);
                n1VarA.e();
                o1.w((o1) n1VarA.f4243b);
                return (o1) n1VarA.b();
            case 7:
                s1 s1VarA = t1.A();
                s1VarA.e();
                t1.w((t1) s1VarA.f4243b);
                byte[] bArrA7 = ag.p.a(32);
                com.google.crypto.tink.shaded.protobuf.h hVarI7 = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA7, bArrA7.length);
                s1VarA.e();
                t1.x((t1) s1VarA.f4243b, hVarI7);
                return (t1) s1VarA.b();
            case 8:
                e0 e0VarA = f0.A();
                byte[] bArrA8 = ag.p.a(((h0) aVar).x());
                com.google.crypto.tink.shaded.protobuf.h hVarI8 = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA8, bArrA8.length);
                e0VarA.e();
                f0.x((f0) e0VarA.f4243b, hVarI8);
                e0VarA.e();
                f0.w((f0) e0VarA.f4243b);
                return (f0) e0VarA.b();
            case 9:
                zf.d dVar = (zf.d) aVar;
                zf.a aVarC = zf.b.C();
                aVarC.e();
                zf.b.w((zf.b) aVarC.f4243b);
                byte[] bArrA9 = ag.p.a(dVar.y());
                com.google.crypto.tink.shaded.protobuf.h hVarI9 = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA9, bArrA9.length);
                aVarC.e();
                zf.b.x((zf.b) aVarC.f4243b, hVarI9);
                zf.f fVarZ = dVar.z();
                aVarC.e();
                zf.b.y((zf.b) aVarC.f4243b, fVarZ);
                return (zf.b) aVarC.b();
            default:
                s0 s0Var = (s0) aVar;
                p0 p0VarD2 = q0.D();
                p0VarD2.e();
                q0.w((q0) p0VarD2.f4243b);
                u0 u0VarA2 = s0Var.A();
                p0VarD2.e();
                q0.x((q0) p0VarD2.f4243b, u0VarA2);
                byte[] bArrA10 = ag.p.a(s0Var.z());
                com.google.crypto.tink.shaded.protobuf.h hVarI10 = com.google.crypto.tink.shaded.protobuf.i.i(0, bArrA10, bArrA10.length);
                p0VarD2.e();
                q0.y((q0) p0VarD2.f4243b, hVarI10);
                return (q0) p0VarD2.b();
        }
    }

    @Override // f0.i0
    public Map l() {
        switch (this.f12455b) {
            case 0:
                HashMap map = new HashMap();
                map.put("AES128_CTR_HMAC_SHA256", h.l(16, 16, 1));
                map.put("AES128_CTR_HMAC_SHA256_RAW", h.l(16, 16, 3));
                map.put("AES256_CTR_HMAC_SHA256", h.l(32, 32, 1));
                map.put("AES256_CTR_HMAC_SHA256_RAW", h.l(32, 32, 3));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                map2.put("AES128_EAX", h.k(16, 1));
                map2.put("AES128_EAX_RAW", h.k(16, 3));
                map2.put("AES256_EAX", h.k(32, 1));
                map2.put("AES256_EAX_RAW", h.k(32, 3));
                return Collections.unmodifiableMap(map2);
            case 2:
                HashMap map3 = new HashMap();
                map3.put("AES128_GCM", h.m(16, 1));
                map3.put("AES128_GCM_RAW", h.m(16, 3));
                map3.put("AES256_GCM", h.m(32, 1));
                map3.put("AES256_GCM_RAW", h.m(32, 3));
                return Collections.unmodifiableMap(map3);
            case 3:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM_SIV", h.n(16, 1));
                map4.put("AES128_GCM_SIV_RAW", h.n(16, 3));
                map4.put("AES256_GCM_SIV", h.n(32, 1));
                map4.put("AES256_GCM_SIV_RAW", h.n(32, 3));
                return Collections.unmodifiableMap(map4);
            case 4:
                HashMap map5 = new HashMap();
                map5.put("CHACHA20_POLY1305", new uf.d(l0.w(), 1));
                map5.put("CHACHA20_POLY1305_RAW", new uf.d(l0.w(), 3));
                return Collections.unmodifiableMap(map5);
            case 5:
            case 6:
            default:
                return super.l();
            case 7:
                HashMap map6 = new HashMap();
                map6.put("XCHACHA20_POLY1305", new uf.d(u1.w(), 1));
                map6.put("XCHACHA20_POLY1305_RAW", new uf.d(u1.w(), 3));
                return Collections.unmodifiableMap(map6);
            case 8:
                HashMap map7 = new HashMap();
                g0 g0VarY = h0.y();
                g0VarY.e();
                h0.w((h0) g0VarY.f4243b);
                map7.put("AES256_SIV", new uf.d((h0) g0VarY.b(), 1));
                g0 g0VarY2 = h0.y();
                g0VarY2.e();
                h0.w((h0) g0VarY2.f4243b);
                map7.put("AES256_SIV_RAW", new uf.d((h0) g0VarY2.b(), 3));
                return Collections.unmodifiableMap(map7);
            case 9:
                HashMap map8 = new HashMap();
                zf.c cVarA = zf.d.A();
                cVarA.e();
                zf.d.w((zf.d) cVarA.f4243b);
                zf.e eVarZ = zf.f.z();
                eVarZ.e();
                zf.f.w((zf.f) eVarZ.f4243b);
                zf.f fVar = (zf.f) eVarZ.b();
                cVarA.e();
                zf.d.x((zf.d) cVarA.f4243b, fVar);
                map8.put("AES_CMAC", new uf.d((zf.d) cVarA.b(), 1));
                zf.c cVarA2 = zf.d.A();
                cVarA2.e();
                zf.d.w((zf.d) cVarA2.f4243b);
                zf.e eVarZ2 = zf.f.z();
                eVarZ2.e();
                zf.f.w((zf.f) eVarZ2.f4243b);
                zf.f fVar2 = (zf.f) eVarZ2.b();
                cVarA2.e();
                zf.d.x((zf.d) cVarA2.f4243b, fVar2);
                map8.put("AES256_CMAC", new uf.d((zf.d) cVarA2.b(), 1));
                zf.c cVarA3 = zf.d.A();
                cVarA3.e();
                zf.d.w((zf.d) cVarA3.f4243b);
                zf.e eVarZ3 = zf.f.z();
                eVarZ3.e();
                zf.f.w((zf.f) eVarZ3.f4243b);
                zf.f fVar3 = (zf.f) eVarZ3.b();
                cVarA3.e();
                zf.d.x((zf.d) cVarA3.f4243b, fVar3);
                map8.put("AES256_CMAC_RAW", new uf.d((zf.d) cVarA3.b(), 3));
                return Collections.unmodifiableMap(map8);
            case 10:
                HashMap map9 = new HashMap();
                o0 o0Var = o0.SHA256;
                map9.put("HMAC_SHA256_128BITTAG", vf.b.k(32, 16, o0Var, 1));
                map9.put("HMAC_SHA256_128BITTAG_RAW", vf.b.k(32, 16, o0Var, 3));
                map9.put("HMAC_SHA256_256BITTAG", vf.b.k(32, 32, o0Var, 1));
                map9.put("HMAC_SHA256_256BITTAG_RAW", vf.b.k(32, 32, o0Var, 3));
                o0 o0Var2 = o0.SHA512;
                map9.put("HMAC_SHA512_128BITTAG", vf.b.k(64, 16, o0Var2, 1));
                map9.put("HMAC_SHA512_128BITTAG_RAW", vf.b.k(64, 16, o0Var2, 3));
                map9.put("HMAC_SHA512_256BITTAG", vf.b.k(64, 32, o0Var2, 1));
                map9.put("HMAC_SHA512_256BITTAG_RAW", vf.b.k(64, 32, o0Var2, 3));
                map9.put("HMAC_SHA512_512BITTAG", vf.b.k(64, 64, o0Var2, 1));
                map9.put("HMAC_SHA512_512BITTAG_RAW", vf.b.k(64, 64, o0Var2, 3));
                return Collections.unmodifiableMap(map9);
        }
    }

    @Override // f0.i0
    public final com.google.crypto.tink.shaded.protobuf.a m(com.google.crypto.tink.shaded.protobuf.i iVar) {
        switch (this.f12455b) {
            case 0:
                return zf.j.B(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 1:
                return zf.t.B(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 2:
                return z.z(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 3:
                return d0.z(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 4:
                return l0.x(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 5:
                return zf.m1.y(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 6:
                return p1.A(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 7:
                return u1.x(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 8:
                return h0.z(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 9:
                return zf.d.B(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            default:
                return s0.C(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }
    }

    @Override // f0.i0
    public final void s(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.f12455b) {
            case 0:
                zf.j jVar = (zf.j) aVar;
                f[] fVarArr = {new f(ag.m.class, 1)};
                HashMap map = new HashMap();
                for (f fVar : fVarArr) {
                    Class cls = fVar.f12453a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException(m1.h(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f12453a;
                }
                Collections.unmodifiableMap(map);
                zf.n nVarY = jVar.y();
                ag.q.a(nVarY.z());
                zf.p pVarA = nVarY.A();
                if (pVarA.y() < 12 || pVarA.y() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(nf.j.class, 11)};
                HashMap map2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    Class cls3 = fVar2.f12453a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(m1.h(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, fVar2);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f12453a;
                }
                Collections.unmodifiableMap(map2);
                s0 s0VarZ = jVar.z();
                if (s0VarZ.z() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                vf.b.m(s0VarZ.A());
                ag.q.a(jVar.y().z());
                return;
            case 1:
                zf.t tVar = (zf.t) aVar;
                ag.q.a(tVar.y());
                if (tVar.z().y() != 12 && tVar.z().y() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                ag.q.a(((z) aVar).x());
                return;
            case 3:
                ag.q.a(((d0) aVar).x());
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                p1 p1Var = (p1) aVar;
                if (p1Var.y().isEmpty() || !p1Var.z()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case 7:
                return;
            case 8:
                h0 h0Var = (h0) aVar;
                if (h0Var.x() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + h0Var.x() + ". Valid keys must have 64 bytes.");
            case 9:
                zf.d dVar = (zf.d) aVar;
                vf.b.l(dVar.z());
                if (dVar.y() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                return;
            default:
                s0 s0Var = (s0) aVar;
                if (s0Var.z() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                vf.b.m(s0Var.A());
                return;
        }
    }

    public g(h hVar, byte b10, boolean z2) {
        super(zf.m1.class);
    }

    public g(h hVar, byte b10, byte b11) {
        super(p1.class);
    }

    public g(h hVar, char c6) {
        super(z.class);
    }

    public g(h hVar, byte b10) {
        super(zf.t.class);
    }

    public g(h hVar, int i10) {
        super(d0.class);
    }

    public g(h hVar, short s10) {
        super(l0.class);
    }

    public g(h hVar, byte b10, char c6) {
        super(u1.class);
    }

    public g(h hVar, byte b10, int i10) {
        super(h0.class);
    }

    public g(h hVar) {
        super(zf.j.class);
    }

    public g(vf.b bVar) {
        super(s0.class);
    }
}
