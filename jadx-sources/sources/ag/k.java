package ag;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f450b = new k(new h9.a(1));

    /* renamed from: c, reason: collision with root package name */
    public static final k f451c = new k(new y9.a());

    /* renamed from: a, reason: collision with root package name */
    public final j f452a;

    static {
        new k(new h9.a(2));
        new k(new ef.f());
        new k(new lh.e());
        int i10 = 1;
        new k(new x9.b(i10));
        new k(new p9.a(i10));
    }

    public k(l lVar) {
        if (rf.a.a()) {
            this.f452a = new yh.c(lVar, 1);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f452a = new i(lVar, 0);
        } else {
            this.f452a = new p7.k(lVar, 1);
        }
    }
}
