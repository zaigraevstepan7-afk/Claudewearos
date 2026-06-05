package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import mc.k;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcfr {
    public static final zzcfe zza(final Context context, final zzcgy zzcgyVar, final String str, final boolean z2, final boolean z10, final zzavs zzavsVar, final zzbej zzbejVar, final rc.a aVar, zzbdr zzbdrVar, final k kVar, final mc.a aVar2, final zzbca zzbcaVar, final zzfbt zzfbtVar, final zzfbw zzfbwVar, final zzecd zzecdVar, final zzfcs zzfcsVar, final zzdsc zzdscVar) throws zzcfq {
        zzbdc.zza(context);
        try {
            final zzbdr zzbdrVar2 = null;
            zzfvw zzfvwVar = new zzfvw(context, zzcgyVar, str, z2, z10, zzavsVar, zzbejVar, aVar, zzbdrVar2, kVar, aVar2, zzbcaVar, zzfbtVar, zzfbwVar, zzfcsVar, zzdscVar, zzecdVar) { // from class: com.google.android.gms.internal.ads.zzcfp
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcgy zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzavs zzf;
                public final /* synthetic */ zzbej zzg;
                public final /* synthetic */ rc.a zzh;
                public final /* synthetic */ k zzi;
                public final /* synthetic */ mc.a zzj;
                public final /* synthetic */ zzbca zzk;
                public final /* synthetic */ zzfbt zzl;
                public final /* synthetic */ zzfbw zzm;
                public final /* synthetic */ zzfcs zzn;
                public final /* synthetic */ zzdsc zzo;
                public final /* synthetic */ zzecd zzp;

                {
                    this.zzi = kVar;
                    this.zzj = aVar2;
                    this.zzk = zzbcaVar;
                    this.zzl = zzfbtVar;
                    this.zzm = zzfbwVar;
                    this.zzn = zzfcsVar;
                    this.zzo = zzdscVar;
                    this.zzp = zzecdVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfvw
                public final Object zza() {
                    zzcgy zzcgyVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z11 = this.zzd;
                    zzbca zzbcaVar2 = this.zzk;
                    boolean z12 = this.zze;
                    zzavs zzavsVar2 = this.zzf;
                    zzfbt zzfbtVar2 = this.zzl;
                    zzbej zzbejVar2 = this.zzg;
                    k kVar2 = this.zzi;
                    zzfbw zzfbwVar2 = this.zzm;
                    Context context2 = this.zza;
                    rc.a aVar3 = this.zzh;
                    mc.a aVar4 = this.zzj;
                    zzfcs zzfcsVar2 = this.zzn;
                    zzdsc zzdscVar2 = this.zzo;
                    zzecd zzecdVar2 = this.zzp;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i10 = zzcgd.zza;
                        zzcfw zzcfwVar = new zzcfw(new zzcgd(new zzcgx(context2), zzcgyVar2, str2, z11, z12, zzavsVar2, zzbejVar2, aVar3, null, kVar2, aVar4, zzbcaVar2, zzfbtVar2, zzfbwVar2, zzfcsVar2), zzdscVar2);
                        n.D.f11580f.getClass();
                        zzcfwVar.setWebViewClient(new zzcgn(zzcfwVar, zzbcaVar2, z12, zzecdVar2));
                        zzcfwVar.setWebChromeClient(new zzcfd(zzcfwVar));
                        return zzcfwVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objZza = zzfvwVar.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (zzcfe) objZza;
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (Throwable th3) {
            throw new zzcfq("Webview initialization failed.", th3);
        }
    }
}
