package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import nc.l2;
import nc.m0;
import nc.s3;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcoq extends zzcon {
    private final Context zzc;
    private final View zzd;
    private final zzcfe zze;
    private final zzfbu zzf;
    private final zzcqt zzg;
    private final zzdix zzh;
    private final zzddy zzi;
    private final zzhfs zzj;
    private final Executor zzk;
    private s3 zzl;

    public zzcoq(zzcqu zzcquVar, Context context, zzfbu zzfbuVar, View view, zzcfe zzcfeVar, zzcqt zzcqtVar, zzdix zzdixVar, zzddy zzddyVar, zzhfs zzhfsVar, Executor executor) {
        super(zzcquVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcfeVar;
        this.zzf = zzfbuVar;
        this.zzg = zzcqtVar;
        this.zzh = zzdixVar;
        this.zzi = zzddyVar;
        this.zzj = zzhfsVar;
        this.zzk = executor;
    }

    public static void zzj(zzcoq zzcoqVar) {
        zzbhy zzbhyVarZze = zzcoqVar.zzh.zze();
        if (zzbhyVarZze == null) {
            return;
        }
        try {
            zzbhyVarZze.zze((m0) zzcoqVar.zzj.zzb(), new xd.b(zzcoqVar.zzc));
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.e("RemoteException when notifyAdLoad is called", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final int zzc() {
        zzbct zzbctVar = zzbdc.zzic;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzid)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final View zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final l2 zze() {
        try {
            return this.zzg.zza();
        } catch (zzfcv unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final zzfbu zzf() {
        s3 s3Var = this.zzl;
        if (s3Var != null) {
            return zzfcu.zzb(s3Var);
        }
        zzfbt zzfbtVar = this.zzb;
        if (zzfbtVar.zzac) {
            for (String str : zzfbtVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfbu(view.getWidth(), view.getHeight(), false);
        }
        return (zzfbu) zzfbtVar.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final zzfbu zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final void zzh() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcon
    public final void zzi(ViewGroup viewGroup, s3 s3Var) {
        zzcfe zzcfeVar;
        if (viewGroup == null || (zzcfeVar = this.zze) == null) {
            return;
        }
        zzcfeVar.zzaj(zzcgy.zzc(s3Var));
        viewGroup.setMinimumHeight(s3Var.f12222c);
        viewGroup.setMinimumWidth(s3Var.f12225f);
        this.zzl = s3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zzk() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcop
            @Override // java.lang.Runnable
            public final void run() {
                zzcoq.zzj(this.zza);
            }
        });
        super.zzk();
    }
}
