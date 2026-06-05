package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import mc.n;
import nc.t;
import qc.n0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeno implements zzetu {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcsl zze;
    private final zzfdv zzf;
    private final zzfco zzg;
    private final n0 zzh = n.D.f11582h.zzi();
    private final zzdrw zzi;
    private final zzcsz zzj;

    public zzeno(Context context, String str, String str2, zzcsl zzcslVar, zzfdv zzfdvVar, zzfco zzfcoVar, zzdrw zzdrwVar, zzcsz zzcszVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcslVar;
        this.zzf = zzfdvVar;
        this.zzg = zzfcoVar;
        this.zzi = zzdrwVar;
        this.zzj = zzcszVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        Bundle bundle = new Bundle();
        zzdrw zzdrwVar = this.zzi;
        Map mapZzb = zzdrwVar.zzb();
        String str = this.zzb;
        mapZzb.put("seq_num", str);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzco)).booleanValue()) {
            n.D.f11584k.getClass();
            zzdrwVar.zzd("tsacc", String.valueOf(System.currentTimeMillis() - this.zzd));
            zzdrwVar.zzd("foreground", true != r0.f(this.zza) ? "1" : "0");
        }
        zzcsl zzcslVar = this.zze;
        zzfco zzfcoVar = this.zzg;
        zzcslVar.zzk(zzfcoVar.zzd);
        bundle.putAll(this.zzf.zzb());
        return zzgdb.zzh(new zzenp(this.zza, bundle, str, this.zzc, this.zzh, zzfcoVar.zzf, this.zzj));
    }
}
