package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import nc.s3;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdka {
    private final zzdpc zza;
    private final zzdnr zzb;
    private final zzcns zzc;
    private final zzdiu zzd;

    public zzdka(zzdpc zzdpcVar, zzdnr zzdnrVar, zzcns zzcnsVar, zzdiu zzdiuVar) {
        this.zza = zzdpcVar;
        this.zzb = zzdnrVar;
        this.zzc = zzcnsVar;
        this.zzd = zzdiuVar;
    }

    public static /* synthetic */ void zzb(zzdka zzdkaVar, zzcfe zzcfeVar, Map map) {
        int i10 = l0.f13401b;
        k.f("Hiding native ads overlay.");
        zzcfeVar.zzF().setVisibility(8);
        zzdkaVar.zzc.zze(false);
    }

    public static /* synthetic */ void zzd(zzdka zzdkaVar, zzcfe zzcfeVar, Map map) {
        int i10 = l0.f13401b;
        k.f("Showing native ads overlay.");
        zzcfeVar.zzF().setVisibility(0);
        zzdkaVar.zzc.zze(true);
    }

    public static /* synthetic */ void zze(zzdka zzdkaVar, Map map, boolean z2, int i10, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        zzdkaVar.zzb.zzj("sendMessageToNativeJs", map2);
    }

    public final View zza() {
        zzcfe zzcfeVarZza = this.zza.zza(s3.c(), null, null);
        zzcfeVarZza.zzF().setVisibility(8);
        zzcfeVarZza.zzag("/sendMessageToSdk", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdju
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                this.zza.zzb.zzj("sendMessageToNativeJs", map);
            }
        });
        zzcfeVarZza.zzag("/adMuted", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                this.zza.zzd.zzi();
            }
        });
        WeakReference weakReference = new WeakReference(zzcfeVarZza);
        zzbkd zzbkdVar = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, final Map map) {
                zzcfe zzcfeVar = (zzcfe) obj;
                zzcgw zzcgwVarZzN = zzcfeVar.zzN();
                final zzdka zzdkaVar = this.zza;
                zzcgwVarZzN.zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdjz
                    @Override // com.google.android.gms.internal.ads.zzcgu
                    public final void zza(boolean z2, int i10, String str, String str2) {
                        zzdka.zze(zzdkaVar, map, z2, i10, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcfeVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcfeVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        };
        zzdnr zzdnrVar = this.zzb;
        zzdnrVar.zzm(weakReference, "/loadHtml", zzbkdVar);
        zzdnrVar.zzm(new WeakReference(zzcfeVarZza), "/showOverlay", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdka.zzd(this.zza, (zzcfe) obj, map);
            }
        });
        zzdnrVar.zzm(new WeakReference(zzcfeVarZza), "/hideOverlay", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdka.zzb(this.zza, (zzcfe) obj, map);
            }
        });
        return zzcfeVarZza.zzF();
    }
}
