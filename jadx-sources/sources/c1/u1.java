package c1;

import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u1 implements l3.n {

    /* renamed from: a, reason: collision with root package name */
    public int f2736a;

    /* renamed from: b, reason: collision with root package name */
    public int f2737b;

    public /* synthetic */ u1(int i10, int i11) {
        this.f2736a = i10;
        this.f2737b = i11;
    }

    @Override // l3.n
    public int a(int i10) {
        if (i10 >= 0 && i10 <= this.f2737b) {
            k0.s.B(i10, this.f2736a, i10);
        }
        return i10;
    }

    @Override // l3.n
    public int b(int i10) {
        if (i10 >= 0 && i10 <= this.f2736a) {
            k0.s.A(i10, this.f2737b, i10);
        }
        return i10;
    }

    public void c(t6.t0 t0Var) {
        View view = t0Var.f16046a;
        this.f2736a = view.getLeft();
        this.f2737b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
