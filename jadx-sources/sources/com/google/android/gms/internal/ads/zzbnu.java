package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import mc.n;
import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbnu implements Runnable {
    final /* synthetic */ zzbof zza;
    final /* synthetic */ zzbnb zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbog zze;

    public zzbnu(zzbog zzbogVar, zzbof zzbofVar, zzbnb zzbnbVar, ArrayList arrayList, long j) {
        this.zza = zzbofVar;
        this.zzb = zzbnbVar;
        this.zzc = arrayList;
        this.zzd = j;
        this.zze = zzbogVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbog zzbogVar = this.zze;
        synchronized (zzbogVar.zza) {
            try {
                l0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                zzbof zzbofVar = this.zza;
                if (zzbofVar.zze() != -1 && zzbofVar.zze() != 1) {
                    zzbct zzbctVar = zzbdc.zzhT;
                    t tVar = t.f12227d;
                    if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                        zzbofVar.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        zzbofVar.zzg();
                    }
                    zzgdm zzgdmVar = zzcad.zzf;
                    final zzbnb zzbnbVar = this.zzb;
                    Objects.requireNonNull(zzbnbVar);
                    zzgdmVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnt
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbnbVar.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(tVar.f12230c.zzb(zzbdc.zzd));
                    int iZze = zzbofVar.zze();
                    int i10 = zzbogVar.zzi;
                    ArrayList arrayList = this.zzc;
                    String strConcat = arrayList.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(arrayList.get(0)));
                    n.D.f11584k.getClass();
                    l0.k("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iZze + ". Update status(fullLoadTimeout) is " + i10 + strConcat + " ms. Total latency(fullLoadTimeout) is " + (System.currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
                    l0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                l0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
