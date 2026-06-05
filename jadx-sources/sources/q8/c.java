package q8;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final q2.b f13297a;

    /* renamed from: b, reason: collision with root package name */
    public final k4.d f13298b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13299c = new Object();

    public c(q2.b bVar, k4.d dVar) {
        this.f13297a = bVar;
        this.f13298b = dVar;
    }

    public final void a(long j) {
        synchronized (this.f13299c) {
            e eVar = (e) this.f13297a.f13184c;
            eVar.f13304b = j;
            eVar.d(j);
        }
    }
}
