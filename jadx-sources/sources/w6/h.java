package w6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements e7.a, yj.a {

    /* renamed from: a, reason: collision with root package name */
    public final e7.a f18809a;

    /* renamed from: b, reason: collision with root package name */
    public final yj.a f18810b;

    /* renamed from: c, reason: collision with root package name */
    public ti.h f18811c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f18812d;

    /* renamed from: e, reason: collision with root package name */
    public final g f18813e;

    public h(e7.a aVar) {
        yj.c cVar = new yj.c();
        fj.l.f(aVar, "delegate");
        this.f18809a = aVar;
        this.f18810b = cVar;
        this.f18813e = new g(this);
    }

    @Override // yj.a
    public final Object b(vi.c cVar) {
        return this.f18810b.b(cVar);
    }

    @Override // e7.a
    public final boolean c() {
        return this.f18809a.c();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        g gVar = this.f18813e;
        if (gVar != null) {
            gVar.evictAll();
        }
        this.f18809a.close();
    }

    @Override // e7.a
    public final e7.c d0(String str) {
        fj.l.f(str, "sql");
        g gVar = this.f18813e;
        if (gVar == null) {
            return this.f18809a.d0(str);
        }
        Object obj = gVar.get(str);
        fj.l.c(obj);
        return new f((e7.c) obj);
    }

    @Override // yj.a
    public final void e(Object obj) {
        this.f18810b.e(null);
    }

    public final void g(StringBuilder sb2) {
        if (this.f18811c == null && this.f18812d == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
        } else {
            sb2.append("\t\tStatus: Acquired connection");
            sb2.append('\n');
            ti.h hVar = this.f18811c;
            if (hVar != null) {
                sb2.append("\t\tCoroutine: " + hVar);
                sb2.append('\n');
            }
            Throwable th2 = this.f18812d;
            if (th2 != null) {
                sb2.append("\t\tAcquired:");
                sb2.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th2.printStackTrace(printWriter);
                printWriter.flush();
                String string = stringWriter.toString();
                fj.l.e(string, "toString(...)");
                Iterator it = qi.l.x0(nj.e.N0(string)).iterator();
                while (it.hasNext()) {
                    sb2.append("\t\t" + ((String) it.next()));
                    sb2.append('\n');
                }
            }
        }
        g gVar = this.f18813e;
        if (gVar != null) {
            sb2.append("\t\tPrepared Statement Cache Size: " + gVar.size());
            sb2.append('\n');
        }
    }

    public final String toString() {
        return this.f18809a.toString();
    }
}
