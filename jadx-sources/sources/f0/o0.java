package f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final ej.c f6176a;

    /* renamed from: c, reason: collision with root package name */
    public a1 f6178c;

    /* renamed from: f, reason: collision with root package name */
    public int f6181f;

    /* renamed from: b, reason: collision with root package name */
    public final ac.d f6177b = new ac.d(10);

    /* renamed from: d, reason: collision with root package name */
    public int f6179d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f6180e = -1;

    public o0(ej.c cVar) {
        this.f6176a = cVar;
    }

    public final n0 a(int i10, long j, boolean z2, ej.c cVar) {
        a1 a1Var = this.f6178c;
        if (a1Var == null) {
            return k.f6155a;
        }
        b1 b1Var = (b1) a1Var.f6107d;
        boolean z10 = b1Var instanceof b;
        z0 z0Var = new z0(a1Var, i10, this.f6177b, cVar);
        z0Var.f6229d = new s3.a(j);
        if (!z10) {
            b1Var.a(z0Var);
        } else if (z2) {
            b bVar = (b) b1Var;
            bVar.f6109b.add(new e1(1, z0Var));
            if (!bVar.f6110c) {
                bVar.f6110c = true;
                bVar.f6108a.post(bVar);
            }
        } else {
            b bVar2 = (b) b1Var;
            bVar2.f6109b.add(new e1(0, z0Var));
            if (!bVar2.f6110c) {
                bVar2.f6110c = true;
                bVar2.f6108a.post(bVar2);
            }
        }
        u3.a.o(i10, "compose:lazy:schedule_prefetch:index");
        return z0Var;
    }
}
