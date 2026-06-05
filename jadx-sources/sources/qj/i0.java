package qj;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class i0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f13584a;

    public i0(Throwable th2, v vVar, ti.h hVar) {
        super("Coroutine dispatcher " + vVar + " threw an exception, context = " + hVar, th2);
        this.f13584a = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f13584a;
    }
}
