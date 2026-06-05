package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import mc.n;
import nc.p1;
import nc.s;
import nc.s1;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdhg implements zzdiu {
    private p1 zzC;
    private final zzcyb zzD;
    private final zzdjo zzE;
    private final mc.b zzF;
    private final Context zza;
    private final zzdix zzb;
    private final JSONObject zzc;
    private final zzdnr zzd;
    private final zzdim zze;
    private final zzavs zzf;
    private final zzcwj zzg;
    private final zzcvp zzh;
    private final zzddu zzi;
    private final zzfbt zzj;
    private final rc.a zzk;
    private final zzfco zzl;
    private final zzcni zzm;
    private final zzdjs zzn;
    private final ud.a zzo;
    private final zzddq zzp;
    private final zzfjq zzq;
    private final zzdph zzr;
    private final zzfhm zzs;
    private final zzecd zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdhg(Context context, zzdix zzdixVar, JSONObject jSONObject, zzdnr zzdnrVar, zzdim zzdimVar, zzavs zzavsVar, zzcwj zzcwjVar, zzcvp zzcvpVar, zzddu zzdduVar, zzfbt zzfbtVar, rc.a aVar, zzfco zzfcoVar, zzcni zzcniVar, zzdjs zzdjsVar, ud.a aVar2, zzddq zzddqVar, zzfjq zzfjqVar, zzfhm zzfhmVar, zzecd zzecdVar, zzdph zzdphVar, zzdjo zzdjoVar, zzcyb zzcybVar, mc.b bVar, zzbxy zzbxyVar) {
        this.zza = context;
        this.zzb = zzdixVar;
        this.zzc = jSONObject;
        this.zzd = zzdnrVar;
        this.zze = zzdimVar;
        this.zzf = zzavsVar;
        this.zzg = zzcwjVar;
        this.zzh = zzcvpVar;
        this.zzi = zzdduVar;
        this.zzj = zzfbtVar;
        this.zzk = aVar;
        this.zzl = zzfcoVar;
        this.zzm = zzcniVar;
        this.zzn = zzdjsVar;
        this.zzo = aVar2;
        this.zzp = zzddqVar;
        this.zzq = zzfjqVar;
        this.zzs = zzfhmVar;
        this.zzt = zzecdVar;
        this.zzr = zzdphVar;
        this.zzE = zzdjoVar;
        this.zzD = zzcybVar;
        this.zzF = bVar;
    }

    private final String zzG(View view) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdM)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, null);
        } catch (Exception unused) {
            int i10 = l0.f13401b;
            k.d("Exception getting data.");
            return null;
        }
    }

    private final String zzH(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzc = this.zze.zzc();
        if (iZzc == 1) {
            return "1099";
        }
        if (iZzc == 2) {
            return "2099";
        }
        if (iZzc != 6) {
            return null;
        }
        return "3099";
    }

    private final void zzI() {
        mc.b bVar;
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznE)).booleanValue() || (bVar = this.zzF) == null) {
            return;
        }
        bVar.f11537b = true;
    }

    private final boolean zzJ(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean zzK() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzL(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z2, View view) throws JSONException {
        JSONException jSONException;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            zzbct zzbctVar = zzbdc.zzdM;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                try {
                    jSONObject6.put("view_signals", str);
                } catch (JSONException e10) {
                    jSONException = e10;
                    int i10 = l0.f13401b;
                    k.e("Unable to create impression JSON.", jSONException);
                    return false;
                }
            }
            jSONObject6.put("policy_validator_enabled", z2);
            jSONObject6.put("screen", mk.b.N(this.zza));
            boolean zBooleanValue = ((Boolean) tVar.f12230c.zzb(zzbdc.zziQ)).booleanValue();
            zzdhf zzdhfVar = null;
            if (zBooleanValue) {
                this.zzd.zzl("/clickRecorded", new zzdhc(this, zzdhfVar));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdhb(this, zzdhfVar));
            }
            zzdnr zzdnrVar = this.zzd;
            zzdnrVar.zzl("/nativeImpression", new zzdhd(this, view, null));
            try {
                zzdnrVar.zzl("/nativeImpressionFlowControl", new zzdhe(this, this.zzq, this.zzj.zzax, this.zzs, null));
                zzcag.zza(zzdnrVar.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
                if (this.zzu) {
                    return true;
                }
                zzfbt zzfbtVar = this.zzj;
                this.zzu = n.D.f11588o.i(this.zza, this.zzk.f14321a, zzfbtVar.zzC.toString(), this.zzl.zzf);
                return true;
            } catch (JSONException e11) {
                e = e11;
                jSONException = e;
                int i102 = l0.f13401b;
                k.e("Unable to create impression JSON.", jSONException);
                return false;
            }
        } catch (JSONException e12) {
            e = e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzA(zzbie zzbieVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzbieVar);
        } else {
            int i10 = l0.f13401b;
            k.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzB(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zR = mk.b.R(this.zzk.f14323c);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zR) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zR) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzC(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzD() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlM)).booleanValue()) {
            return this.zzl.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzE() {
        return zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final boolean zzF(Bundle bundle) throws JSONException {
        JSONObject jSONObjectJ;
        if (!zzJ("impression_reporting")) {
            int i10 = l0.f13401b;
            k.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        rc.e eVar = s.f12202f.f12203a;
        eVar.getClass();
        if (bundle != null) {
            try {
                jSONObjectJ = eVar.j(bundle);
            } catch (JSONException e10) {
                k.e("Error converting Bundle to JSON", e10);
            }
        } else {
            jSONObjectJ = null;
        }
        return zzL(null, null, null, null, ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlI)).booleanValue() ? zzG(null) : null, jSONObjectJ, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final int zza() {
        zzbgc zzbgcVar = this.zzl.zzi;
        if (zzbgcVar == null) {
            return 0;
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlM)).booleanValue()) {
            return zzbgcVar.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectL = mk.b.L(context, map, map2, view, scaleType);
        JSONObject jSONObjectP = mk.b.P(context, view);
        JSONObject jSONObjectO = mk.b.O(view);
        JSONObject jSONObjectM = mk.b.M(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectL);
            jSONObject.put("ad_view_signal", jSONObjectP);
            jSONObject.put("scroll_view_signal", jSONObjectO);
            jSONObject.put("lock_screen_signal", jSONObjectM);
            return jSONObject;
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("Unable to create native ad view signals JSON.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final JSONObject zzg(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectZzf = zzf(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzK()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZzf != null) {
                jSONObject.put("nas", jSONObjectZzf);
            }
            return jSONObject;
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("Unable to create native click meta data JSON.", e10);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzi() {
        try {
            p1 p1Var = this.zzC;
            if (p1Var != null) {
                p1Var.zze();
            }
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzj() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzk() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzl(s1 s1Var) {
        try {
            if (this.zzw) {
                return;
            }
            if (s1Var == null) {
                zzdim zzdimVar = this.zze;
                if (zzdimVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzd(zzdimVar.zzk().f12258b, this.zzj.zzax, this.zzs, null);
                    zzi();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzd(s1Var.zzf(), this.zzj.zzax, this.zzs, null);
            zzi();
        } catch (RemoteException e10) {
            int i10 = l0.f13401b;
            k.i("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzm(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectL = mk.b.L(context, map, map2, view2, scaleType);
        JSONObject jSONObjectP = mk.b.P(context, view2);
        JSONObject jSONObjectO = mk.b.O(view2);
        JSONObject jSONObjectM = mk.b.M(context, view2);
        String strZzH = zzH(view, map);
        zzp(true == ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdT)).booleanValue() ? view2 : view, jSONObjectP, jSONObjectL, jSONObjectO, jSONObjectM, strZzH, mk.b.K(strZzH, context, this.zzz, this.zzy), null, z2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzn(String str) throws JSONException {
        zzp(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzo(Bundle bundle) throws JSONException {
        if (bundle == null) {
            int i10 = l0.f13401b;
            k.b("Click data is null. No click is reported.");
            return;
        }
        if (!zzJ("click_reporting")) {
            int i11 = l0.f13401b;
            k.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObjectJ = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        rc.e eVar = s.f12202f.f12203a;
        eVar.getClass();
        try {
            jSONObjectJ = eVar.j(bundle);
        } catch (JSONException e10) {
            k.e("Error converting Bundle to JSON", e10);
        }
        zzp(null, null, null, null, null, string, null, jSONObjectJ, false, false);
    }

    public final void zzp(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z2, boolean z10) throws JSONException {
        String strZzd;
        try {
            zzI();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdix zzdixVar = this.zzb;
            zzdim zzdimVar = this.zze;
            jSONObject7.put("has_custom_click_handler", zzdixVar.zzc(zzdimVar.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdimVar.zzc());
            jSONObject9.put("view_aware_api_used", z2);
            zzbgc zzbgcVar = this.zzl.zzi;
            jSONObject9.put("custom_mute_requested", zzbgcVar != null && zzbgcVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdimVar.zzH().isEmpty() || zzdimVar.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            ((ud.b) this.zzo).getClass();
            jSONObject9.put("timestamp", System.currentTimeMillis());
            if (this.zzx && zzK()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z10) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdixVar.zzc(zzdimVar.zzA()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzd = this.zzf.zzc().zzd(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                int i10 = l0.f13401b;
                k.e("Exception obtaining click signals", e10);
                strZzd = null;
            }
            jSONObject9.put("click_signals", strZzd);
            jSONObject9.put("open_chrome_custom_tab", true);
            zzbct zzbctVar = zzbdc.zziU;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && ud.c.k()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zziV)).booleanValue() && ud.c.k()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            ((ud.b) this.zzo).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzA);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                JSONObject jSONObject11 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzq(string, this.zze);
                }
            }
            zzcag.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            int i11 = l0.f13401b;
            k.e("Unable to create click JSON.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzq(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType, int i10) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.zzc;
        boolean z10 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlM)).booleanValue()) {
                z10 = true;
            }
        }
        if (!z10) {
            if (!this.zzx) {
                int i11 = l0.f13401b;
                k.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzK()) {
                int i12 = l0.f13401b;
                k.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.zza;
        JSONObject jSONObjectL = mk.b.L(context, map, map2, view2, scaleType);
        JSONObject jSONObjectP = mk.b.P(context, view2);
        boolean z11 = z10;
        JSONObject jSONObjectO = mk.b.O(view2);
        JSONObject jSONObjectM = mk.b.M(context, view2);
        String strZzH = zzH(view, map);
        JSONObject jSONObjectK = mk.b.K(strZzH, context, this.zzz, this.zzy);
        if (z11) {
            try {
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i10);
                    } catch (Exception e10) {
                        e = e10;
                        int i13 = l0.f13401b;
                        k.e("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzp(view2, jSONObjectP, jSONObjectL, jSONObjectO, jSONObjectM, strZzH, jSONObjectK, null, z2, true);
                    }
                } catch (Exception e11) {
                    e = e11;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e12) {
                int i14 = l0.f13401b;
                k.e("Error occurred while adding CustomClickGestureSignals to adJson.", e12);
                n.D.f11582h.zzw(e12, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzp(view2, jSONObjectP, jSONObjectL, jSONObjectO, jSONObjectM, strZzH, jSONObjectK, null, z2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectL = mk.b.L(context, map, map2, view, scaleType);
        JSONObject jSONObjectP = mk.b.P(context, view);
        JSONObject jSONObjectO = mk.b.O(view);
        JSONObject jSONObjectM = mk.b.M(context, view);
        boolean zQ = mk.b.Q(context, this.zzj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", jSONObjectL);
            jSONObject.put("ad_view_signal", jSONObjectP);
            jSONObject.put("scroll_view_signal", jSONObjectO);
            jSONObject.put("lock_screen_signal", jSONObjectM);
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdM)).booleanValue()) {
                jSONObject.put("view_signals", zzG(view));
            }
            jSONObject.put("policy_validator_enabled", zQ);
            jSONObject.put("screen", mk.b.N(context));
            zzcag.zza(this.zzd.zzg("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("Unable to create native ad signals logging JSON.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzs() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcag.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzt(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        zzL(mk.b.P(context, view), mk.b.L(context, map, map2, view, scaleType), mk.b.O(view), mk.b.M(context, view), zzG(view), null, mk.b.Q(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzu() throws JSONException {
        zzL(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzv(View view, MotionEvent motionEvent, View view2) {
        int[] iArr = new int[2];
        if (view2 != null) {
            view2.getLocationOnScreen(iArr);
        }
        this.zzy = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        ((ud.b) this.zzo).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.zzB = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = jCurrentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        motionEventObtain.setLocation(point.x, point.y);
        this.zzf.zzd(motionEventObtain);
        motionEventObtain.recycle();
        zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzw(Bundle bundle) {
        if (bundle == null) {
            int i10 = l0.f13401b;
            k.b("Touch event data is null. No touch event is reported.");
        } else {
            if (!zzJ("touch_reporting")) {
                int i11 = l0.f13401b;
                k.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzx(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i10 = l0.f13401b;
            k.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdjs zzdjsVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdjsVar);
        view.setClickable(true);
        zzdjsVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzy() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdiu
    public final void zzz(p1 p1Var) {
        this.zzC = p1Var;
    }
}
