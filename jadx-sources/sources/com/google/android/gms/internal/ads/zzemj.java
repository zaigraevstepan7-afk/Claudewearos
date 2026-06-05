package com.google.android.gms.internal.ads;

import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import nc.s3;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzemj implements zzett {
    public final s3 zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;
    public final Insets zzj;

    public zzemj(s3 s3Var, String str, boolean z2, String str2, float f10, int i10, int i11, String str3, boolean z10, Insets insets) {
        e0.j(s3Var, "the adSize must not be null");
        this.zza = s3Var;
        this.zzb = str;
        this.zzc = z2;
        this.zzd = str2;
        this.zze = f10;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = str3;
        this.zzi = z10;
        this.zzj = insets;
    }

    private final void zzc(Bundle bundle) {
        Insets insets;
        s3 s3Var = this.zza;
        int i10 = s3Var.f12224e;
        boolean z2 = s3Var.H;
        zzfdc.zzf(bundle, "smart_w", "full", i10 == -1);
        int i11 = s3Var.f12221b;
        zzfdc.zzf(bundle, "smart_h", "auto", i11 == -2);
        zzfdc.zzg(bundle, "ene", true, s3Var.C);
        zzfdc.zzf(bundle, "rafmt", "102", s3Var.F);
        zzfdc.zzf(bundle, "rafmt", "103", s3Var.G);
        zzfdc.zzf(bundle, "rafmt", "105", z2);
        zzfdc.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfdc.zzg(bundle, "interscroller_slot", true, z2);
        zzfdc.zzc(bundle, "format", this.zzb);
        zzfdc.zzf(bundle, "fluid", "height", this.zzc);
        zzfdc.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(r2));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str = this.zzh;
        zzfdc.zzf(bundle, "sc", str, true ^ TextUtils.isEmpty(str));
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznw)).booleanValue() && Build.VERSION.SDK_INT >= 35 && (insets = this.zzj) != null) {
            bundle.putInt("sam_t", insets.top);
            bundle.putInt("sam_b", insets.bottom);
            bundle.putInt("sam_l", insets.left);
            bundle.putInt("sam_r", insets.right);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        s3[] s3VarArr = s3Var.f12226z;
        if (s3VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i11);
            bundle2.putInt("width", i10);
            bundle2.putBoolean("is_fluid_height", s3Var.B);
            arrayList.add(bundle2);
        } else {
            for (s3 s3Var2 : s3VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", s3Var2.B);
                bundle3.putInt("height", s3Var2.f12221b);
                bundle3.putInt("width", s3Var2.f12224e);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzcut) obj).zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzcut) obj).zza);
    }
}
