package cl;

import ak.v;
import fj.f;
import fj.l;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import mh.g;
import oj.d;
import oj.e;
import qi.j;
import zk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final zk.a f3389a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3390b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3391c;

    /* renamed from: d, reason: collision with root package name */
    public final c f3392d;

    /* renamed from: e, reason: collision with root package name */
    public final v f3393e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3394f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadLocal f3395g;

    public a(zk.a aVar, String str, c cVar, v vVar, int i10) {
        boolean z2 = (i10 & 4) == 0;
        cVar = (i10 & 8) != 0 ? null : cVar;
        l.f(aVar, "scopeQualifier");
        this.f3389a = aVar;
        this.f3390b = str;
        this.f3391c = z2;
        this.f3392d = cVar;
        this.f3393e = vVar;
        this.f3394f = new ArrayList();
        new LinkedHashSet();
    }

    public final Object a(f fVar, yk.a aVar) {
        ef.f fVar2 = (ef.f) this.f3393e.f730a;
        vk.a aVar2 = vk.a.f18134a;
        fVar2.getClass();
        if (vk.a.f18138e.compareTo(aVar2) > 0) {
            return c(fVar, aVar);
        }
        String str = "|- '" + dl.a.a(fVar) + "'" + (this.f3391c ? "" : m6.a.i(new StringBuilder(" - scope:'"), this.f3390b, '\'')) + "...";
        fVar2.getClass();
        l.f(str, "msg");
        long jB = d.b();
        Object objC = c(fVar, aVar);
        long jA = e.a(jB);
        StringBuilder sb2 = new StringBuilder("|- '");
        sb2.append(dl.a.a(fVar));
        sb2.append("' in ");
        oj.f fVar3 = oj.a.f12531b;
        sb2.append(oj.a.p(jA, oj.c.f12537c) / 1000.0d);
        sb2.append(" ms");
        String string = sb2.toString();
        fVar2.getClass();
        l.f(string, "msg");
        return objC;
    }

    public final Object b(v vVar) throws tk.a {
        g gVar = (g) this.f3393e.f731b;
        gVar.getClass();
        Object objB = gVar.B(this, vVar, true);
        if (objB != null) {
            return objB;
        }
        String str = "No definition found for type '" + dl.a.a((f) vVar.f733d) + "'. Check your Modules configuration and add missing type and/or qualifier!";
        l.f(str, "msg");
        throw new tk.a(str);
    }

    public final Object c(f fVar, yk.a aVar) {
        j jVar;
        ef.f fVar2 = (ef.f) this.f3393e.f730a;
        v vVar = new v(fVar2, this, fVar, aVar);
        if (aVar == null) {
            return b(vVar);
        }
        vk.a aVar2 = vk.a.f18134a;
        fVar2.getClass();
        if (vk.a.f18138e.compareTo(aVar2) <= 0) {
            l.f("| >> parameters " + aVar, "msg");
        }
        ThreadLocal threadLocal = this.f3395g;
        if (threadLocal == null || (jVar = (j) threadLocal.get()) == null) {
            jVar = new j();
            ThreadLocal threadLocal2 = new ThreadLocal();
            this.f3395g = threadLocal2;
            threadLocal2.set(jVar);
        }
        jVar.addFirst(aVar);
        try {
            return b(vVar);
        } finally {
            fVar2.e("| << parameters");
            if (!jVar.isEmpty()) {
                jVar.removeFirst();
            }
            if (jVar.isEmpty()) {
                ThreadLocal threadLocal3 = this.f3395g;
                if (threadLocal3 != null) {
                    threadLocal3.remove();
                }
                this.f3395g = null;
            }
        }
    }

    public final String toString() {
        return m6.a.j(new StringBuilder("['"), this.f3390b, "']");
    }
}
