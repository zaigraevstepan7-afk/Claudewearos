package t4;

import android.view.WindowInsets;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class f1 extends e1 {

    /* renamed from: o, reason: collision with root package name */
    public l4.b f15719o;

    /* renamed from: p, reason: collision with root package name */
    public l4.b f15720p;

    /* renamed from: q, reason: collision with root package name */
    public l4.b f15721q;

    public f1(m1 m1Var, WindowInsets windowInsets) {
        super(m1Var, windowInsets);
        this.f15719o = null;
        this.f15720p = null;
        this.f15721q = null;
    }

    @Override // t4.j1
    public l4.b i() {
        if (this.f15720p == null) {
            this.f15720p = l4.b.d(this.f15705c.getMandatorySystemGestureInsets());
        }
        return this.f15720p;
    }

    @Override // t4.j1
    public l4.b k() {
        if (this.f15719o == null) {
            this.f15719o = l4.b.d(this.f15705c.getSystemGestureInsets());
        }
        return this.f15719o;
    }

    @Override // t4.j1
    public l4.b m() {
        if (this.f15721q == null) {
            this.f15721q = l4.b.d(this.f15705c.getTappableElementInsets());
        }
        return this.f15721q;
    }

    @Override // t4.c1, t4.j1
    public m1 n(int i10, int i11, int i12, int i13) {
        return m1.d(null, this.f15705c.inset(i10, i11, i12, i13));
    }

    public f1(m1 m1Var, f1 f1Var) {
        super(m1Var, f1Var);
        this.f15719o = null;
        this.f15720p = null;
        this.f15721q = null;
    }

    @Override // t4.d1, t4.j1
    public void u(l4.b bVar) {
    }
}
