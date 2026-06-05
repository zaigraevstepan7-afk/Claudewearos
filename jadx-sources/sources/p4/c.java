package p4;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import qj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final l f12791a;

    public c(l lVar) {
        super(false);
        this.f12791a = lVar;
    }

    public final void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            this.f12791a.resumeWith(uk.c.r(th2));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f12791a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
