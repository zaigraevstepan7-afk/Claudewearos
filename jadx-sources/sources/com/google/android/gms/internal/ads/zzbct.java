package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import nc.t;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzbct {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public zzbct(int i10, String str, Object obj, Object obj2, zzbcs zzbcsVar) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        t.f12227d.f12228a.zzd(this);
    }

    public static zzbct zzf(int i10, String str, float f10, float f11) {
        return new zzbcq(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbct zzg(int i10, String str, int i11, int i12) {
        return new zzbco(1, str, Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static zzbct zzh(int i10, String str, long j, long j4) {
        return new zzbcp(1, str, Long.valueOf(j), Long.valueOf(j4));
    }

    public static zzbct zzi(int i10, String str) {
        zzbcr zzbcrVar = new zzbcr(1, "gads:sdk_core_constants:experiment_id", null, null);
        t.f12227d.f12228a.zzc(zzbcrVar);
        return zzbcrVar;
    }

    public static zzbct zzj(int i10, String str) {
        zzbcr zzbcrVar = new zzbcr(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        t.f12227d.f12228a.zze(zzbcrVar);
        return zzbcrVar;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzk() {
        return t.f12227d.f12230c.zzb(this);
    }

    public final Object zzl() {
        return t.f12227d.f12230c.zzf() ? this.zzd : this.zzc;
    }

    public final String zzm() {
        return this.zzb;
    }
}
