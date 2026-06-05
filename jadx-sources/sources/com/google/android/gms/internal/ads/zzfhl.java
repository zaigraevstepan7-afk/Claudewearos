package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfhl {
    public static void zza(mf.a aVar, zzfhm zzfhmVar, zzfhb zzfhbVar) {
        zzg(aVar, zzfhmVar, zzfhbVar, false);
    }

    public static void zzb(mf.a aVar, zzfhm zzfhmVar, zzfhb zzfhbVar) {
        zzg(aVar, zzfhmVar, zzfhbVar, true);
    }

    public static void zzc(mf.a aVar, zzfhm zzfhmVar, zzfhb zzfhbVar) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzgdb.zzr(zzgcs.zzw(aVar), new zzfhk(zzfhmVar, zzfhbVar), zzcad.zzg);
        }
    }

    public static void zzd(mf.a aVar, zzfhb zzfhbVar) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzgdb.zzr(zzgcs.zzw(aVar), new zzfhi(zzfhbVar), zzcad.zzg);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) t.f12227d.f12230c.zzb(zzbdc.zzja), str);
    }

    public static int zzf(zzfco zzfcoVar) {
        int iY = u3.c.y(zzfcoVar) - 1;
        return (iY == 0 || iY == 1) ? 7 : 23;
    }

    private static void zzg(mf.a aVar, zzfhm zzfhmVar, zzfhb zzfhbVar, boolean z2) {
        if (((Boolean) zzbev.zzc.zze()).booleanValue()) {
            zzgdb.zzr(zzgcs.zzw(aVar), new zzfhj(zzfhmVar, zzfhbVar, z2), zzcad.zzg);
        }
    }
}
