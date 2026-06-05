package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import nc.a2;
import nc.i2;
import nc.m0;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcoi extends zzbat {
    private final zzcoh zza;
    private final m0 zzb;
    private final zzexr zzc;
    private boolean zzd = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaT)).booleanValue();
    private final zzdsc zze;

    public zzcoi(zzcoh zzcohVar, m0 m0Var, zzexr zzexrVar, zzdsc zzdscVar) {
        this.zza = zzcohVar;
        this.zzb = m0Var;
        this.zzc = zzexrVar;
        this.zze = zzdscVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final m0 zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final i2 zzf() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgR)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final String zzg() {
        try {
            return this.zzb.zzr();
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzh(boolean z2) {
        this.zzd = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzi(a2 a2Var) {
        e0.d("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!a2Var.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                k.c("Error in making CSI ping for reporting paid event callback", e10);
            }
            this.zzc.zzn(a2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzj(xd.a aVar, zzbbb zzbbbVar) {
        try {
            this.zzc.zzp(zzbbbVar);
            this.zza.zzd((Activity) xd.b.u(aVar), zzbbbVar, this.zzd);
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
        }
    }
}
