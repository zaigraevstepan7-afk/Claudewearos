package p0;

import android.content.Intent;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import r5.s;
import r5.t;
import u6.v;
import w5.s0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12603b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12604c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12605d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.f12602a = i10;
        this.f12603b = obj;
        this.f12604c = obj2;
        this.f12605d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12602a) {
            case 0:
                h hVar = (h) this.f12603b;
                e eVar = (e) this.f12604c;
                f fVar = (f) this.f12605d;
                ActionMode actionModeStartActionMode = hVar.f12606a.startActionMode(new m(eVar), 1);
                fj.l.b(hVar.f12613h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    fVar.close();
                    return;
                }
                return;
            case 1:
                k3.a aVar = (k3.a) this.f12603b;
                uk.c cVar = (uk.c) this.f12604c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f12605d;
                try {
                    t tVarO = v.o(aVar.f9352a);
                    if (tVarO == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((r5.j) tVarO.f13731b);
                    synchronized (sVar.f13758d) {
                        sVar.f13760f = threadPoolExecutor;
                    }
                    ((r5.j) tVarO.f13731b).a(new r5.m(cVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    cVar.H(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.f12603b;
                View view = (View) this.f12604c;
                w5.f fVar2 = (w5.f) this.f12605d;
                fj.l.f(viewGroup, "$container");
                fj.l.f(fVar2, "this$0");
                viewGroup.endViewTransition(view);
                ((s0) fVar2.f18627c.f6149a).c(fVar2);
                return;
            case 3:
                wh.g gVar = (wh.g) this.f12603b;
                Intent intent = (Intent) this.f12604c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12605d;
                try {
                    gVar.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            default:
                zb.a aVar2 = (zb.a) this.f12603b;
                ub.i iVar = (ub.i) this.f12604c;
                String str = iVar.f16961a;
                ub.h hVar2 = (ub.h) this.f12605d;
                aVar2.getClass();
                Logger logger = zb.a.f20486f;
                try {
                    vb.e eVarA = aVar2.f20489c.a(str);
                    if (eVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((bc.h) aVar2.f20491e).s(new ai.n(aVar2, iVar, ((sb.b) eVarA).a(hVar2), 7));
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    return;
                }
        }
    }

    public /* synthetic */ g(zb.a aVar, ub.i iVar, l7.n nVar, ub.h hVar) {
        this.f12602a = 4;
        this.f12603b = aVar;
        this.f12604c = iVar;
        this.f12605d = hVar;
    }
}
