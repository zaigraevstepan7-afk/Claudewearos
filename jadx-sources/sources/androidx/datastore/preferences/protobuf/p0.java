package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f993a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f994b;

    /* renamed from: c, reason: collision with root package name */
    public final p f995c;

    public p0(f1 f1Var, p pVar, a aVar) {
        this.f994b = f1Var;
        pVar.getClass();
        this.f995c = pVar;
        this.f993a = aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void a(Object obj, Object obj2) {
        y0.k(this.f994b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void b(Object obj) {
        this.f994b.getClass();
        e1 e1Var = ((w) obj).unknownFields;
        if (e1Var.f923e) {
            e1Var.f923e = false;
        }
        this.f995c.getClass();
        m6.a.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean c(Object obj) {
        this.f995c.getClass();
        m6.a.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final w d() {
        a aVar = this.f993a;
        return aVar instanceof w ? ((w) aVar).i() : ((u) ((w) aVar).c(5)).b();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void e(Object obj, g0 g0Var) {
        this.f995c.getClass();
        m6.a.q(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final int f(w wVar) {
        this.f994b.getClass();
        e1 e1Var = wVar.unknownFields;
        int i10 = e1Var.f922d;
        if (i10 != -1) {
            return i10;
        }
        int iA0 = 0;
        for (int i11 = 0; i11 < e1Var.f919a; i11++) {
            int i12 = e1Var.f920b[i11] >>> 3;
            iA0 += m.a0(3, (g) e1Var.f921c[i11]) + m.d0(i12) + m.c0(2) + (m.c0(1) * 2);
        }
        e1Var.f922d = iA0;
        return iA0;
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final int g(w wVar) {
        this.f994b.getClass();
        return wVar.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final boolean h(w wVar, w wVar2) {
        this.f994b.getClass();
        return wVar.unknownFields.equals(wVar2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.x0
    public final void i(Object obj, k kVar, o oVar) {
        this.f994b.getClass();
        f1.a(obj);
        this.f995c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
