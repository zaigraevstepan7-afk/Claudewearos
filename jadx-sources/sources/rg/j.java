package rg;

import android.os.Handler;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j implements pg.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f14427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ug.k f14429c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f14430d;

    public j(k kVar, h hVar, long j, ug.k kVar2) {
        this.f14430d = kVar;
        this.f14427a = hVar;
        this.f14428b = j;
        this.f14429c = kVar2;
    }

    @Override // pg.s
    public final void b(String str, String str2) {
        mg.b bVarA = str != null ? mg.b.a(str, str2) : null;
        k kVar = this.f14430d;
        h hVar = this.f14427a;
        k.b(kVar, "setValue", hVar, bVarA);
        k.c(kVar, this.f14428b, hVar, bVarA);
        ug.k kVar2 = this.f14429c;
        if (kVar2 != null) {
            zg.c cVarY = hVar.y();
            ((Handler) kVar.f14438h.f14396b.f5001a).post(new a8.e(kVar2, bVarA, (cVarY == null || !cVarY.equals(zg.c.f20591d)) ? new mg.d(kVar, hVar) : new mg.d(kVar, hVar.A())));
        }
    }
}
