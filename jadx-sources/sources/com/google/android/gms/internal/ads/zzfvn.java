package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfvn extends zzfvr {
    final /* synthetic */ zzfup zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvn(zzfvt zzfvtVar, CharSequence charSequence, zzfup zzfupVar) {
        super(zzfvtVar, charSequence);
        this.zza = zzfupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfvr
    public final int zzd(int i10) {
        CharSequence charSequence = ((zzfvr) this).zzb;
        int length = charSequence.length();
        zzfve.zzb(i10, length, "index");
        while (i10 < length) {
            if (this.zza.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
