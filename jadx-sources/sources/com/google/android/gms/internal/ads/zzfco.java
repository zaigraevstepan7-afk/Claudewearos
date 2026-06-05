package com.google.android.gms.internal.ads;

import android.os.Bundle;
import ic.g;
import java.util.ArrayList;
import java.util.List;
import nc.b1;
import nc.e1;
import nc.n3;
import nc.q3;
import nc.s3;
import nc.t;
import nc.v3;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfco {
    public final n3 zza;
    public final zzbmn zzb;
    public final zzekq zzc;
    public final q3 zzd;
    public final s3 zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbgc zzi;
    public final v3 zzj;
    public final int zzk;
    public final ic.a zzl;
    public final g zzm;
    public final b1 zzn;
    public final zzfcb zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final e1 zzt;

    public zzfco(zzfcm zzfcmVar, zzfcn zzfcnVar) {
        this.zze = zzfcmVar.zzb;
        this.zzf = zzfcmVar.zzc;
        this.zzt = zzfcmVar.zzu;
        int i10 = zzfcmVar.zza.f12190a;
        long j = zzfcmVar.zza.f12191b;
        Bundle bundle = zzfcmVar.zza.f12192c;
        int i11 = zzfcmVar.zza.f12193d;
        List list = zzfcmVar.zza.f12194e;
        boolean z2 = zzfcmVar.zza.f12195f;
        int i12 = zzfcmVar.zza.f12196z;
        boolean z10 = true;
        if (!zzfcmVar.zza.A && !zzfcmVar.zze) {
            z10 = false;
        }
        this.zzd = new q3(i10, j, bundle, i11, list, z2, i12, z10, zzfcmVar.zza.B, zzfcmVar.zza.C, zzfcmVar.zza.D, zzfcmVar.zza.E, zzfcmVar.zza.F, zzfcmVar.zza.G, zzfcmVar.zza.H, zzfcmVar.zza.I, zzfcmVar.zza.J, zzfcmVar.zza.K, zzfcmVar.zza.L, zzfcmVar.zza.M, zzfcmVar.zza.N, zzfcmVar.zza.O, r0.t(zzfcmVar.zza.P), zzfcmVar.zza.Q, zzfcmVar.zza.R, zzfcmVar.zza.S);
        this.zza = zzfcmVar.zzd != null ? zzfcmVar.zzd : zzfcmVar.zzh != null ? zzfcmVar.zzh.zzf : null;
        this.zzg = zzfcmVar.zzf;
        this.zzh = zzfcmVar.zzg;
        this.zzi = zzfcmVar.zzf == null ? null : zzfcmVar.zzh == null ? new zzbgc(new ic.e(new ic.d())) : zzfcmVar.zzh;
        this.zzj = zzfcmVar.zzi;
        this.zzk = zzfcmVar.zzm;
        this.zzl = zzfcmVar.zzj;
        this.zzm = zzfcmVar.zzk;
        this.zzn = zzfcmVar.zzl;
        this.zzb = zzfcmVar.zzn;
        this.zzo = new zzfcb(zzfcmVar.zzo, null);
        this.zzp = zzfcmVar.zzp;
        this.zzq = zzfcmVar.zzq;
        this.zzc = zzfcmVar.zzr;
        this.zzr = zzfcmVar.zzs;
        this.zzs = zzfcmVar.zzt;
    }

    public final boolean zza() {
        return this.zzf.matches((String) t.f12227d.f12230c.zzb(zzbdc.zzdv));
    }
}
