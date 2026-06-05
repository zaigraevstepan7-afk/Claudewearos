package rg;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class s extends x8.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zg.r f14467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q5.b f14468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r5.g f14469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f14470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z f14471f;

    public s(z zVar, zg.r rVar, q5.b bVar, r5.g gVar, ArrayList arrayList) {
        this.f14471f = zVar;
        this.f14467b = rVar;
        this.f14468c = bVar;
        this.f14469d = gVar;
        this.f14470e = arrayList;
    }

    @Override // x8.a
    public final void Y(Object obj, Object obj2) {
        zg.c cVar = (zg.c) obj;
        ug.e eVar = (ug.e) obj2;
        zg.r rVar = this.f14467b;
        zg.r rVarT = rVar != null ? rVar.t(cVar) : null;
        q5.b bVar = this.f14468c;
        q5.b bVar2 = new q5.b(5, ((h) bVar.f13235b).i(cVar), (h0) bVar.f13236c);
        r5.g gVarW = this.f14469d.w(cVar);
        if (gVarW != null) {
            this.f14470e.addAll(this.f14471f.d(gVarW, eVar, rVarT, bVar2));
        }
    }
}
