package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfpe extends mc.c {
    private final int zze;

    public zzfpe(Context context, Looper looper, com.google.android.gms.common.internal.b bVar, com.google.android.gms.common.internal.c cVar, int i10) {
        super(context, looper, bVar, cVar, 116);
        this.zze = i10;
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof zzfpj ? (zzfpj) iInterfaceQueryLocalInterface : new zzfpj(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final int getMinApkVersion() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public final zzfpj zzp() {
        return (zzfpj) getService();
    }
}
