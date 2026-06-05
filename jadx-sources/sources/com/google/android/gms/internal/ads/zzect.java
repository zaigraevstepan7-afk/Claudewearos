package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.Objects;
import mc.n;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzect implements zzecu {
    public static /* synthetic */ zzecz zzc(String str, String str2, String str3, zzecv zzecvVar, String str4, WebView webView, String str5, String str6, zzecw zzecwVar) {
        zzflq zzflqVarZza = zzflq.zza("Google", str2);
        zzflp zzflpVarZzp = zzp("javascript");
        zzfli zzfliVarZzn = zzn(zzecvVar.toString());
        zzflp zzflpVar = zzflp.NONE;
        if (zzflpVarZzp == zzflpVar) {
            int i10 = l0.f13401b;
            k.g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfliVarZzn == null) {
            String strValueOf = String.valueOf(zzecvVar);
            int i11 = l0.f13401b;
            k.g("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzflp zzflpVarZzp2 = zzp(str4);
        if (zzfliVarZzn != zzfli.VIDEO || zzflpVarZzp2 != zzflpVar) {
            zzflf zzflfVarZzb = zzflf.zzb(zzflqVarZza, webView, str5, "");
            return new zzecz(zzfld.zza(zzfle.zza(zzfliVarZzn, zzo(zzecwVar.toString()), zzflpVarZzp, zzflpVarZzp2, true), zzflfVarZzb), zzflfVarZzb);
        }
        String strValueOf2 = String.valueOf(str4);
        int i12 = l0.f13401b;
        k.g("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    public static /* synthetic */ zzecz zzd(String str, String str2, String str3, String str4, zzecv zzecvVar, WebView webView, String str5, String str6, zzecw zzecwVar) {
        zzflq zzflqVarZza = zzflq.zza(str, str2);
        zzflp zzflpVarZzp = zzp("javascript");
        zzflp zzflpVarZzp2 = zzp(str4);
        zzfli zzfliVarZzn = zzn(zzecvVar.toString());
        zzflp zzflpVar = zzflp.NONE;
        if (zzflpVarZzp == zzflpVar) {
            int i10 = l0.f13401b;
            k.g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfliVarZzn == null) {
            String strValueOf = String.valueOf(zzecvVar);
            int i11 = l0.f13401b;
            k.g("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfliVarZzn != zzfli.VIDEO || zzflpVarZzp2 != zzflpVar) {
            zzflf zzflfVarZzc = zzflf.zzc(zzflqVarZza, webView, str5, "");
            return new zzecz(zzfld.zza(zzfle.zza(zzfliVarZzn, zzo(zzecwVar.toString()), zzflpVarZzp, zzflpVarZzp2, true), zzflfVarZzc), zzflfVarZzc);
        }
        String strValueOf2 = String.valueOf(str4);
        int i12 = l0.f13401b;
        k.g("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    private static zzfli zzn(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return zzfli.HTML_DISPLAY;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return zzfli.VIDEO;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return zzfli.NATIVE_DISPLAY;
        }
        return null;
    }

    private static zzfll zzo(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return zzfll.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return zzfll.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return zzfll.BEGIN_TO_RENDER;
        }
        return zzfll.UNSPECIFIED;
    }

    private static zzflp zzp(String str) {
        return "native".equals(str) ? zzflp.NATIVE : "javascript".equals(str) ? zzflp.JAVASCRIPT : zzflp.NONE;
    }

    private static final Object zzq(zzecs zzecsVar) {
        try {
            return zzecsVar.zza();
        } catch (RuntimeException e10) {
            n.D.f11582h.zzv(e10, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            n.D.f11582h.zzv(e10, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final zzecz zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzecw zzecwVar, final zzecv zzecvVar, final String str5) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfu)).booleanValue() || !zzflb.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzecz) zzq(new zzecs(str7, str, str6, zzecvVar, str4, webView, str5, str8, zzecwVar) { // from class: com.google.android.gms.internal.ads.zzeci
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzecv zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzecw zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzecvVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzecwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzecs
            public final Object zza() {
                return zzect.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final zzecz zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzecw zzecwVar, final zzecv zzecvVar, final String str6) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfu)).booleanValue() || !zzflb.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzecz) zzq(new zzecs(str5, str, str8, str4, zzecvVar, webView, str6, str7, zzecwVar) { // from class: com.google.android.gms.internal.ads.zzecl
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzecv zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzecw zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzecvVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzecwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzecs
            public final Object zza() {
                return zzect.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final zzflo zze(final rc.a aVar, final WebView webView, boolean z2) {
        final boolean z10 = true;
        return (zzflo) zzq(new zzecs(webView, z10) { // from class: com.google.android.gms.internal.ads.zzecq
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzecs
            public final Object zza() {
                rc.a aVar2 = this.zza;
                return zzflo.zzb(zzflq.zza("Google", aVar2.f14322b + "." + aVar2.f14323c), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final String zzf(Context context) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfu)).booleanValue()) {
            return (String) zzq(new zzecs() { // from class: com.google.android.gms.internal.ads.zzeco
                @Override // com.google.android.gms.internal.ads.zzecs
                public final Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzg(final zzfld zzfldVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfu)).booleanValue() && zzflb.zzb()) {
                    zzfldVar.zzb(view, zzflk.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzh(final zzflo zzfloVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // java.lang.Runnable
            public final void run() {
                zzfloVar.zzf(view, zzflk.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzi(final zzfld zzfldVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecr
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfu)).booleanValue() && zzflb.zzb()) {
                    zzfldVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzj(final zzfld zzfldVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfu)).booleanValue() && zzflb.zzb()) {
                    zzfldVar.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzk(final zzfld zzfldVar) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfu)).booleanValue() && zzflb.zzb()) {
            Objects.requireNonNull(zzfldVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeck
                @Override // java.lang.Runnable
                public final void run() {
                    zzfldVar.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final boolean zzl(final Context context) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfu)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzecs() { // from class: com.google.android.gms.internal.ads.zzecm
                @Override // com.google.android.gms.internal.ads.zzecs
                public final Object zza() {
                    if (zzflb.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzflb.zza(context);
                    return Boolean.valueOf(zzflb.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i10 = l0.f13401b;
        k.g("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzecu
    public final void zzm(final zzflo zzfloVar, final zzcfv zzcfvVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecp
            @Override // java.lang.Runnable
            public final void run() {
                zzfloVar.zzg(zzcfvVar);
            }
        });
    }
}
