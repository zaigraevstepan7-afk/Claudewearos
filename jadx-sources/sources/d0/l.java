package d0;

import f0.g0;
import f0.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final k f4371b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f4372c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f4374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v1.e f4377h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4378i;
    public final /* synthetic */ int j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f4379k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f4380l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j, k kVar, g0 g0Var, int i10, int i11, v1.e eVar, int i12, int i13, long j4, u uVar) {
        super(0);
        this.f4374e = g0Var;
        this.f4375f = i10;
        this.f4376g = i11;
        this.f4377h = eVar;
        this.f4378i = i12;
        this.j = i13;
        this.f4379k = j4;
        this.f4380l = uVar;
        this.f4371b = kVar;
        this.f4372c = g0Var;
        this.f4373d = s3.b.b(0, s3.a.h(j), 0, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 5);
    }

    public final p t(int i10, long j) {
        k kVar = this.f4371b;
        Object objB = kVar.b(i10);
        Object objJ = kVar.f4368b.j(i10);
        return new p(i10, i(this.f4372c, i10, j), this.f4377h, this.f4374e.f6142b.getLayoutDirection(), this.f4378i, this.j, i10 == this.f4375f + (-1) ? 0 : this.f4376g, this.f4379k, objB, objJ, this.f4380l.f4452n, j);
    }
}
