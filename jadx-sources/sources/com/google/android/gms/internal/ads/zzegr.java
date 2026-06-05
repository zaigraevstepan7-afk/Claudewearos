package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzegr implements zzgcx {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfbw zzb;
    final /* synthetic */ zzfbt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfjm zze;
    final /* synthetic */ zzfcf zzf;
    final /* synthetic */ zzegt zzg;

    public zzegr(zzegt zzegtVar, long j, zzfbw zzfbwVar, zzfbt zzfbtVar, String str, zzfjm zzfjmVar, zzfcf zzfcfVar) {
        this.zza = j;
        this.zzb = zzfbwVar;
        this.zzc = zzfbtVar;
        this.zzd = str;
        this.zze = zzfjmVar;
        this.zzf = zzfcfVar;
        this.zzg = zzegtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgcx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegr.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        long j;
        zzegt zzegtVar = this.zzg;
        ((ud.b) zzegtVar.zza).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        synchronized (zzegtVar) {
            try {
                if (zzegtVar.zze) {
                    j = jElapsedRealtime;
                    zzegtVar.zzb.zza(this.zzb, this.zzc, 0, null, j);
                } else {
                    j = jElapsedRealtime;
                }
                if (zzegtVar.zzg) {
                    return;
                }
                zzfbt zzfbtVar = this.zzc;
                if (zzegtVar.zzq(zzfbtVar)) {
                    ((zzegs) zzegtVar.zzd.get(zzfbtVar)).zzd = j;
                } else {
                    long j4 = j;
                    j = j4;
                    zzegtVar.zzd.put(zzfbtVar, new zzegs(this.zzd, zzfbtVar.zzaf, 0, j4, null));
                }
                zzegtVar.zzf.zzg(zzfbtVar, j, null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
