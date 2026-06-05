package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzvu extends zzyy {
    private final zzbm zza;

    public zzvu(zzyw zzywVar, zzbm zzbmVar) {
        super(zzywVar);
        this.zza = zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyy
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof zzvu)) {
            return this.zza.equals(((zzvu) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzyy
    public final int hashCode() {
        return this.zza.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzyy, com.google.android.gms.internal.ads.zzzb
    public final zzz zza(int i10) {
        return this.zza.zzb(zzd().zze(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzyy, com.google.android.gms.internal.ads.zzyw
    public final zzz zzb() {
        return this.zza.zzb(zzd().zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzyy, com.google.android.gms.internal.ads.zzzb
    public final zzbm zzc() {
        return this.zza;
    }
}
