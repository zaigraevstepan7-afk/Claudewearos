package r5;

import android.graphics.Rect;
import android.view.View;
import t6.e0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f13730a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13731b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13732c;

    public /* synthetic */ g(int i10, Object obj, Comparable comparable) {
        this.f13730a = i10;
        this.f13731b = obj;
        this.f13732c = comparable;
    }

    public static g b(e0 e0Var, int i10) {
        if (i10 == 0) {
            return new t6.u(e0Var, 0);
        }
        if (i10 == 1) {
            return new t6.u(e0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void a(e7.a aVar);

    public abstract void c(e7.a aVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i10);

    public abstract void r(e7.a aVar);

    public abstract void s(e7.a aVar);

    public abstract void t(e7.a aVar);

    public abstract void u(e7.a aVar);

    public abstract u6.x v(e7.a aVar);

    public abstract g w(zg.c cVar);

    public g(e0 e0Var) {
        this.f13730a = Integer.MIN_VALUE;
        this.f13732c = new Rect();
        this.f13731b = e0Var;
    }

    public g(j jVar) {
        this.f13730a = 0;
        this.f13732c = new d();
        this.f13731b = jVar;
    }
}
