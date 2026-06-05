package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import nc.s;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfda {
    private final zzfbt zza;
    private final zzfbw zzb;
    private final zzfjq zzc;
    private final zzfji zzd;
    private final zzfhm zze;
    private final zzcml zzf;

    public zzfda(zzfjq zzfjqVar, zzfji zzfjiVar, zzfbt zzfbtVar, zzfbw zzfbwVar, zzcml zzcmlVar, zzfhm zzfhmVar) {
        this.zza = zzfbtVar;
        this.zzb = zzfbwVar;
        this.zzc = zzfjqVar;
        this.zzd = zzfjiVar;
        this.zzf = zzcmlVar;
        this.zze = zzfhmVar;
    }

    public final void zza(List list, zzcyb zzcybVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2, zzcybVar);
        }
    }

    public final void zzb(String str, int i10, zzcyb zzcybVar) {
        zzfbt zzfbtVar = this.zza;
        if (zzfbtVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i10);
            return;
        }
        this.zzc.zzd(str, zzfbtVar.zzax, this.zze, zzcybVar);
    }

    public final void zzc(List list, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzgdb.zzr((((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkn)).booleanValue() && zzcml.zzj(str)) ? this.zzf.zze(str, s.f12202f.f12207e) : zzgdb.zzh(str), new zzfcz(this, i10), zzcad.zza);
        }
    }
}
