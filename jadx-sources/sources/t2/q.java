package t2;

import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q extends androidx.datastore.preferences.protobuf.j implements Runnable, t4.m, View.OnAttachStateChangeListener {
    public final q.b0 A;
    public final t1.q B;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15627c;

    /* renamed from: d, reason: collision with root package name */
    public int f15628d;

    /* renamed from: e, reason: collision with root package name */
    public t4.m1 f15629e;

    /* renamed from: f, reason: collision with root package name */
    public final q.g0 f15630f;

    /* renamed from: z, reason: collision with root package name */
    public final f1.g1 f15631z;

    public q() {
        super(1);
        q.g0 g0Var = new q.g0(9);
        v1.f15662a.getClass();
        g0Var.m(u1.f15651b, new y1("caption bar"));
        g0Var.m(u1.f15652c, new y1("display cutout"));
        g0Var.m(u1.f15653d, new y1("ime"));
        g0Var.m(u1.f15654e, new y1("mandatory system gestures"));
        g0Var.m(u1.f15655f, new y1("navigation bars"));
        g0Var.m(u1.f15656g, new y1("status bars"));
        g0Var.m(u1.f15657h, new y1("system gestures"));
        g0Var.m(u1.f15658i, new y1("tappable element"));
        g0Var.m(u1.j, new y1("waterfall"));
        this.f15630f = g0Var;
        this.f15631z = new f1.g1(0);
        this.A = new q.b0(4);
        this.B = new t1.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(t4.m1 r28) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.q.M(t4.m1):void");
    }

    @Override // t4.m
    public final t4.m1 i(View view, t4.m1 m1Var) {
        if (this.f15627c) {
            this.f15629e = m1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return m1Var;
            }
        } else if (this.f15628d == 0) {
            M(m1Var);
        }
        return m1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void k(t4.v0 v0Var) {
        boolean z2 = false;
        this.f15627c = false;
        int iD = v0Var.f15784a.d();
        this.f15628d &= ~iD;
        this.f15629e = null;
        v1 v1Var = (v1) x1.f15670a.b(iD);
        if (v1Var != null) {
            Object objG = this.f15630f.g(v1Var);
            fj.l.c(objG);
            y1 y1Var = (y1) objG;
            y1Var.f15675c.h(0.0f);
            y1Var.f15677e.h(1.0f);
            y1Var.f15676d.h(0L);
            y1Var.f15675c.h(0.0f);
            y1Var.f15674b.setValue(Boolean.FALSE);
            y1Var.j = -1L;
            y1Var.f15682k = -1L;
            f1.g1 g1Var = this.f15631z;
            g1Var.h(g1Var.g() + 1);
            synchronized (t1.m.f15471c) {
                q.h0 h0Var = t1.m.j.f15411h;
                if (h0Var != null) {
                    if (h0Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                t1.m.a();
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void l(t4.v0 v0Var) {
        this.f15627c = true;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final t4.m1 m(t4.m1 m1Var, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            t4.v0 v0Var = (t4.v0) list.get(i10);
            v1 v1Var = (v1) x1.f15670a.b(v0Var.f15784a.d());
            if (v1Var != null) {
                Object objG = this.f15630f.g(v1Var);
                fj.l.c(objG);
                y1 y1Var = (y1) objG;
                if (((Boolean) y1Var.f15674b.getValue()).booleanValue()) {
                    t4.u0 u0Var = v0Var.f15784a;
                    y1Var.f15675c.h(u0Var.c());
                    y1Var.f15677e.h(u0Var.a());
                    y1Var.f15676d.h(u0Var.b());
                }
            }
        }
        M(m1Var);
        return m1Var;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final q5.b n(t4.v0 v0Var, q5.b bVar) {
        t4.m1 m1Var = this.f15629e;
        boolean z2 = false;
        this.f15627c = false;
        this.f15629e = null;
        if (v0Var.f15784a.b() > 0 && m1Var != null) {
            int iD = v0Var.f15784a.d();
            this.f15628d |= iD;
            v1 v1Var = (v1) x1.f15670a.b(iD);
            if (v1Var != null) {
                Object objG = this.f15630f.g(v1Var);
                fj.l.c(objG);
                y1 y1Var = (y1) objG;
                l4.b bVarG = m1Var.f15751a.g(iD);
                long j = (bVarG.f9967a << 48) | (bVarG.f9968b << 32) | (bVarG.f9969c << 16) | bVarG.f9970d;
                long j4 = y1Var.f15680h;
                if (!z.g(j, j4)) {
                    y1Var.j = j4;
                    y1Var.f15682k = j;
                    y1Var.f15674b.setValue(Boolean.TRUE);
                    t4.u0 u0Var = v0Var.f15784a;
                    y1Var.f15675c.h(u0Var.c());
                    y1Var.f15677e.h(u0Var.a());
                    y1Var.f15676d.h(u0Var.b());
                    f1.g1 g1Var = this.f15631z;
                    g1Var.h(g1Var.g() + 1);
                    synchronized (t1.m.f15471c) {
                        q.h0 h0Var = t1.m.j.f15411h;
                        if (h0Var != null) {
                            if (h0Var.h()) {
                                z2 = true;
                            }
                        }
                    }
                    if (z2) {
                        t1.m.a();
                        return bVar;
                    }
                }
            }
        }
        return bVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = t4.l0.f15744a;
        t4.d0.i(view, this);
        t4.l0.n(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        Field field = t4.l0.f15744a;
        t4.d0.i(view, null);
        t4.l0.n(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15627c) {
            this.f15628d = 0;
            this.f15627c = false;
            t4.m1 m1Var = this.f15629e;
            if (m1Var != null) {
                M(m1Var);
                this.f15629e = null;
            }
        }
    }
}
