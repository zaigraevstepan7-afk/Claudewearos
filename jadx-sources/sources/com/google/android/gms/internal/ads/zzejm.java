package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import mc.n;
import nc.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import qc.n0;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzejm {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzejm(Executor executor) {
        this.zzf = executor;
    }

    private final synchronized zzfyi zzh(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(((o0) n.D.f11582h.zzi()).n().zzc())) {
                zzbct zzbctVar = zzbdc.zzdv;
                t tVar = t.f12227d;
                boolean zMatches = Pattern.matches((String) tVar.f12230c.zzb(zzbctVar), str);
                boolean zMatches2 = Pattern.matches((String) tVar.f12230c.zzb(zzbdc.zzdw), str);
                if (zMatches) {
                    map = new HashMap(this.zze);
                } else if (zMatches2) {
                    map = new HashMap(this.zzd);
                }
                return zzfyi.zzc(map);
            }
            return zzfyi.zzd();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized List zzi(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleZzo = zzo(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        String str2 = (String) arrayList2.get(i11);
                        zzg(str2);
                        if (((zzejo) this.zza.get(str2)) != null) {
                            arrayList.add(new zzejo(str2, str, bundleZzo));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzj() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzm();
        zzn();
        zzk();
    }

    private final synchronized void zzk() {
        JSONObject jSONObjectZzf;
        try {
            if (!((Boolean) zzbfi.zzb.zze()).booleanValue()) {
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbW)).booleanValue() && (jSONObjectZzf = ((o0) n.D.f11582h.zzi()).n().zzf()) != null) {
                    JSONArray jSONArray = jSONObjectZzf.getJSONArray("adapter_settings");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String strOptString = jSONObject.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                                boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject2.optString("platform");
                                zzejq zzejqVar = new zzejq(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.zzd.put(strOptString, zzejqVar);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.zze.put(strOptString, zzejqVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e10) {
            l0.l("Malformed config loading JSON.", e10);
        } finally {
        }
    }

    private final synchronized void zzl(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = this.zzc;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List arrayList = (List) map2.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map2.put(str2, arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzm() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectZzf = ((o0) n.D.f11582h.zzi()).n().zzf();
            if (jSONObjectZzf != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                    this.zzg = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                            String lowerCase = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlg)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                    arrayList.addAll(zzi(jSONArrayOptJSONArray.getJSONObject(i11), strOptString));
                                }
                            }
                            zzl(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e10) {
                    l0.l("Malformed config loading JSON.", e10);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzn() {
        JSONObject jSONObjectZzf;
        if (!((Boolean) zzbfi.zze.zze()).booleanValue()) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzbV)).booleanValue() && (jSONObjectZzf = ((o0) n.D.f11582h.zzi()).n().zzf()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectZzf.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Bundle bundleZzo = zzo(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.zzb.put(strOptString, new zzejq(strOptString, zOptBoolean2, zOptBoolean, true, bundleZzo));
                        }
                    }
                } catch (JSONException e10) {
                    l0.l("Malformed config loading JSON.", e10);
                }
            }
        }
    }

    private static final Bundle zzo(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        HashMap map;
        try {
            Map mapZzb = zzb(str, str2);
            zzfyi zzfyiVarZzh = zzh(str2);
            map = new HashMap();
            for (Map.Entry entry : ((zzfyi) mapZzb).entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzfyiVarZzh.containsKey(str3)) {
                    zzejq zzejqVar = (zzejq) zzfyiVarZzh.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new zzejq(str3, zzejqVar.zzb, zzejqVar.zzc, zzejqVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzgal zzgalVarZze = zzfyiVarZzh.entrySet().iterator();
            while (zzgalVarZze.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzgalVarZze.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((zzejq) entry2.getValue()).zzd) {
                    map.put(str4, (zzejq) entry2.getValue());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return map;
    }

    public final synchronized Map zzb(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(((o0) n.D.f11582h.zzi()).n().zzc()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzejo> list = (List) map.get(str2);
                if (list == null) {
                    String strZza = zzdpz.zza(this.zzg, str2, str);
                    if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzlg)).booleanValue()) {
                        strZza = strZza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strZza);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (zzejo zzejoVar : list) {
                        String str3 = zzejoVar.zza;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(zzejoVar.zzb);
                    }
                    return zzfyi.zzc(map2);
                }
            }
            return zzfyi.zzd();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(((o0) n.D.f11582h.zzi()).n().zzc())) {
            return zzfyi.zzd();
        }
        return zzfyi.zzc(this.zzb);
    }

    public final void zzf() {
        n0 n0VarZzi = n.D.f11582h.zzi();
        ((o0) n0VarZzi).f13416c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejl
            @Override // java.lang.Runnable
            public final void run() {
                zzejm zzejmVar = this.zza;
                zzejmVar.zzf.execute(new zzejk(zzejmVar));
            }
        });
        this.zzf.execute(new zzejk(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, new zzejo(str, "", new Bundle()));
            }
        }
    }
}
