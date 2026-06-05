package s4;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: c, reason: collision with root package name */
    public final Object f14763c;

    public c() {
        super(12);
        this.f14763c = new Object();
    }

    @Override // s4.b
    public final Object a() {
        Object objA;
        synchronized (this.f14763c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // s4.b
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f14763c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
