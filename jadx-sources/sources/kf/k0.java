package kf;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k0 extends i0 {
    public final /* synthetic */ i0 A;
    public final /* synthetic */ e B;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f9585z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e eVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, i0 i0Var) {
        super(taskCompletionSource);
        this.f9585z = taskCompletionSource2;
        this.A = i0Var;
        this.B = eVar;
    }

    @Override // kf.i0
    public final void b() {
        synchronized (this.B.f9565f) {
            try {
                e eVar = this.B;
                TaskCompletionSource taskCompletionSource = this.f9585z;
                eVar.f9564e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new mh.g(19, eVar, taskCompletionSource));
                if (this.B.f9570l.getAndIncrement() > 0) {
                    this.B.f9561b.b("Already connected to the service.", new Object[0]);
                }
                e.b(this.B, this.A);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
