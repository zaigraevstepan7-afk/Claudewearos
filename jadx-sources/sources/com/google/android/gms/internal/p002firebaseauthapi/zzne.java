package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzne {
    public static final zzro zza = new zzng();

    public static <P> zzrr zza(zzoo<P> zzooVar) {
        zzbw zzbwVar;
        zzrq zzrqVar = new zzrq();
        zzrqVar.zza(zzooVar.zzb());
        Iterator<List<zzop<P>>> it = zzooVar.zzd().iterator();
        while (it.hasNext()) {
            for (zzop<P> zzopVar : it.next()) {
                int i10 = zznd.zza[zzopVar.zzb().ordinal()];
                if (i10 == 1) {
                    zzbwVar = zzbw.zza;
                } else if (i10 == 2) {
                    zzbwVar = zzbw.zzb;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzbwVar = zzbw.zzc;
                }
                int iZza = zzopVar.zza();
                String strZze = zzopVar.zze();
                if (strZze.startsWith("type.googleapis.com/google.crypto.")) {
                    strZze = strZze.substring(34);
                }
                zzrqVar.zza(zzbwVar, iZza, strZze, zzopVar.zzc().name());
            }
        }
        if (zzooVar.zza() != null) {
            zzrqVar.zza(zzooVar.zza().zza());
        }
        try {
            return zzrqVar.zza();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
