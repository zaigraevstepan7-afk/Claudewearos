package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeji {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdps zzb;

    public zzeji(zzdps zzdpsVar) {
        this.zzb = zzdpsVar;
    }

    public final zzbrn zza(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbrn) concurrentHashMap.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e10) {
            l0.l("Couldn't create RTB adapter : ", e10);
        }
    }
}
