package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbut extends mc.c {
    public zzbut(Context context, Looper looper, com.google.android.gms.common.internal.b bVar, com.google.android.gms.common.internal.c cVar) {
        super(zzbvy.zza(context), looper, bVar, cVar, 8);
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof zzbvc ? (zzbvc) iInterfaceQueryLocalInterface : new zzbva(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final int getMinApkVersion() {
        return 243734000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public final zzbvc zzp() {
        return (zzbvc) getService();
    }
}
