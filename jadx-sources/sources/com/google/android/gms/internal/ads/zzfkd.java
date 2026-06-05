package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Locale;
import java.util.Map;
import nc.h2;
import qc.l0;
import qc.m0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfkd {
    private final zzdsc zza;
    private final String zzb;

    public zzfkd(zzdsc zzdscVar, Context context) {
        CharSequence charSequenceC;
        this.zza = zzdscVar;
        m0 m0Var = r0.f13445l;
        try {
            charSequenceC = wd.b.a(context).c(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e10) {
            int i10 = l0.f13401b;
            k.h("Failed to get application name", e10);
            charSequenceC = "";
        }
        this.zzb = charSequenceC.toString();
    }

    private final void zzq(String str, String str2, long j, int i10, int i11, String str3, zzfkl zzfklVar, String str4) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb(str2, Long.toString(j));
        zzdsbVarZza.zzb("app", this.zzb);
        if (zzfklVar != null) {
            zzdsbVarZza.zzb("ad_unit_id", zzfklVar.zzb());
            zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
            zzdsbVarZza.zzb("pid", zzfklVar.zzc());
        }
        zzdsbVarZza.zzb("action", str);
        if (str3 != null) {
            zzdsbVarZza.zzb("gqi", str3);
        }
        if (i10 >= 0) {
            zzdsbVarZza.zzb("max_ads", Integer.toString(i10));
        }
        if (i11 >= 0) {
            zzdsbVarZza.zzb("cache_size", Integer.toString(i11));
        }
        zzdsbVarZza.zzb("pv", str4);
        zzdsbVarZza.zzj();
    }

    private final void zzr(String str, long j, String str2, String str3, fc.b bVar, int i10, int i11, int i12, String str4) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", str);
        zzdsbVarZza.zzb("pat", Long.toString(j));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("ad_format", bVar.name().toLowerCase(Locale.ENGLISH));
        zzdsbVarZza.zzb("max_ads", Integer.toString(i10));
        zzdsbVarZza.zzb("cache_size", Integer.toString(i11));
        zzdsbVarZza.zzb("pas", Integer.toString(i12));
        zzdsbVarZza.zzb("pv", "2");
        zzdsbVarZza.zzb("ad_unit_id", str3);
        zzdsbVarZza.zzb("pid", str2);
        zzdsbVarZza.zzj();
    }

    public final void zza(int i10, int i11, long j, zzfkl zzfklVar) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", "cache_resize");
        zzdsbVarZza.zzb("cs_ts", Long.toString(j));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("orig_ma", Integer.toString(i10));
        zzdsbVarZza.zzb("max_ads", Integer.toString(i11));
        zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
        zzdsbVarZza.zzb("ad_unit_id", zzfklVar.zzb());
        zzdsbVarZza.zzb("pid", zzfklVar.zzc());
        zzdsbVarZza.zzb("pv", "1");
        zzdsbVarZza.zzj();
    }

    public final void zzb(long j, String str, String str2, fc.b bVar, int i10, int i11) {
        zzr("pd", j, str, str2, bVar, i10, i11, 1, "2");
    }

    public final void zzc(long j, fc.b bVar, int i10) {
        zzr("pda", j, null, null, bVar, -1, -1, i10, "2");
    }

    public final void zzd(long j, String str, String str2, fc.b bVar, int i10, int i11) {
        zzr("pgc", j, str, str2, bVar, i10, i11, 1, "2");
    }

    public final void zze(fc.b bVar, long j, int i10) {
        zzr("pgcs", j, null, null, bVar, -1, -1, i10, "2");
    }

    public final void zzf(int i10, long j, String str, String str2, fc.b bVar, int i11) {
        zzr("pnav", j, str, str2, bVar, i11, i10, 1, "2");
    }

    public final void zzg(long j, String str) {
        zzq("poll_ad", "ppacwe_ts", j, -1, -1, null, null, "2");
    }

    public final void zzh(int i10, int i11, long j, Long l10, String str, zzfkl zzfklVar, String str2) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("plaac_ts", Long.toString(j));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("max_ads", Integer.toString(i10));
        zzdsbVarZza.zzb("cache_size", Integer.toString(i11));
        zzdsbVarZza.zzb("action", "is_ad_available");
        if (zzfklVar != null) {
            zzdsbVarZza.zzb("ad_unit_id", zzfklVar.zzb());
            zzdsbVarZza.zzb("pid", zzfklVar.zzc());
            zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
        }
        if (l10 != null) {
            zzdsbVarZza.zzb("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            zzdsbVarZza.zzb("gqi", str);
        }
        zzdsbVarZza.zzb("pv", str2);
        zzdsbVarZza.zzj();
    }

    public final void zzi(long j, String str, zzfkl zzfklVar, int i10, int i11, String str2) {
        zzq("paa", "pano_ts", j, i10, i11, str, zzfklVar, str2);
    }

    public final void zzj(long j, zzfkl zzfklVar, int i10, String str) {
        zzq("pae", "paeo_ts", j, i10, 0, null, zzfklVar, str);
    }

    public final void zzk(long j, zzfkl zzfklVar, h2 h2Var, int i10, int i11, String str) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", "pftla");
        zzdsbVarZza.zzb("pftlat_ts", Long.toString(j));
        zzdsbVarZza.zzb("pftlaec", Integer.toString(h2Var.f12114a));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
        zzdsbVarZza.zzb("max_ads", Integer.toString(i10));
        zzdsbVarZza.zzb("cache_size", Integer.toString(i11));
        zzdsbVarZza.zzb("ad_unit_id", zzfklVar.zzb());
        zzdsbVarZza.zzb("pid", zzfklVar.zzc());
        zzdsbVarZza.zzb("pv", str);
        zzdsbVarZza.zzj();
    }

    public final void zzl(long j, zzfkl zzfklVar, int i10, int i11, String str) {
        zzq("poll_ad", "ppac_ts", j, i10, i11, null, zzfklVar, str);
    }

    public final void zzm(long j, int i10, int i11, String str, zzfkl zzfklVar, String str2) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("ppla_ts", Long.toString(j));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
        zzdsbVarZza.zzb("ad_unit_id", zzfklVar.zzb());
        zzdsbVarZza.zzb("pid", zzfklVar.zzc());
        zzdsbVarZza.zzb("max_ads", Integer.toString(i10));
        zzdsbVarZza.zzb("cache_size", Integer.toString(i11));
        zzdsbVarZza.zzb("action", "poll_ad");
        if (str != null) {
            zzdsbVarZza.zzb("gqi", str);
        }
        zzdsbVarZza.zzb("pv", str2);
        zzdsbVarZza.zzj();
    }

    public final void zzn(long j, int i10, int i11, String str, zzfkl zzfklVar, String str2) {
        zzq("poll_ad", "psvroc_ts", j, i10, i11, str, zzfklVar, str2);
    }

    public final void zzo(Map map, long j, String str) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", "start_preload");
        zzdsbVarZza.zzb("sp_ts", Long.toString(j));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("pv", "1");
        for (fc.b bVar : map.keySet()) {
            String strValueOf = String.valueOf(bVar.name().toLowerCase(Locale.ENGLISH));
            zzdsbVarZza.zzb(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(bVar)).intValue()));
        }
        zzdsbVarZza.zzj();
    }

    public final void zzp(int i10, long j, zzfkl zzfklVar, String str) {
        zzdsb zzdsbVarZza = this.zza.zza();
        zzdsbVarZza.zzb("action", "start_preload");
        zzdsbVarZza.zzb("sp_ts", Long.toString(j));
        zzdsbVarZza.zzb("app", this.zzb);
        zzdsbVarZza.zzb("ad_format", zzfklVar.zza());
        zzdsbVarZza.zzb("ad_unit_id", zzfklVar.zzb());
        zzdsbVarZza.zzb("pid", zzfklVar.zzc());
        zzdsbVarZza.zzb("max_ads", Integer.toString(i10));
        zzdsbVarZza.zzb("pv", str);
        zzdsbVarZza.zzj();
    }
}
