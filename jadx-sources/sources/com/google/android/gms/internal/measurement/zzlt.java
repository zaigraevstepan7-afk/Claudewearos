package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzlt implements zzlg {
    private final zzlj zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzlt(zzlj zzljVar, String str, Object[] objArr) {
        this.zza = zzljVar;
        this.zzb = str;
        this.zzc = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < '\ud800') {
            this.zzd = cCharAt;
            return;
        }
        int i10 = cCharAt & '\u1fff';
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < '\ud800') {
                this.zzd = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & '\u1fff') << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final zzlj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
