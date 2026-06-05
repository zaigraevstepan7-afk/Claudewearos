package t2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final q.v f15670a;

    /* renamed from: b, reason: collision with root package name */
    public static final v1[] f15671b;

    static {
        q.v vVar = new q.v(8);
        v1.f15662a.getClass();
        w1 w1Var = u1.f15656g;
        vVar.i(1, w1Var);
        w1 w1Var2 = u1.f15655f;
        vVar.i(2, w1Var2);
        w1 w1Var3 = u1.f15651b;
        vVar.i(4, w1Var3);
        w1 w1Var4 = u1.f15653d;
        vVar.i(8, w1Var4);
        w1 w1Var5 = u1.f15657h;
        vVar.i(16, w1Var5);
        w1 w1Var6 = u1.f15654e;
        vVar.i(32, w1Var6);
        w1 w1Var7 = u1.f15658i;
        vVar.i(64, w1Var7);
        w1 w1Var8 = u1.f15652c;
        vVar.i(128, w1Var8);
        f15670a = vVar;
        f15671b = new v1[]{w1Var, w1Var2, w1Var3, w1Var7, w1Var5, w1Var6, w1Var4, u1.j, w1Var8};
    }

    public static final void a(v2.k0 k0Var, p pVar, long j, int i10, int i11) {
        if (z.g(j, -1L)) {
            return;
        }
        k0Var.f(pVar.b(), (int) ((j >>> 48) & 65535));
        k0Var.f(pVar.d(), (int) ((j >>> 32) & 65535));
        k0Var.f(pVar.c(), i10 - ((int) ((j >>> 16) & 65535)));
        k0Var.f(pVar.a(), i11 - ((int) (j & 65535)));
    }
}
