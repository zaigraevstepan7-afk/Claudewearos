package p0;

import c1.s3;
import fj.v;
import t2.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f12590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0.e f12591c;

    public /* synthetic */ b(h hVar, r0.e eVar, int i10) {
        this.f12589a = i10;
        this.f12590b = hVar;
        this.f12591c = eVar;
    }

    @Override // ej.a
    public final Object a() {
        switch (this.f12589a) {
            case 0:
                h hVar = this.f12590b;
                a aVar = hVar.f12611f;
                a7.e eVar = new a7.e(this.f12591c, 26);
                v vVar = new v();
                hVar.f12610e.c("dataBuilder", aVar, new s3(18, vVar, eVar));
                Object obj = vVar.f6807a;
                if (obj != null) {
                    return (n0.c) obj;
                }
                fj.l.l("result");
                throw null;
            case 1:
                h hVar2 = this.f12590b;
                a aVar2 = hVar2.f12612g;
                b bVar = new b(hVar2, this.f12591c, 2);
                v vVar2 = new v();
                hVar2.f12610e.c("positioner", aVar2, new s3(18, vVar2, bVar));
                Object obj2 = vVar2.f6807a;
                if (obj2 != null) {
                    return (b2.c) obj2;
                }
                fj.l.l("result");
                throw null;
            default:
                Object objA = this.f12590b.f12608c.a();
                if (!((w) objA).E()) {
                    objA = null;
                }
                w wVar = (w) objA;
                return wVar == null ? b2.c.f1501e : this.f12591c.x0(wVar).i(wVar.q0(0L));
        }
    }
}
