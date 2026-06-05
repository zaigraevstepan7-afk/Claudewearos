package f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f6422a;

    public q1(ej.a aVar) {
        this.f6422a = new s0(aVar);
    }

    public abstract r1 a(Object obj);

    public u2 b() {
        return this.f6422a;
    }

    public final r1 c(Object obj) {
        return a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u2 d(r1 r1Var, u2 u2Var) {
        c0 c0Var = null;
        if (u2Var instanceof c0) {
            if (r1Var.f6435b) {
                c0Var = (c0) u2Var;
                c0Var.f6275a.setValue(r1Var.b());
            }
        } else if (u2Var instanceof s2) {
            if ((r1Var.f6434a || r1Var.f6439f != null) && !r1Var.f6435b) {
                s2 s2Var = (s2) u2Var;
                if (fj.l.b(r1Var.b(), s2Var.f6448a)) {
                    c0Var = s2Var;
                }
            }
        } else if (u2Var instanceof w) {
            r1Var.getClass();
        }
        if (c0Var != null) {
            return c0Var;
        }
        if (!r1Var.f6435b) {
            return new s2(r1Var.b());
        }
        Object obj = r1Var.f6439f;
        n2 n2Var = (n2) r1Var.f6438e;
        if (n2Var == null) {
            n2Var = f.f6293z;
        }
        return new c0(new j1(obj, n2Var));
    }
}
