package androidx.work.impl;

import ac.d;
import ac.n;
import android.content.Context;
import c8.b;
import f0.a1;
import f7.e;
import fj.l;
import java.util.HashMap;
import mh.g;
import t0.j;
import u6.a;
import u6.y;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f1236t = 0;

    /* renamed from: m, reason: collision with root package name */
    public volatile n f1237m;

    /* renamed from: n, reason: collision with root package name */
    public volatile j f1238n;

    /* renamed from: o, reason: collision with root package name */
    public volatile g f1239o;

    /* renamed from: p, reason: collision with root package name */
    public volatile d f1240p;

    /* renamed from: q, reason: collision with root package name */
    public volatile j f1241q;

    /* renamed from: r, reason: collision with root package name */
    public volatile a8.j f1242r;

    /* renamed from: s, reason: collision with root package name */
    public volatile g f1243s;

    @Override // u6.u
    public final u6.g e() {
        return new u6.g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // u6.u
    public final e g(a aVar) {
        y yVar = new y(aVar, new d8.e(this));
        Context context = aVar.f16661a;
        l.f(context, "context");
        return aVar.f16663c.e(new a1(context, aVar.f16662b, yVar, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j r() {
        j jVar;
        if (this.f1238n != null) {
            return this.f1238n;
        }
        synchronized (this) {
            try {
                if (this.f1238n == null) {
                    this.f1238n = new j(this, 4);
                }
                jVar = this.f1238n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g s() {
        g gVar;
        if (this.f1243s != null) {
            return this.f1243s;
        }
        synchronized (this) {
            try {
                if (this.f1243s == null) {
                    this.f1243s = new g(this, 5);
                }
                gVar = this.f1243s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final d t() {
        d dVar;
        if (this.f1240p != null) {
            return this.f1240p;
        }
        synchronized (this) {
            try {
                if (this.f1240p == null) {
                    this.f1240p = new d(this);
                }
                dVar = this.f1240p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j u() {
        j jVar;
        if (this.f1241q != null) {
            return this.f1241q;
        }
        synchronized (this) {
            try {
                if (this.f1241q == null) {
                    this.f1241q = new j(this, 5);
                }
                jVar = this.f1241q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final a8.j v() {
        a8.j jVar;
        if (this.f1242r != null) {
            return this.f1242r;
        }
        synchronized (this) {
            try {
                if (this.f1242r == null) {
                    a8.j jVar2 = new a8.j();
                    jVar2.f215a = this;
                    jVar2.f216b = new b(this, 4);
                    jVar2.f217c = new c8.e(this, 1);
                    jVar2.f218d = new c8.e(this, 2);
                    this.f1242r = jVar2;
                }
                jVar = this.f1242r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n w() {
        n nVar;
        if (this.f1237m != null) {
            return this.f1237m;
        }
        synchronized (this) {
            try {
                if (this.f1237m == null) {
                    this.f1237m = new n(this);
                }
                nVar = this.f1237m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final g x() {
        g gVar;
        if (this.f1239o != null) {
            return this.f1239o;
        }
        synchronized (this) {
            try {
                if (this.f1239o == null) {
                    this.f1239o = new g(this, 6);
                }
                gVar = this.f1239o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }
}
