package l3;

import android.view.Choreographer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f9962b;

    public /* synthetic */ y(int i10, Runnable runnable) {
        this.f9961a = i10;
        this.f9962b = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f9961a) {
            case 0:
                this.f9962b.run();
                break;
            default:
                this.f9962b.run();
                break;
        }
    }
}
