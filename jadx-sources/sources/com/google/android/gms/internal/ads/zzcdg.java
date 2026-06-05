package com.google.android.gms.internal.ads;

import java.util.HashMap;
import mc.n;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcdg implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcdl zzk;

    public zzcdg(zzcdl zzcdlVar, String str, String str2, long j, long j4, long j10, long j11, long j12, boolean z2, int i10, int i11) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = j4;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = j12;
        this.zzh = z2;
        this.zzi = i10;
        this.zzj = i11;
        this.zzk = zzcdlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put("event", "precacheProgress");
        map.put("src", this.zza);
        map.put("cachedSrc", this.zzb);
        map.put("bufferedDuration", Long.toString(this.zzc));
        map.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzca)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.zze));
            map.put("qoeCachedBytes", Long.toString(this.zzf));
            map.put("totalBytes", Long.toString(this.zzg));
            n.D.f11584k.getClass();
            map.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        map.put("cacheReady", true != this.zzh ? "0" : "1");
        map.put("playerCount", Integer.toString(this.zzi));
        map.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcdl.zze(this.zzk, "onPrecacheEvent", map);
    }
}
