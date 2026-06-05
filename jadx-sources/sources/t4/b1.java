package t4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f15696a;

    /* renamed from: b, reason: collision with root package name */
    public l4.b[] f15697b;

    public b1() {
        this(new m1((m1) null));
    }

    public final void a() {
        l4.b[] bVarArr = this.f15697b;
        if (bVarArr != null) {
            l4.b bVarG = bVarArr[0];
            l4.b bVarG2 = bVarArr[1];
            m1 m1Var = this.f15696a;
            if (bVarG2 == null) {
                bVarG2 = m1Var.f15751a.g(2);
            }
            if (bVarG == null) {
                bVarG = m1Var.f15751a.g(1);
            }
            g(l4.b.a(bVarG, bVarG2));
            l4.b bVar = this.f15697b[x8.a.J(16)];
            if (bVar != null) {
                f(bVar);
            }
            l4.b bVar2 = this.f15697b[x8.a.J(32)];
            if (bVar2 != null) {
                d(bVar2);
            }
            l4.b bVar3 = this.f15697b[x8.a.J(64)];
            if (bVar3 != null) {
                h(bVar3);
            }
        }
    }

    public abstract m1 b();

    public void c(int i10, l4.b bVar) {
        if (this.f15697b == null) {
            this.f15697b = new l4.b[10];
        }
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                this.f15697b[x8.a.J(i11)] = bVar;
            }
        }
    }

    public abstract void e(l4.b bVar);

    public abstract void g(l4.b bVar);

    public b1(m1 m1Var) {
        this.f15696a = m1Var;
    }

    public void d(l4.b bVar) {
    }

    public void f(l4.b bVar) {
    }

    public void h(l4.b bVar) {
    }
}
