package com.google.android.gms.internal.ads;

import android.content.Context;
import mc.n;
import nc.t;
import org.json.JSONException;
import qc.n0;
import qc.o0;
import xc.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcua implements zzcyt, zzdei {
    private final Context zza;
    private final zzfco zzb;
    private final rc.a zzc;
    private final n0 zzd;
    private final zzdug zze;
    private final zzfhp zzf;
    private final zzdvb zzg;

    public zzcua(Context context, zzfco zzfcoVar, rc.a aVar, n0 n0Var, zzdug zzdugVar, zzfhp zzfhpVar, zzdvb zzdvbVar) {
        this.zza = context;
        this.zzb = zzfcoVar;
        this.zzc = aVar;
        this.zzd = n0Var;
        this.zze = zzdugVar;
        this.zzf = zzfhpVar;
        this.zzg = zzdvbVar;
    }

    private final void zzc() throws JSONException {
        String strZzb;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzej)).booleanValue()) {
            n0 n0Var = this.zzd;
            Context context = this.zza;
            rc.a aVar = this.zzc;
            zzfco zzfcoVar = this.zzb;
            zzfhp zzfhpVar = this.zzf;
            zzdvb zzdvbVar = this.zzg;
            String str = zzfcoVar.zzf;
            zzbzk zzbzkVarN = ((o0) n0Var).n();
            mc.e eVar = n.D.f11585l;
            boolean zZzq = zzdvbVar.zzq();
            if (zzbzkVarN != null) {
                eVar.getClass();
                strZzb = zzbzkVarN.zzb();
            } else {
                strZzb = null;
            }
            eVar.k(context, aVar, false, zzbzkVarN, strZzb, str, null, zzfhpVar, null, null, zZzq);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) throws JSONException {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze(v vVar) throws JSONException {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzek)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf(String str) {
    }
}
