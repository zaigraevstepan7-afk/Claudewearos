package d8;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e8.k f5015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f5016c;

    public /* synthetic */ k(l lVar, e8.k kVar, int i10) {
        this.f5014a = i10;
        this.f5016c = lVar;
        this.f5015b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5014a) {
            case 0:
                this.f5015b.j(this.f5016c.f5021d.getForegroundInfoAsync());
                return;
            default:
                l lVar = this.f5016c;
                e8.k kVar = lVar.f5018a;
                ListenableWorker listenableWorker = lVar.f5021d;
                c8.i iVar = lVar.f5020c;
                try {
                    t7.g gVar = (t7.g) this.f5015b.get();
                    if (gVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + iVar.f3123c + ") but did not provide ForegroundInfo");
                    }
                    t7.m.g().c(l.f5017z, "Updating notification for " + iVar.f3123c, new Throwable[0]);
                    listenableWorker.setRunInForeground(true);
                    n nVar = lVar.f5022e;
                    Context context = lVar.f5019b;
                    UUID id2 = listenableWorker.getId();
                    nVar.getClass();
                    e8.k kVar2 = new e8.k();
                    ((ac.d) nVar.f5029a).f(new m(nVar, kVar2, id2, gVar, context));
                    kVar.j(kVar2);
                    return;
                } catch (Throwable th2) {
                    kVar.i(th2);
                    return;
                }
        }
    }
}
