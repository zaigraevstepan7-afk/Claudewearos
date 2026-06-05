package lg;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f10947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f10948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f10949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f10950f;

    public /* synthetic */ c(f fVar, Runnable runnable, long j, long j4, TimeUnit timeUnit, int i10) {
        this.f10945a = i10;
        this.f10946b = fVar;
        this.f10947c = runnable;
        this.f10948d = j;
        this.f10949e = j4;
        this.f10950f = timeUnit;
    }

    @Override // lg.g
    public final ScheduledFuture a(p7.k kVar) {
        switch (this.f10945a) {
            case 0:
                f fVar = this.f10946b;
                return fVar.f10959b.scheduleAtFixedRate(new d(fVar, this.f10947c, kVar, 0), this.f10948d, this.f10949e, this.f10950f);
            default:
                f fVar2 = this.f10946b;
                return fVar2.f10959b.scheduleWithFixedDelay(new d(fVar2, this.f10947c, kVar, 2), this.f10948d, this.f10949e, this.f10950f);
        }
    }
}
