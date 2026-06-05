package v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements w3.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.c f17416a;

    /* renamed from: b, reason: collision with root package name */
    public final m f17417b;

    /* renamed from: c, reason: collision with root package name */
    public long f17418c = 0;

    public l(v1.c cVar, m mVar) {
        this.f17416a = cVar;
        this.f17417b = mVar;
    }

    @Override // w3.c0
    public final long d(s3.k kVar, long j, s3.m mVar, long j4) {
        long jA = this.f17417b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.f17418c;
        }
        this.f17418c = jA;
        return s3.j.c(s3.j.c(kVar.b(), yd.f.d0(jA)), this.f17416a.a(j4, 0L, mVar));
    }
}
