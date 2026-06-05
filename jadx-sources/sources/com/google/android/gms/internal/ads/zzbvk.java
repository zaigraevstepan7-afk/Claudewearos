package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import mc.n;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbvk extends zzbvi {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbok zzd;
    private final rc.a zze;

    public zzbvk(Context context, zzbok zzbokVar, rc.a aVar) {
        this.zzb = context.getApplicationContext();
        this.zze = aVar;
        this.zzd = zzbokVar;
    }

    public static Void zzb(zzbvk zzbvkVar, JSONObject jSONObject) {
        zzbct zzbctVar = zzbdc.zza;
        t tVar = t.f12227d;
        zzbcv zzbcvVar = tVar.f12229b;
        SharedPreferences sharedPreferencesZza = zzbcv.zza(zzbvkVar.zzb);
        if (sharedPreferencesZza == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZza.edit();
        zzbcu zzbcuVar = tVar.f12228a;
        int i10 = zzbes.zza;
        zzbcuVar.zzf(editorEdit, 1, jSONObject);
        editorEdit.commit();
        SharedPreferences sharedPreferences = zzbvkVar.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
        n.D.f11584k.getClass();
        editorEdit2.putLong("js_last_update", System.currentTimeMillis()).apply();
        return null;
    }

    public static JSONObject zzc(Context context, rc.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbfc.zzb.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f14321a);
            jSONObject.put("mf", zzbfc.zzc.zze());
            jSONObject.put("cl", "761682454");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", yd.e.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final mf.a zza() {
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        long j = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        n.D.f11584k.getClass();
        if (System.currentTimeMillis() - j < ((Long) zzbfc.zzd.zze()).longValue()) {
            return zzgdb.zzh(null);
        }
        return zzgdb.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzfut() { // from class: com.google.android.gms.internal.ads.zzbvj
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                zzbvk.zzb(this.zza, (JSONObject) obj);
                return null;
            }
        }, zzcad.zzg);
    }
}
