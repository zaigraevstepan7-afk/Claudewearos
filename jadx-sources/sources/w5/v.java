package w5;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends u1.b implements b1, c.d0, g.g, a7.f, l0 {
    public final /* synthetic */ w A;

    /* renamed from: d, reason: collision with root package name */
    public final w f18776d;

    /* renamed from: e, reason: collision with root package name */
    public final w f18777e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f18778f;

    /* renamed from: z, reason: collision with root package name */
    public final i0 f18779z;

    public v(w wVar) {
        this.A = wVar;
        Handler handler = new Handler();
        this.f18776d = wVar;
        this.f18777e = wVar;
        this.f18778f = handler;
        this.f18779z = new i0();
    }

    @Override // c.d0
    public final c.b0 a() {
        return this.A.a();
    }

    @Override // g.g
    public final c.l d() {
        return this.A.B;
    }

    @Override // androidx.lifecycle.b1
    public final a1 e() {
        return this.A.e();
    }

    @Override // a7.f
    public final mh.g g() {
        return (mh.g) this.A.f1843d.f15364c;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v h() {
        return this.A.N;
    }

    @Override // u1.b
    public final View t(int i10) {
        return this.A.findViewById(i10);
    }

    @Override // u1.b
    public final boolean u() {
        Window window = this.A.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // w5.l0
    public final void b() {
    }
}
