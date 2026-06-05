package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import nc.l2;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdhu extends zzbgj {
    private final zzdim zza;
    private xd.a zzb;

    public zzdhu(zzdim zzdimVar) {
        this.zza = zzdimVar;
    }

    private static float zzb(xd.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) xd.b.u(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zze() {
        zzdim zzdimVar = this.zza;
        if (zzdimVar.zzb() != 0.0f) {
            return zzdimVar.zzb();
        }
        if (zzdimVar.zzj() != null) {
            try {
                return zzdimVar.zzj().zze();
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                k.e("Remote exception getting video controller aspect ratio.", e10);
                return 0.0f;
            }
        }
        xd.a aVar = this.zzb;
        if (aVar != null) {
            return zzb(aVar);
        }
        zzbgn zzbgnVarZzm = zzdimVar.zzm();
        if (zzbgnVarZzm == null) {
            return 0.0f;
        }
        float fZzd = (zzbgnVarZzm.zzd() == -1 || zzbgnVarZzm.zzc() == -1) ? 0.0f : zzbgnVarZzm.zzd() / zzbgnVarZzm.zzc();
        return fZzd == 0.0f ? zzb(zzbgnVarZzm.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zzf() {
        zzdim zzdimVar = this.zza;
        if (zzdimVar.zzj() != null) {
            return zzdimVar.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final float zzg() {
        zzdim zzdimVar = this.zza;
        if (zzdimVar.zzj() != null) {
            return zzdimVar.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final l2 zzh() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final xd.a zzi() {
        xd.a aVar = this.zzb;
        if (aVar != null) {
            return aVar;
        }
        zzbgn zzbgnVarZzm = this.zza.zzm();
        if (zzbgnVarZzm == null) {
            return null;
        }
        return zzbgnVarZzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zzj(xd.a aVar) {
        this.zzb = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final boolean zzk() {
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final boolean zzl() {
        return this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zzm(zzbhv zzbhvVar) {
        zzdim zzdimVar = this.zza;
        if (zzdimVar.zzj() instanceof zzcgg) {
            ((zzcgg) zzdimVar.zzj()).zzv(zzbhvVar);
        }
    }
}
