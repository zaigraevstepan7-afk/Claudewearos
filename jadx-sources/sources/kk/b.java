package kk;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9676a = 0;

    public /* synthetic */ b(String str) {
        super(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ReentrantLock reentrantLock;
        switch (this.f9676a) {
            case 0:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = e.f9683h;
                reentrantLock = e.f9683h;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
            }
            try {
                e eVarH = h9.a.h();
                if (eVarH == e.f9686l) {
                    e.f9686l = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (eVarH != null) {
                        eVarH.j();
                    }
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public /* synthetic */ b(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
