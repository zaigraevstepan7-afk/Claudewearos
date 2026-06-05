package rg;

import android.os.Build;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public k4.d f14395a;

    /* renamed from: b, reason: collision with root package name */
    public d8.e f14396b;

    /* renamed from: c, reason: collision with root package name */
    public mh.g f14397c;

    /* renamed from: d, reason: collision with root package name */
    public t0.j f14398d;

    /* renamed from: e, reason: collision with root package name */
    public ac.d f14399e;

    /* renamed from: f, reason: collision with root package name */
    public String f14400f;

    /* renamed from: g, reason: collision with root package name */
    public String f14401g;

    /* renamed from: h, reason: collision with root package name */
    public int f14402h;

    /* renamed from: i, reason: collision with root package name */
    public cg.i f14403i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public t0.j f14404k;

    public final p1.l a(String str) {
        return new p1.l(this.f14395a, str, (Object) null, 22);
    }

    public final t0.j b() {
        if (this.f14404k == null) {
            synchronized (this) {
                this.f14404k = new t0.j(this.f14403i);
            }
        }
        return this.f14404k;
    }

    public final void c() {
        if (this.f14395a == null) {
            t0.j jVarB = b();
            int i10 = this.f14402h;
            jVarB.getClass();
            k4.d dVar = new k4.d();
            dVar.f9421b = null;
            dVar.f9420a = i10;
            this.f14395a = dVar;
        }
        b();
        if (this.f14401g == null) {
            b().getClass();
            this.f14401g = m1.i("Firebase/5/21.0.0/", m6.a.h(new StringBuilder(), Build.VERSION.SDK_INT, "/Android"));
        }
        if (this.f14396b == null) {
            b().getClass();
            this.f14396b = new d8.e(16);
        }
        if (this.f14399e == null) {
            t0.j jVar = this.f14404k;
            jVar.getClass();
            this.f14399e = new ac.d(jVar, a("RunLoop"));
        }
        if (this.f14400f == null) {
            this.f14400f = "default";
        }
        com.google.android.gms.common.internal.e0.j(this.f14397c, "You must register an authTokenProvider before initializing Context.");
        com.google.android.gms.common.internal.e0.j(this.f14398d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    public final synchronized void d(String str) {
        if (this.j) {
            throw new mg.c("Modifications to DatabaseConfig objects must occur before they are in use");
        }
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.f14400f = str;
    }
}
