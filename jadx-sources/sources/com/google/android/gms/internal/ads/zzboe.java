package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzboe implements zzcam {
    final /* synthetic */ zzbof zza;

    public zzboe(zzbof zzbofVar) {
        this.zza = zzbofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbnb zzbnbVar = (zzbnb) obj;
        zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbod
            @Override // java.lang.Runnable
            public final void run() {
                zzbnb zzbnbVar2 = zzbnbVar;
                zzbnbVar2.zzr("/result", zzbkc.zzo);
                zzbnbVar2.zzc();
            }
        });
    }
}
