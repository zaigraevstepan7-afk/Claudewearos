package f1;

import android.view.Choreographer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements ti.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6280a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6281b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6282c;

    public e(Choreographer choreographer, w2.l0 l0Var) {
        this.f6280a = 2;
        this.f6281b = choreographer;
        this.f6282c = l0Var;
    }

    @Override // ti.h
    public final ti.f C(ti.g gVar) {
        switch (this.f6280a) {
        }
        return yd.f.w(this, gVar);
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        switch (this.f6280a) {
        }
        return eVar.invoke(obj, this);
    }

    @Override // ti.h
    public final ti.h V(ti.h hVar) {
        switch (this.f6280a) {
        }
        return yd.f.W(this, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ej.c r8, ti.c r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.e.a(ej.c, ti.c):java.lang.Object");
    }

    @Override // ti.f
    public ti.g getKey() {
        return f.f6289c;
    }

    @Override // ti.h
    public final ti.h s(ti.g gVar) {
        switch (this.f6280a) {
        }
        return yd.f.N(this, gVar);
    }

    public e(e eVar) {
        this.f6280a = 1;
        this.f6281b = eVar;
        this.f6282c = new f0.a1(1);
    }

    public e(u1 u1Var) {
        this.f6280a = 0;
        this.f6281b = u1Var;
        this.f6282c = new ak.v(9);
    }
}
