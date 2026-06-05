package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 implements t {
    public static final g0 B = new g0();

    /* renamed from: a, reason: collision with root package name */
    public int f1083a;

    /* renamed from: b, reason: collision with root package name */
    public int f1084b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1087e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1085c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1086d = true;

    /* renamed from: f, reason: collision with root package name */
    public final v f1088f = new v(this, true);

    /* renamed from: z, reason: collision with root package name */
    public final ac.o f1089z = new ac.o(this, 2);
    public final ld.i A = new ld.i(this, 3);

    public final void b() {
        int i10 = this.f1084b + 1;
        this.f1084b = i10;
        if (i10 == 1) {
            if (this.f1085c) {
                this.f1088f.d(n.ON_RESUME);
                this.f1085c = false;
            } else {
                Handler handler = this.f1087e;
                fj.l.c(handler);
                handler.removeCallbacks(this.f1089z);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final v h() {
        return this.f1088f;
    }
}
