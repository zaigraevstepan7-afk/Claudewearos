package vf;

import java.security.GeneralSecurityException;
import uf.u;
import zf.q1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final uf.k f18042a;

    /* renamed from: b, reason: collision with root package name */
    public static final uf.j f18043b;

    /* renamed from: c, reason: collision with root package name */
    public static final uf.c f18044c;

    /* renamed from: d, reason: collision with root package name */
    public static final uf.a f18045d;

    static {
        bg.a aVarB = u.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f18042a = new uf.k(d.class);
        f18043b = new uf.j(aVarB);
        f18044c = new uf.c(a.class);
        f18045d = new uf.a(aVarB, new l7.n(29));
    }

    public static c a(q1 q1Var) throws GeneralSecurityException {
        int iOrdinal = q1Var.ordinal();
        if (iOrdinal == 1) {
            return c.f18025c;
        }
        if (iOrdinal == 2) {
            return c.f18027e;
        }
        if (iOrdinal == 3) {
            return c.f18028f;
        }
        if (iOrdinal == 4) {
            return c.f18026d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var.b());
    }
}
