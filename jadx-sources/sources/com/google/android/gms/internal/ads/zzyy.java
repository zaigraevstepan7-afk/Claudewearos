package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzyy implements zzyw {
    private final zzyw zza;

    public zzyy(zzyw zzywVar) {
        this.zza = zzywVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzyy) {
            return this.zza.equals(((zzyy) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public zzz zza(int i10) {
        return this.zza.zza(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public zzz zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public zzbm zzc() {
        return this.zza.zzc();
    }

    public final zzyw zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final int zze(int i10) {
        return this.zza.zze(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzyw
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final int zzg(int i10) {
        return this.zza.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final int zzh() {
        return this.zza.zzh();
    }
}
