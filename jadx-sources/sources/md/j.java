package md;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11624a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f11625b;

    public /* synthetic */ j(k kVar, int i10) {
        this.f11624a = i10;
        this.f11625b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        switch (this.f11624a) {
            case 0:
                break;
            case 1:
                k kVar = this.f11625b;
                synchronized (kVar) {
                    if (kVar.f11626a == 1) {
                        kVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.f11625b.a("Service disconnected");
                return;
        }
        while (true) {
            k kVar2 = this.f11625b;
            synchronized (kVar2) {
                try {
                    if (kVar2.f11626a != 2) {
                        return;
                    }
                    if (kVar2.f11629d.isEmpty()) {
                        kVar2.c();
                        return;
                    }
                    l lVar = (l) kVar2.f11629d.poll();
                    kVar2.f11630e.put(lVar.f11632a, lVar);
                    ((ScheduledExecutorService) kVar2.f11631f.f11640c).schedule(new a8.e(11, kVar2, lVar, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(lVar)));
                    }
                    m mVar = kVar2.f11631f;
                    Messenger messenger = kVar2.f11627b;
                    int i10 = lVar.f11634c;
                    Context context = (Context) mVar.f11639b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = lVar.f11632a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", lVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", lVar.f11635d);
                    messageObtain.setData(bundle);
                    try {
                        t0.j jVar = kVar2.f11628c;
                        Messenger messenger2 = (Messenger) jVar.f15363b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            g gVar = (g) jVar.f15364c;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.f11616a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e10) {
                        kVar2.a(e10.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
