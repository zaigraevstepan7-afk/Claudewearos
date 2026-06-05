package ai;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import rg.z;
import zg.r;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Continuation, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f527e;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.f523a = obj;
        this.f524b = obj2;
        this.f525c = obj3;
        this.f526d = obj4;
        this.f527e = obj5;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        List listF;
        ad.f fVar = (ad.f) this.f523a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f524b;
        mg.a aVar = (mg.a) this.f525c;
        mg.d dVar = (mg.d) this.f526d;
        rg.k kVar = (rg.k) this.f527e;
        rg.k kVar2 = (rg.k) fVar.f422e;
        if (taskCompletionSource.getTask().isComplete()) {
            return;
        }
        if (!task.isSuccessful()) {
            if (aVar.b()) {
                taskCompletionSource.setResult(aVar);
                return;
            }
            Exception exception = task.getException();
            Objects.requireNonNull(exception);
            taskCompletionSource.setException(exception);
            return;
        }
        r rVarB = u0.c.b(task.getResult(), zg.j.f20603e);
        wg.h hVarE = dVar.e();
        rg.h hVar = hVarE.f19305a;
        kVar2.f(hVarE, true);
        if (hVarE.f19306b.d()) {
            listF = kVar2.f14443n.f(hVar, rVarB);
        } else {
            z zVar = kVar2.f14443n;
            listF = (List) zVar.f14496g.c(new rg.p(zVar, zVar.k(hVarE), hVar, rVarB, 1));
        }
        kVar.g(listF);
        taskCompletionSource.setResult(new mg.a(new mg.d(dVar.f11673a, dVar.f11674b), new zg.l(rVarB, dVar.e().f19306b.f19304e)));
        kVar2.f(hVarE, false);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        j jVar = (j) this.f523a;
        Task task2 = (Task) this.f524b;
        Task task3 = (Task) this.f525c;
        Date date = (Date) this.f526d;
        HashMap map = (HashMap) this.f527e;
        if (!task2.isSuccessful()) {
            return Tasks.forException(new zh.c("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return Tasks.forException(new zh.c("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            i iVarA = jVar.a((String) task2.getResult(), ((ph.a) task3.getResult()).f12967a, date, map);
            return iVarA.f528a != 0 ? Tasks.forResult(iVarA) : jVar.f536e.d(iVarA.f529b).onSuccessTask(jVar.f534c, new ac.h(iVarA, 4));
        } catch (zh.d e10) {
            return Tasks.forException(e10);
        }
    }
}
