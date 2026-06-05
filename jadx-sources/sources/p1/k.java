package p1;

import android.os.Trace;
import c1.s3;
import f1.c2;
import f1.d2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import q.g0;
import q.h0;
import q.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Set f12649a;

    /* renamed from: b, reason: collision with root package name */
    public u1.f f12650b;

    /* renamed from: c, reason: collision with root package name */
    public final g1.e f12651c;

    /* renamed from: d, reason: collision with root package name */
    public h0 f12652d;

    /* renamed from: e, reason: collision with root package name */
    public g1.e f12653e;

    /* renamed from: f, reason: collision with root package name */
    public final g1.e f12654f;

    /* renamed from: g, reason: collision with root package name */
    public final g1.e f12655g;

    /* renamed from: h, reason: collision with root package name */
    public h0 f12656h;

    /* renamed from: i, reason: collision with root package name */
    public g0 f12657i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public h0 f12658k;

    public k() {
        g1.e eVar = new g1.e(new d2[16]);
        this.f12651c = eVar;
        h0 h0Var = o0.f13110a;
        this.f12652d = new h0();
        this.f12653e = eVar;
        this.f12654f = new g1.e(new Object[16]);
        this.f12655g = new g1.e(new ej.a[16]);
    }

    public static final boolean f(d2 d2Var, g1.e eVar) {
        Object[] objArr = eVar.f7024a;
        int i10 = eVar.f7026c;
        for (int i11 = 0; i11 < i10; i11++) {
            c2 c2VarA = ((d2) objArr[i11]).a();
            if (c2VarA instanceof g) {
                g1.e eVar2 = ((g) c2VarA).f12644b;
                if (eVar2.k(d2Var) || f(d2Var, eVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f12649a = null;
        this.f12650b = null;
        g1.e eVar = this.f12651c;
        eVar.h();
        this.f12652d.b();
        this.f12653e = eVar;
        this.f12654f.h();
        this.f12655g.h();
        this.f12656h = null;
        this.f12657i = null;
        this.j = null;
    }

    public final void b() {
        Set set = this.f12649a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c2 c2Var = (c2) it.next();
                it.remove();
                c2Var.a();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        Set set = this.f12649a;
        if (set == null) {
            return;
        }
        this.f12658k = null;
        g1.e eVar = this.f12654f;
        if (eVar.f7026c != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                h0 h0Var = this.f12656h;
                int i10 = eVar.f7026c;
                while (true) {
                    i10--;
                    if (-1 >= i10) {
                        break;
                    }
                    Object obj = eVar.f7024a[i10];
                    try {
                        if (obj instanceof d2) {
                            c2 c2VarA = ((d2) obj).a();
                            set.remove(c2VarA);
                            c2VarA.c();
                        }
                        if (obj instanceof f1.i) {
                            if (h0Var == null || !h0Var.c(obj)) {
                                ((f1.i) obj).b();
                            } else {
                                ((f1.i) obj).a();
                            }
                        }
                    } catch (Throwable th2) {
                        u1.f fVar = this.f12650b;
                        if (fVar != null) {
                            u1.d.h(th2, new s3(25, fVar, obj));
                        }
                        throw th2;
                    }
                }
            } finally {
            }
        }
        g1.e eVar2 = this.f12651c;
        if (eVar2.f7026c != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.f12649a;
                if (set2 != null) {
                    Object[] objArr = eVar2.f7024a;
                    int i11 = eVar2.f7026c;
                    for (int i12 = 0; i12 < i11; i12++) {
                        d2 d2Var = (d2) objArr[i12];
                        c2 c2VarA2 = d2Var.a();
                        set2.remove(c2VarA2);
                        try {
                            c2VarA2.d();
                        } catch (Throwable th3) {
                            u1.f fVar2 = this.f12650b;
                            if (fVar2 != null) {
                                u1.d.h(th3, new s3(25, fVar2, d2Var));
                            }
                            throw th3;
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void d() {
        g1.e eVar = this.f12655g;
        if (eVar.f7026c != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = eVar.f7024a;
                int i10 = eVar.f7026c;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((ej.a) objArr[i11]).a();
                }
                eVar.h();
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final void e(d2 d2Var) {
        if (!this.f12652d.c(d2Var)) {
            h0 h0Var = this.f12658k;
            if (h0Var == null || !h0Var.c(d2Var)) {
                this.f12654f.b(d2Var);
                return;
            }
            return;
        }
        this.f12652d.l(d2Var);
        if (!this.f12653e.k(d2Var)) {
            g1.e eVar = this.f12651c;
            if (!eVar.k(d2Var)) {
                f(d2Var, eVar);
            }
        }
        Set set = this.f12649a;
        if (set == null) {
            return;
        }
        set.add(d2Var.a());
    }

    public final void g(Set set, u1.f fVar) {
        a();
        this.f12649a = set;
        this.f12650b = fVar;
    }

    public final void h(d2 d2Var) {
        this.f12653e.b(d2Var);
        this.f12652d.a(d2Var);
    }
}
