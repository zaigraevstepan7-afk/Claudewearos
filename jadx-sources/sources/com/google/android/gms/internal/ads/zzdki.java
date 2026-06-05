package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import nc.s;
import nc.s3;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdki {
    private final zzdpc zza;
    private final zzdnr zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdki(zzdpc zzdpcVar, zzdnr zzdnrVar) {
        this.zza = zzdpcVar;
        this.zzb = zzdnrVar;
    }

    public static /* synthetic */ void zzb(zzdki zzdkiVar, WindowManager windowManager, View view, zzcfe zzcfeVar, Map map) {
        int i10 = l0.f13401b;
        k.b("Hide native ad policy validator overlay.");
        zzcfeVar.zzF().setVisibility(8);
        if (zzcfeVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcfeVar.zzF());
        }
        zzcfeVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (zzdkiVar.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(zzdkiVar.zzc);
    }

    public static void zzc(final zzdki zzdkiVar, final View view, final WindowManager windowManager, final zzcfe zzcfeVar, final Map map) throws NumberFormatException {
        zzcfeVar.zzN().zzC(new zzcgu() { // from class: com.google.android.gms.internal.ads.zzdkg
            @Override // com.google.android.gms.internal.ads.zzcgu
            public final void zza(boolean z2, int i10, String str, String str2) {
                zzdki.zzd(this.zza, map, z2, i10, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        String str = (String) map.get("validator_width");
        zzbct zzbctVar = zzbdc.zzio;
        t tVar = t.f12227d;
        int iZzf = zzf(context, str, ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) tVar.f12230c.zzb(zzbdc.zzip)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcfeVar.zzaj(zzcgy.zzb(iZzf, iZzf2));
        try {
            zzcfeVar.zzG().getSettings().setUseWideViewPort(((Boolean) tVar.f12230c.zzb(zzbdc.zziq)).booleanValue());
            zzcfeVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) tVar.f12230c.zzb(zzbdc.zzir)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsJ = mk.b.J();
        layoutParamsJ.x = iZzf3;
        layoutParamsJ.y = iZzf4;
        windowManager.updateViewLayout(zzcfeVar.zzF(), layoutParamsJ);
        final String str2 = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i10 = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - iZzf4;
            zzdkiVar.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdkh
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcfe zzcfeVar2 = zzcfeVar;
                        if (zzcfeVar2.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i11 = i10;
                        WindowManager.LayoutParams layoutParams = layoutParamsJ;
                        String str3 = str2;
                        if ("1".equals(str3) || "2".equals(str3)) {
                            layoutParams.y = rect2.bottom - i11;
                        } else {
                            layoutParams.y = rect2.top - i11;
                        }
                        windowManager.updateViewLayout(zzcfeVar2.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(zzdkiVar.zzc);
            }
        }
        String str3 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        zzcfeVar.loadUrl(str3);
    }

    public static /* synthetic */ void zzd(zzdki zzdkiVar, Map map, boolean z2, int i10, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        zzdkiVar.zzb.zzj("sendMessageToNativeJs", map2);
    }

    private static final int zzf(Context context, String str, int i10) throws NumberFormatException {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        rc.e eVar = s.f12202f.f12203a;
        return rc.e.b(context, i10);
    }

    public final View zza(final View view, final WindowManager windowManager) {
        zzcfe zzcfeVarZza = this.zza.zza(s3.c(), null, null);
        zzcfeVarZza.zzF().setVisibility(4);
        zzcfeVarZza.zzF().setContentDescription("policy_validator");
        zzcfeVarZza.zzag("/sendMessageToSdk", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdkc
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                this.zza.zzb.zzj("sendMessageToNativeJs", map);
            }
        });
        zzcfeVarZza.zzag("/hideValidatorOverlay", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdkd
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                zzdki.zzb(this.zza, windowManager, view, (zzcfe) obj, map);
            }
        });
        zzcfeVarZza.zzag("/open", new zzbkp(null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzcfeVarZza);
        zzbkd zzbkdVar = new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) throws NumberFormatException {
                zzdki.zzc(this.zza, view, windowManager, (zzcfe) obj, map);
            }
        };
        zzdnr zzdnrVar = this.zzb;
        zzdnrVar.zzm(weakReference, "/loadNativeAdPolicyViolations", zzbkdVar);
        zzdnrVar.zzm(new WeakReference(zzcfeVarZza), "/showValidatorOverlay", new zzbkd() { // from class: com.google.android.gms.internal.ads.zzdkf
            @Override // com.google.android.gms.internal.ads.zzbkd
            public final void zza(Object obj, Map map) {
                int i10 = l0.f13401b;
                k.b("Show native ad policy validator overlay.");
                ((zzcfe) obj).zzF().setVisibility(0);
            }
        });
        return zzcfeVarZza.zzF();
    }
}
