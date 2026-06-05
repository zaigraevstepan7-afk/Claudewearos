package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdsf implements zzfgt {
    private final zzdrw zzb;
    private final ud.a zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdsf(zzdrw zzdrwVar, Set set, ud.a aVar) {
        this.zzb = zzdrwVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdse zzdseVar = (zzdse) it.next();
            this.zzd.put(zzdseVar.zzc, zzdseVar);
        }
        this.zzc = aVar;
    }

    private final void zze(zzfgm zzfgmVar, boolean z2) {
        zzdse zzdseVar = (zzdse) this.zzd.get(zzfgmVar);
        if (zzdseVar == null) {
            return;
        }
        String str = true != z2 ? "f." : "s.";
        Map map = this.zza;
        zzfgm zzfgmVar2 = zzdseVar.zzb;
        if (map.containsKey(zzfgmVar2)) {
            ((ud.b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfgmVar2)).longValue();
            this.zzb.zzb().put("label.".concat(zzdseVar.zza), str + jElapsedRealtime);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzd(zzfgm zzfgmVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfgmVar)) {
            ((ud.b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfgmVar)).longValue();
            zzdrw zzdrwVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzdrwVar.zzb().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfgmVar)) {
            zze(zzfgmVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdF(zzfgm zzfgmVar, String str, Throwable th2) {
        Map map = this.zza;
        if (map.containsKey(zzfgmVar)) {
            ((ud.b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfgmVar)).longValue();
            zzdrw zzdrwVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzdrwVar.zzb().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfgmVar)) {
            zze(zzfgmVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdG(zzfgm zzfgmVar, String str) {
        ((ud.b) this.zzc).getClass();
        this.zza.put(zzfgmVar, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfgt
    public final void zzdE(zzfgm zzfgmVar, String str) {
    }
}
