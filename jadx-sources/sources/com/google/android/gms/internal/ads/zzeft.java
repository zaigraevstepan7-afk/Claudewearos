package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import mc.n;
import nc.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeft implements zzefn {
    private final zzdgu zza;
    private final zzgdm zzb;
    private final zzdlg zzc;
    private final zzfdn zzd;
    private final zzdnx zze;
    private final zzdrw zzf;
    private final rc.a zzg;
    private final Context zzh;
    private final zzbxu zzi;

    public zzeft(zzdgu zzdguVar, zzgdm zzgdmVar, zzdlg zzdlgVar, zzfdn zzfdnVar, zzdnx zzdnxVar, zzdrw zzdrwVar, rc.a aVar, Context context, zzbxu zzbxuVar) {
        this.zzg = aVar;
        this.zzh = context;
        this.zzi = zzbxuVar;
        this.zza = zzdguVar;
        this.zzb = zzgdmVar;
        this.zzc = zzdlgVar;
        this.zzd = zzfdnVar;
        this.zze = zzdnxVar;
        this.zzf = zzdrwVar;
    }

    public static zzdih zzc(zzeft zzeftVar, mf.a aVar, mf.a aVar2, zzfcf zzfcfVar, zzfbt zzfbtVar, JSONObject jSONObject, mc.b bVar, zzbxy zzbxyVar) throws Throwable {
        zzdim zzdimVar = (zzdim) aVar.get();
        zzdnr zzdnrVar = (zzdnr) aVar2.get();
        zzbct zzbctVar = zzbdc.zzcr;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        if (((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzeftVar.zzf.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzdin zzdinVarZzd = zzeftVar.zza.zzd(new zzcrl(zzfcfVar, zzfbtVar, null), new zzdiy(zzdimVar), new zzdhi(jSONObject, zzdnrVar, bVar, zzbxyVar));
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            n.D.f11584k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzdrw zzdrwVar = zzeftVar.zzf;
            zzdrwVar.zza().putLong(zzdrk.RENDERING_AD_COMPONENT_CREATION_END.zza(), jCurrentTimeMillis);
            zzdrwVar.zza().putLong(zzdrk.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jCurrentTimeMillis);
        }
        zzdinVarZzd.zzh().zzb();
        zzdinVarZzd.zzi().zza(zzdnrVar);
        zzdinVarZzd.zzg().zzc(zzdimVar.zzs());
        zzdinVarZzd.zzl().zza(zzeftVar.zze, zzdimVar.zzq());
        if (((Boolean) zzbdaVar2.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzeftVar.zzf.zza(), zzdrk.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
        return zzdinVarZzd.zza();
    }

    public static mf.a zzd(zzeft zzeftVar, zzfcf zzfcfVar, zzfbt zzfbtVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgdb.zzg(new zzdwe(3));
        }
        int i10 = zzfcfVar.zza.zza.zzk;
        if (i10 <= 1) {
            return zzgdb.zzm(zzeftVar.zzg(zzfcfVar, zzfbtVar, jSONArray.getJSONObject(0)), new zzfut() { // from class: com.google.android.gms.internal.ads.zzefs
                @Override // com.google.android.gms.internal.ads.zzfut
                public final Object apply(Object obj) {
                    return Collections.singletonList(zzgdb.zzh((zzdih) obj));
                }
            }, zzeftVar.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcs)).booleanValue()) {
            zzeftVar.zzf.zzd("nsl", String.valueOf(length));
        }
        zzeftVar.zzd.zzc(Math.min(length, i10));
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 < length) {
                arrayList.add(zzeftVar.zzg(zzfcfVar, zzfbtVar, jSONArray.getJSONObject(i11)));
            } else {
                arrayList.add(zzgdb.zzg(new zzdwe(3)));
            }
        }
        return zzgdb.zzh(arrayList);
    }

    public static mf.a zze(final zzeft zzeftVar, zzfbt zzfbtVar, final zzdnr zzdnrVar) throws JSONException {
        zzbct zzbctVar = zzbdc.zzcq;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, zzeftVar.zzf.zza(), zzdrk.RENDERING_NATIVE_ADS_PREPROCESS_START.zza());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zziT)).booleanValue() && ud.c.k()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfbtVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgdb.zzn(zzdnrVar.zzg("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgci() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzeft.zzf(this.zza, zzdnrVar, (JSONObject) obj);
            }
        }, zzeftVar.zzb);
    }

    public static mf.a zzf(zzeft zzeftVar, zzdnr zzdnrVar, JSONObject jSONObject) throws zzboj {
        zzeftVar.zzd.zzb(zzgdb.zzh(zzdnrVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzboj("process json failed");
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcq)).booleanValue()) {
            m1.u(n.D.f11584k, zzeftVar.zzf.zza(), zzdrk.RENDERING_NATIVE_ADS_PREPROCESS_END.zza());
        }
        return zzgdb.zzh(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    private final mf.a zzg(final zzfcf zzfcfVar, final zzfbt zzfbtVar, final JSONObject jSONObject) {
        mc.b bVar;
        zzbxy zzbxyVarZza;
        zzbct zzbctVar = zzbdc.zzcr;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            m1.u(n.D.f11584k, this.zzf.zza(), zzdrk.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final mf.a aVarZza = this.zzd.zza();
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zznE)).booleanValue()) {
            Context context = this.zzh;
            zzbxyVarZza = zzcvm.zza(context, this.zzg, zzfbtVar, this.zzi);
            bVar = new mc.b(context, zzbxyVarZza);
        } else {
            zzbxyVarZza = null;
            bVar = new mc.b(this.zzh, null);
        }
        final zzbxy zzbxyVar = zzbxyVarZza;
        final mc.b bVar2 = bVar;
        final mf.a aVarZzd = this.zzc.zzd(zzfcfVar, zzfbtVar, jSONObject, bVar2, zzbxyVar);
        return zzgdb.zzc(aVarZza, aVarZzd).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeft.zzc(this.zza, aVarZzd, aVarZza, zzfcfVar, zzfbtVar, jSONObject, bVar2, zzbxyVar);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final mf.a zza(final zzfcf zzfcfVar, final zzfbt zzfbtVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcq)).booleanValue()) {
            m1.u(n.D.f11584k, this.zzf.zza(), zzdrk.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza());
        }
        mf.a aVarZza = this.zzd.zza();
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzefq
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzeft.zze(this.zza, zzfbtVar, (zzdnr) obj);
            }
        };
        zzgdm zzgdmVar = this.zzb;
        return zzgdb.zzn(zzgdb.zzn(aVarZza, zzgciVar, zzgdmVar), new zzgci() { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzeft.zzd(this.zza, zzfcfVar, zzfbtVar, (JSONArray) obj);
            }
        }, zzgdmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzede
    public final boolean zzb(zzfcf zzfcfVar, zzfbt zzfbtVar) {
        zzfby zzfbyVar = zzfbtVar.zzs;
        return (zzfbyVar == null || zzfbyVar.zzc == null) ? false : true;
    }
}
