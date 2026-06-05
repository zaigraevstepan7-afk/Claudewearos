package ph;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f12986a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f12986a = taskCompletionSource;
    }

    @Override // ph.i
    public final boolean a(qh.a aVar) {
        int i10 = aVar.f13497b;
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            return false;
        }
        this.f12986a.trySetResult(aVar.f13496a);
        return true;
    }

    @Override // ph.i
    public final boolean b(Exception exc) {
        return false;
    }
}
