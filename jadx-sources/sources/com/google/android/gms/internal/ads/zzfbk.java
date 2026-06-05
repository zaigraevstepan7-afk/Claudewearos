package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.e0;
import mc.n;
import nc.a2;
import nc.i2;
import nc.q3;
import nc.t;
import nc.y1;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfbk extends zzbws {
    private final zzfbg zza;
    private final zzfaw zzb;
    private final String zzc;
    private final zzfcg zzd;
    private final Context zze;
    private final rc.a zzf;
    private final zzavs zzg;
    private final zzdsc zzh;
    private zzdog zzi;
    private boolean zzj = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaQ)).booleanValue();

    public zzfbk(String str, zzfbg zzfbgVar, Context context, zzfaw zzfawVar, zzfcg zzfcgVar, rc.a aVar, zzavs zzavsVar, zzdsc zzdscVar) {
        this.zzc = str;
        this.zza = zzfbgVar;
        this.zzb = zzfawVar;
        this.zzd = zzfcgVar;
        this.zze = context;
        this.zzf = aVar;
        this.zzg = zzavsVar;
        this.zzh = zzdscVar;
    }

    private final synchronized void zzv(q3 q3Var, zzbxa zzbxaVar, int i10) {
        try {
            if (!q3Var.c()) {
                boolean z2 = false;
                if (((Boolean) zzbfa.zzk.zze()).booleanValue()) {
                    if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlu)).booleanValue()) {
                        z2 = true;
                    }
                }
                if (this.zzf.f14323c < ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzlv)).intValue() || !z2) {
                    e0.d("#008 Must be called on the main UI thread.");
                }
            }
            zzfaw zzfawVar = this.zzb;
            zzfawVar.zzk(zzbxaVar);
            r0 r0Var = n.D.f11577c;
            if (r0.g(this.zze) && q3Var.L == null) {
                int i11 = l0.f13401b;
                k.d("Failed to load the ad because app ID is missing.");
                zzfawVar.zzdD(zzfdp.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzfay zzfayVar = new zzfay(null);
            zzfbg zzfbgVar = this.zza;
            zzfbgVar.zzj(i10);
            zzfbgVar.zzb(q3Var, this.zzc, zzfayVar, new zzfbj(this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final Bundle zzb() {
        e0.d("#008 Must be called on the main UI thread.");
        zzdog zzdogVar = this.zzi;
        return zzdogVar != null ? zzdogVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final i2 zzc() {
        zzdog zzdogVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgR)).booleanValue() && (zzdogVar = this.zzi) != null) {
            return zzdogVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final zzbwq zzd() {
        e0.d("#008 Must be called on the main UI thread.");
        zzdog zzdogVar = this.zzi;
        if (zzdogVar != null) {
            return zzdogVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final String zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized String zzf() {
        zzdog zzdogVar = this.zzi;
        if (zzdogVar == null || zzdogVar.zzl() == null) {
            return null;
        }
        return zzdogVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzg(q3 q3Var, zzbxa zzbxaVar) {
        zzv(q3Var, zzbxaVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzh(q3 q3Var, zzbxa zzbxaVar) {
        zzv(q3Var, zzbxaVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzi(boolean z2) {
        e0.d("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzj(y1 y1Var) {
        if (y1Var == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfbi(this, y1Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzk(a2 a2Var) {
        e0.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!a2Var.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.c("Error in making CSI ping for reporting paid event callback", e10);
        }
        this.zzb.zzi(a2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzl(zzbww zzbwwVar) {
        e0.d("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzm(zzbxh zzbxhVar) {
        e0.d("#008 Must be called on the main UI thread.");
        zzfcg zzfcgVar = this.zzd;
        zzfcgVar.zza = zzbxhVar.zza;
        zzfcgVar.zzb = zzbxhVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzn(xd.a aVar) {
        zzo(aVar, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final synchronized void zzo(xd.a aVar, boolean z2) {
        e0.d("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i10 = l0.f13401b;
            k.g("Rewarded can not be shown before loaded");
            this.zzb.zzr(zzfdp.zzd(9, null, null));
        } else {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdb)).booleanValue()) {
                this.zzg.zzc().zzn(new Throwable().getStackTrace());
            }
            this.zzi.zzh(z2, (Activity) xd.b.u(aVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final boolean zzp() {
        e0.d("#008 Must be called on the main UI thread.");
        zzdog zzdogVar = this.zzi;
        return (zzdogVar == null || zzdogVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbwt
    public final void zzq(zzbxb zzbxbVar) {
        e0.d("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbxbVar);
    }
}
