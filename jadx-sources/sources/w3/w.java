package w3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w extends fj.m implements ej.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fj.u f18546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f18547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s3.k f18548c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f18550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(fj.u uVar, x xVar, s3.k kVar, long j, long j4) {
        super(0);
        this.f18546a = uVar;
        this.f18547b = xVar;
        this.f18548c = kVar;
        this.f18549d = j;
        this.f18550e = j4;
    }

    @Override // ej.a
    public final Object a() {
        x xVar = this.f18547b;
        this.f18546a.f6806a = xVar.getPositionProvider().d(this.f18548c, this.f18549d, xVar.getParentLayoutDirection(), this.f18550e);
        return pi.o.f13011a;
    }
}
