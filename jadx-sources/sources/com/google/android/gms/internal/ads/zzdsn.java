package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mc.n;
import nc.t;
import qc.n0;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdsn {
    private final String zze;
    private final zzdsh zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final n0 zza = n.D.f11582h.zzi();

    public zzdsn(String str, zzdsh zzdshVar) {
        this.zze = str;
        this.zzf = zzdshVar;
    }

    private final Map zzg() {
        Map mapZza = this.zzf.zza();
        n.D.f11584k.getClass();
        mapZza.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        mapZza.put("tid", ((o0) this.zza).k() ? "" : this.zze);
        return mapZza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcj)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "aaia");
            mapZzg.put("aair", "MalformedJson");
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzb(String str, String str2) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcj)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_finished");
            mapZzg.put("ancn", str);
            mapZzg.put("rqe", str2);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzc(String str) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcj)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_started");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcj)).booleanValue()) {
            Map mapZzg = zzg();
            mapZzg.put("action", "adapter_init_finished");
            mapZzg.put("ancn", str);
            this.zzb.add(mapZzg);
        }
    }

    public final synchronized void zze() {
        try {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcj)).booleanValue() && !this.zzd) {
                Map mapZzg = zzg();
                mapZzg.put("action", "init_finished");
                List list = this.zzb;
                list.add(mapZzg);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.zzf.zzg((Map) it.next());
                }
                this.zzd = true;
            }
        } finally {
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcj)).booleanValue() && !this.zzc) {
            Map mapZzg = zzg();
            mapZzg.put("action", "init_started");
            this.zzb.add(mapZzg);
            this.zzc = true;
        }
    }
}
