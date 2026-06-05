package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3674a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f3675b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3676c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f3677d;

    /* renamed from: e, reason: collision with root package name */
    public final l0 f3678e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f3679f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o0 f3680g;

    public m0(o0 o0Var, l0 l0Var) {
        this.f3680g = o0Var;
        this.f3678e = l0Var;
    }

    public final void a(String str, Executor executor) throws Throwable {
        td.a aVar;
        Context context;
        this.f3675b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            o0 o0Var = this.f3680g;
            aVar = o0Var.f3685g;
            context = o0Var.f3683e;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            boolean zC = aVar.c(context, str, this.f3678e.a(context), this, 4225, executor);
            this.f3676c = zC;
            if (zC) {
                this.f3680g.f3684f.sendMessageDelayed(this.f3680g.f3684f.obtainMessage(1, this.f3678e), this.f3680g.f3687i);
            } else {
                this.f3675b = 2;
                try {
                    o0 o0Var2 = this.f3680g;
                    o0Var2.f3685g.b(o0Var2.f3683e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            StrictMode.setVmPolicy(vmPolicy);
            throw th4;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f3680g.f3682d) {
            try {
                this.f3680g.f3684f.removeMessages(1, this.f3678e);
                this.f3677d = iBinder;
                this.f3679f = componentName;
                Iterator it = this.f3674a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f3675b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3680g.f3682d) {
            try {
                this.f3680g.f3684f.removeMessages(1, this.f3678e);
                this.f3677d = null;
                this.f3679f = componentName;
                Iterator it = this.f3674a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f3675b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
