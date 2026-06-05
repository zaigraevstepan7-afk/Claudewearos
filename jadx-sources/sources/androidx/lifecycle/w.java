package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class w extends Service implements t {

    /* renamed from: a, reason: collision with root package name */
    public final ac.d f1150a = new ac.d(this);

    @Override // androidx.lifecycle.t
    public final v h() {
        return (v) this.f1150a.f373b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        fj.l.f(intent, "intent");
        ac.d dVar = this.f1150a;
        dVar.getClass();
        dVar.G(n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        ac.d dVar = this.f1150a;
        dVar.getClass();
        dVar.G(n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        ac.d dVar = this.f1150a;
        dVar.getClass();
        dVar.G(n.ON_STOP);
        dVar.G(n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        ac.d dVar = this.f1150a;
        dVar.getClass();
        dVar.G(n.ON_START);
        super.onStart(intent, i10);
    }
}
