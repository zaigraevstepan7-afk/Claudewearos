package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import nc.h2;
import nc.s;
import nc.t;
import nc.u3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdup implements zzcvu, zzcyt, zzcxj {
    private final zzdvb zza;
    private final String zzb;
    private final String zzc;
    private zzcvk zzf;
    private h2 zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzduo zze = zzduo.AD_REQUESTED;

    public zzdup(zzdvb zzdvbVar, zzfco zzfcoVar, String str) {
        this.zza = zzdvbVar;
        this.zzc = str;
        this.zzb = zzfcoVar.zzf;
    }

    private static JSONObject zzh(h2 h2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", h2Var.f12116c);
        jSONObject.put("errorCode", h2Var.f12114a);
        jSONObject.put("errorDescription", h2Var.f12115b);
        h2 h2Var2 = h2Var.f12117d;
        jSONObject.put("underlyingError", h2Var2 == null ? null : zzh(h2Var2));
        return jSONObject;
    }

    private final JSONObject zzi(zzcvk zzcvkVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcvkVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcvkVar.zzd());
        jSONObject.put("responseId", zzcvkVar.zzi());
        zzbct zzbctVar = zzbdc.zzjx;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            String strZzk = zzcvkVar.zzk();
            if (!TextUtils.isEmpty(strZzk)) {
                String strValueOf = String.valueOf(strZzk);
                int i10 = l0.f13401b;
                k.b("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(strZzk));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjA)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (u3 u3Var : zzcvkVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", u3Var.f12241a);
            jSONObject2.put("latencyMillis", u3Var.f12242b);
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjy)).booleanValue()) {
                jSONObject2.put("credentials", s.f12202f.f12203a.j(u3Var.f12244d));
            }
            h2 h2Var = u3Var.f12243c;
            jSONObject2.put("error", h2Var == null ? null : zzh(h2Var));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcxj
    public final void zza(zzcqv zzcqvVar) {
        zzdvb zzdvbVar = this.zza;
        if (zzdvbVar.zzq()) {
            this.zzf = zzcqvVar.zzl();
            this.zze = zzduo.AD_LOADED;
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjE)).booleanValue()) {
                zzdvbVar.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObjectZzi;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzfbt.zza(this.zzd));
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjE)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzcvk zzcvkVar = this.zzf;
        if (zzcvkVar != null) {
            jSONObjectZzi = zzi(zzcvkVar);
        } else {
            h2 h2Var = this.zzg;
            JSONObject jSONObjectZzi2 = null;
            if (h2Var != null && (iBinder = h2Var.f12118e) != null) {
                zzcvk zzcvkVar2 = (zzcvk) iBinder;
                jSONObjectZzi2 = zzi(zzcvkVar2);
                if (zzcvkVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObjectZzi2.put("errors", jSONArray);
                }
            }
            jSONObjectZzi = jSONObjectZzi2;
        }
        jSONObject.put("responseInfo", jSONObjectZzi);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzdD(h2 h2Var) {
        zzdvb zzdvbVar = this.zza;
        if (zzdvbVar.zzq()) {
            this.zze = zzduo.AD_LOAD_FAILED;
            this.zzg = h2Var;
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjE)).booleanValue()) {
                zzdvbVar.zzf(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdn(zzbvo zzbvoVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjE)).booleanValue()) {
            return;
        }
        zzdvb zzdvbVar = this.zza;
        if (zzdvbVar.zzq()) {
            zzdvbVar.zzf(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyt
    public final void zzdo(zzfcf zzfcfVar) {
        zzdvb zzdvbVar = this.zza;
        if (zzdvbVar.zzq()) {
            zzfce zzfceVar = zzfcfVar.zzb;
            List list = zzfceVar.zza;
            if (!list.isEmpty()) {
                this.zzd = ((zzfbt) list.get(0)).zzb;
            }
            zzfbw zzfbwVar = zzfceVar.zzb;
            String str = zzfbwVar.zzl;
            if (!TextUtils.isEmpty(str)) {
                this.zzh = str;
            }
            String str2 = zzfbwVar.zzm;
            if (!TextUtils.isEmpty(str2)) {
                this.zzi = str2;
            }
            JSONObject jSONObject = zzfbwVar.zzp;
            if (jSONObject.length() > 0) {
                this.zzl = jSONObject;
            }
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjA)).booleanValue()) {
                if (!zzdvbVar.zzs()) {
                    this.zzo = true;
                    return;
                }
                String str3 = zzfbwVar.zzn;
                if (!TextUtils.isEmpty(str3)) {
                    this.zzj = str3;
                }
                JSONObject jSONObject2 = zzfbwVar.zzo;
                if (jSONObject2.length() > 0) {
                    this.zzk = jSONObject2;
                }
                JSONObject jSONObject3 = this.zzk;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzdvbVar.zzk(length);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != zzduo.AD_REQUESTED;
    }
}
