package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import mc.n;
import nc.h2;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;
import t.m1;
import xc.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdri implements zzcyt, zzcxf, zzcvu, zzdei {
    private final zzdrw zza;
    private final zzdsh zzb;
    private final int zzc;

    public zzdri(zzdrw zzdrwVar, zzdsh zzdshVar, int i10) {
        this.zza = zzdrwVar;
        this.zzb = zzdshVar;
        this.zzc = i10;
    }

    private final void zzc(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzd(str, String.valueOf(j));
            }
        }
    }

    private final void zzd(Bundle bundle, zzfyf zzfyfVar) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzco)).booleanValue() || bundle == null) {
            return;
        }
        m1.u(n.D.f11584k, bundle, zzdrk.PUBLIC_API_CALLBACK.zza());
        zzdrw zzdrwVar = this.zza;
        zzdrwVar.zzc();
        if (bundle.containsKey("ls")) {
            zzdrwVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzfyfVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzdrl zzdrlVar = (zzdrl) zzfyfVar.get(i10);
            long j = bundle.getLong(zzdrlVar.zza().zza(), -1L);
            long j4 = bundle.getLong(zzdrlVar.zzb().zza(), -1L);
            if (j > 0 && j4 > 0) {
                zzdrwVar.zzd(zzdrlVar.zzc(), String.valueOf(j4 - j));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhH)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdrwVar.zzd("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdrwVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(h2 h2Var) {
        zzdrw zzdrwVar = this.zza;
        zzdrwVar.zzb().put("action", "ftl");
        zzdrwVar.zzd("ftl", String.valueOf(h2Var.f12114a));
        zzdrwVar.zzd("ed", h2Var.f12116c);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhp)).booleanValue()) {
            zzdrwVar.zzd("emsg", h2Var.f12115b);
        }
        this.zzb.zzg(zzdrwVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
        this.zza.zzf(zzbvoVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
        this.zza.zze(zzfcfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze(v vVar) {
        String str;
        zzbct zzbctVar = zzbdc.zzhb;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzhH)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            if (vVar == null) {
                zzdrw zzdrwVar = this.zza;
                zzdrwVar.zzb().put("action", "sgs");
                zzdrwVar.zzb().put("request_id", "-1");
                this.zzb.zzg(zzdrwVar.zzb());
                return;
            }
            zzbvo zzbvoVar = vVar.f20027d;
            Bundle bundle = vVar.f20028e;
            if (zzbvoVar != null) {
                zzd(zzbvoVar.zzm, zzdrl.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzd(bundle, zzdrl.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(vVar.f20026c) ? vVar.f20025b : vVar.f20026c);
                zzdrw zzdrwVar2 = this.zza;
                zzdrwVar2.zzb().put("action", "sgs");
                Map mapZzb = zzdrwVar2.zzb();
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjT)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e10) {
                        int i10 = l0.f13401b;
                        k.e("Error retrieving JSONObject from the requestJson, ", e10);
                    }
                } else {
                    str = "na";
                }
                mapZzb.put("tpc", str);
                if (zzbvoVar != null) {
                    this.zza.zzf(zzbvoVar.zza);
                }
                this.zzb.zzg(this.zza.zzb());
            } catch (JSONException unused) {
                zzdrw zzdrwVar3 = this.zza;
                zzdrwVar3.zzb().put("action", "sgf");
                zzdrwVar3.zzb().put("sgf_reason", "request_invalid");
                this.zzb.zzg(zzdrwVar3.zzb());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf(String str) {
        zzbct zzbctVar = zzbdc.zzhb;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzhH)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            zzdrw zzdrwVar = this.zza;
            zzdrwVar.zzb().put("action", "sgf");
            zzdrwVar.zzd("sgf_reason", str);
            this.zzb.zzg(zzdrwVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxf
    public final void zzt() {
        zzdrw zzdrwVar = this.zza;
        zzdrwVar.zzb().put("action", "loaded");
        zzd(zzdrwVar.zza(), zzdrl.zzb);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmP)).booleanValue()) {
            zzdrwVar.zzb().put("mafe", true != mk.b.w("MUTE_AUDIO") ? "0" : "1");
        }
        this.zzb.zzg(zzdrwVar.zzb());
    }
}
