package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbxd implements ad.b {
    private final zzbwq zza;

    public zzbxd(zzbwq zzbwqVar) {
        this.zza = zzbwqVar;
    }

    @Override // ad.b
    public final int getAmount() {
        zzbwq zzbwqVar = this.zza;
        if (zzbwqVar != null) {
            try {
                return zzbwqVar.zze();
            } catch (RemoteException e10) {
                k.h("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    @Override // ad.b
    public final String getType() {
        zzbwq zzbwqVar = this.zza;
        if (zzbwqVar != null) {
            try {
                return zzbwqVar.zzf();
            } catch (RemoteException e10) {
                k.h("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }
}
