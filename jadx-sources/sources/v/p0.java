package v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p0 implements c2.w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f17255b = new p0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final p0 f17256c = new p0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17257a;

    public /* synthetic */ p0(int i10) {
        this.f17257a = i10;
    }

    @Override // c2.w0
    public final c2.e0 b(long j, s3.m mVar, s3.c cVar) {
        switch (this.f17257a) {
            case 0:
                float fI0 = cVar.I0(z.f17337a);
                return new c2.m0(new b2.c(0.0f, -fI0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fI0));
            default:
                float fI02 = cVar.I0(z.f17337a);
                return new c2.m0(new b2.c(-fI02, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fI02, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
