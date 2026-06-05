package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import fc.h;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import nc.l2;
import nc.s3;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeej implements zzedk {
    private final Context zza;
    private final zzcps zzb;
    private final Executor zzc;

    public zzeej(Context context, zzcps zzcpsVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcpsVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final Object zza(zzfcf zzfcfVar, final zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        final View viewZza;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
            zzbpx zzbpxVarZzc = ((zzfdm) zzedhVar.zzb).zzc();
            if (zzbpxVarZzc == null) {
                int i10 = l0.f13401b;
                k.d("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfcv(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                viewZza = (View) xd.b.u(zzbpxVarZzc.zze());
                boolean zZzf = zzbpxVarZzc.zzf();
                if (viewZza == null) {
                    throw new zzfcv(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        viewZza = (View) zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzeeh
                            @Override // com.google.android.gms.internal.ads.zzgci
                            public final mf.a zza(Object obj) {
                                return zzgdb.zzh(zzcqh.zza(this.zza.zza, viewZza, zzfbtVar));
                            }
                        }, zzcad.zzf).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfcv(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfcv(e11);
            }
        } else {
            viewZza = ((zzfdm) zzedhVar.zzb).zza();
        }
        zzcps zzcpsVar = this.zzb;
        zzcrl zzcrlVar = new zzcrl(zzfcfVar, zzfbtVar, zzedhVar.zza);
        final zzfdm zzfdmVar = (zzfdm) zzedhVar.zzb;
        Objects.requireNonNull(zzfdmVar);
        zzcoo zzcooVarZza = zzcpsVar.zza(zzcrlVar, new zzcou(viewZza, null, new zzcqt() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzcqt
            public final l2 zza() {
                return zzfdmVar.zzb();
            }
        }, (zzfbu) zzfbtVar.zzu.get(0)));
        zzcooVarZza.zzh().zza(viewZza);
        zzcooVarZza.zzd().zzo(new zzcmb(zzfdmVar), this.zzc);
        ((zzeev) zzedhVar.zzc).zzc(zzcooVarZza.zzk());
        return zzcooVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedk
    public final void zzb(zzfcf zzfcfVar, zzfbt zzfbtVar, zzedh zzedhVar) throws zzfcv {
        s3 s3VarZza;
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        s3 s3Var = zzfcoVar.zze;
        boolean z2 = s3Var.G;
        int i10 = s3Var.f12221b;
        int i11 = s3Var.f12224e;
        if (z2) {
            Context context = this.zza;
            h hVar = new h(i11, i10);
            hVar.f6702e = true;
            hVar.f6703f = i10;
            s3VarZza = new s3(context, hVar);
        } else {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
                Context context2 = this.zza;
                h hVar2 = new h(i11, i10);
                hVar2.f6704g = true;
                hVar2.f6705h = i10;
                s3VarZza = new s3(context2, hVar2);
            } else {
                s3VarZza = zzfcu.zza(this.zza, zzfbtVar.zzu);
            }
        }
        s3 s3Var2 = s3VarZza;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzic)).booleanValue() && zzfbtVar.zzag) {
            ((zzfdm) zzedhVar.zzb).zzn(this.zza, s3Var2, zzfcoVar.zzd, zzfbtVar.zzv.toString(), hj.a.b0(zzfbtVar.zzs), (zzbpu) zzedhVar.zzc);
        } else {
            ((zzfdm) zzedhVar.zzb).zzm(this.zza, s3Var2, zzfcoVar.zzd, zzfbtVar.zzv.toString(), hj.a.b0(zzfbtVar.zzs), (zzbpu) zzedhVar.zzc);
        }
    }
}
