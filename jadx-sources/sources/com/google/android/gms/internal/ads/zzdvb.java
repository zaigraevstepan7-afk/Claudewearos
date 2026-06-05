package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mc.n;
import nc.s;
import nc.t;
import nc.w1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import qc.n0;
import qc.o0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdvb implements zzdwc, zzdum {
    private final zzdvm zza;
    private final zzdwd zzb;
    private final zzdun zzc;
    private final zzduw zzd;
    private final zzdul zze;
    private final zzdvy zzf;
    private final zzdvi zzg;
    private final zzdvi zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = "{}";
    private long zzq = Long.MAX_VALUE;
    private zzdux zzr = zzdux.NONE;
    private zzdva zzv = zzdva.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzdvb(zzdvm zzdvmVar, zzdwd zzdwdVar, zzdun zzdunVar, Context context, rc.a aVar, zzduw zzduwVar, zzdvy zzdvyVar, zzdvi zzdviVar, zzdvi zzdviVar2, String str) {
        this.zza = zzdvmVar;
        this.zzb = zzdwdVar;
        this.zzc = zzdunVar;
        this.zze = new zzdul(context);
        this.zzi = aVar.f14321a;
        this.zzk = str;
        this.zzd = zzduwVar;
        this.zzf = zzdvyVar;
        this.zzg = zzdviVar;
        this.zzh = zzdviVar2;
        this.zzj = context;
        n.D.f11588o.f13412g = this;
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdux) Enum.valueOf(zzdux.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", "{}");
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.zzl.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzdup zzdupVar : (List) entry.getValue()) {
                    if (zzdupVar.zzg()) {
                        jSONArray.put(zzdupVar.zzd());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    private final void zzu() throws JSONException {
        String str;
        String str2;
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzi(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzbct zzbctVar = zzbdc.zzjJ;
        t tVar = t.f12227d;
        if (!TextUtils.isEmpty((CharSequence) tVar.f12230c.zzb(zzbctVar))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) tVar.f12230c.zzb(zzbctVar)).split(",")));
        }
        zzbct zzbctVar2 = zzbdc.zzjK;
        if (!TextUtils.isEmpty((CharSequence) tVar.f12230c.zzb(zzbctVar2))) {
            this.zzh.zzb(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) tVar.f12230c.zzb(zzbctVar2)).split(",")));
        }
        n nVar = n.D;
        o0 o0Var = (o0) nVar.f11582h.zzi();
        o0Var.l();
        synchronized (o0Var.f13414a) {
            str = o0Var.f13436x;
        }
        zzA(str);
        o0 o0Var2 = (o0) nVar.f11582h.zzi();
        o0Var2.l();
        synchronized (o0Var2.f13414a) {
            str2 = o0Var2.A;
        }
        this.zzx = str2;
    }

    private final void zzv() {
        n0 n0VarZzi = n.D.f11582h.zzi();
        String strZzd = zzd();
        o0 o0Var = (o0) n0VarZzi;
        o0Var.getClass();
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjg)).booleanValue()) {
            o0Var.l();
            synchronized (o0Var.f13414a) {
                try {
                    if (o0Var.f13436x.equals(strZzd)) {
                        return;
                    }
                    o0Var.f13436x = strZzd;
                    SharedPreferences.Editor editor = o0Var.f13420g;
                    if (editor != null) {
                        editor.putString("inspector_info", strZzd);
                        o0Var.f13420g.apply();
                    }
                    o0Var.m();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final synchronized void zzw(zzdux zzduxVar, boolean z2) {
        try {
            if (this.zzr != zzduxVar) {
                if (zzq()) {
                    zzy();
                }
                this.zzr = zzduxVar;
                if (zzq()) {
                    zzz();
                }
                if (z2) {
                    zzv();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void zzx(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzjv     // Catch: java.lang.Throwable -> L27
            nc.t r0 = nc.t.f12227d     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzbda r0 = r0.f12230c     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.zzb(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            mc.n r2 = mc.n.D     // Catch: java.lang.Throwable -> L27
            qc.n r2 = r2.f11588o     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.zzz()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.zzq()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.zzy()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.zzv()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvb.zzx(boolean, boolean):void");
    }

    private final synchronized void zzy() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzz() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    public final zzdux zza() {
        return this.zzr;
    }

    public final synchronized mf.a zzb(String str) {
        zzcai zzcaiVar;
        try {
            zzcaiVar = new zzcai();
            Map map = this.zzm;
            if (map.containsKey(str)) {
                zzcaiVar.zzc((zzdup) map.get(str));
            } else {
                Map map2 = this.zzn;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(zzcaiVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzcaiVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjg)).booleanValue() && zzq()) {
            long j = this.zzq;
            n.D.f11584k.getClass();
            if (j < System.currentTimeMillis() / 1000) {
                this.zzo = "{}";
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals("{}")) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            long j = this.zzq;
            n.D.f11584k.getClass();
            if (j > System.currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                String str = this.zzk;
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + str);
                }
                jSONObject.put("internalSdkVersion", this.zzi);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.zzd.zza());
                zzbct zzbctVar = zzbdc.zzjG;
                t tVar = t.f12227d;
                if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                    String strZzn = n.D.f11582h.zzn();
                    if (!TextUtils.isEmpty(strZzn)) {
                        jSONObject.put("plugin", strZzn);
                    }
                }
                long j = this.zzq;
                n nVar = n.D;
                nVar.f11584k.getClass();
                if (j < System.currentTimeMillis() / 1000) {
                    this.zzo = "{}";
                }
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("adSlots", zzt());
                jSONObject.put("appInfo", this.zze.zza());
                String strZzc = ((o0) nVar.f11582h.zzi()).n().zzc();
                if (!TextUtils.isEmpty(strZzc)) {
                    jSONObject.put("cld", new JSONObject(strZzc));
                }
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjw)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                    String str2 = "Server data: " + jSONObject2.toString();
                    int i10 = l0.f13401b;
                    k.b(str2);
                    jSONObject.put("serverData", this.zzp);
                }
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjv)).booleanValue()) {
                    jSONObject.put("openAction", this.zzv);
                    jSONObject.put("gesture", this.zzr);
                }
                jSONObject.put("isGamRegisteredTestDevice", nVar.f11588o.g());
                rc.e eVar = s.f12202f.f12203a;
                jSONObject.put("isSimulator", rc.e.n());
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjI)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.zzx));
                }
                if (!TextUtils.isEmpty((CharSequence) tVar.f12230c.zzb(zzbdc.zzjK))) {
                    jSONObject.put("gmaDisk", this.zzh.zza());
                }
                if (!TextUtils.isEmpty((CharSequence) tVar.f12230c.zzb(zzbdc.zzjJ))) {
                    jSONObject.put("userDisk", this.zzg.zza());
                }
            } catch (JSONException e10) {
                n.D.f11582h.zzv(e10, "Inspector.toJson");
                int i11 = l0.f13401b;
                k.h("Ad inspector encountered an error", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdup zzdupVar) {
        zzbct zzbctVar = zzbdc.zzjg;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) tVar.f12230c.zzb(zzbdc.zzji)).intValue()) {
                int i10 = l0.f13401b;
                k.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            Map map = this.zzl;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) map.get(str)).add(zzdupVar);
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjE)).booleanValue()) {
                String strZzc = zzdupVar.zzc();
                this.zzm.put(strZzc, zzdupVar);
                Map map2 = this.zzn;
                if (map2.containsKey(strZzc)) {
                    List list = (List) map2.get(strZzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcai) it.next()).zzc(zzdupVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() throws JSONException {
        String str;
        boolean z2;
        zzbct zzbctVar = zzbdc.zzjg;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjv)).booleanValue()) {
                o0 o0Var = (o0) n.D.f11582h.zzi();
                o0Var.l();
                synchronized (o0Var.f13414a) {
                    z2 = o0Var.f13437y;
                }
                if (z2) {
                    zzu();
                    return;
                }
            }
            o0 o0Var2 = (o0) n.D.f11582h.zzi();
            o0Var2.l();
            synchronized (o0Var2.f13414a) {
                str = o0Var2.f13436x;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (new JSONObject(str).optBoolean("isTestMode", false)) {
                    zzu();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(w1 w1Var, zzdva zzdvaVar) {
        if (!zzq()) {
            try {
                w1Var.zze(zzfdp.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i10 = l0.f13401b;
                k.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjg)).booleanValue()) {
            this.zzv = zzdvaVar;
            this.zza.zzj(w1Var, new zzbkx(this), new zzbkq(this.zzf), new zzbke(this));
            return;
        } else {
            try {
                w1Var.zze(zzfdp.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i11 = l0.f13401b;
                k.g("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzi(String str, long j) {
        this.zzo = str;
        this.zzq = j;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        ((o0) n.D.f11582h.zzi()).b(this.zzx);
    }

    public final synchronized void zzk(long j) {
        this.zzw += j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzl(boolean r2) throws org.json.JSONException {
        /*
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzu()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzs
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzz()
            return
        L15:
            boolean r2 = r1.zzq()
            if (r2 != 0) goto L1e
            r1.zzy()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdvb.zzl(boolean):void");
    }

    public final void zzm(zzdux zzduxVar) {
        zzw(zzduxVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z2) throws JSONException {
        if (!this.zzu && z2) {
            zzu();
        }
        zzx(z2, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjv)).booleanValue()) {
            return this.zzs || n.D.f11588o.g();
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        return this.zzw < ((Long) t.f12227d.f12230c.zzb(zzbdc.zzjB)).longValue();
    }
}
