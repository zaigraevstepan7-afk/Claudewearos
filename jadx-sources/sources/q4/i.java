package q4;

import android.os.Process;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f13232a;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f13232a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.f13232a);
        super.run();
    }
}
