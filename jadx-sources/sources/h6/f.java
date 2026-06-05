package h6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CountDownLatch countDownLatch;
        e eVar = (e) message.obj;
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            a aVar = eVar.f7667a;
            return;
        }
        a aVar2 = eVar.f7667a;
        Object obj = eVar.f7668b[0];
        if (aVar2.f7658d.get()) {
            countDownLatch = aVar2.f7660f;
            try {
                ld.d dVar = aVar2.f7661z;
                if (dVar.f10915h == aVar2) {
                    SystemClock.uptimeMillis();
                    dVar.f10915h = null;
                    dVar.b();
                }
                countDownLatch.countDown();
            } finally {
                countDownLatch.countDown();
            }
        } else {
            try {
                ld.d dVar2 = aVar2.f7661z;
                if (dVar2.f10914g != aVar2) {
                    if (dVar2.f10915h == aVar2) {
                        SystemClock.uptimeMillis();
                        dVar2.f10915h = null;
                        dVar2.b();
                    }
                } else if (!dVar2.f10910c) {
                    SystemClock.uptimeMillis();
                    dVar2.f10914g = null;
                    g6.a aVar3 = dVar2.f10908a;
                    if (aVar3 != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            aVar3.i(obj);
                        } else {
                            aVar3.g(obj);
                        }
                    }
                }
            } finally {
                countDownLatch = aVar2.f7660f;
            }
        }
        aVar2.f7657c = 3;
    }
}
