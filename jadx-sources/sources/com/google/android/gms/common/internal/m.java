package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3671a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static o0 f3672b;

    /* renamed from: c, reason: collision with root package name */
    public static HandlerThread f3673c;

    public static o0 a(Context context) {
        synchronized (f3671a) {
            try {
                if (f3672b == null) {
                    f3672b = new o0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f3672b;
    }

    public final void b(String str, String str2, ServiceConnection serviceConnection, boolean z2) {
        l0 l0Var = new l0(str, str2, z2);
        o0 o0Var = (o0) this;
        e0.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (o0Var.f3682d) {
            try {
                m0 m0Var = (m0) o0Var.f3682d.get(l0Var);
                if (m0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(l0Var.toString()));
                }
                if (!m0Var.f3674a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(l0Var.toString()));
                }
                m0Var.f3674a.remove(serviceConnection);
                if (m0Var.f3674a.isEmpty()) {
                    o0Var.f3684f.sendMessageDelayed(o0Var.f3684f.obtainMessage(0, l0Var), o0Var.f3686h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract boolean c(l0 l0Var, h0 h0Var, String str, Executor executor);
}
