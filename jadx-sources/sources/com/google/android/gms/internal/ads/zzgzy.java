package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgzy implements zzhba {
    private static final zzhae zza = new zzgzw();
    private final zzhae zzb;

    public zzgzy() {
        zzgyo zzgyoVarZza = zzgyo.zza();
        int i10 = zzhaq.zza;
        zzgzx zzgzxVar = new zzgzx(zzgyoVarZza, zza);
        byte[] bArr = zzgzi.zzb;
        this.zzb = zzgzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhba
    public final zzhaz zza(Class cls) {
        int i10 = zzhbb.zza;
        if (!zzgyv.class.isAssignableFrom(cls)) {
            int i11 = zzhaq.zza;
        }
        zzhad zzhadVarZzb = this.zzb.zzb(cls);
        if (zzhadVarZzb.zzb()) {
            int i12 = zzhaq.zza;
            return zzhak.zzc(zzhbb.zzm(), zzgyi.zza(), zzhadVarZzb.zza());
        }
        int i13 = zzhaq.zza;
        return zzhaj.zzm(cls, zzhadVarZzb, zzhan.zza(), zzgzu.zza(), zzhbb.zzm(), zzhadVarZzb.zzc() + (-1) != 1 ? zzgyi.zza() : null, zzhac.zza());
    }
}
