package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1.v f17248a = new f1.v(new ta.n(17));

    public static final i a(f1.i0 i0Var) {
        i0Var.b0(282942128);
        j jVar = (j) i0Var.j(f17248a);
        if (jVar == null) {
            i0Var.p(false);
            return null;
        }
        boolean zF = i0Var.f(jVar);
        Object objQ = i0Var.Q();
        if (zF || objQ == f1.m.f6385a) {
            Object iVar = new i(jVar.f17234a, jVar.f17235b, jVar.f17236c, jVar.f17237d);
            i0Var.l0(iVar);
            objQ = iVar;
        }
        i iVar2 = (i) objQ;
        i0Var.p(false);
        return iVar2;
    }
}
