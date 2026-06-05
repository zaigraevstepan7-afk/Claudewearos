package com.google.android.gms.internal.ads;

import java.util.Map;
import qc.d0;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbns implements zzbkd {
    final /* synthetic */ zzbnb zza;
    final /* synthetic */ d0 zzb;
    final /* synthetic */ zzbog zzc;

    public zzbns(zzbog zzbogVar, zzavs zzavsVar, zzbnb zzbnbVar, d0 d0Var) {
        this.zza = zzbnbVar;
        this.zzb = d0Var;
        this.zzc = zzbogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        l0.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbog zzbogVar = this.zzc;
        synchronized (zzbogVar.zza) {
            try {
                l0.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                k.f("JS Engine is requesting an update");
                if (zzbogVar.zzi == 0) {
                    k.f("Starting reload.");
                    zzbogVar.zzi = 2;
                    zzbogVar.zzd(null);
                }
                this.zza.zzr("/requestReload", (zzbkd) this.zzb.f13348a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l0.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
