package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcs {
    private CharSequence zza;
    private Bitmap zzb;
    private Layout.Alignment zzc;
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;
    private int zzp;

    public zzcs() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final zzcs zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final zzcs zzd(float f10) {
        this.zzm = f10;
        return this;
    }

    public final zzcs zze(float f10, int i10) {
        this.zze = f10;
        this.zzf = i10;
        return this;
    }

    public final zzcs zzf(int i10) {
        this.zzg = i10;
        return this;
    }

    public final zzcs zzg(Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzcs zzh(float f10) {
        this.zzh = f10;
        return this;
    }

    public final zzcs zzi(int i10) {
        this.zzi = i10;
        return this;
    }

    public final zzcs zzj(float f10) {
        this.zzo = f10;
        return this;
    }

    public final zzcs zzk(float f10) {
        this.zzl = f10;
        return this;
    }

    public final zzcs zzl(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzcs zzm(Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzcs zzn(float f10, int i10) {
        this.zzk = f10;
        this.zzj = i10;
        return this;
    }

    public final zzcs zzo(int i10) {
        this.zzn = i10;
        return this;
    }

    public final zzcs zzp(int i10) {
        this.zzp = i10;
        return this;
    }

    public final zzcu zzq() {
        return new zzcu(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, -16777216, this.zzn, this.zzo, this.zzp, null);
    }

    public final CharSequence zzr() {
        return this.zza;
    }

    public /* synthetic */ zzcs(zzcu zzcuVar, zzct zzctVar) {
        this.zza = zzcuVar.zza;
        this.zzb = zzcuVar.zzd;
        this.zzc = zzcuVar.zzb;
        this.zzd = zzcuVar.zzc;
        this.zze = zzcuVar.zze;
        this.zzf = zzcuVar.zzf;
        this.zzg = zzcuVar.zzg;
        this.zzh = zzcuVar.zzh;
        this.zzi = zzcuVar.zzi;
        this.zzj = zzcuVar.zzl;
        this.zzk = zzcuVar.zzm;
        this.zzl = zzcuVar.zzj;
        this.zzm = zzcuVar.zzk;
        this.zzn = zzcuVar.zzn;
        this.zzo = zzcuVar.zzo;
        this.zzp = zzcuVar.zzp;
    }
}
