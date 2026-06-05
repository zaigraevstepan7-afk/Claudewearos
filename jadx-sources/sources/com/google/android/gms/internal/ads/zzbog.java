package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import mc.n;
import nc.t;
import qc.d0;
import qc.l0;
import qc.r0;
import qc.s;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbog {
    private final Context zzb;
    private final String zzc;
    private final rc.a zzd;
    private final zzfhp zze;
    private final s zzf;
    private final s zzg;
    private zzbof zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbog(Context context, rc.a aVar, String str, s sVar, s sVar2, zzfhp zzfhpVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = aVar;
        this.zze = zzfhpVar;
        this.zzf = sVar;
        this.zzg = sVar2;
    }

    public static /* synthetic */ void zzg(zzbog zzbogVar, zzbnb zzbnbVar) {
        if (zzbnbVar.zzi()) {
            zzbogVar.zzi = 1;
        }
    }

    public static void zzh(zzbog zzbogVar, zzavs zzavsVar, zzbof zzbofVar) {
        n.D.f11584k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            l0.k("loadJavascriptEngine > Before createJavascriptEngine");
            zzbnj zzbnjVar = new zzbnj(zzbogVar.zzb, zzbogVar.zzd, null, null);
            l0.k("loadJavascriptEngine > After createJavascriptEngine");
            l0.k("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbnjVar.zzk(new zzbnm(zzbogVar, arrayList, jCurrentTimeMillis, zzbofVar, zzbnjVar));
            l0.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbnjVar.zzq("/jsLoaded", new zzbnr(zzbogVar, jCurrentTimeMillis, zzbofVar, zzbnjVar));
            d0 d0Var = new d0();
            zzbns zzbnsVar = new zzbns(zzbogVar, null, zzbnjVar, d0Var);
            d0Var.f13348a = zzbnsVar;
            l0.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbnjVar.zzq("/requestReload", zzbnsVar);
            String str = zzbogVar.zzc;
            l0.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                l0.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbnjVar.zzh(str);
                l0.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                l0.k("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbnjVar.zzf(str);
                l0.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                l0.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbnjVar.zzg(str);
                l0.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            l0.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            r0.f13445l.postDelayed(new zzbnu(zzbogVar, zzbofVar, zzbnjVar, arrayList, jCurrentTimeMillis), ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzd)).intValue());
        } catch (Throwable th2) {
            int i10 = l0.f13401b;
            k.e("Error creating webview.", th2);
            zzbct zzbctVar = zzbdc.zzhT;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                zzbofVar.zzh(th2, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzhV)).booleanValue()) {
                n.D.f11582h.zzv(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbofVar.zzg();
            } else {
                n.D.f11582h.zzw(th2, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbofVar.zzg();
            }
        }
    }

    public static void zzi(zzbog zzbogVar, zzbof zzbofVar, final zzbnb zzbnbVar, ArrayList arrayList, long j) {
        l0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (zzbogVar.zza) {
            try {
                l0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbofVar.zze() != -1 && zzbofVar.zze() != 1) {
                    zzbct zzbctVar = zzbdc.zzhT;
                    t tVar = t.f12227d;
                    if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                        zzbofVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbofVar.zzg();
                    }
                    zzgdm zzgdmVar = zzcad.zzf;
                    Objects.requireNonNull(zzbnbVar);
                    zzgdmVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnl
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbnbVar.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(tVar.f12230c.zzb(zzbdc.zzc));
                    int iZze = zzbofVar.zze();
                    int i10 = zzbogVar.zzi;
                    String strValueOf2 = String.valueOf(arrayList.get(0));
                    n.D.f11584k.getClass();
                    l0.k("Could not receive /jsLoaded in " + strValueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + iZze + ". Update status(onEngLoadedTimeout) is " + i10 + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + strValueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + (System.currentTimeMillis() - j) + " ms. Rejecting.");
                    l0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                l0.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzboa zzb(zzavs zzavsVar) {
        l0.k("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            try {
                l0.k("getEngine: Lock acquired");
                l0.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (obj) {
                    try {
                        l0.k("refreshIfDestroyed: Lock acquired");
                        zzbof zzbofVar = this.zzh;
                        if (zzbofVar != null && this.zzi == 0) {
                            zzbofVar.zzj(new zzcam() { // from class: com.google.android.gms.internal.ads.zzbno
                                @Override // com.google.android.gms.internal.ads.zzcam
                                public final void zza(Object obj2) {
                                    zzbog.zzg(this.zza, (zzbnb) obj2);
                                }
                            }, new zzcak() { // from class: com.google.android.gms.internal.ads.zzbnp
                                @Override // com.google.android.gms.internal.ads.zzcak
                                public final void zza() {
                                }
                            });
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l0.k("refreshIfDestroyed: Lock released");
        zzbof zzbofVar2 = this.zzh;
        if (zzbofVar2 != null && zzbofVar2.zze() != -1) {
            int i10 = this.zzi;
            if (i10 == 0) {
                l0.k("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i10 != 1) {
                l0.k("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zzd(null);
            l0.k("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zzd(null);
        l0.k("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final zzbof zzd(zzavs zzavsVar) {
        zzfhb zzfhbVarZza = zzfha.zza(this.zzb, 6);
        zzfhbVarZza.zzi();
        final zzbof zzbofVar = new zzbof(this.zzg);
        l0.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzavs zzavsVar2 = null;
        zzcad.zzf.execute(new Runnable(zzavsVar2, zzbofVar) { // from class: com.google.android.gms.internal.ads.zzbnq
            public final /* synthetic */ zzbof zzb;

            {
                this.zzb = zzbofVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbog.zzh(this.zza, null, this.zzb);
            }
        });
        l0.k("loadNewJavascriptEngine: Promise created");
        zzbofVar.zzj(new zzbnv(this, zzbofVar, zzfhbVarZza), new zzbnw(this, zzbofVar, zzfhbVarZza));
        return zzbofVar;
    }
}
