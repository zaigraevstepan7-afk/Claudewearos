package of;

import f0.i0;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import t.m1;
import u6.a0;
import zf.b0;
import zf.c0;
import zf.d0;
import zf.f0;
import zf.j0;
import zf.l1;
import zf.o0;
import zf.o1;
import zf.q0;
import zf.r0;
import zf.s0;
import zf.t0;
import zf.t1;
import zf.u0;
import zf.w0;
import zf.z;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h extends a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Class cls, f[] fVarArr, int i10) {
        super(cls, fVarArr);
        this.f12456d = i10;
    }

    public static uf.d k(int i10, int i11) {
        zf.s sVarA = zf.t.A();
        sVarA.e();
        zf.t.x((zf.t) sVarA.f4243b, i10);
        zf.u uVarZ = zf.v.z();
        uVarZ.e();
        zf.v.w((zf.v) uVarZ.f4243b);
        zf.v vVar = (zf.v) uVarZ.b();
        sVarA.e();
        zf.t.w((zf.t) sVarA.f4243b, vVar);
        return new uf.d((zf.t) sVarA.b(), i11);
    }

    public static uf.d l(int i10, int i11, int i12) {
        zf.m mVarB = zf.n.B();
        zf.o oVarZ = zf.p.z();
        oVarZ.e();
        zf.p.w((zf.p) oVarZ.f4243b);
        zf.p pVar = (zf.p) oVarZ.b();
        mVarB.e();
        zf.n.w((zf.n) mVarB.f4243b, pVar);
        mVarB.e();
        zf.n.x((zf.n) mVarB.f4243b, i10);
        zf.n nVar = (zf.n) mVarB.b();
        r0 r0VarB = s0.B();
        t0 t0VarB = u0.B();
        t0VarB.e();
        u0.w((u0) t0VarB.f4243b, o0.SHA256);
        t0VarB.e();
        u0.x((u0) t0VarB.f4243b, i11);
        u0 u0Var = (u0) t0VarB.b();
        r0VarB.e();
        s0.w((s0) r0VarB.f4243b, u0Var);
        r0VarB.e();
        s0.x((s0) r0VarB.f4243b, 32);
        s0 s0Var = (s0) r0VarB.b();
        zf.i iVarA = zf.j.A();
        iVarA.e();
        zf.j.w((zf.j) iVarA.f4243b, nVar);
        iVarA.e();
        zf.j.x((zf.j) iVarA.f4243b, s0Var);
        return new uf.d((zf.j) iVarA.b(), i12);
    }

    public static uf.d m(int i10, int i11) {
        zf.y yVarY = z.y();
        yVarY.e();
        z.w((z) yVarY.f4243b, i10);
        return new uf.d((z) yVarY.b(), i11);
    }

    public static uf.d n(int i10, int i11) {
        c0 c0VarY = d0.y();
        c0VarY.e();
        d0.w((d0) c0VarY.f4243b, i10);
        return new uf.d((d0) c0VarY.b(), i11);
    }

    @Override // u6.a0
    public int c() {
        switch (this.f12456d) {
            case 0:
                return 2;
            case 1:
            default:
                return super.c();
            case 2:
                return 2;
        }
    }

    @Override // u6.a0
    public final String d() {
        switch (this.f12456d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 5:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
    }

    @Override // u6.a0
    public final i0 f() {
        switch (this.f12456d) {
            case 0:
                return new g(this);
            case 1:
                return new g(this, (byte) 0);
            case 2:
                return new g(this, (char) 0);
            case 3:
                return new g(this, 0);
            case 4:
                return new g(this, (short) 0);
            case 5:
                return new g(this, (byte) 0, false);
            case 6:
                return new g(this, (byte) 0, (byte) 0);
            case 7:
                return new g(this, (byte) 0, (char) 0);
            default:
                return new g(this, (byte) 0, 0);
        }
    }

    @Override // u6.a0
    public final w0 g() {
        switch (this.f12456d) {
        }
        return w0.SYMMETRIC;
    }

    @Override // u6.a0
    public final com.google.crypto.tink.shaded.protobuf.a h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        switch (this.f12456d) {
            case 0:
                return zf.h.D(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 1:
                return zf.r.D(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 2:
                return zf.x.B(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 3:
                return b0.B(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 4:
                return j0.B(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 5:
                return l1.B(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 6:
                return o1.B(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            case 7:
                return t1.B(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            default:
                return f0.B(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }
    }

    @Override // u6.a0
    public final void j(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.f12456d) {
            case 0:
                zf.h hVar = (zf.h) aVar;
                ag.q.c(hVar.B());
                f[] fVarArr = {new f(ag.m.class, 1)};
                HashMap map = new HashMap();
                f fVar = fVarArr[0];
                Class cls = fVar.f12453a;
                if (map.containsKey(cls)) {
                    throw new IllegalArgumentException(m1.h(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map.put(cls, fVar);
                Class cls2 = fVarArr[0].f12453a;
                Collections.unmodifiableMap(map);
                zf.l lVarZ = hVar.z();
                ag.q.c(lVarZ.C());
                ag.q.a(lVarZ.A().size());
                zf.p pVarB = lVarZ.B();
                if (pVarB.y() < 12 || pVarB.y() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(nf.j.class, 11)};
                HashMap map2 = new HashMap();
                f fVar2 = fVarArr2[0];
                Class cls3 = fVar2.f12453a;
                if (map2.containsKey(cls3)) {
                    throw new IllegalArgumentException(m1.h(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map2.put(cls3, fVar2);
                Class cls4 = fVarArr2[0].f12453a;
                Collections.unmodifiableMap(map2);
                q0 q0VarA = hVar.A();
                ag.q.c(q0VarA.C());
                if (q0VarA.A().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                vf.b.m(q0VarA.B());
                return;
            case 1:
                zf.r rVar = (zf.r) aVar;
                ag.q.c(rVar.B());
                ag.q.a(rVar.z().size());
                if (rVar.A().y() != 12 && rVar.A().y() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                zf.x xVar = (zf.x) aVar;
                ag.q.c(xVar.z());
                ag.q.a(xVar.y().size());
                return;
            case 3:
                b0 b0Var = (b0) aVar;
                ag.q.c(b0Var.z());
                ag.q.a(b0Var.y().size());
                return;
            case 4:
                j0 j0Var = (j0) aVar;
                ag.q.c(j0Var.z());
                if (j0Var.y().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 5:
                ag.q.c(((l1) aVar).z());
                return;
            case 6:
                ag.q.c(((o1) aVar).z());
                return;
            case 7:
                t1 t1Var = (t1) aVar;
                ag.q.c(t1Var.z());
                if (t1Var.y().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                f0 f0Var = (f0) aVar;
                ag.q.c(f0Var.z());
                if (f0Var.y().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + f0Var.y().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
