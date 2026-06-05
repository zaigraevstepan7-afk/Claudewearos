package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.os.Bundle;
import com.anonlab.voidlauncher.R;
import java.util.List;
import mc.n;
import nc.t;
import org.json.JSONObject;
import qc.r0;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdlg {
    private final zzgdm zza;
    private final zzdlv zzb;
    private final zzdma zzc;
    private final zzdrw zzd;

    public zzdlg(zzgdm zzgdmVar, zzdlv zzdlvVar, zzdma zzdmaVar, zzdrw zzdrwVar) {
        this.zza = zzgdmVar;
        this.zzb = zzdlvVar;
        this.zzc = zzdmaVar;
        this.zzd = zzdrwVar;
    }

    public static zzdim zza(zzdlg zzdlgVar, mf.a aVar, mf.a aVar2, mf.a aVar3, mf.a aVar4, mf.a aVar5, JSONObject jSONObject, mf.a aVar6, mf.a aVar7, mf.a aVar8, mf.a aVar9, mf.a aVar10) {
        zzbct zzbctVar = zzbdc.zzcq;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzdlgVar.zzd.zza(), zzdrk.RENDERING_NATIVE_ASSETS_LOADING_END.zza());
        }
        zzdim zzdimVar = (zzdim) aVar.get();
        zzdimVar.zzP((List) aVar2.get());
        zzdimVar.zzM((zzbgn) aVar3.get());
        zzdimVar.zzQ((zzbgn) aVar4.get());
        zzdimVar.zzJ((zzbgg) aVar5.get());
        zzdimVar.zzS(zzdlv.zzl(jSONObject));
        zzdimVar.zzL(zzdlv.zzk(jSONObject));
        zzcfe zzcfeVar = (zzcfe) aVar6.get();
        if (zzcfeVar != null) {
            zzdimVar.zzad(zzcfeVar);
            zzdimVar.zzac(zzcfeVar.zzF());
            zzdimVar.zzab(zzcfeVar.zzq());
        }
        zzdimVar.zzd().putAll((Bundle) aVar7.get());
        zzcfe zzcfeVar2 = (zzcfe) aVar8.get();
        if (zzcfeVar2 != null) {
            zzdimVar.zzO(zzcfeVar2);
            zzdimVar.zzae(zzcfeVar2.zzF());
        }
        if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzfB)).booleanValue() || zzf(jSONObject)) {
            zzcfe zzcfeVar3 = (zzcfe) aVar9.get();
            if (zzcfeVar3 != null) {
                zzdimVar.zzT(zzcfeVar3);
            }
        } else {
            zzdimVar.zzU(aVar9);
            zzdimVar.zzX(new zzcai());
        }
        for (zzdlz zzdlzVar : (List) aVar10.get()) {
            if (zzdlzVar.zza != 1) {
                zzdimVar.zzN(zzdlzVar.zzb, zzdlzVar.zzd);
            } else {
                zzdimVar.zzZ(zzdlzVar.zzb, zzdlzVar.zzc);
            }
        }
        return zzdimVar;
    }

    public static zzdim zzb(zzdlg zzdlgVar, zzfcf zzfcfVar, zzfbt zzfbtVar, JSONObject jSONObject) throws zzegx {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcv)).booleanValue()) {
            m1.u(n.D.f11584k, zzdlgVar.zzd.zza(), zzdrk.NATIVE_ASSETS_LOADING_BASIC_START.zza());
        }
        zzdim zzdimVar = new zzdim();
        zzdimVar.zzaa(jSONObject.optInt("template_id", -1));
        zzdimVar.zzK(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdimVar.zzV(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfco zzfcoVar = zzfcfVar.zza.zza;
        if (!zzfcoVar.zzg.contains(Integer.toString(zzdimVar.zzc()))) {
            throw new zzegx(1, m6.a.d(zzdimVar.zzc(), "Invalid template ID: "));
        }
        if (zzdimVar.zzc() == 3) {
            if (zzdimVar.zzA() == null) {
                throw new zzegx(1, "No custom template id for custom template ad response.");
            }
            if (!zzfcoVar.zzh.contains(zzdimVar.zzA())) {
                throw new zzegx(1, "Unexpected custom template id in the response.");
            }
        }
        zzdimVar.zzY(jSONObject.optDouble("rating", -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzfbtVar.zzM) {
            n nVar = n.D;
            r0 r0Var = nVar.f11577c;
            Resources resourcesZze = nVar.f11582h.zze();
            strOptString = m1.w(resourcesZze != null ? resourcesZze.getString(R.string.f3411s7) : "Test Ad", " : ", strOptString);
        }
        zzdimVar.zzZ("headline", strOptString);
        zzdimVar.zzZ("body", jSONObject.optString("body", null));
        zzdimVar.zzZ("call_to_action", jSONObject.optString("call_to_action", null));
        zzdimVar.zzZ("store", jSONObject.optString("store", null));
        zzdimVar.zzZ("price", jSONObject.optString("price", null));
        zzdimVar.zzZ("advertiser", jSONObject.optString("advertiser", null));
        return zzdimVar;
    }

    private final mf.a zze(mf.a aVar, zzdrk zzdrkVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcv)).booleanValue()) {
            zzgdb.zzr(aVar, new zzdlf(this, zzdrkVar), this.zza);
        }
        return aVar;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mf.a zzd(final com.google.android.gms.internal.ads.zzfcf r15, final com.google.android.gms.internal.ads.zzfbt r16, final org.json.JSONObject r17, mc.b r18, com.google.android.gms.internal.ads.zzbxy r19) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdlg.zzd(com.google.android.gms.internal.ads.zzfcf, com.google.android.gms.internal.ads.zzfbt, org.json.JSONObject, mc.b, com.google.android.gms.internal.ads.zzbxy):mf.a");
    }
}
