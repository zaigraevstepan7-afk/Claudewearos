package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbch;
import fc.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.s3;
import nc.t;
import nc.x2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdlv {
    private final Context zza;
    private final zzdlb zzb;
    private final zzavs zzc;
    private final rc.a zzd;
    private final mc.a zze;
    private final zzbca zzf;
    private final Executor zzg;
    private final zzbgc zzh;
    private final zzdmn zzi;
    private final zzdpc zzj;
    private final ScheduledExecutorService zzk;
    private final zzdnx zzl;
    private final zzdsc zzm;
    private final zzfjq zzn;
    private final zzebs zzo;
    private final zzecd zzp;
    private final zzfcs zzq;
    private final zzdrw zzr;

    public zzdlv(Context context, zzdlb zzdlbVar, zzavs zzavsVar, rc.a aVar, mc.a aVar2, zzbca zzbcaVar, Executor executor, zzfco zzfcoVar, zzdmn zzdmnVar, zzdpc zzdpcVar, ScheduledExecutorService scheduledExecutorService, zzdsc zzdscVar, zzfjq zzfjqVar, zzebs zzebsVar, zzdnx zzdnxVar, zzecd zzecdVar, zzfcs zzfcsVar, zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzdlbVar;
        this.zzc = zzavsVar;
        this.zzd = aVar;
        this.zze = aVar2;
        this.zzf = zzbcaVar;
        this.zzg = executor;
        this.zzh = zzfcoVar.zzi;
        this.zzi = zzdmnVar;
        this.zzj = zzdpcVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdscVar;
        this.zzn = zzfjqVar;
        this.zzo = zzebsVar;
        this.zzl = zzdnxVar;
        this.zzp = zzecdVar;
        this.zzq = zzfcsVar;
        this.zzr = zzdrwVar;
    }

    public static /* synthetic */ zzbfx zza(zzdlv zzdlvVar, JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzs = zzs(jSONObject, "bg_color");
        Integer numZzs2 = zzs(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", zzbch.zzq.zzf);
        return new zzbfx(strOptString, list, numZzs, numZzs2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, zzdlvVar.zzh.zze, zOptBoolean);
    }

    public static mf.a zzb(zzdlv zzdlvVar, String str, zzbxy zzbxyVar, mc.b bVar, Object obj) throws zzcfq {
        zzcfr zzcfrVar = n.D.f11578d;
        Context context = zzdlvVar.zza;
        zzecd zzecdVar = zzdlvVar.zzp;
        zzcfe zzcfeVarZza = zzcfr.zza(context, zzcgy.zza(), "native-omid", false, false, zzdlvVar.zzc, null, zzdlvVar.zzd, null, null, zzdlvVar.zze, zzdlvVar.zzf, null, null, zzecdVar, zzdlvVar.zzq, zzdlvVar.zzm);
        final zzcah zzcahVarZza = zzcah.zza((Object) zzcfeVarZza);
        zzcfeVarZza.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z2, int i10, String str2, String str3) {
                zzcahVarZza.zzb();
            }
        });
        zzcfeVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznE)).booleanValue()) {
            if (zzbxyVar != null) {
                zzcfeVarZza.zzN().zzL(zzbxyVar);
            }
            zzcfeVarZza.zzN().zzD(bVar);
        }
        return zzcahVarZza;
    }

    public static mf.a zzc(zzdlv zzdlvVar, s3 s3Var, zzfbt zzfbtVar, zzfbw zzfbwVar, mc.b bVar, zzbxy zzbxyVar, String str, String str2, Object obj) {
        zzcfe zzcfeVarZza = zzdlvVar.zzj.zza(s3Var, zzfbtVar, zzfbwVar);
        final zzcah zzcahVarZza = zzcah.zza((Object) zzcfeVarZza);
        zzdnu zzdnuVarZzb = zzdlvVar.zzl.zzb();
        zzcgw zzcgwVarZzN = zzcfeVarZza.zzN();
        zzbct zzbctVar = zzbdc.zznE;
        t tVar = t.f12227d;
        zzcgwVarZzN.zzX(zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, zzdnuVarZzb, false, null, !((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() ? new mc.b(zzdlvVar.zza, null) : bVar, null, true != ((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() ? null : zzbxyVar, zzdlvVar.zzo, zzdlvVar.zzn, zzdlvVar.zzm, null, zzdnuVarZzb, null, null, null, null);
        zzcfeVarZza.zzag("/getNativeAdViewSignals", zzbkc.zzs);
        zzcfeVarZza.zzag("/getNativeClickMeta", zzbkc.zzt);
        zzcfeVarZza.zzN().zzG(true);
        zzcfeVarZza.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdlr
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z2, int i10, String str3, String str4) {
                zzcah zzcahVar = zzcahVarZza;
                if (z2) {
                    zzcahVar.zzb();
                    return;
                }
                zzcahVar.zzd(new zzegx(1, "Image Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcfeVarZza.zzae(str, str2, null);
        return zzcahVarZza;
    }

    public static final x2 zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzfyf.zzn();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfyf.zzn();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            x2 x2VarZzt = zzt(jSONArrayOptJSONArray.optJSONObject(i10));
            if (x2VarZzt != null) {
                arrayList.add(x2VarZzt);
            }
        }
        return zzfyf.zzl(arrayList);
    }

    private final s3 zzm(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return s3.c();
            }
            i10 = 0;
        }
        return new s3(this.zza, new h(i10, i11));
    }

    private static mf.a zzn(mf.a aVar, Object obj) {
        final Object obj2 = null;
        return zzgdb.zzf(aVar, Exception.class, new zzgci(obj2) { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj3) {
                l0.l("Error during loading assets.", (Exception) obj3);
                return zzgdb.zzh(null);
            }
        }, zzcad.zzg);
    }

    private static mf.a zzo(boolean z2, final mf.a aVar, Object obj) {
        return z2 ? zzgdb.zzn(aVar, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj2) {
                return obj2 != null ? aVar : zzgdb.zzg(new zzegx(1, "Retrieve required value in native ad response failed."));
            }
        }, zzcad.zzg) : zzn(aVar, null);
    }

    private final mf.a zzp(JSONObject jSONObject, boolean z2, zzdrk zzdrkVar) {
        if (jSONObject == null) {
            return zzgdb.zzh(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgdb.zzh(null);
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcv)).booleanValue() && zzdrkVar != null) {
            m1.u(n.D.f11584k, this.zzr.zza(), zzdrkVar.zza());
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z2) {
            return zzgdb.zzh(new zzbga(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzo(jSONObject.optBoolean("require"), zzgdb.zzm(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdll
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzbga(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final mf.a zzq(JSONArray jSONArray, boolean z2, boolean z10, zzdrk zzdrkVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgdb.zzh(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z10 ? jSONArray.length() : 1;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcv)).booleanValue()) {
            m1.u(n.D.f11584k, this.zzr.zza(), zzdrkVar.zza());
        }
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(zzp(jSONArray.optJSONObject(i10), z2, null));
        }
        return zzgdb.zzm(zzgdb.zzd(arrayList), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdli
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbga zzbgaVar : (List) obj) {
                    if (zzbgaVar != null) {
                        arrayList2.add(zzbgaVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final mf.a zzr(JSONObject jSONObject, zzfbt zzfbtVar, zzfbw zzfbwVar, mc.b bVar, zzbxy zzbxyVar) {
        final mf.a aVarZze = this.zzi.zze(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfbtVar, zzfbwVar, zzm(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), bVar, zzbxyVar);
        return zzgdb.zzn(aVarZze, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdlo
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) throws zzegx {
                zzcfe zzcfeVar = (zzcfe) obj;
                if (zzcfeVar == null || zzcfeVar.zzq() == null) {
                    throw new zzegx(1, "Retrieve video view in html5 ad response failed.");
                }
                return aVarZze;
            }
        }, zzcad.zzg);
    }

    private static Integer zzs(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final x2 zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new x2(strOptString, strOptString2);
    }

    public final mf.a zzd(JSONObject jSONObject, String str, zzdrk zzdrkVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzgdb.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzo(jSONObjectOptJSONObject.optBoolean("require"), zzgdb.zzm(zzq(jSONArrayOptJSONArray, false, true, zzdrkVar), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdlq
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzdlv.zza(this.zza, jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final mf.a zze(JSONObject jSONObject, String str, zzdrk zzdrkVar) {
        return zzp(jSONObject.optJSONObject(str), this.zzh.zzb, zzdrkVar);
    }

    public final mf.a zzf(JSONObject jSONObject, String str, zzdrk zzdrkVar) {
        zzbgc zzbgcVar = this.zzh;
        return zzq(jSONObject.optJSONArray("images"), zzbgcVar.zzb, zzbgcVar.zzd, zzdrkVar);
    }

    public final mf.a zzg(JSONObject jSONObject, String str, final zzfbt zzfbtVar, final zzfbw zzfbwVar, final mc.b bVar, final zzbxy zzbxyVar) {
        zzbct zzbctVar = zzbdc.zzkm;
        t tVar = t.f12227d;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            return zzgdb.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgdb.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgdb.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final s3 s3VarZzm = zzm(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgdb.zzh(null);
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzcv)).booleanValue()) {
            m1.u(n.D.f11584k, this.zzr.zza(), zzdrk.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza());
        }
        final mf.a aVarZzn = zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzdlv.zzc(this.zza, s3VarZzm, zzfbtVar, zzfbwVar, bVar, zzbxyVar, strOptString, strOptString2, obj);
            }
        }, zzcad.zzf);
        return zzgdb.zzn(aVarZzn, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) throws zzegx {
                if (((zzcfe) obj) != null) {
                    return aVarZzn;
                }
                throw new zzegx(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcad.zzg);
    }

    public final mf.a zzh(mf.a aVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcv)).booleanValue()) {
            m1.u(n.D.f11584k, this.zzr.zza(), zzdrk.NATIVE_ASSETS_LOADING_MEDIA_START.zza());
        }
        zzcai zzcaiVar = new zzcai();
        zzgdb.zzr(aVar, new zzdlu(this, zzcaiVar), zzcad.zzf);
        return zzcaiVar;
    }

    public final mf.a zzi(JSONObject jSONObject, final mc.b bVar, final zzbxy zzbxyVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgdb.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        if (jSONObjectOptJSONObject == null) {
            return zzgdb.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgdb.zzh(null);
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcv)).booleanValue()) {
            m1.u(n.D.f11584k, this.zzr.zza(), zzdrk.NATIVE_ASSETS_LOADING_OMID_START.zza());
        }
        return zzgdb.zzn(zzgdb.zzh(null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzdlk
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzdlv.zzb(this.zza, strOptString, zzbxyVar, bVar, obj);
            }
        }, zzcad.zzf);
    }

    public final mf.a zzj(JSONObject jSONObject, zzfbt zzfbtVar, zzfbw zzfbwVar, mc.b bVar, zzbxy zzbxyVar) {
        mf.a aVarZzd;
        zzdlv zzdlvVar;
        String[] strArr = {"html_containers", "instream"};
        JSONObject jSONObjectC0 = hj.a.c0(jSONObject, strArr);
        JSONObject jSONObjectOptJSONObject = jSONObjectC0 == null ? null : jSONObjectC0.optJSONObject(strArr[1]);
        if (jSONObjectOptJSONObject != null) {
            return zzr(jSONObjectOptJSONObject, zzfbtVar, zzfbwVar, bVar, zzbxyVar);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject2 == null) {
            return zzgdb.zzh(null);
        }
        String strOptString = jSONObjectOptJSONObject2.optString("vast_xml");
        zzbct zzbctVar = zzbdc.zzkl;
        boolean z2 = ((Boolean) t.f12227d.f12230c.zzb(zzbctVar)).booleanValue() && jSONObjectOptJSONObject2.has("html");
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z2) {
                aVarZzd = this.zzi.zzd(jSONObjectOptJSONObject2, bVar, zzbxyVar);
                zzdlvVar = this;
            }
            return zzn(zzgdb.zzo(aVarZzd, ((Integer) r1.f12230c.zzb(zzbdc.zzea)).intValue(), TimeUnit.SECONDS, zzdlvVar.zzk), null);
        }
        if (!z2) {
            int i10 = l0.f13401b;
            k.g("Required field 'vast_xml' or 'html' is missing");
            return zzgdb.zzh(null);
        }
        zzdlvVar = this;
        aVarZzd = zzdlvVar.zzr(jSONObjectOptJSONObject2, zzfbtVar, zzfbwVar, bVar, zzbxyVar);
        return zzn(zzgdb.zzo(aVarZzd, ((Integer) r1.f12230c.zzb(zzbdc.zzea)).intValue(), TimeUnit.SECONDS, zzdlvVar.zzk), null);
    }
}
