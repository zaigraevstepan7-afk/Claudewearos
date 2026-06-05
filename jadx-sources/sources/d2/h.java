package d2;

import q.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final v f4661a;

    static {
        q qVar = d.f4634e;
        int i10 = qVar.f4629c;
        e eVar = new e(qVar, qVar, 1);
        int i11 = qVar.f4629c;
        l lVar = d.f4652x;
        int i12 = (lVar.f4629c << 6) | i11;
        g gVar = new g(qVar, lVar, 0);
        int i13 = (i11 << 6) | lVar.f4629c;
        g gVar2 = new g(lVar, qVar, 0);
        v vVar = q.l.f13102a;
        v vVar2 = new v();
        vVar2.i(i10 | (i10 << 6), eVar);
        vVar2.i(i12, gVar);
        vVar2.i(i13, gVar2);
        f4661a = vVar2;
    }
}
