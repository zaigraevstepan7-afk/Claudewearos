package vf;

import java.security.GeneralSecurityException;
import uf.u;
import zf.o0;
import zf.q1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final uf.k f18054a;

    /* renamed from: b, reason: collision with root package name */
    public static final uf.j f18055b;

    /* renamed from: c, reason: collision with root package name */
    public static final uf.c f18056c;

    /* renamed from: d, reason: collision with root package name */
    public static final uf.a f18057d;

    static {
        bg.a aVarB = u.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f18054a = new uf.k(k.class);
        f18055b = new uf.j(aVarB);
        f18056c = new uf.c(i.class);
        f18057d = new uf.a(aVarB, new j(1));
    }

    public static c a(o0 o0Var) throws GeneralSecurityException {
        int iOrdinal = o0Var.ordinal();
        if (iOrdinal == 1) {
            return c.f18029g;
        }
        if (iOrdinal == 2) {
            return c.j;
        }
        if (iOrdinal == 3) {
            return c.f18031i;
        }
        if (iOrdinal == 4) {
            return c.f18032k;
        }
        if (iOrdinal == 5) {
            return c.f18030h;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o0Var.a());
    }

    public static c b(q1 q1Var) throws GeneralSecurityException {
        int iOrdinal = q1Var.ordinal();
        if (iOrdinal == 1) {
            return c.f18033l;
        }
        if (iOrdinal == 2) {
            return c.f18035n;
        }
        if (iOrdinal == 3) {
            return c.f18036o;
        }
        if (iOrdinal == 4) {
            return c.f18034m;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var.b());
    }
}
