package ub;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static volatile j f16977e;

    /* renamed from: a, reason: collision with root package name */
    public final dc.a f16978a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.a f16979b;

    /* renamed from: c, reason: collision with root package name */
    public final zb.b f16980c;

    /* renamed from: d, reason: collision with root package name */
    public final ac.n f16981d;

    public p(dc.a aVar, dc.a aVar2, zb.b bVar, ac.n nVar, a8.j jVar) {
        this.f16978a = aVar;
        this.f16979b = aVar2;
        this.f16980c = bVar;
        this.f16981d = nVar;
        ((Executor) jVar.f215a).execute(new ac.o(jVar, 0));
    }

    public static p a() {
        j jVar = f16977e;
        if (jVar != null) {
            return (p) jVar.f16969f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f16977e == null) {
            synchronized (p.class) {
                try {
                    if (f16977e == null) {
                        ld.i iVar = new ld.i(25, false);
                        context.getClass();
                        iVar.f10924b = context;
                        f16977e = iVar.u();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final o c(k kVar) {
        byte[] bytes;
        Set setUnmodifiableSet = kVar != null ? Collections.unmodifiableSet(sb.a.f14959d) : Collections.singleton(new rb.c("proto"));
        p1.l lVarA = i.a();
        kVar.getClass();
        lVarA.f12660b = "cct";
        sb.a aVar = (sb.a) kVar;
        String str = aVar.f14962a;
        String str2 = aVar.f14963b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = y8.f.b("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        lVarA.f12661c = bytes;
        return new o(setUnmodifiableSet, lVarA.f(), this);
    }
}
