package i6;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f8354a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Looper looper) {
        super(looper);
        this.f8354a = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        f[] fVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        b bVar = this.f8354a;
        do {
            synchronized (bVar.f8358b) {
                try {
                    size = bVar.f8360d.size();
                    if (size <= 0) {
                        return;
                    }
                    fVarArr = new f[size];
                    bVar.f8360d.toArray(fVarArr);
                    bVar.f8360d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (size <= 0);
        f fVar = fVarArr[0];
        throw null;
    }
}
