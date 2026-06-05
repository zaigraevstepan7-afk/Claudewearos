package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class r0 extends t0 {

    /* renamed from: c, reason: collision with root package name */
    public final l f13613c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f13614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, long j, l lVar) {
        super(j);
        this.f13614d = v0Var;
        this.f13613c = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws i0 {
        this.f13613c.C(this.f13614d, pi.o.f13011a);
    }

    @Override // qj.t0
    public final String toString() {
        return super.toString() + this.f13613c;
    }
}
