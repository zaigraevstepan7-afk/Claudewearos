package d8;

import android.content.Context;
import java.util.UUID;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e8.k f5024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f5025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t7.g f5026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f5027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f5028e;

    public m(n nVar, e8.k kVar, UUID uuid, t7.g gVar, Context context) {
        this.f5028e = nVar;
        this.f5024a = kVar;
        this.f5025b = uuid;
        this.f5026c = gVar;
        this.f5027d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f5024a.f5827a instanceof e8.a)) {
                String string = this.f5025b.toString();
                int iE = this.f5028e.f5031c.e(string);
                if (iE == 0 || m1.b(iE)) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((u7.b) this.f5028e.f5030b).f(string, this.f5026c);
                this.f5027d.startService(b8.c.a(this.f5027d, string, this.f5026c));
            }
            this.f5024a.h(null);
        } catch (Throwable th2) {
            this.f5024a.i(th2);
        }
    }
}
