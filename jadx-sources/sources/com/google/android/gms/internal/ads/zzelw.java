package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import nc.q3;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzelw implements zzett {
    final zzfco zza;
    private final long zzb;

    public zzelw(zzfco zzfcoVar, long j) {
        this.zza = zzfcoVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zza(Object obj) {
        Bundle bundle = ((zzcut) obj).zzb;
        zzfco zzfcoVar = this.zza;
        bundle.putString("slotname", zzfcoVar.zzf);
        q3 q3Var = zzfcoVar.zzd;
        if (q3Var.f12195f) {
            bundle.putBoolean("test_request", true);
        }
        int i10 = q3Var.f12196z;
        zzfdc.zze(bundle, "tag_for_child_directed_treatment", i10, i10 != -1);
        if (q3Var.f12190a >= 8) {
            int i11 = q3Var.M;
            zzfdc.zze(bundle, "tag_for_under_age_of_consent", i11, i11 != -1);
        }
        zzfdc.zzc(bundle, "url", q3Var.E);
        zzfdc.zzd(bundle, "neighboring_content_urls", q3Var.O);
        Bundle bundle2 = q3Var.f12192c;
        Bundle bundle3 = (Bundle) bundle2.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) t.f12227d.f12230c.zzb(zzbdc.zzhJ)).split(",", -1)));
        for (String str : bundle2.keySet()) {
            if (!hashSet.contains(str)) {
                bundle3.remove(str);
            }
        }
        zzfdc.zzb(bundle, "extras", bundle3);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) {
        Bundle bundle = ((zzcut) obj).zza;
        zzfco zzfcoVar = this.zza;
        q3 q3Var = zzfcoVar.zzd;
        int i10 = q3Var.P;
        Bundle bundle2 = q3Var.f12192c;
        bundle.putInt("http_timeout_millis", i10);
        bundle.putString("slotname", zzfcoVar.zzf);
        int i11 = zzfcoVar.zzo.zza;
        if (i11 == 0) {
            throw null;
        }
        int i12 = i11 - 1;
        if (i12 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i12 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        zzfdc.zzg(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        zzfdc.zzf(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j = q3Var.f12191b;
        zzfdc.zzf(bundle, "cust_age", simpleDateFormat.format(new Date(j)), j != -1);
        zzfdc.zzb(bundle, "extras", bundle2);
        int i13 = q3Var.f12193d;
        zzfdc.zze(bundle, "cust_gender", i13, i13 != -1);
        zzfdc.zzd(bundle, "kw", q3Var.f12194e);
        int i14 = q3Var.f12196z;
        zzfdc.zze(bundle, "tag_for_child_directed_treatment", i14, i14 != -1);
        if (q3Var.f12195f) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", q3Var.R);
        int i15 = q3Var.f12190a;
        zzfdc.zze(bundle, "d_imp_hdr", 1, i15 >= 2 && q3Var.A);
        String str = q3Var.B;
        zzfdc.zzf(bundle, "ppid", str, i15 >= 2 && !TextUtils.isEmpty(str));
        Location location = q3Var.D;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        zzfdc.zzc(bundle, "url", q3Var.E);
        zzfdc.zzd(bundle, "neighboring_content_urls", q3Var.O);
        zzfdc.zzb(bundle, "custom_targeting", q3Var.G);
        zzfdc.zzd(bundle, "category_exclusions", q3Var.H);
        zzfdc.zzc(bundle, "request_agent", q3Var.I);
        zzfdc.zzc(bundle, "request_pkg", q3Var.J);
        zzfdc.zzg(bundle, "is_designed_for_families", q3Var.K, i15 >= 7);
        if (i15 >= 8) {
            int i16 = q3Var.M;
            zzfdc.zze(bundle, "tag_for_under_age_of_consent", i16, i16 != -1);
            zzfdc.zzc(bundle, "max_ad_content_rating", q3Var.N);
        }
    }
}
