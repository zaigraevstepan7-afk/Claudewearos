package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import qc.l0;
import qc.r0;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcet extends zzcbf {
    private final zzcca zzc;
    private zzceu zzd;
    private Uri zze;
    private zzcbe zzf;
    private boolean zzg;
    private int zzh;

    public zzcet(Context context, zzcca zzccaVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzccaVar;
        zzccaVar.zza(this);
    }

    public static /* synthetic */ void zzi(zzcet zzcetVar) {
        zzcbe zzcbeVar = zzcetVar.zzf;
        if (zzcbeVar != null) {
            if (!zzcetVar.zzg) {
                zzcbeVar.zzg();
                zzcetVar.zzg = true;
            }
            zzcetVar.zzf.zze();
        }
    }

    public static /* synthetic */ void zzk(zzcet zzcetVar) {
        zzcbe zzcbeVar = zzcetVar.zzf;
        if (zzcbeVar != null) {
            zzcbeVar.zzd();
        }
    }

    public static /* synthetic */ void zzl(zzcet zzcetVar) {
        zzcbe zzcbeVar = zzcetVar.zzf;
        if (zzcbeVar != null) {
            zzcbeVar.zzf();
        }
    }

    private final boolean zzm() {
        int i10 = this.zzh;
        return (i10 == 1 || i10 == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i10) {
        if (i10 == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = i10;
    }

    @Override // android.view.View
    public final String toString() {
        return m1.w(zzcet.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zzb() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zzc() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final long zzg() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final long zzh() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final String zzj() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzcbf, com.google.android.gms.internal.ads.zzccc
    public final void zzn() {
        if (this.zzd != null) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzo() {
        l0.k("AdImmersivePlayerView pause");
        if (zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            zzv(5);
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzces
                @Override // java.lang.Runnable
                public final void run() {
                    zzcet.zzk(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzp() {
        l0.k("AdImmersivePlayerView play");
        if (zzm()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zzb();
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcer
                @Override // java.lang.Runnable
                public final void run() {
                    zzcet.zzi(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzq(int i10) {
        l0.k("AdImmersivePlayerView seek " + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzr(zzcbe zzcbeVar) {
        this.zzf = zzcbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzs(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzceu(uri.toString());
            zzv(3);
            r0.f13445l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcet.zzl(this.zza);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzt() {
        l0.k("AdImmersivePlayerView stop");
        zzceu zzceuVar = this.zzd;
        if (zzceuVar != null) {
            zzceuVar.zzc();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbf
    public final void zzu(float f10, float f11) {
    }
}
