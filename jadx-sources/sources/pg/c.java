package pg;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import rg.c0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f12887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12889c;

    public /* synthetic */ c(q qVar, boolean z2, boolean z10) {
        this.f12887a = qVar;
        this.f12888b = z2;
        this.f12889c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f12887a;
        ScheduledExecutorService scheduledExecutorService = qVar.f12947x;
        p1.l lVar = qVar.f12948y;
        l lVar2 = qVar.f12932h;
        hj.a.z(lVar2 == l.f12906a, "Not in disconnected state: %s", lVar2);
        qVar.f12932h = l.f12907b;
        long j = qVar.B + 1;
        qVar.B = j;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        lVar.l(null, "Trying to fetch auth token", new Object[0]);
        ac.l lVar3 = qVar.f12945v;
        ((c0) lVar3.f401b).f(this.f12888b, new q5.b(3, (ScheduledExecutorService) lVar3.f402c, new ld.i(taskCompletionSource, 16)));
        Task task = taskCompletionSource.getTask();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        lVar.l(null, "Trying to fetch app check token", new Object[0]);
        ac.l lVar4 = qVar.f12946w;
        ((c0) lVar4.f401b).f(this.f12889c, new q5.b(3, (ScheduledExecutorService) lVar4.f402c, new ag.i(taskCompletionSource2, 17)));
        Task task2 = taskCompletionSource2.getTask();
        Tasks.whenAll((Task<?>[]) new Task[]{task, task2}).addOnSuccessListener(scheduledExecutorService, new ac.k(qVar, j, task, task2)).addOnFailureListener(scheduledExecutorService, new bc.e(qVar, j));
    }
}
