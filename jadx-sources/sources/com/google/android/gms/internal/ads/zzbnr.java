package com.google.android.gms.internal.ads;

import java.util.Map;
import mc.n;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbnr implements zzbkd {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbof zzb;
    final /* synthetic */ zzbnb zzc;
    final /* synthetic */ zzbog zzd;

    public zzbnr(zzbog zzbogVar, long j, zzbof zzbofVar, zzbnb zzbnbVar) {
        this.zza = j;
        this.zzb = zzbofVar;
        this.zzc = zzbnbVar;
        this.zzd = zzbogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        n.D.f11584k.getClass();
        l0.k("onGmsg /jsLoaded. JsLoaded latency is " + (System.currentTimeMillis() - this.zza) + " ms.");
        l0.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbog zzbogVar = this.zzd;
        synchronized (zzbogVar.zza) {
            l0.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbof zzbofVar = this.zzb;
            if (zzbofVar.zze() != -1 && zzbofVar.zze() != 1) {
                zzbogVar.zzi = 0;
                zzbnb zzbnbVar = this.zzc;
                zzbnbVar.zzq("/log", zzbkc.zzg);
                zzbnbVar.zzq("/result", zzbkc.zzo);
                zzbofVar.zzi(zzbnbVar);
                zzbogVar.zzh = zzbofVar;
                l0.k("Successfully loaded JS Engine.");
                l0.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            l0.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
