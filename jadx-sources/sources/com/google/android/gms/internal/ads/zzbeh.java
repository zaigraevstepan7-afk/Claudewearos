package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import mc.n;
import nc.t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.g;
import p.m;
import qc.l0;
import rc.k;
import xc.b0;
import xc.g0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbeh {
    private final ScheduledExecutorService zza;
    private final g0 zzb;
    private final b0 zzc;
    private final zzdsh zzd;
    private Runnable zze;
    private zzbee zzf;
    private m zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbeh(ScheduledExecutorService scheduledExecutorService, g0 g0Var, b0 b0Var, zzdsh zzdshVar) {
        this.zza = scheduledExecutorService;
        this.zzb = g0Var;
        this.zzc = b0Var;
        this.zzd = zzdshVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (((java.lang.Boolean) nc.t.f12227d.f12230c.zzb(com.google.android.gms.internal.ads.zzbdc.zzkd)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzbee r0 = r7.zzf
            if (r0 != 0) goto Lc
            int r0 = qc.l0.f13401b
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            rc.k.d(r0)
            return
        Lc:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.String r0 = r7.zzh
            if (r0 == 0) goto L98
            p.m r0 = r7.zzg
            if (r0 == 0) goto L98
            java.util.concurrent.ScheduledExecutorService r0 = r7.zza
            if (r0 == 0) goto L98
            long r1 = r7.zzi
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L2c
            goto L3e
        L2c:
            mc.n r1 = mc.n.D
            ud.b r1 = r1.f11584k
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r7.zzi
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3e
            goto L50
        L3e:
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzkd
            nc.t r2 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r2 = r2.f12230c
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L98
        L50:
            p.m r1 = r7.zzg
            java.lang.String r2 = r7.zzh
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            p.f r4 = r1.f12585c
            b.d r1 = r1.f12584b
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L80
            r5.<init>()     // Catch: android.os.RemoteException -> L80
            boolean r6 = r5.isEmpty()     // Catch: android.os.RemoteException -> L80
            if (r6 == 0) goto L70
            r5 = 0
        L70:
            if (r5 == 0) goto L7b
            r3.putAll(r5)     // Catch: android.os.RemoteException -> L80
            b.b r1 = (b.b) r1     // Catch: android.os.RemoteException -> L80
            r1.w(r4, r2, r3)     // Catch: android.os.RemoteException -> L80
            goto L80
        L7b:
            b.b r1 = (b.b) r1     // Catch: android.os.RemoteException -> L80
            r1.v(r4, r2)     // Catch: android.os.RemoteException -> L80
        L80:
            java.lang.Runnable r1 = r7.zze
            com.google.android.gms.internal.ads.zzbct r2 = com.google.android.gms.internal.ads.zzbdc.zzke
            nc.t r3 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r3 = r3.f12230c
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L98:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            qc.l0.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbeh.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) throws JSONException {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) t.f12227d.f12230c.zzb(zzbdc.zzkg));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("Error fetching the PACT active eids JSON: ", e10);
        }
    }

    public final m zzb() {
        return this.zzg;
    }

    public final JSONObject zzc(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbfh.zze.zze()).booleanValue() ? ((Long) zzbfh.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.a());
        }
        return jSONObject;
    }

    public final JSONObject zzd(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbfh.zze.zze()).booleanValue() ? ((Long) zzbfh.zzh.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.a());
        }
        return jSONObject;
    }

    public final void zzf() {
        n.D.f11584k.getClass();
        this.zzi = SystemClock.elapsedRealtime() + ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzkc)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbef
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, g gVar, String str, p.a aVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (gVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzdsh zzdshVar = this.zzd;
        zzbee zzbeeVar = new zzbee(this, aVar, zzdshVar);
        this.zzf = zzbeeVar;
        m mVarB = gVar.b(zzbeeVar);
        this.zzg = mVarB;
        if (mVarB == null) {
            int i10 = l0.f13401b;
            k.d("CustomTabsClient failed to create new session.");
        }
        u3.c.x(zzdshVar, "pact_action", new Pair("pe", "pact_init"));
    }

    public final void zzh(String str) {
        try {
            m mVar = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbfh.zzc.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.a());
            }
            mVar.a(jSONObject.toString());
            zzbeg zzbegVar = new zzbeg(this, str);
            if (((Boolean) zzbfh.zze.zze()).booleanValue()) {
                this.zzb.b(this.zzg, zzbegVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            Context context = this.zzl;
            d8.e eVar = new d8.e(7);
            eVar.h(bundle);
            zc.a.a(context, new fc.g(eVar), zzbegVar);
        } catch (JSONException e10) {
            int i10 = l0.f13401b;
            k.e("Error creating JSON: ", e10);
        }
    }

    public final void zzi(long j) {
        this.zzj = j;
    }
}
