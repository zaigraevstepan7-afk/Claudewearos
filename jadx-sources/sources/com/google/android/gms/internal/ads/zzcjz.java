package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.e0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mc.n;
import nc.k3;
import nc.l1;
import nc.t;
import nc.w1;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import qc.o0;
import qc.r0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcjz extends l1 {
    private final Context zza;
    private final rc.a zzb;
    private final zzdps zzc;
    private final zzedg zzd;
    private final zzejm zze;
    private final zzdug zzf;
    private final zzbym zzg;
    private final zzdpx zzh;
    private final zzdvb zzi;
    private final zzbfv zzj;
    private final zzfhp zzk;
    private final zzfdk zzl;
    private final zzctg zzm;
    private final zzdsc zzn;
    private boolean zzo = false;
    private final Long zzp;

    public zzcjz(Context context, rc.a aVar, zzdps zzdpsVar, zzedg zzedgVar, zzejm zzejmVar, zzdug zzdugVar, zzbym zzbymVar, zzdpx zzdpxVar, zzdvb zzdvbVar, zzbfv zzbfvVar, zzfhp zzfhpVar, zzfdk zzfdkVar, zzctg zzctgVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = zzdpsVar;
        this.zzd = zzedgVar;
        this.zze = zzejmVar;
        this.zzf = zzdugVar;
        this.zzg = zzbymVar;
        this.zzh = zzdpxVar;
        this.zzi = zzdvbVar;
        this.zzj = zzbfvVar;
        this.zzk = zzfhpVar;
        this.zzl = zzfdkVar;
        this.zzm = zzctgVar;
        this.zzn = zzdscVar;
        n.D.f11584k.getClass();
        this.zzp = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public static void zzb(zzcjz zzcjzVar) {
        n.D.f11587n.zzd(zzcjzVar.zza, zzcjzVar.zzn);
    }

    public static void zzc(zzcjz zzcjzVar, Runnable runnable) {
        e0.d("Adapters must be initialized on the main thread.");
        Map mapZze = ((o0) n.D.f11582h.zzi()).n().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                int i10 = l0.f13401b;
                k.h("Could not initialize rewarded ads.", th2);
                return;
            }
        }
        if (zzcjzVar.zzc.zzd()) {
            HashMap map = new HashMap();
            Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (zzbph zzbphVar : ((zzbpi) it.next()).zza) {
                    String str = zzbphVar.zzb;
                    for (String str2 : zzbphVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzedh zzedhVarZza = zzcjzVar.zzd.zza(str3, jSONObject);
                    if (zzedhVarZza != null) {
                        zzfdm zzfdmVar = (zzfdm) zzedhVarZza.zzb;
                        if (!zzfdmVar.zzC() && zzfdmVar.zzB()) {
                            zzfdmVar.zzj(zzcjzVar.zza, (zzeew) zzedhVarZza.zzc, (List) entry.getValue());
                            int i11 = l0.f13401b;
                            k.b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfcv e10) {
                    String strJ = m1.j("Failed to initialize rewarded video mediation adapter \"", str3, "\"");
                    int i12 = l0.f13401b;
                    k.h(strJ, e10);
                }
            }
        }
    }

    @Override // nc.m1
    public final synchronized float zze() {
        return n.D.f11583i.a();
    }

    @Override // nc.m1
    public final String zzf() {
        return this.zzb.f14321a;
    }

    @Override // nc.m1
    public final List zzg() {
        return this.zzf.zzg();
    }

    @Override // nc.m1
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // nc.m1
    public final void zzi() {
        this.zzf.zzq();
    }

    @Override // nc.m1
    public final void zzj(boolean z2) throws IOException, RemoteException {
        try {
            Context context = this.zza;
            zzfrs.zza(context).zzc(z2);
            if (z2) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e10) {
                n.D.f11582h.zzw(e10, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e11) {
            throw new RemoteException(e11.getMessage());
        }
    }

    @Override // nc.m1
    public final synchronized void zzk() {
        if (this.zzo) {
            int i10 = l0.f13401b;
            k.g("Mobile ads is initialized already.");
            return;
        }
        Context context = this.zza;
        zzbdc.zza(context);
        rc.a aVar = this.zzb;
        n nVar = n.D;
        nVar.f11582h.zzu(context, aVar);
        this.zzm.zzd();
        nVar.j.zzi(context);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zzf();
        zzbct zzbctVar = zzbdc.zzel;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            this.zzh.zzf();
        }
        this.zzi.zzg();
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjv)).booleanValue()) {
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx();
                }
            });
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzli)).booleanValue()) {
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj.zza(new zzbuq());
                }
            });
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzdj)).booleanValue()) {
            zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjv
                @Override // java.lang.Runnable
                public final void run() {
                    zzfds.zzb(this.zza.zza, true);
                }
            });
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzeO)).booleanValue()) {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzeP)).booleanValue()) {
                zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcjz.zzb(this.zza);
                    }
                });
            }
        }
    }

    @Override // nc.m1
    public final void zzl(String str, xd.a aVar) throws JSONException {
        String strG;
        Runnable runnable;
        Context context = this.zza;
        zzbdc.zza(context);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeq)).booleanValue()) {
            try {
                r0 r0Var = n.D.f11577c;
                strG = r0.G(context);
            } catch (RemoteException | RuntimeException e10) {
                n.D.f11582h.zzw(e10, "NonagonMobileAdsSettingManager_AppId");
            }
        } else {
            strG = "";
        }
        boolean z2 = true;
        String str2 = true == TextUtils.isEmpty(strG) ? str : strG;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzbct zzbctVar = zzbdc.zzej;
        t tVar = t.f12227d;
        zzbda zzbdaVar = tVar.f12230c;
        zzbda zzbdaVar2 = tVar.f12230c;
        boolean zBooleanValue = ((Boolean) zzbdaVar.zzb(zzbctVar)).booleanValue();
        zzbct zzbctVar2 = zzbdc.zzbc;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzbdaVar2.zzb(zzbctVar2)).booleanValue();
        if (((Boolean) zzbdaVar2.zzb(zzbctVar2)).booleanValue()) {
            final Runnable runnable2 = (Runnable) xd.b.u(aVar);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjy
                @Override // java.lang.Runnable
                public final void run() {
                    zzgdm zzgdmVar = zzcad.zzf;
                    final zzcjz zzcjzVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgdmVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcjz.zzc(zzcjzVar, runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z2 = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z2) {
            n.D.f11585l.k(this.zza, this.zzb, true, null, str2, null, runnable3, this.zzk, this.zzn, this.zzp, this.zzi.zzq());
        }
    }

    @Override // nc.m1
    public final void zzm(w1 w1Var) {
        this.zzi.zzh(w1Var, zzdva.API);
    }

    @Override // nc.m1
    public final void zzn(xd.a aVar, String str) {
        if (aVar == null) {
            int i10 = l0.f13401b;
            k.d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) xd.b.u(aVar);
        if (context == null) {
            int i11 = l0.f13401b;
            k.d("Context is null. Failed to open debug menu.");
        } else {
            qc.k kVar = new qc.k(context);
            kVar.f13386d = str;
            kVar.f13387e = this.zzb.f14321a;
            kVar.b();
        }
    }

    @Override // nc.m1
    public final void zzo(zzbpo zzbpoVar) {
        this.zzl.zzf(zzbpoVar);
    }

    @Override // nc.m1
    public final synchronized void zzp(boolean z2) {
        qc.b bVar = n.D.f11583i;
        synchronized (bVar) {
            bVar.f13336a = z2;
        }
    }

    @Override // nc.m1
    public final synchronized void zzq(float f10) {
        qc.b bVar = n.D.f11583i;
        synchronized (bVar) {
            bVar.f13337b = f10;
        }
    }

    @Override // nc.m1
    public final synchronized void zzr(String str) {
        Context context = this.zza;
        zzbdc.zza(context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzej)).booleanValue()) {
                n.D.f11585l.k(context, this.zzb, true, null, str, null, null, this.zzk, null, null, this.zzi.zzq());
            }
        }
    }

    @Override // nc.m1
    public final void zzs(zzbmi zzbmiVar) {
        this.zzf.zzs(zzbmiVar);
    }

    @Override // nc.m1
    public final void zzt(String str) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjG)).booleanValue()) {
            n.D.f11582h.zzz(str);
        }
    }

    @Override // nc.m1
    public final void zzu(k3 k3Var) {
        this.zzg.zzn(this.zza, k3Var);
    }

    @Override // nc.m1
    public final synchronized boolean zzv() {
        boolean z2;
        qc.b bVar = n.D.f11583i;
        synchronized (bVar) {
            z2 = bVar.f13336a;
        }
        return z2;
    }

    public final void zzx() {
        boolean z2;
        String str;
        n nVar = n.D;
        o0 o0Var = (o0) nVar.f11582h.zzi();
        o0Var.l();
        synchronized (o0Var.f13414a) {
            z2 = o0Var.f13437y;
        }
        if (z2) {
            o0 o0Var2 = (o0) nVar.f11582h.zzi();
            o0Var2.l();
            synchronized (o0Var2.f13414a) {
                str = o0Var2.f13438z;
            }
            if (nVar.f11588o.f(this.zza, str, this.zzb.f14321a)) {
                return;
            }
            ((o0) nVar.f11582h.zzi()).r(false);
            ((o0) nVar.f11582h.zzi()).q("");
        }
    }
}
