package p;

import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f12561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f12562c;

    public /* synthetic */ b(f fVar, Bundle bundle, int i10) {
        this.f12560a = i10;
        this.f12562c = fVar;
        this.f12561b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12560a) {
            case 0:
                this.f12562c.f12580b.onUnminimized(this.f12561b);
                break;
            case 1:
                this.f12562c.f12580b.onMessageChannelReady(this.f12561b);
                break;
            case 2:
                this.f12562c.f12580b.onWarmupCompleted(this.f12561b);
                break;
            default:
                this.f12562c.f12580b.onMinimized(this.f12561b);
                break;
        }
    }
}
