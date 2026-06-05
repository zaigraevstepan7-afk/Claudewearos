package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzegt {
    private final ud.a zza;
    private final zzegv zzb;
    private final zzfjq zzc;
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgV)).booleanValue();
    private final zzedj zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzegt(ud.a aVar, zzegv zzegvVar, zzedj zzedjVar, zzfjq zzfjqVar) {
        this.zza = aVar;
        this.zzb = zzegvVar;
        this.zzf = zzedjVar;
        this.zzc = zzfjqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfbt zzfbtVar) {
        zzegs zzegsVar = (zzegs) this.zzd.get(zzfbtVar);
        if (zzegsVar == null) {
            return false;
        }
        return zzegsVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    public final synchronized mf.a zzf(zzfcf zzfcfVar, zzfbt zzfbtVar, mf.a aVar, zzfjm zzfjmVar) {
        zzfbw zzfbwVar = zzfcfVar.zzb.zzb;
        ((ud.b) this.zza).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str = zzfbtVar.zzw;
        if (str != null) {
            this.zzd.put(zzfbtVar, new zzegs(str, zzfbtVar.zzaf, 9, 0L, null));
            zzgdb.zzr(aVar, new zzegr(this, jElapsedRealtime, zzfbwVar, zzfbtVar, str, zzfjmVar, zzfcfVar), zzcad.zzg);
        }
        return aVar;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.zzd.entrySet().iterator();
            while (it.hasNext()) {
                zzegs zzegsVar = (zzegs) ((Map.Entry) it.next()).getValue();
                if (zzegsVar.zzc != Integer.MAX_VALUE) {
                    arrayList.add(zzegsVar.toString());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(zzfbt zzfbtVar) {
        try {
            ((ud.b) this.zza).getClass();
            this.zzh = SystemClock.elapsedRealtime() - this.zzi;
            if (zzfbtVar != null) {
                this.zzf.zze(zzfbtVar);
            }
            this.zzg = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzj() {
        ((ud.b) this.zza).getClass();
        this.zzh = SystemClock.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        ((ud.b) this.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbt zzfbtVar = (zzfbt) it.next();
            String str = zzfbtVar.zzw;
            if (!TextUtils.isEmpty(str)) {
                this.zzd.put(zzfbtVar, new zzegs(str, zzfbtVar.zzaf, f.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        ((ud.b) this.zza).getClass();
        this.zzi = SystemClock.elapsedRealtime();
    }

    public final synchronized void zzm(zzfbt zzfbtVar) {
        zzegs zzegsVar = (zzegs) this.zzd.get(zzfbtVar);
        if (zzegsVar == null || this.zzg) {
            return;
        }
        zzegsVar.zzc = 8;
    }
}
