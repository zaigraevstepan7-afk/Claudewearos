package lg;

import android.os.Process;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10962a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f10963b;

    public /* synthetic */ j(int i10, Runnable runnable) {
        this.f10962a = i10;
        this.f10963b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        switch (this.f10962a) {
            case 0:
                this.f10963b.run();
                break;
            case 1:
                try {
                    this.f10963b.run();
                    break;
                } catch (Exception e10) {
                    u0.c.i(e10, "Executor", "Background execution failure.");
                    return;
                }
            default:
                Process.setThreadPriority(0);
                this.f10963b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f10962a) {
            case 0:
                return this.f10963b.toString();
            default:
                return super.toString();
        }
    }
}
