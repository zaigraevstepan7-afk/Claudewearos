package vf;

import ag.q;
import f0.i0;
import java.security.GeneralSecurityException;
import u6.a0;
import zf.o0;
import zf.q0;
import zf.r0;
import zf.s0;
import zf.t0;
import zf.u0;
import zf.w0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends a0 {

    /* renamed from: e, reason: collision with root package name */
    public static final uf.l f18022e = new uf.l(a.class, new l7.n(28));

    /* renamed from: f, reason: collision with root package name */
    public static final uf.l f18023f = new uf.l(i.class, new j(0));

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18024d = 1;

    public /* synthetic */ b(Class cls, of.f[] fVarArr) {
        super(cls, fVarArr);
    }

    public static uf.d k(int i10, int i11, o0 o0Var, int i12) {
        r0 r0VarB = s0.B();
        t0 t0VarB = u0.B();
        t0VarB.e();
        u0.w((u0) t0VarB.f4243b, o0Var);
        t0VarB.e();
        u0.x((u0) t0VarB.f4243b, i11);
        u0 u0Var = (u0) t0VarB.b();
        r0VarB.e();
        s0.w((s0) r0VarB.f4243b, u0Var);
        r0VarB.e();
        s0.x((s0) r0VarB.f4243b, i10);
        return new uf.d((s0) r0VarB.b(), i12);
    }

    public static void l(zf.f fVar) {
        if (fVar.y() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (fVar.y() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void m(u0 u0Var) {
        if (u0Var.A() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = u0Var.z().ordinal();
        if (iOrdinal == 1) {
            if (u0Var.A() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (u0Var.A() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (u0Var.A() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (u0Var.A() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (u0Var.A() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // u6.a0
    public int c() {
        switch (this.f18024d) {
            case 1:
                return 2;
            default:
                return super.c();
        }
    }

    @Override // u6.a0
    public final String d() {
        switch (this.f18024d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // u6.a0
    public final i0 f() {
        switch (this.f18024d) {
            case 0:
                return new of.g(zf.d.class);
            default:
                return new of.g(this);
        }
    }

    @Override // u6.a0
    public final w0 g() {
        switch (this.f18024d) {
        }
        return w0.SYMMETRIC;
    }

    @Override // u6.a0
    public final com.google.crypto.tink.shaded.protobuf.a h(com.google.crypto.tink.shaded.protobuf.i iVar) {
        switch (this.f18024d) {
            case 0:
                return zf.b.D(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
            default:
                return q0.E(iVar, com.google.crypto.tink.shaded.protobuf.o.a());
        }
    }

    @Override // u6.a0
    public final void j(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.f18024d) {
            case 0:
                zf.b bVar = (zf.b) aVar;
                q.c(bVar.B());
                if (bVar.z().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                l(bVar.A());
                return;
            default:
                q0 q0Var = (q0) aVar;
                q.c(q0Var.C());
                if (q0Var.A().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                m(q0Var.B());
                return;
        }
    }

    public b() {
        super(q0.class, new of.f(nf.j.class, 11));
    }
}
