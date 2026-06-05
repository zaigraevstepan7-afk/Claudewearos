package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhas implements zzhad {
    private final zzhag zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzhas(zzhag zzhagVar, String str, Object[] objArr) {
        this.zza = zzhagVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < '\ud800') {
            this.zzd = cCharAt;
            return;
        }
        int i10 = cCharAt & '\u1fff';
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < '\ud800') {
                this.zzd = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & '\u1fff') << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhad
    public final zzhag zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhad
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.zzhad
    public final int zzc() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
