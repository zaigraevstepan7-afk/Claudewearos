package l3;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Choreographer f9960a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9960a.postFrameCallback(new y(0, runnable));
    }
}
