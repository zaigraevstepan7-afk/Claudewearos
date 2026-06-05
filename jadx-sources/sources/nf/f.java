package nf;

import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.w;
import f0.i0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import u6.a0;
import uf.u;
import zf.a1;
import zf.c1;
import zf.d1;
import zf.e1;
import zf.f1;
import zf.q1;
import zf.v0;
import zf.w0;
import zf.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f12316c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f12317d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f12318e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12319a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12320b;

    static {
        int i10 = 0;
        f12316c = new f("ENABLED", i10);
        f12317d = new f("DISABLED", i10);
        f12318e = new f("DESTROYED", i10);
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.f12319a = i10;
        this.f12320b = obj;
    }

    public synchronized void a(a1 a1Var) {
        e1 e1VarB;
        synchronized (this) {
            e1VarB = b(n.e(a1Var), a1Var.A());
        }
        c1 c1Var = (c1) this.f12320b;
        c1Var.e();
        f1.x((f1) c1Var.f4243b, e1VarB);
    }

    public synchronized e1 b(x0 x0Var, q1 q1Var) {
        int iA;
        synchronized (this) {
            iA = u.a();
            while (d(iA)) {
                iA = u.a();
            }
        }
        return (e1) d1VarF.b();
        if (q1Var == q1.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        d1 d1VarF = e1.F();
        d1VarF.e();
        e1.w((e1) d1VarF.f4243b, x0Var);
        d1VarF.e();
        e1.z((e1) d1VarF.f4243b, iA);
        d1VarF.e();
        e1.y((e1) d1VarF.f4243b);
        d1VarF.e();
        e1.x((e1) d1VarF.f4243b, q1Var);
        return (e1) d1VarF.b();
    }

    public synchronized ac.d c() {
        return ac.d.g((f1) ((c1) this.f12320b).b());
    }

    public synchronized boolean d(int i10) {
        Iterator it = Collections.unmodifiableList(((f1) ((c1) this.f12320b).f4243b).A()).iterator();
        while (it.hasNext()) {
            if (((e1) it.next()).B() == i10) {
                return true;
            }
        }
        return false;
    }

    public x0 e(com.google.crypto.tink.shaded.protobuf.i iVar) throws GeneralSecurityException {
        a0 a0Var = (a0) this.f12320b;
        try {
            i0 i0VarF = a0Var.f();
            com.google.crypto.tink.shaded.protobuf.a aVarM = i0VarF.m(iVar);
            i0VarF.s(aVarM);
            com.google.crypto.tink.shaded.protobuf.a aVarF = i0VarF.f(aVarM);
            v0 v0VarD = x0.D();
            String strD = a0Var.d();
            v0VarD.e();
            x0.w((x0) v0VarD.f4243b, strD);
            try {
                int iB = ((w) aVarF).b(null);
                byte[] bArr = new byte[iB];
                com.google.crypto.tink.shaded.protobuf.l lVar = new com.google.crypto.tink.shaded.protobuf.l(bArr, iB);
                aVarF.f(lVar);
                if (lVar.f4193f - lVar.f4194g != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                com.google.crypto.tink.shaded.protobuf.h hVar = new com.google.crypto.tink.shaded.protobuf.h(bArr);
                v0VarD.e();
                x0.x((x0) v0VarD.f4243b, hVar);
                w0 w0VarG = a0Var.g();
                v0VarD.e();
                x0.y((x0) v0VarD.f4243b, w0VarG);
                return (x0) v0VarD.b();
            } catch (IOException e10) {
                throw new RuntimeException(aVarF.c("ByteString"), e10);
            }
        } catch (c0 e11) {
            throw new GeneralSecurityException("Unexpected proto", e11);
        }
    }

    public String toString() {
        switch (this.f12319a) {
            case 0:
                return (String) this.f12320b;
            default:
                return super.toString();
        }
    }

    public f(a0 a0Var, Class cls) {
        this.f12319a = 2;
        if (!((Map) a0Var.f16683b).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(y8.f.b("Given internalKeyMananger ", a0Var.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f12320b = a0Var;
    }
}
