package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeqz implements zzett {
    private final Integer zza;

    public zzeqz(Integer num) {
        this.zza = num;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcut zzcutVar = (zzcut) obj;
        if (num != null) {
            zzcutVar.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
    }
}
