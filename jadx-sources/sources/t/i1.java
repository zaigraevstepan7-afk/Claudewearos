package t;

import f1.q2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i1 implements q2 {
    public final f1.j1 A;
    public p B;
    public final f1.h1 C;
    public boolean D;
    public final u0 E;
    public final /* synthetic */ j1 F;

    /* renamed from: a, reason: collision with root package name */
    public final p1 f15191a;

    /* renamed from: b, reason: collision with root package name */
    public final f1.j1 f15192b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.j1 f15193c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.j1 f15194d;

    /* renamed from: e, reason: collision with root package name */
    public final f1.j1 f15195e;

    /* renamed from: f, reason: collision with root package name */
    public final f1.f1 f15196f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f15197z;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public i1(j1 j1Var, Object obj, p pVar, p1 p1Var) {
        this.F = j1Var;
        this.f15191a = p1Var;
        f1.j1 j1VarA = f1.s.A(obj);
        this.f15192b = j1VarA;
        Object objInvoke = null;
        f1.j1 j1VarA2 = f1.s.A(d.s(0.0f, 0.0f, null, 7));
        this.f15193c = j1VarA2;
        this.f15194d = f1.s.A(new c1((z) j1VarA2.getValue(), p1Var, obj, j1VarA.getValue(), pVar));
        this.f15195e = f1.s.A(Boolean.TRUE);
        this.f15196f = new f1.f1(-1.0f);
        this.A = f1.s.A(obj);
        this.B = pVar;
        this.C = new f1.h1(b().b());
        Float f10 = (Float) y1.f15332a.get(p1Var);
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            p pVar2 = (p) p1Var.f15249a.invoke(obj);
            int iB = pVar2.b();
            for (int i10 = 0; i10 < iB; i10++) {
                pVar2.e(fFloatValue, i10);
            }
            objInvoke = this.f15191a.f15250b.invoke(pVar2);
        }
        this.E = d.s(0.0f, 0.0f, objInvoke, 3);
    }

    public final c1 b() {
        return (c1) this.f15194d.getValue();
    }

    public final void d() {
        if (this.f15196f.g() == -1.0f) {
            this.D = true;
            boolean zB = fj.l.b(b().f15121c, b().f15122d);
            f1.j1 j1Var = this.A;
            if (zB) {
                j1Var.setValue(b().f15121c);
            } else {
                j1Var.setValue(b().f(0L));
                this.B = b().d(0L);
            }
        }
    }

    public final void e(Object obj, boolean z2) {
        j1 j1Var = this.F;
        f1.j1 j1Var2 = j1Var.f15207h;
        f1.j1 j1Var3 = this.f15192b;
        boolean zB = fj.l.b(null, j1Var3.getValue());
        f1.h1 h1Var = this.C;
        f1.j1 j1Var4 = this.f15194d;
        z zVar = this.E;
        if (zB) {
            j1Var4.setValue(new c1(zVar, this.f15191a, obj, obj, this.B.c()));
            this.f15197z = true;
            h1Var.h(b().b());
            return;
        }
        f1.j1 j1Var5 = this.f15193c;
        if (!z2 || this.D || (((z) j1Var5.getValue()) instanceof u0)) {
            zVar = (z) j1Var5.getValue();
        }
        j1Var4.setValue(new c1(j1Var.e() <= 0 ? zVar : new v0(zVar, j1Var.e()), this.f15191a, obj, j1Var3.getValue(), this.B));
        h1Var.h(b().b());
        this.f15197z = false;
        j1Var2.setValue(Boolean.TRUE);
        if (j1Var.g()) {
            t1.q qVar = j1Var.f15208i;
            int size = qVar.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                i1 i1Var = (i1) qVar.get(i10);
                jMax = Math.max(jMax, i1Var.C.g());
                i1Var.d();
            }
            j1Var2.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, z zVar) {
        this.f15192b.setValue(obj2);
        this.f15193c.setValue(zVar);
        if (fj.l.b(b().f15122d, obj) && fj.l.b(b().f15121c, obj2)) {
            return;
        }
        e(obj, false);
    }

    public final void g(Object obj, z zVar) {
        if (this.f15197z && fj.l.b(obj, null)) {
            return;
        }
        f1.j1 j1Var = this.f15192b;
        boolean zB = fj.l.b(j1Var.getValue(), obj);
        f1.f1 f1Var = this.f15196f;
        if (zB && f1Var.g() == -1.0f) {
            return;
        }
        j1Var.setValue(obj);
        this.f15193c.setValue(zVar);
        float fG = f1Var.g();
        f1.j1 j1Var2 = this.A;
        Object value = fG == -3.0f ? obj : j1Var2.getValue();
        f1.j1 j1Var3 = this.f15195e;
        e(value, !((Boolean) j1Var3.getValue()).booleanValue());
        j1Var3.setValue(Boolean.valueOf(f1Var.g() == -3.0f));
        if (f1Var.g() >= 0.0f) {
            j1Var2.setValue(b().f((long) (f1Var.g() * b().b())));
        } else if (f1Var.g() == -3.0f) {
            j1Var2.setValue(obj);
        }
        this.f15197z = false;
        f1Var.h(-1.0f);
    }

    @Override // f1.q2
    public final Object getValue() {
        return this.A.getValue();
    }

    public final String toString() {
        return "current value: " + this.A.getValue() + ", target: " + this.f15192b.getValue() + ", spec: " + ((z) this.f15193c.getValue());
    }
}
