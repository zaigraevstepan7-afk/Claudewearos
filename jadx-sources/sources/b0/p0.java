package b0;

import android.os.Build;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 extends androidx.datastore.preferences.protobuf.j implements Runnable, t4.m, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final f2 f1388c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1389d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1390e;

    /* renamed from: f, reason: collision with root package name */
    public t4.m1 f1391f;

    public p0(f2 f2Var) {
        super(!f2Var.f1330t ? 1 : 0);
        this.f1388c = f2Var;
    }

    @Override // t4.m
    public final t4.m1 i(View view, t4.m1 m1Var) {
        this.f1391f = m1Var;
        f2 f2Var = this.f1388c;
        c2 c2Var = f2Var.f1328r;
        t4.j1 j1Var = m1Var.f15751a;
        c2Var.f(d.y(j1Var.g(8)));
        if (this.f1389d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f1390e) {
            f2Var.f1329s.f(d.y(j1Var.g(8)));
            f2.b(f2Var, m1Var);
        }
        return f2Var.f1330t ? t4.m1.f15750b : m1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void k(t4.v0 v0Var) {
        this.f1389d = false;
        this.f1390e = false;
        t4.m1 m1Var = this.f1391f;
        if (v0Var.f15784a.b() > 0 && m1Var != null) {
            t4.j1 j1Var = m1Var.f15751a;
            f2 f2Var = this.f1388c;
            f2Var.f1329s.f(d.y(j1Var.g(8)));
            f2Var.f1328r.f(d.y(j1Var.g(8)));
            f2.b(f2Var, m1Var);
        }
        this.f1391f = null;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void l(t4.v0 v0Var) {
        this.f1389d = true;
        this.f1390e = true;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final t4.m1 m(t4.m1 m1Var, List list) {
        f2 f2Var = this.f1388c;
        f2.b(f2Var, m1Var);
        return f2Var.f1330t ? t4.m1.f15750b : m1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final q5.b n(t4.v0 v0Var, q5.b bVar) {
        this.f1389d = false;
        return bVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1389d) {
            this.f1389d = false;
            this.f1390e = false;
            t4.m1 m1Var = this.f1391f;
            if (m1Var != null) {
                f2 f2Var = this.f1388c;
                f2Var.f1329s.f(d.y(m1Var.f15751a.g(8)));
                f2.b(f2Var, m1Var);
                this.f1391f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
