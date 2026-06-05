package p0;

import w3.c0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final p7.k f12627a;

    /* renamed from: b, reason: collision with root package name */
    public s3.l f12628b;

    /* renamed from: c, reason: collision with root package name */
    public s3.m f12629c;

    /* renamed from: d, reason: collision with root package name */
    public s3.l f12630d;

    /* renamed from: e, reason: collision with root package name */
    public s3.j f12631e;

    public n(p7.k kVar) {
        this.f12627a = kVar;
    }

    @Override // w3.c0
    public final long d(s3.k kVar, long j, s3.m mVar, long j4) {
        s3.j jVar = this.f12631e;
        if (jVar != null) {
            s3.l lVar = this.f12628b;
            if ((lVar == null ? false : s3.l.b(lVar.f14751a, j)) && this.f12629c == mVar) {
                s3.l lVar2 = this.f12630d;
                if (lVar2 != null ? s3.l.b(lVar2.f14751a, j4) : false) {
                    return jVar.f14745a;
                }
            }
        }
        long jD = this.f12627a.d(kVar, j, mVar, j4);
        this.f12628b = new s3.l(j);
        this.f12629c = mVar;
        this.f12630d = new s3.l(j4);
        this.f12631e = new s3.j(jD);
        return jD;
    }
}
