package w5;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.y0;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 implements androidx.lifecycle.j, a7.f, b1 {

    /* renamed from: a, reason: collision with root package name */
    public final t f18720a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f18721b;

    /* renamed from: c, reason: collision with root package name */
    public final ac.o f18722c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.v f18723d = null;

    /* renamed from: e, reason: collision with root package name */
    public t0.j f18724e = null;

    public p0(t tVar, a1 a1Var, ac.o oVar) {
        this.f18720a = tVar;
        this.f18721b = a1Var;
        this.f18722c = oVar;
    }

    public final void b(androidx.lifecycle.n nVar) {
        this.f18723d.d(nVar);
    }

    @Override // androidx.lifecycle.j
    public final d6.c c() {
        Application application;
        t tVar = this.f18720a;
        Context applicationContext = tVar.I().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        d6.c cVar = new d6.c(0);
        LinkedHashMap linkedHashMap = cVar.f4977a;
        if (application != null) {
            linkedHashMap.put(y0.f1158f, application);
        }
        linkedHashMap.put(androidx.lifecycle.r0.f1122a, tVar);
        linkedHashMap.put(androidx.lifecycle.r0.f1123b, this);
        Bundle bundle = tVar.f18763f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.r0.f1124c, bundle);
        }
        return cVar;
    }

    public final void d() {
        if (this.f18723d == null) {
            this.f18723d = new androidx.lifecycle.v(this, true);
            c7.b bVar = new c7.b(this, new a7.e(this, 0));
            this.f18724e = new t0.j(bVar);
            bVar.a();
            this.f18722c.run();
        }
    }

    @Override // androidx.lifecycle.b1
    public final a1 e() {
        d();
        return this.f18721b;
    }

    @Override // a7.f
    public final mh.g g() {
        d();
        return (mh.g) this.f18724e.f15364c;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v h() {
        d();
        return this.f18723d;
    }
}
