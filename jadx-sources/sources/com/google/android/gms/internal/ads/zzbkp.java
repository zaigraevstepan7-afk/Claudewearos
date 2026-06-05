package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import mc.n;
import nc.s;
import nc.t;
import qc.l0;
import rc.k;
import rc.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbkp implements zzbkd {
    private final mc.b zza;
    private final zzdsc zzb;
    private final zzbsm zzd;
    private final zzebs zze;
    private final zzcml zzf;
    private pc.a zzg = null;
    private final zzgdm zzh = zzcad.zzg;
    private final o zzc = new o(null);

    public zzbkp(mc.b bVar, zzbsm zzbsmVar, zzebs zzebsVar, zzdsc zzdscVar, zzcml zzcmlVar) {
        this.zza = bVar;
        this.zzd = zzbsmVar;
        this.zze = zzebsVar;
        this.zzb = zzdscVar;
        this.zzf = zzcmlVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri zzc(Context context, zzavs zzavsVar, Uri uri, View view, Activity activity, zzfcs zzfcsVar) {
        if (zzavsVar != null) {
            try {
                if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmk)).booleanValue() || zzfcsVar == null) {
                    if (zzavsVar.zze(uri)) {
                        return zzavsVar.zza(uri, context, view, activity);
                    }
                } else if (zzavsVar.zze(uri)) {
                    return zzfcsVar.zza(uri, context, view, activity);
                }
            } catch (zzavt unused) {
            } catch (Exception e10) {
                n.D.f11582h.zzw(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e10) {
            String strValueOf = String.valueOf(uri.toString());
            int i10 = l0.f13401b;
            k.e("Error adding click uptime parameter to url: ".concat(strValueOf), e10);
            return uri;
        }
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.String r26, nc.a r27, java.util.Map r28, java.lang.String r29) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkp.zzh(java.lang.String, nc.a, java.util.Map, java.lang.String):void");
    }

    private final void zzi(Context context, String str, String str2) {
        zzebs zzebsVar = this.zze;
        zzebsVar.zzc(str);
        zzdsc zzdscVar = this.zzb;
        if (zzdscVar != null) {
            zzecd.zzp(context, zzdscVar, zzebsVar, str, "dialog_not_shown", zzfyi.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzj(nc.a r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkp.zzj(nc.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzk(boolean z2) {
        zzbsm zzbsmVar = this.zzd;
        if (zzbsmVar != null) {
            zzbsmVar.zzb(z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (((java.lang.Boolean) nc.t.f12227d.f12230c.zzb(com.google.android.gms.internal.ads.zzbdc.zziM)).booleanValue() != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) nc.t.f12227d.f12230c.zzb(com.google.android.gms.internal.ads.zzbdc.zziH)).booleanValue() : ((java.lang.Boolean) nc.t.f12227d.f12230c.zzb(com.google.android.gms.internal.ads.zzbdc.zziG)).booleanValue()) != false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzl(nc.a r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException, pc.f {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkp.zzl(nc.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i10) {
        zzdsc zzdscVar;
        String str;
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzeN)).booleanValue() || (zzdscVar = this.zzb) == null) {
            return;
        }
        zzdsb zzdsbVarZza = zzdscVar.zza();
        zzdsbVarZza.zzb("action", "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdsbVarZza.zzb("cct_open_status", str);
        zzdsbVarZza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) {
        zzcml zzcmlVar;
        nc.a aVar = (nc.a) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzcfe zzcfeVar = (zzcfe) aVar;
        if (zzcfeVar.zzD() != null) {
            map2 = zzcfeVar.zzD().zzaw;
        }
        String strZzc = zzbyo.zzc(str, zzcfeVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i10 = l0.f13401b;
            k.g("Action missing from an open GMSG.");
            return;
        }
        mc.b bVar = this.zza;
        if (bVar == null || bVar.b()) {
            zzgdb.zzr((((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkn)).booleanValue() && (zzcmlVar = this.zzf) != null && zzcml.zzj(strZzc)) ? zzcmlVar.zze(strZzc, s.f12202f.f12207e) : zzgdb.zzh(strZzc), new zzbkl(this, map, aVar, str2), this.zzh);
        } else {
            bVar.a(strZzc);
        }
    }
}
