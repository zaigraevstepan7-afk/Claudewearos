package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzegv {
    private final zzfdg zza;
    private final zzdpp zzb;
    private final zzdsc zzc;

    public zzegv(zzfdg zzfdgVar, zzdpp zzdppVar, zzdsc zzdscVar) {
        this.zza = zzfdgVar;
        this.zzb = zzdppVar;
        this.zzc = zzdscVar;
    }

    public final void zza(zzfbw zzfbwVar, zzfbt zzfbtVar, int i10, zzedi zzediVar, long j) {
        zzdpo zzdpoVarZza;
        zzdsb zzdsbVarZza = this.zzc.zza();
        zzdsbVarZza.zzd(zzfbwVar);
        zzdsbVarZza.zzc(zzfbtVar);
        zzdsbVarZza.zzb("action", "adapter_status");
        zzdsbVarZza.zzb("adapter_l", String.valueOf(j));
        zzdsbVarZza.zzb("sc", Integer.toString(i10));
        if (zzediVar != null) {
            zzdsbVarZza.zzb("arec", Integer.toString(zzediVar.zzb().f12114a));
            String strZza = this.zza.zza(zzediVar.getMessage());
            if (strZza != null) {
                zzdsbVarZza.zzb("areec", strZza);
            }
        }
        zzdpp zzdppVar = this.zzb;
        Iterator it = zzfbtVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzdpoVarZza = null;
                break;
            } else {
                zzdpoVarZza = zzdppVar.zza((String) it.next());
                if (zzdpoVarZza != null) {
                    break;
                }
            }
        }
        if (zzdpoVarZza != null) {
            zzdsbVarZza.zzb("ancn", zzdpoVarZza.zza);
            zzbsc zzbscVar = zzdpoVarZza.zzb;
            if (zzbscVar != null) {
                zzdsbVarZza.zzb("adapter_v", zzbscVar.toString());
            }
            zzbsc zzbscVar2 = zzdpoVarZza.zzc;
            if (zzbscVar2 != null) {
                zzdsbVarZza.zzb("adapter_sv", zzbscVar2.toString());
            }
        }
        zzdsbVarZza.zzj();
    }
}
