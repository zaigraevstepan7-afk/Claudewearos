package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i0 extends b0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f3647g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f3648h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(f fVar, int i10, IBinder iBinder, Bundle bundle) {
        super(fVar, i10, bundle);
        this.f3648h = fVar;
        this.f3647g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.b0
    public final void a(nd.b bVar) {
        f fVar = this.f3648h;
        if (fVar.zzx != null) {
            fVar.zzx.onConnectionFailed(bVar);
        }
        fVar.onConnectionFailed(bVar);
    }

    @Override // com.google.android.gms.common.internal.b0
    public final boolean b() throws RemoteException {
        IBinder iBinder = this.f3647g;
        try {
            e0.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            f fVar = this.f3648h;
            if (!fVar.getServiceDescriptor().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + fVar.getServiceDescriptor() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = fVar.createServiceInterface(iBinder);
            if (iInterfaceCreateServiceInterface == null || !(f.zzn(fVar, 2, 4, iInterfaceCreateServiceInterface) || f.zzn(fVar, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            fVar.zzB = null;
            Bundle connectionHint = fVar.getConnectionHint();
            if (fVar.zzw == null) {
                return true;
            }
            fVar.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
