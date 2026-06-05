package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import mc.n;
import org.json.JSONException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdue implements zzgcx {
    final /* synthetic */ zzdug zza;

    public zzdue(zzdug zzdugVar) {
        this.zza = zzdugVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
        synchronized (this) {
            zzdug zzdugVar = this.zza;
            zzdugVar.zzc = true;
            n.D.f11584k.getClass();
            zzdugVar.zzv("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (SystemClock.elapsedRealtime() - zzdugVar.zzd));
            zzdugVar.zze.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzdug zzdugVar = this.zza;
            zzdugVar.zzc = true;
            n.D.f11584k.getClass();
            zzdugVar.zzv("com.google.android.gms.ads.MobileAds", true, "", (int) (SystemClock.elapsedRealtime() - zzdugVar.zzd));
            zzdugVar.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdud
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    zzdug.zzo(this.zza.zza, str);
                }
            });
        }
    }
}
