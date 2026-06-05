package s0;

import p2.h0;
import v1.o;
import v2.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final l f14712a;

    static {
        float f10 = 40;
        float f11 = 10;
        f14712a = new l(f11, f10, f11, f10);
    }

    public static final o a(boolean z2, boolean z10, ej.a aVar) {
        o h0Var = v1.l.f17564b;
        if (!z2 || !d.f14713a) {
            return h0Var;
        }
        if (z10) {
            h0Var = new h0(f14712a);
        }
        return h0Var.c(new a(aVar));
    }
}
