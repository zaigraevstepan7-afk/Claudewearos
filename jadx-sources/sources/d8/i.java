package d8;

import androidx.work.impl.WorkDatabase;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f5008d = t7.m.l("StopWorkRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final u7.k f5009a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5010b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5011c;

    public i(u7.k kVar, String str, boolean z2) {
        this.f5009a = kVar;
        this.f5010b = str;
        this.f5011c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zJ;
        u7.k kVar = this.f5009a;
        WorkDatabase workDatabase = kVar.f16842d;
        u7.b bVar = kVar.f16845g;
        ac.n nVarW = workDatabase.w();
        workDatabase.c();
        try {
            String str = this.f5010b;
            synchronized (bVar.D) {
                zContainsKey = bVar.f16816f.containsKey(str);
            }
            if (this.f5011c) {
                zJ = this.f5009a.f16845g.i(this.f5010b);
            } else {
                if (!zContainsKey && nVarW.e(this.f5010b) == 2) {
                    nVarW.m(1, this.f5010b);
                }
                zJ = this.f5009a.f16845g.j(this.f5010b);
            }
            t7.m.g().c(f5008d, "StopWorkRunnable for " + this.f5010b + "; Processor.stopWork = " + zJ, new Throwable[0]);
            workDatabase.q();
            workDatabase.h();
        } catch (Throwable th2) {
            workDatabase.h();
            throw th2;
        }
    }
}
