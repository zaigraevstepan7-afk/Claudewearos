package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzauk extends zzaui {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzauk() {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
    }

    @Override // com.google.android.gms.internal.ads.zzaui
    public final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(4, this.zze);
        map.put(3, this.zzd);
        map.put(2, this.zzc);
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzauk(String str) {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
        HashMap mapZza = zzaui.zza(str);
        if (mapZza != null) {
            this.zza = mapZza.get(0) == null ? "E" : (String) mapZza.get(0);
            this.zzb = mapZza.get(1) != null ? ((Long) mapZza.get(1)).longValue() : -1L;
            this.zzc = mapZza.get(2) == null ? "E" : (String) mapZza.get(2);
            this.zzd = mapZza.get(3) == null ? "E" : (String) mapZza.get(3);
            this.zze = mapZza.get(4) != null ? (String) mapZza.get(4) : "E";
        }
    }
}
