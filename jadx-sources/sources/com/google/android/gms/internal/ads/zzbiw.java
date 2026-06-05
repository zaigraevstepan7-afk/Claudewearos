package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;
import mc.n;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbiw implements zzbkd {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    private static final Pattern zzb = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final void zza(Object obj, Map map) throws NumberFormatException {
        zzcfe zzcfeVar = (zzcfe) obj;
        String str = (String) map.get("action");
        if (!"tick".equals(str)) {
            if ("experiment".equals(str)) {
                String str2 = (String) map.get("value");
                if (TextUtils.isEmpty(str2)) {
                    int i10 = l0.f13401b;
                    k.g("No value given for CSI experiment.");
                    return;
                }
                if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzck)).booleanValue() || zzb.matcher(str2).matches()) {
                    zzcfeVar.zzl().zza().zzd("e", str2);
                    return;
                } else {
                    int i11 = l0.f13401b;
                    k.b("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                    return;
                }
            }
            if ("extra".equals(str)) {
                String str3 = (String) map.get("name");
                String str4 = (String) map.get("value");
                if (TextUtils.isEmpty(str4)) {
                    int i12 = l0.f13401b;
                    k.g("No value given for CSI extra.");
                    return;
                }
                if (TextUtils.isEmpty(str3)) {
                    int i13 = l0.f13401b;
                    k.g("No name given for CSI extra.");
                    return;
                }
                if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzck)).booleanValue() || zza.matcher(str3).matches()) {
                    zzcfeVar.zzl().zza().zzd(str3, str4);
                    return;
                } else {
                    int i14 = l0.f13401b;
                    k.b("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            }
            return;
        }
        String str5 = (String) map.get("label");
        String str6 = (String) map.get("start_label");
        String str7 = (String) map.get("timestamp");
        if (TextUtils.isEmpty(str5)) {
            int i15 = l0.f13401b;
            k.g("No label given for CSI tick.");
            return;
        }
        zzbct zzbctVar = zzbdc.zzck;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && !zza.matcher(str5).matches()) {
            int i16 = l0.f13401b;
            k.b("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            return;
        }
        if (TextUtils.isEmpty(str7)) {
            int i17 = l0.f13401b;
            k.g("No timestamp given for CSI tick.");
            return;
        }
        try {
            long j = Long.parseLong(str7);
            n nVar = n.D;
            nVar.f11584k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            nVar.f11584k.getClass();
            long jElapsedRealtime = (j - jCurrentTimeMillis) + SystemClock.elapsedRealtime();
            if (true == TextUtils.isEmpty(str6)) {
                str6 = "native:view_load";
            }
            if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() || zza.matcher(str6).matches()) {
                zzcfeVar.zzl().zzc(str5, str6, jElapsedRealtime);
            } else {
                int i18 = l0.f13401b;
                k.b("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            }
        } catch (NumberFormatException e10) {
            int i19 = l0.f13401b;
            k.h("Malformed timestamp for CSI tick.", e10);
        }
    }
}
