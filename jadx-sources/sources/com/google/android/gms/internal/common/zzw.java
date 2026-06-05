package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzw extends zzj {
    final CharSequence zzb;
    final zzo zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = f.API_PRIORITY_OTHER;

    public zzw(zzx zzxVar, CharSequence charSequence) {
        this.zzc = zzxVar.zza;
        this.zzd = zzxVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzj
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int iZzc;
        int i10 = this.zze;
        while (true) {
            int i11 = this.zze;
            if (i11 == -1) {
                zzb();
                return null;
            }
            iZzd = zzd(i11);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i10) {
                int i12 = iZzc + 1;
                this.zze = i12;
                if (i12 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i10 < iZzd) {
                    this.zzb.charAt(i10);
                }
                if (i10 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i10 != iZzd) {
                    break;
                }
                i10 = this.zze;
            }
        }
        int i13 = this.zzf;
        if (i13 == 1) {
            iZzd = this.zzb.length();
            this.zze = -1;
            if (iZzd > i10) {
                this.zzb.charAt(iZzd - 1);
            }
        } else {
            this.zzf = i13 - 1;
        }
        return this.zzb.subSequence(i10, iZzd).toString();
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}
