package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import mc.n;
import nc.t;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdnr {
    private final mc.a zzb;
    private final Context zzc;
    private final zzdsc zzd;
    private final Executor zze;
    private final zzavs zzf;
    private final rc.a zzg;
    private final zzebs zzi;
    private final zzfjq zzj;
    private final zzecd zzk;
    private final zzfcs zzl;
    private mf.a zzm;
    private final zzdne zza = new zzdne();
    private final zzbkt zzh = new zzbkt();

    public zzdnr(zzdno zzdnoVar) {
        this.zzc = zzdnoVar.zzb;
        this.zze = zzdnoVar.zze;
        this.zzf = zzdnoVar.zzf;
        this.zzg = zzdnoVar.zzg;
        this.zzb = zzdnoVar.zza;
        this.zzi = zzdnoVar.zzd;
        this.zzj = zzdnoVar.zzh;
        this.zzd = zzdnoVar.zzc;
        this.zzk = zzdnoVar.zzi;
        this.zzl = zzdnoVar.zzj;
    }

    public static /* synthetic */ zzcfe zza(zzdnr zzdnrVar, zzcfe zzcfeVar) {
        zzcfeVar.zzag("/result", zzdnrVar.zzh);
        zzcgw zzcgwVarZzN = zzcfeVar.zzN();
        mc.b bVar = new mc.b(zzdnrVar.zzc, null);
        zzebs zzebsVar = zzdnrVar.zzi;
        zzfjq zzfjqVar = zzdnrVar.zzj;
        zzdsc zzdscVar = zzdnrVar.zzd;
        zzdne zzdneVar = zzdnrVar.zza;
        zzcgwVarZzN.zzX(null, zzdneVar, zzdneVar, zzdneVar, zzdneVar, false, null, bVar, null, null, zzebsVar, zzfjqVar, zzdscVar, null, null, null, null, null, null);
        return zzcfeVar;
    }

    public final synchronized mf.a zzg(final String str, final JSONObject jSONObject) {
        mf.a aVar = this.zzm;
        if (aVar == null) {
            return zzgdb.zzh(null);
        }
        return zzgdb.zzn(aVar, new zzgci() { // from class: com.google.android.gms.internal.ads.zzdnf
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return this.zza.zzh.zzb((zzcfe) obj, str, jSONObject);
            }
        }, this.zze);
    }

    public final synchronized void zzh(zzfbt zzfbtVar, zzfbw zzfbwVar, zzcml zzcmlVar) {
        mf.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgdb.zzr(aVar, new zzdnl(this, zzfbtVar, zzfbwVar, zzcmlVar), this.zze);
    }

    public final synchronized void zzi() {
        mf.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgdb.zzr(aVar, new zzdnh(this), this.zze);
        this.zzm = null;
    }

    public final synchronized void zzj(String str, Map map) {
        mf.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgdb.zzr(aVar, new zzdnk(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzk() {
        final String str = (String) t.f12227d.f12230c.zzb(zzbdc.zzdY);
        final Context context = this.zzc;
        final zzavs zzavsVar = this.zzf;
        final rc.a aVar = this.zzg;
        final mc.a aVar2 = this.zzb;
        final zzecd zzecdVar = this.zzk;
        final zzfcs zzfcsVar = this.zzl;
        final zzdsc zzdscVar = this.zzd;
        mf.a aVarZzm = zzgdb.zzm(zzgdb.zzk(new zzgch() { // from class: com.google.android.gms.internal.ads.zzcfn
            @Override // com.google.android.gms.internal.ads.zzgch
            public final mf.a zza() throws zzcfq {
                zzcfr zzcfrVar = n.D.f11578d;
                Context context2 = context;
                zzecd zzecdVar2 = zzecdVar;
                zzcgy zzcgyVarZza = zzcgy.zza();
                zzavs zzavsVar2 = zzavsVar;
                zzfcs zzfcsVar2 = zzfcsVar;
                mc.a aVar3 = aVar2;
                zzcfe zzcfeVarZza = zzcfr.zza(context2, zzcgyVarZza, "", false, false, zzavsVar2, null, aVar, null, null, aVar3, zzbca.zza(), null, null, zzecdVar2, zzfcsVar2, zzdscVar);
                final zzcah zzcahVarZza = zzcah.zza((Object) zzcfeVarZza);
                zzcfeVarZza.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzcfo
                    @Override // com.google.android.gms.internal.ads.zzcgu
                    public final void zza(boolean z2, int i10, String str2, String str3) {
                        zzcahVarZza.zzb();
                    }
                });
                zzcfeVarZza.loadUrl(str);
                return zzcahVarZza;
            }
        }, zzcad.zzf), new zzfut() { // from class: com.google.android.gms.internal.ads.zzdng
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                zzcfe zzcfeVar = (zzcfe) obj;
                zzdnr.zza(this.zza, zzcfeVar);
                return zzcfeVar;
            }
        }, this.zze);
        this.zzm = aVarZzm;
        zzcag.zza(aVarZzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbkd zzbkdVar) {
        mf.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgdb.zzr(aVar, new zzdni(this, str, zzbkdVar), this.zze);
    }

    public final void zzm(WeakReference weakReference, String str, zzbkd zzbkdVar) {
        zzl(str, new zzdnp(this, weakReference, str, zzbkdVar, null));
    }

    public final synchronized void zzn(String str, zzbkd zzbkdVar) {
        mf.a aVar = this.zzm;
        if (aVar == null) {
            return;
        }
        zzgdb.zzr(aVar, new zzdnj(this, str, zzbkdVar), this.zze);
    }
}
