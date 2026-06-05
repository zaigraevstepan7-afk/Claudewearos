package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
abstract class zzfvr extends zzfuj {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = f.API_PRIORITY_OTHER;

    public zzfvr(zzfvt zzfvtVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfuj
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzc;
        int i10 = this.zzc;
        while (true) {
            int i11 = this.zzc;
            if (i11 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i11);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zzc = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzc = iZzc;
            }
            if (iZzc != i10) {
                if (i10 < iZzd) {
                    this.zzb.charAt(i10);
                }
                if (i10 < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                int i12 = this.zzd;
                if (i12 == 1) {
                    CharSequence charSequence = this.zzb;
                    int length = charSequence.length();
                    this.zzc = -1;
                    if (length > i10) {
                        charSequence.charAt(length - 1);
                    }
                    iZzd = length;
                } else {
                    this.zzd = i12 - 1;
                }
                return this.zzb.subSequence(i10, iZzd).toString();
            }
            int i13 = iZzc + 1;
            this.zzc = i13;
            if (i13 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}
