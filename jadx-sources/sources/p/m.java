package p;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f12583a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final b.d f12584b;

    /* renamed from: c, reason: collision with root package name */
    public final f f12585c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f12586d;

    public m(b.d dVar, f fVar, ComponentName componentName) {
        this.f12584b = dVar;
        this.f12585c = fVar;
        this.f12586d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f12583a) {
            try {
                try {
                    ((b.b) this.f12584b).u(this.f12585c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
