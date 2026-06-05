package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f3638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f3639b;

    public h0(f fVar, int i10) {
        this.f3639b = fVar;
        this.f3638a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar = this.f3639b;
        if (iBinder == null) {
            f.zzk(fVar, 16);
            return;
        }
        synchronized (fVar.zzq) {
            try {
                f fVar2 = this.f3639b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p)) ? new d0(iBinder) : (p) iInterfaceQueryLocalInterface;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3639b.zzl(0, null, this.f3638a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3639b.zzq) {
            this.f3639b.zzr = null;
        }
        f fVar = this.f3639b;
        int i10 = this.f3638a;
        Handler handler = fVar.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
