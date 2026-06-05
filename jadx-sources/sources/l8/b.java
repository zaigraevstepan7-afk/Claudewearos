package l8;

import fj.l;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import kk.k;
import kk.t;
import qj.b0;
import qj.m0;
import qj.u1;
import qj.v;
import xj.e;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10089a;

    static {
        l.e(Pattern.compile("[a-z0-9_-]{1,120}"), "compile(...)");
    }

    public b(k kVar, t tVar, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        tVar.f("journal");
        tVar.f("journal.tmp");
        tVar.f("journal.bkp");
        new LinkedHashMap(0, 0.75f, true);
        u1 u1VarC = b0.c();
        l.f(v.f13628b, "key");
        e eVar = m0.f13601a;
        b0.b(f.W(u1VarC, xj.d.f20094c.h0(1)));
        this.f10089a = new Object();
        new a(kVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f10089a) {
        }
    }
}
