package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import nc.s;
import nc.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qc.j0;
import qc.l0;
import rc.k;
import t.m1;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzccz implements zzbkd {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                rc.e eVar = s.f12202f.f12203a;
                i10 = rc.e.b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                String strB = f.b("Could not parse ", str, " in a video GMSG: ", str2);
                int i11 = l0.f13401b;
                k.g(strB);
            }
        }
        if (l0.m()) {
            StringBuilder sbM = m1.m("Parse pixels for ", str, ", got string ", str2, ", int ");
            sbM.append(i10);
            sbM.append(".");
            l0.k(sbM.toString());
        }
        return i10;
    }

    private static void zzc(zzcbn zzcbnVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcbnVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String strK = m1.k("Could not parse buffer parameters in loadControl video GMSG: (", str, ", ", str2, ")");
                int i10 = l0.f13401b;
                k.g(strK);
                return;
            }
        }
        if (str2 != null) {
            zzcbnVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcbnVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcbnVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcbnVar.zzD(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) throws JSONException, NumberFormatException {
        int iMin;
        int iMin2;
        int i10;
        zzcbz zzcbzVar = (zzcbz) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i11 = l0.f13401b;
            k.g("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZzb = zzcbzVar.zzn() != null ? zzcbzVar.zzn().zzb() : null;
        if (numValueOf2 != null && numZzb != null && !numValueOf2.equals(numZzb) && !str.equals("load")) {
            Locale locale = Locale.US;
            int i12 = l0.f13401b;
            k.f("Event intended for player " + numValueOf2 + ", but sent to player " + numZzb + " - event ignored");
            return;
        }
        if (k.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            k.b("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                k.g("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcbzVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                k.g("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                k.g("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcbzVar.zzB(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                k.g("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                k.g("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcbzVar.zzd("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(",")) {
                map3.put(str5, j0.a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            zzcbzVar.zzd("onVideoEvent", map4);
            return;
        }
        zzcbo zzcboVarZzn = zzcbzVar.zzn();
        if (zzcboVarZzn == null) {
            k.g("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = zzcbzVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            zzbct zzbctVar = zzbdc.zzee;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcbzVar.zzh() : Math.min(iZzb3, zzcbzVar.zzh());
            } else {
                if (l0.m()) {
                    StringBuilder sbQ = gk.b.q("Calculate width with original width ", iZzb3, ", videoHost.getVideoBoundingWidth() ", zzcbzVar.zzh(), ", x ");
                    sbQ.append(iZzb);
                    sbQ.append(".");
                    l0.k(sbQ.toString());
                }
                iMin = Math.min(iZzb3, zzcbzVar.zzh() - iZzb);
            }
            int iZzb4 = zzb(context, map, "h", -1);
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcbzVar.zzg() : Math.min(iZzb4, zzcbzVar.zzg());
            } else {
                if (l0.m()) {
                    StringBuilder sbQ2 = gk.b.q("Calculate height with original height ", iZzb4, ", videoHost.getVideoBoundingHeight() ", zzcbzVar.zzg(), ", y ");
                    sbQ2.append(iZzb2);
                    sbQ2.append(".");
                    l0.k(sbQ2.toString());
                }
                iMin2 = Math.min(iZzb4, zzcbzVar.zzg() - iZzb2);
            }
            int i13 = iMin2;
            try {
                i10 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i10 = 0;
            }
            boolean z2 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcboVarZzn.zza() != null) {
                zzcboVarZzn.zzc(iZzb, iZzb2, iMin, i13);
                return;
            }
            zzcboVarZzn.zzd(iZzb, iZzb2, iMin, i13, i10, z2, new zzcby((String) map.get("flags")));
            zzcbn zzcbnVarZza = zzcboVarZzn.zza();
            if (zzcbnVarZza != null) {
                zzc(zzcbnVarZza, map);
                return;
            }
            return;
        }
        zzcgg zzcggVarZzq = zzcbzVar.zzq();
        if (zzcggVarZzq != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    k.g("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcggVarZzq.zzt(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    k.g("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcggVarZzq.zzu();
                return;
            }
        }
        zzcbn zzcbnVarZza2 = zzcboVarZzn.zza();
        if (zzcbnVarZza2 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            zzcbzVar.zzd("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzcbzVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcbnVarZza2.zzx(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                k.g("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcbnVarZza2.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                k.g("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzcbnVarZza2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzcbnVarZza2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcbnVarZza2.zzr(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzcbnVarZza2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcbnVarZza2.zzs();
                return;
            } else {
                zzcbnVarZza2.zzI();
                return;
            }
        }
        if (str.equals("pause")) {
            zzcbnVarZza2.zzu();
            return;
        }
        if (str.equals("play")) {
            zzcbnVarZza2.zzv();
            return;
        }
        if (str.equals("show")) {
            zzcbnVarZza2.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = zzcbzVar.getContext();
                zzcbnVarZza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcbzVar.zzdi();
                this.zza = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    zzcbnVarZza2.zzp();
                    return;
                } else {
                    k.g("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                k.g("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzcbnVarZza2.zzG(Float.parseFloat(str8));
                return;
            } catch (NumberFormatException unused6) {
                k.g("Could not parse volume parameter from volume video GMSG: ".concat(str8));
                return;
            }
        }
        String str9 = (String) map.get("src");
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcl)).booleanValue() && TextUtils.isEmpty(str9)) {
            k.g("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
            } catch (NumberFormatException unused7) {
                k.g("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
            }
        }
        String[] strArr = {str9};
        String str10 = (String) map.get("demuxed");
        if (str10 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str10);
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                    String string = jSONArray.getString(i14);
                    if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcl)).booleanValue() || !TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcl)).booleanValue() && arrayList.isEmpty()) {
                    k.g("All demuxed URLs are empty for playback: " + str10);
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                k.g("Malformed demuxed URL list for playback: ".concat(str10));
                strArr = new String[]{str9};
            }
        }
        if (numValueOf != null) {
            zzcbzVar.zzA(numValueOf.intValue());
        }
        zzcbnVarZza2.zzE(str9, strArr);
    }
}
