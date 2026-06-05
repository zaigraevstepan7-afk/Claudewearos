package qb;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import b2.e;
import c2.n;
import c2.u;
import f1.c2;
import f1.j1;
import f1.s;
import fj.l;
import pi.m;
import q0.k;
import u6.v;
import v2.h0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends h2.b implements c2 {
    public final j1 A;
    public final m B;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f13333f;

    /* renamed from: z, reason: collision with root package name */
    public final j1 f13334z;

    public b(Drawable drawable) {
        l.f(drawable, "drawable");
        this.f13333f = drawable;
        this.f13334z = s.A(0);
        this.A = s.A(new e(c.a(drawable)));
        this.B = v.Q(new k(this, 2));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // f1.c2
    public final void a() {
        c();
    }

    @Override // h2.b
    public final boolean b(float f10) {
        this.f13333f.setAlpha(cg.b.p(hj.a.H(f10 * 255), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f1.c2
    public final void c() {
        Drawable drawable = this.f13333f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f1.c2
    public final void d() {
        Drawable.Callback callback = (Drawable.Callback) this.B.getValue();
        Drawable drawable = this.f13333f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // h2.b
    public final boolean e(n nVar) {
        this.f13333f.setColorFilter(nVar != null ? nVar.f3019a : null);
        return true;
    }

    @Override // h2.b
    public final void f(s3.m mVar) {
        int i10;
        l.f(mVar, "layoutDirection");
        int iOrdinal = mVar.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new b3.e();
            }
        } else {
            i10 = 0;
        }
        this.f13333f.setLayoutDirection(i10);
    }

    @Override // h2.b
    public final long h() {
        return ((e) this.A.getValue()).f1514a;
    }

    @Override // h2.b
    public final void i(h0 h0Var) {
        e2.b bVar = h0Var.f17669a;
        u uVarH = bVar.f5738b.h();
        ((Number) this.f13334z.getValue()).intValue();
        try {
            uVarH.f();
            int i10 = Build.VERSION.SDK_INT;
            Drawable drawable = this.f13333f;
            if (i10 < 28 || i10 >= 31 || !p7.e.w(drawable)) {
                drawable.setBounds(0, 0, hj.a.H(e.e(bVar.a())), hj.a.H(e.b(bVar.a())));
            } else {
                uVarH.b(e.e(bVar.a()) / e.e(h()), e.b(bVar.a()) / e.b(h()));
            }
            drawable.draw(c2.c.a(uVarH));
            uVarH.q();
        } catch (Throwable th2) {
            uVarH.q();
            throw th2;
        }
    }
}
