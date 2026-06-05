package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class v extends ti.a implements ti.e {

    /* renamed from: b, reason: collision with root package name */
    public static final u f13628b = new u(ti.d.f16335a, new la.a(25));

    public v() {
        super(ti.d.f16335a);
    }

    @Override // ti.a, ti.h
    public final ti.f C(ti.g gVar) {
        ti.f fVar;
        fj.l.f(gVar, "key");
        if (gVar instanceof u) {
            u uVar = (u) gVar;
            ti.g gVar2 = this.f16332a;
            if ((gVar2 == uVar || uVar.f13626b == gVar2) && (fVar = (ti.f) uVar.f13625a.invoke(this)) != null) {
                return fVar;
            }
        } else if (ti.d.f16335a == gVar) {
            return this;
        }
        return null;
    }

    public abstract void e0(ti.h hVar, Runnable runnable);

    public void f0(ti.h hVar, Runnable runnable) {
        vj.b.i(this, hVar, runnable);
    }

    public boolean g0(ti.h hVar) {
        return !(this instanceof b2);
    }

    public v h0(int i10) {
        vj.b.a(i10);
        return new vj.h(this, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((ti.f) r3.f13625a.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (ti.d.f16335a == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return ti.i.f16336a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // ti.a, ti.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ti.h s(ti.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            fj.l.f(r3, r0)
            boolean r0 = r3 instanceof qj.u
            if (r0 == 0) goto L20
            qj.u r3 = (qj.u) r3
            ti.g r0 = r2.f16332a
            if (r0 == r3) goto L15
            ti.g r1 = r3.f13626b
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            ej.c r3 = r3.f13625a
            java.lang.Object r3 = r3.invoke(r2)
            ti.f r3 = (ti.f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            ti.d r0 = ti.d.f16335a
            if (r0 != r3) goto L27
        L24:
            ti.i r3 = ti.i.f16336a
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.v.s(ti.g):ti.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.n(this);
    }
}
