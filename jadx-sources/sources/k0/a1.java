package k0;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final g3.f f9037a;

    /* renamed from: b, reason: collision with root package name */
    public final g3.n0 f9038b;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9041e;

    /* renamed from: g, reason: collision with root package name */
    public final s3.c f9043g;

    /* renamed from: h, reason: collision with root package name */
    public final k3.i f9044h;
    public ak.v j;

    /* renamed from: k, reason: collision with root package name */
    public s3.m f9046k;

    /* renamed from: c, reason: collision with root package name */
    public final int f9039c = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: d, reason: collision with root package name */
    public final int f9040d = 1;

    /* renamed from: f, reason: collision with root package name */
    public final int f9042f = 1;

    /* renamed from: i, reason: collision with root package name */
    public final List f9045i = qi.s.f13520a;

    public a1(g3.f fVar, g3.n0 n0Var, boolean z2, s3.c cVar, k3.i iVar, int i10) {
        this.f9037a = fVar;
        this.f9038b = n0Var;
        this.f9041e = z2;
        this.f9043g = cVar;
        this.f9044h = iVar;
    }

    public final void a(s3.m mVar) {
        ak.v vVar = this.j;
        if (vVar == null || mVar != this.f9046k || vVar.a()) {
            this.f9046k = mVar;
            vVar = new ak.v(this.f9037a, g3.e0.h(this.f9038b, mVar), this.f9045i, this.f9043g, this.f9044h);
        }
        this.j = vVar;
    }
}
