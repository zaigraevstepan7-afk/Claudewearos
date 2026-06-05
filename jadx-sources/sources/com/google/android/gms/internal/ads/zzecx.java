package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import mc.n;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzecx {
    private final Context zza;
    private final rc.a zzb;
    private final zzfbt zzc;
    private final zzcfe zzd;
    private final zzdsc zze;
    private zzflo zzf;

    public zzecx(Context context, rc.a aVar, zzfbt zzfbtVar, zzcfe zzcfeVar, zzdsc zzdscVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = zzfbtVar;
        this.zzd = zzcfeVar;
        this.zze = zzdscVar;
    }

    public final synchronized void zza(View view) {
        zzflo zzfloVar = this.zzf;
        if (zzfloVar != null) {
            n.D.f11598y.zzh(zzfloVar, view);
        }
    }

    public final synchronized void zzb() {
        zzcfe zzcfeVar;
        if (this.zzf == null || (zzcfeVar = this.zzd) == null) {
            return;
        }
        zzcfeVar.zzd("onSdkImpression", zzfyi.zzd());
    }

    public final synchronized void zzc() {
        zzcfe zzcfeVar;
        try {
            zzflo zzfloVar = this.zzf;
            if (zzfloVar == null || (zzcfeVar = this.zzd) == null) {
                return;
            }
            Iterator it = zzcfeVar.zzV().iterator();
            while (it.hasNext()) {
                n.D.f11598y.zzh(zzfloVar, (View) it.next());
            }
            zzcfeVar.zzd("onSdkLoaded", zzfyi.zzd());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    public final synchronized boolean zze(boolean z2) {
        zzcfe zzcfeVar;
        zzfbt zzfbtVar = this.zzc;
        if (zzfbtVar.zzT) {
            zzbct zzbctVar = zzbdc.zzfu;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzfx)).booleanValue() && (zzcfeVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i10 = l0.f13401b;
                        k.g("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.zza;
                    n nVar = n.D;
                    if (!nVar.f11598y.zzl(context)) {
                        int i11 = l0.f13401b;
                        k.g("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfbtVar.zzV.zzb()) {
                        zzflo zzfloVarZze = nVar.f11598y.zze(this.zzb, zzcfeVar.zzG(), true);
                        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzfy)).booleanValue()) {
                            zzdsc zzdscVar = this.zze;
                            String str = zzfloVarZze != null ? "1" : "0";
                            zzdsb zzdsbVarZza = zzdscVar.zza();
                            zzdsbVarZza.zzb("omid_js_session_success", str);
                            zzdsbVarZza.zzj();
                        }
                        if (zzfloVarZze == null) {
                            int i12 = l0.f13401b;
                            k.g("Unable to create javascript session service.");
                            return false;
                        }
                        int i13 = l0.f13401b;
                        k.f("Created omid javascript session service.");
                        this.zzf = zzfloVarZze;
                        zzcfeVar.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(zzcfv zzcfvVar) {
        zzcfe zzcfeVar;
        zzflo zzfloVar = this.zzf;
        if (zzfloVar == null || (zzcfeVar = this.zzd) == null) {
            return;
        }
        n.D.f11598y.zzm(zzfloVar, zzcfvVar);
        this.zzf = null;
        zzcfeVar.zzas(null);
    }
}
