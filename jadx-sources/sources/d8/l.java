package d8;

import android.content.Context;
import androidx.work.ListenableWorker;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final String f5017z = t7.m.l("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final e8.k f5018a = new e8.k();

    /* renamed from: b, reason: collision with root package name */
    public final Context f5019b;

    /* renamed from: c, reason: collision with root package name */
    public final c8.i f5020c;

    /* renamed from: d, reason: collision with root package name */
    public final ListenableWorker f5021d;

    /* renamed from: e, reason: collision with root package name */
    public final n f5022e;

    /* renamed from: f, reason: collision with root package name */
    public final f8.a f5023f;

    public l(Context context, c8.i iVar, ListenableWorker listenableWorker, n nVar, ac.d dVar) {
        this.f5019b = context;
        this.f5020c = iVar;
        this.f5021d = listenableWorker;
        this.f5022e = nVar;
        this.f5023f = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f5020c.f3136q || p4.a.a()) {
            this.f5018a.h(null);
            return;
        }
        e8.k kVar = new e8.k();
        ac.d dVar = (ac.d) this.f5023f;
        ((f8.b) dVar.f375d).execute(new k(this, kVar, 0));
        kVar.addListener(new k(this, kVar, 1), (f8.b) dVar.f375d);
    }
}
