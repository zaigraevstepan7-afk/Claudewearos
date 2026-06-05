package ph;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f12984a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f12985b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f12984a = jVar;
        this.f12985b = taskCompletionSource;
    }

    @Override // ph.i
    public final boolean a(qh.a aVar) {
        if (aVar.f13497b != 4 || this.f12984a.a(aVar)) {
            return false;
        }
        String str = aVar.f13498c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f12985b.setResult(new a(str, aVar.f13500e, aVar.f13501f));
        return true;
    }

    @Override // ph.i
    public final boolean b(Exception exc) {
        this.f12985b.trySetException(exc);
        return true;
    }
}
