package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhau extends zzgxg {
    final zzhaw zza;
    zzgxi zzb = zzb();
    final /* synthetic */ zzhay zzc;

    public zzhau(zzhay zzhayVar) {
        this.zzc = zzhayVar;
        this.zza = new zzhaw(zzhayVar, null);
    }

    private final zzgxi zzb() {
        zzhaw zzhawVar = this.zza;
        if (zzhawVar.hasNext()) {
            return zzhawVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxi
    public final byte zza() {
        zzgxi zzgxiVar = this.zzb;
        if (zzgxiVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzgxiVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
