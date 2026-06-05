package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 extends m {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3682d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f3683e;

    /* renamed from: f, reason: collision with root package name */
    public volatile zzi f3684f;

    /* renamed from: g, reason: collision with root package name */
    public final td.a f3685g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3686h;

    /* renamed from: i, reason: collision with root package name */
    public final long f3687i;

    public o0(Context context, Looper looper) {
        n0 n0Var = new n0(this);
        this.f3683e = context.getApplicationContext();
        this.f3684f = new zzi(looper, n0Var);
        this.f3685g = td.a.a();
        this.f3686h = 5000L;
        this.f3687i = 300000L;
    }

    @Override // com.google.android.gms.common.internal.m
    public final boolean c(l0 l0Var, h0 h0Var, String str, Executor executor) {
        boolean z2;
        synchronized (this.f3682d) {
            try {
                m0 m0Var = (m0) this.f3682d.get(l0Var);
                if (executor == null) {
                    executor = null;
                }
                if (m0Var == null) {
                    m0Var = new m0(this, l0Var);
                    m0Var.f3674a.put(h0Var, h0Var);
                    m0Var.a(str, executor);
                    this.f3682d.put(l0Var, m0Var);
                } else {
                    this.f3684f.removeMessages(0, l0Var);
                    if (m0Var.f3674a.containsKey(h0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(l0Var.toString()));
                    }
                    m0Var.f3674a.put(h0Var, h0Var);
                    int i10 = m0Var.f3675b;
                    if (i10 == 1) {
                        h0Var.onServiceConnected(m0Var.f3679f, m0Var.f3677d);
                    } else if (i10 == 2) {
                        m0Var.a(str, executor);
                    }
                }
                z2 = m0Var.f3676c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z2;
    }
}
