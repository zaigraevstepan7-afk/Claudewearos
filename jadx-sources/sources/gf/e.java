package gf;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import md.k;
import md.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7404b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f7403a = i10;
        this.f7404b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f7403a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                f fVar = (f) this.f7404b;
                if (message.obj != null) {
                    throw new ClassCastException();
                }
                synchronized (fVar.f7406a) {
                    throw null;
                }
            default:
                int i10 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + i10);
                }
                k kVar = (k) this.f7404b;
                synchronized (kVar) {
                    try {
                        l lVar = (l) kVar.f11630e.get(i10);
                        if (lVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                            return true;
                        }
                        kVar.f11630e.remove(i10);
                        kVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            lVar.b(new a5.a("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (lVar.f11636e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    lVar.c(null);
                                    return true;
                                }
                                lVar.b(new a5.a("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                lVar.c(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
        }
    }
}
