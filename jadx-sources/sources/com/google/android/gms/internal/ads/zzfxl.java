package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfxl extends zzfwy {
    final /* synthetic */ zzfxo zza;
    private final Object zzb;
    private int zzc;

    public zzfxl(zzfxo zzfxoVar, int i10) {
        this.zza = zzfxoVar;
        this.zzb = zzfxo.zzg(zzfxoVar, i10);
        this.zzc = i10;
    }

    private final void zza() {
        int i10 = this.zzc;
        if (i10 != -1) {
            zzfxo zzfxoVar = this.zza;
            if (i10 < zzfxoVar.size() && zzfvb.zza(this.zzb, zzfxo.zzg(zzfxoVar, this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzw(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfwy, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwy, java.util.Map.Entry
    public final Object getValue() {
        zzfxo zzfxoVar = this.zza;
        Map mapZzl = zzfxoVar.zzl();
        if (mapZzl != null) {
            return mapZzl.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzfxo.zzj(zzfxoVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfwy, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzfxo zzfxoVar = this.zza;
        Map mapZzl = zzfxoVar.zzl();
        if (mapZzl != null) {
            return mapZzl.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            zzfxoVar.put(this.zzb, obj);
            return null;
        }
        Object objZzj = zzfxo.zzj(zzfxoVar, i10);
        zzfxo.zzn(zzfxoVar, this.zzc, obj);
        return objZzj;
    }
}
