package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.os.SystemClock;
import mc.n;
import nc.h2;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzejp extends zzbrp {
    private final String zza;
    private final zzbrn zzb;
    private final zzcai zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzejp(String str, zzbrn zzbrnVar, zzcai zzcaiVar, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcaiVar;
        this.zza = str;
        this.zzb = zzbrnVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbrnVar.zzf().toString());
            jSONObject.put("sdk_version", zzbrnVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzcai zzcaiVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbK)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzcaiVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzh(String str, int i10) {
        try {
            if (this.zzf) {
                return;
            }
            try {
                JSONObject jSONObject = this.zzd;
                jSONObject.put("signal_error", str);
                zzbct zzbctVar = zzbdc.zzbL;
                t tVar = t.f12227d;
                if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                    n.D.f11584k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.zze);
                }
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzbK)).booleanValue()) {
                    jSONObject.put("signal_error_code", i10);
                }
            } catch (JSONException unused) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbK)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final synchronized void zze(String str) {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signals", str);
            zzbct zzbctVar = zzbdc.zzbL;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                n.D.f11584k.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.zze);
            }
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzbK)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final synchronized void zzf(String str) {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final synchronized void zzg(h2 h2Var) {
        zzh(h2Var.f12115b, 2);
    }
}
