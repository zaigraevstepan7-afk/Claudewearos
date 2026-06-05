package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgzx implements zzhae {
    private final zzhae[] zza;

    public zzgzx(zzhae... zzhaeVarArr) {
        this.zza = zzhaeVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final zzhad zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzhae zzhaeVar = this.zza[i10];
            if (zzhaeVar.zzc(cls)) {
                return zzhaeVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzhae
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
