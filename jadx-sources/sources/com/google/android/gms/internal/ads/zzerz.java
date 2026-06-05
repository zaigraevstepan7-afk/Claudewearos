package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import nc.n3;
import nc.t;
import org.json.JSONArray;
import org.json.JSONObject;
import qc.n0;
import qc.o0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzerz implements zzett {
    private final zzfco zza;
    private final PackageInfo zzb;
    private final n0 zzc;

    public zzerz(zzfco zzfcoVar, PackageInfo packageInfo, n0 n0Var) {
        this.zza = zzfcoVar;
        this.zzb = packageInfo;
        this.zzc = n0Var;
    }

    private final void zzc(Bundle bundle) {
        int i10;
        zzbgc zzbgcVar = this.zza.zzi;
        if (zzbgcVar == null || (i10 = zzbgcVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbgcVar.zzj);
        bundle.putInt("sccg_dir", i10);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ArrayList arrayList = this.zza.zzg;
        zzcut zzcutVar = (zzcut) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzcutVar.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final void zzb(Object obj) {
        int i10;
        JSONObject jSONObject;
        String str;
        JSONArray jSONArrayOptJSONArray;
        zzfco zzfcoVar = this.zza;
        ArrayList<String> arrayList = zzfcoVar.zzg;
        zzcut zzcutVar = (zzcut) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            zzcutVar.zza.putInt("native_version", 0);
            return;
        }
        Bundle bundle = zzcutVar.zza;
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzfcoVar.zzh);
        zzbgc zzbgcVar = zzfcoVar.zzi;
        if (zzbgcVar != null) {
            if (zzbgcVar.zza > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i11 = zzbgcVar.zzh;
                String str2 = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                if (!"unknown".equals(str2)) {
                    bundle.putString("native_media_orientation", str2);
                }
            }
            int i12 = zzbgcVar.zzc;
            String str3 = i12 != 0 ? i12 != 1 ? i12 != 2 ? "unknown" : "landscape" : "portrait" : "any";
            if (!"unknown".equals(str3)) {
                bundle.putString("native_image_orientation", str3);
            }
            bundle.putBoolean("native_multiple_images", zzbgcVar.zzd);
            bundle.putBoolean("use_custom_mute", zzbgcVar.zzg);
            zzc(bundle);
        }
        PackageInfo packageInfo = this.zzb;
        int i13 = packageInfo != null ? packageInfo.versionCode : 0;
        n0 n0Var = this.zzc;
        o0 o0Var = (o0) n0Var;
        o0Var.l();
        synchronized (o0Var.f13414a) {
            i10 = o0Var.f13430r;
        }
        if (i13 > i10) {
            o0 o0Var2 = (o0) n0Var;
            o0Var2.l();
            synchronized (o0Var2.f13414a) {
                try {
                    o0Var2.f13432t = new JSONObject();
                    SharedPreferences.Editor editor = o0Var2.f13420g;
                    if (editor != null) {
                        editor.remove("native_advanced_settings");
                        o0Var2.f13420g.apply();
                    }
                    o0Var2.m();
                } finally {
                }
            }
            o0Var2.l();
            synchronized (o0Var2.f13414a) {
                try {
                    if (o0Var2.f13430r != i13) {
                        o0Var2.f13430r = i13;
                        SharedPreferences.Editor editor2 = o0Var2.f13420g;
                        if (editor2 != null) {
                            editor2.putInt("version_code", i13);
                            o0Var2.f13420g.apply();
                        }
                        o0Var2.m();
                    }
                } finally {
                }
            }
        }
        o0 o0Var3 = (o0) n0Var;
        o0Var3.l();
        synchronized (o0Var3.f13414a) {
            jSONObject = o0Var3.f13432t;
        }
        String string = null;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(zzfcoVar.zzf)) != null) {
            string = jSONArrayOptJSONArray.toString();
        }
        if (!TextUtils.isEmpty(string)) {
            bundle.putString("native_advanced_settings", string);
        }
        int i14 = zzfcoVar.zzk;
        if (i14 > 1) {
            bundle.putInt("max_num_ads", i14);
        }
        zzbmn zzbmnVar = zzfcoVar.zzb;
        if (zzbmnVar != null) {
            String str4 = zzbmnVar.zzc;
            if (TextUtils.isEmpty(str4)) {
                if (zzbmnVar.zza >= 2) {
                    int i15 = zzbmnVar.zzd;
                    str = (i15 == 2 || i15 != 3) ? "l" : "p";
                } else {
                    int i16 = zzbmnVar.zzb;
                    if (i16 == 1) {
                        str = "l";
                    } else if (i16 != 2) {
                        k.d("Instream ad video aspect ratio " + i16 + " is wrong.");
                        str = "l";
                    } else {
                        str = "p";
                    }
                }
                bundle.putString("ia_var", str);
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmd)).booleanValue() || zzbgcVar == null) {
            return;
        }
        n3 n3Var = zzbgcVar.zzf;
        if (n3Var != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", n3Var.f12151a);
            bundle2.putBoolean("clickToExpandRequested", n3Var.f12153c);
            bundle2.putBoolean("customControlsRequested", n3Var.f12152b);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbgcVar.zzb);
        bundle.putInt("preferred_ad_choices_position", zzbgcVar.zze);
    }
}
