package k3;

import com.google.android.gms.internal.ads.zzbch;
import k0.t1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final a f9380a;

    /* renamed from: b, reason: collision with root package name */
    public final b f9381b;

    /* renamed from: c, reason: collision with root package name */
    public final mh.g f9382c;

    /* renamed from: d, reason: collision with root package name */
    public final n f9383d;

    /* renamed from: e, reason: collision with root package name */
    public final d8.e f9384e;

    /* renamed from: f, reason: collision with root package name */
    public final ab.k f9385f;

    public k(a aVar, b bVar) {
        mh.g gVar = l.f9386a;
        n nVar = new n(l.f9387b);
        d8.e eVar = new d8.e(11);
        this.f9380a = aVar;
        this.f9381b = bVar;
        this.f9382c = gVar;
        this.f9383d = nVar;
        this.f9384e = eVar;
        this.f9385f = new ab.k(this, 22);
    }

    public final e0 a(b0 b0Var) {
        mh.g gVar = this.f9382c;
        t1 t1Var = new t1(3, this, b0Var);
        synchronized (((ef.f) gVar.f11707b)) {
            e0 e0Var = (e0) ((q.r) gVar.f11708c).get(b0Var);
            if (e0Var != null) {
                if (e0Var.a()) {
                    return e0Var;
                }
            }
            try {
                e0 e0Var2 = (e0) t1Var.invoke(new t1(4, gVar, b0Var));
                synchronized (((ef.f) gVar.f11707b)) {
                    if (((q.r) gVar.f11708c).get(b0Var) == null && e0Var2.a()) {
                        ((q.r) gVar.f11708c).put(b0Var, e0Var2);
                    }
                }
                return e0Var2;
            } catch (Exception e10) {
                throw new IllegalStateException("Could not load font", e10);
            }
        }
    }

    public final e0 b(j jVar, s sVar, int i10, int i11) {
        b bVar = this.f9381b;
        bVar.getClass();
        int i12 = bVar.f9354a;
        s sVar2 = (i12 == 0 || i12 == Integer.MAX_VALUE) ? sVar : new s(cg.b.p(sVar.f9401a + i12, 1, zzbch.zzq.zzf));
        this.f9380a.getClass();
        return a(new b0(jVar, sVar2, i10, i11, null));
    }
}
