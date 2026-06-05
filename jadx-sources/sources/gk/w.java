package gk;

import java.net.SocketTimeoutException;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class w extends kk.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f7529m;

    public w(x xVar) {
        this.f7529m = xVar;
    }

    @Override // kk.e
    public final void j() {
        this.f7529m.e(6);
        q qVar = this.f7529m.f7533d;
        synchronized (qVar) {
            try {
                long j = qVar.F;
                long j4 = qVar.E;
                if (j < j4) {
                    return;
                }
                qVar.E = j4 + 1;
                qVar.G = System.nanoTime() + 1000000000;
                try {
                    qVar.A.execute(new j(qVar, new Object[]{qVar.f7496d}));
                } catch (RejectedExecutionException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k() {
        if (i()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
