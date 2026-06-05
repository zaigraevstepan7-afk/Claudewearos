package wd;

import android.content.Context;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f19280b;

    /* renamed from: a, reason: collision with root package name */
    public k3.a f19281a;

    static {
        b bVar = new b();
        bVar.f19281a = null;
        f19280b = bVar;
    }

    public static k3.a a(Context context) {
        k3.a aVar;
        b bVar = f19280b;
        synchronized (bVar) {
            try {
                if (bVar.f19281a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f19281a = new k3.a(context, (byte) 0);
                }
                aVar = bVar.f19281a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }
}
