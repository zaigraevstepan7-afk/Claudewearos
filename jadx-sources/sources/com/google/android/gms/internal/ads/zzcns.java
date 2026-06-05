package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcns implements zzazb {
    private zzcfe zza;
    private final Executor zzb;
    private final zzcne zzc;
    private final ud.a zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcnh zzg = new zzcnh();

    public zzcns(Executor executor, zzcne zzcneVar, ud.a aVar) {
        this.zzb = executor;
        this.zzc = zzcneVar;
        this.zzd = aVar;
    }

    public static /* synthetic */ void zza(zzcns zzcnsVar, JSONObject jSONObject) {
        String strJ = m1.j("Calling AFMA_updateActiveView(", jSONObject.toString(), ")");
        int i10 = l0.f13401b;
        k.b(strJ);
        zzcnsVar.zza.zzp("AFMA_updateActiveView", jSONObject);
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcns.zza(this.zza, jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e10) {
            l0.l("Failed to call video active view js", e10);
        }
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final void zzdr(zzaza zzazaVar) {
        boolean z2 = this.zzf ? false : zzazaVar.zzj;
        zzcnh zzcnhVar = this.zzg;
        zzcnhVar.zza = z2;
        ((ud.b) this.zzd).getClass();
        zzcnhVar.zzd = SystemClock.elapsedRealtime();
        zzcnhVar.zzf = zzazaVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z2) {
        this.zzf = z2;
    }

    public final void zzf(zzcfe zzcfeVar) {
        this.zza = zzcfeVar;
    }
}
