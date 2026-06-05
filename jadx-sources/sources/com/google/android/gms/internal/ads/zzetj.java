package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzetj implements zzett {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;

    public zzetj(boolean z2, boolean z10, String str, boolean z11, int i10, int i11, int i12, String str2) {
        this.zza = z2;
        this.zzb = z10;
        this.zzc = str;
        this.zzd = z11;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcut) obj).zzb;
        bundle.putString("js", this.zzc);
        bundle.putInt("target_api", this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        zzbct zzbctVar = zzbdc.zzdX;
        t tVar = t.f12227d;
        bundle.putString("extra_caps", (String) tVar.f12230c.zzb(zzbctVar));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzgd)).booleanValue()) {
            String str = this.zzh;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleZza = zzfdc.zza(bundle, "sdk_env");
        bundleZza.putBoolean("mf", ((Boolean) zzbfc.zzc.zze()).booleanValue());
        bundleZza.putBoolean("instant_app", this.zza);
        bundleZza.putBoolean("lite", this.zzb);
        bundleZza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", bundleZza);
        Bundle bundleZza2 = zzfdc.zza(bundleZza, "build_meta");
        bundleZza2.putString("cl", "761682454");
        bundleZza2.putString("rapid_rc", "dev");
        bundleZza2.putString("rapid_rollup", "HEAD");
        bundleZza.putBundle("build_meta", bundleZza2);
    }
}
