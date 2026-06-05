package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaaa {
    public static final zzzt zza = new zzzt(2, -9223372036854775807L, null);
    public static final zzzt zzb = new zzzt(3, -9223372036854775807L, null);
    private final zzaai zzc = zzaag.zza(zzex.zzF("ExoPlayer:Loader:ProgressiveMediaPeriod"), new zzdn() { // from class: com.google.android.gms.internal.ads.zzzr
        @Override // com.google.android.gms.internal.ads.zzdn
        public final void zza(Object obj) {
            ((ExecutorService) obj).shutdown();
        }
    });
    private zzzu zzd;
    private IOException zze;

    public zzaaa(String str) {
    }

    public static zzzt zzb(boolean z2, long j) {
        return new zzzt(z2 ? 1 : 0, j, null);
    }

    public final long zza(zzzv zzzvVar, zzzs zzzsVar, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        zzdd.zzb(looperMyLooper);
        this.zze = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new zzzu(this, looperMyLooper, zzzvVar, zzzsVar, i10, jElapsedRealtime).zzc(0L);
        return jElapsedRealtime;
    }

    public final void zzg() {
        zzzu zzzuVar = this.zzd;
        zzdd.zzb(zzzuVar);
        zzzuVar.zza(false);
    }

    public final void zzh() {
        this.zze = null;
    }

    public final void zzi(int i10) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzzu zzzuVar = this.zzd;
        if (zzzuVar != null) {
            zzzuVar.zzb(i10);
        }
    }

    public final void zzj(zzzw zzzwVar) {
        zzzu zzzuVar = this.zzd;
        if (zzzuVar != null) {
            zzzuVar.zza(true);
        }
        zzaai zzaaiVar = this.zzc;
        zzaaiVar.execute(new zzzx(zzzwVar));
        zzaaiVar.zza();
    }

    public final boolean zzk() {
        return this.zze != null;
    }

    public final boolean zzl() {
        return this.zzd != null;
    }
}
