package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzciu {
    private zzchc zza;
    private zzcjo zzb;
    private zzfgw zzc;
    private zzckb zzd;
    private zzfdq zze;

    private zzciu() {
        throw null;
    }

    public final zzcgz zza() {
        zzhgg.zzc(this.zza, zzchc.class);
        zzhgg.zzc(this.zzb, zzcjo.class);
        if (this.zzc == null) {
            this.zzc = new zzfgw();
        }
        if (this.zzd == null) {
            this.zzd = new zzckb();
        }
        if (this.zze == null) {
            this.zze = new zzfdq();
        }
        return new zzcij(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final zzciu zzb(zzchc zzchcVar) {
        this.zza = zzchcVar;
        return this;
    }

    public final zzciu zzc(zzcjo zzcjoVar) {
        this.zzb = zzcjoVar;
        return this;
    }

    public /* synthetic */ zzciu(zzcjn zzcjnVar) {
    }
}
