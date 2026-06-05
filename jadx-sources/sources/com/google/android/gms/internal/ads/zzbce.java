package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbce {
    final /* synthetic */ zzbcg zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbce(zzbcg zzbcgVar, byte[] bArr, zzbcf zzbcfVar) {
        this.zza = zzbcgVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbcg zzbcgVar = this.zza;
            if (zzbcgVar.zzb) {
                zzbcgVar.zza.zzj(this.zzb);
                zzbcgVar.zza.zzi(0);
                zzbcgVar.zza.zzg(this.zzc);
                zzbcgVar.zza.zzh(null);
                zzbcgVar.zza.zzf();
            }
        } catch (RemoteException e10) {
            k.c("Clearcut log failed", e10);
        }
    }

    public final zzbce zza(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        this.zza.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }
}
