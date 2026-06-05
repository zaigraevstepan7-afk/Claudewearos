package ac;

import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import c.b0;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.tasks.TaskCompletionSource;
import fj.v;
import java.util.concurrent.Callable;
import kg.p;
import qj.i0;
import u6.d0;
import w2.u2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f378c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f376a = i10;
        this.f377b = obj;
        this.f378c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws i0, SecurityException, IllegalArgumentException {
        oh.a aVar;
        switch (this.f376a) {
            case 0:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f377b;
                JobParameters jobParameters = (JobParameters) this.f378c;
                int i10 = JobInfoSchedulerService.f3436a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 1:
                c.m mVar = (c.m) this.f377b;
                mVar.f1840a.a(new c.e((b0) this.f378c, mVar));
                return;
            case 2:
                z4.d dVar = (z4.d) this.f377b;
                String message = ((Exception) this.f378c).getMessage();
                ((y.n) dVar).b(new a5.a(message != null ? message.toString() : null));
                return;
            case 3:
                z4.d dVar2 = (z4.d) this.f377b;
                Object obj = this.f378c;
                fj.l.f(dVar2, "$callback");
                fj.l.f(obj, "$exception");
                ((y.n) dVar2).b(obj);
                return;
            case 4:
                g5.d dVar3 = (g5.d) this.f377b;
                z4.k kVar = (z4.k) this.f378c;
                fj.l.f(dVar3, "this$0");
                fj.l.f(kVar, "$response");
                ((y.n) dVar3.e()).c(kVar);
                return;
            case 5:
                g5.d dVar4 = (g5.d) this.f377b;
                v vVar = (v) this.f378c;
                fj.l.f(dVar4, "this$0");
                fj.l.f(vVar, "$exception");
                ((y.n) dVar4.e()).b(vVar.f6807a);
                return;
            case 6:
                g5.d dVar5 = (g5.d) this.f377b;
                a5.b bVar = (a5.b) this.f378c;
                fj.l.f(dVar5, "this$0");
                fj.l.f(bVar, "$e");
                ((y.n) dVar5.e()).b(bVar);
                return;
            case 7:
                i5.c cVar = (i5.c) this.f377b;
                z4.k kVar2 = (z4.k) this.f378c;
                fj.l.f(cVar, "this$0");
                fj.l.f(kVar2, "$response");
                ((y.n) cVar.f()).c(kVar2);
                return;
            case 8:
                i5.c cVar2 = (i5.c) this.f377b;
                v vVar2 = (v) this.f378c;
                fj.l.f(cVar2, "this$0");
                fj.l.f(vVar2, "$exception");
                ((y.n) cVar2.f()).b(vVar2.f6807a);
                return;
            case 9:
                i5.c cVar3 = (i5.c) this.f377b;
                a5.b bVar2 = (a5.b) this.f378c;
                fj.l.f(cVar3, "this$0");
                fj.l.f(bVar2, "$e");
                ((y.n) cVar3.f()).b(bVar2);
                return;
            case 10:
                ((y.n) ((i5.c) this.f377b).f()).b((a5.e) this.f378c);
                return;
            case 11:
                ((k4.b) this.f377b).h((Typeface) this.f378c);
                return;
            case 12:
                p pVar = (p) this.f377b;
                oh.b bVar3 = (oh.b) this.f378c;
                if (pVar.f9644b != p.f9642d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar) {
                    aVar = pVar.f9643a;
                    pVar.f9643a = null;
                    pVar.f9644b = bVar3;
                }
                aVar.a(bVar3);
                return;
            case 13:
                kg.o oVar = (kg.o) this.f377b;
                oh.b bVar4 = (oh.b) this.f378c;
                synchronized (oVar) {
                    try {
                        if (oVar.f9640b == null) {
                            oVar.f9639a.add(bVar4);
                        } else {
                            oVar.f9640b.add(bVar4.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 14:
                lg.a aVar2 = (lg.a) this.f377b;
                Runnable runnable = (Runnable) this.f378c;
                Process.setThreadPriority(aVar2.f10940c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.f10941d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 15:
                Callable callable = (Callable) this.f377b;
                lg.h hVar = (lg.h) ((p7.k) this.f378c).f12813b;
                try {
                    hVar.w(callable.call());
                    return;
                } catch (Exception e10) {
                    hVar.x(e10);
                    return;
                }
            case 16:
                ((rg.b0) this.f377b).j(((th.b) this.f378c).f16331a);
                return;
            case 17:
                ((TaskCompletionSource) this.f377b).trySetResult((mg.a) this.f378c);
                return;
            case 18:
                ((qj.l) this.f377b).C((rj.d) this.f378c, pi.o.f13011a);
                return;
            case 19:
                Runnable runnable2 = (Runnable) this.f377b;
                d0 d0Var = (d0) this.f378c;
                try {
                    runnable2.run();
                    return;
                } finally {
                    d0Var.a();
                }
            case 20:
                u2 u2Var = (u2) this.f377b;
                androidx.lifecycle.v vVar3 = (androidx.lifecycle.v) this.f378c;
                if (u2Var.f18433c) {
                    return;
                }
                u2Var.f18434d = vVar3;
                vVar3.a(u2Var);
                return;
            case zzbch.zzt.zzm /* 21 */:
                wh.n nVar = (wh.n) this.f377b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f378c;
                try {
                    taskCompletionSource.setResult(nVar.b());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                }
            default:
                u1.d.e((x1.e) this.f377b, (LongSparseArray) this.f378c);
                return;
        }
    }
}
