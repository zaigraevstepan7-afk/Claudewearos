package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import pc.m;
import qc.l0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcni implements zzazb, zzcwm, m, zzcwl {
    private final zzcnd zza;
    private final zzcne zzb;
    private final zzbpg zzd;
    private final Executor zze;
    private final ud.a zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcnh zzh = new zzcnh();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcni(zzbpd zzbpdVar, zzcne zzcneVar, Executor executor, zzcnd zzcndVar, ud.a aVar) {
        this.zza = zzcndVar;
        zzboo zzbooVar = zzbor.zza;
        this.zzd = zzbpdVar.zza("google.afma.activeView.handleUpdate", zzbooVar, zzbooVar);
        this.zzb = zzcneVar;
        this.zze = executor;
        this.zzf = aVar;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzcfe) it.next());
        }
        this.zza.zze();
    }

    @Override // pc.m
    public final synchronized void zzdH() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdj(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // pc.m
    public final synchronized void zzdk() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdl(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final synchronized void zzdm(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final synchronized void zzdr(zzaza zzazaVar) {
        zzcnh zzcnhVar = this.zzh;
        zzcnhVar.zza = zzazaVar.zzj;
        zzcnhVar.zzf = zzazaVar;
        zzg();
    }

    public final synchronized void zzg() {
        try {
            if (this.zzj.get() == null) {
                zzj();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcnh zzcnhVar = this.zzh;
                ((ud.b) this.zzf).getClass();
                zzcnhVar.zzd = SystemClock.elapsedRealtime();
                final JSONObject jSONObjectZza = this.zzb.zzb(zzcnhVar);
                for (final zzcfe zzcfeVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcng
                        @Override // java.lang.Runnable
                        public final void run() {
                            JSONObject jSONObject = jSONObjectZza;
                            String strJ = m1.j("Calling AFMA_updateActiveView(", jSONObject.toString(), ")");
                            int i10 = l0.f13401b;
                            k.b(strJ);
                            zzcfeVar.zzp("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                zzcag.zzb(this.zzd.zzc(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e10) {
                l0.l("Failed to call ActiveViewJS", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzh(zzcfe zzcfeVar) {
        this.zzc.add(zzcfeVar);
        this.zza.zzd(zzcfeVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final synchronized void zzs() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }

    @Override // pc.m
    public final void zzds() {
    }

    @Override // pc.m
    public final void zzdt() {
    }

    @Override // pc.m
    public final void zzdv() {
    }

    @Override // pc.m
    public final void zzdw(int i10) {
    }
}
