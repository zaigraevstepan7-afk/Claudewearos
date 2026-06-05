package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzuw;
import com.google.android.gms.internal.p002firebaseauthapi.zzvg;
import com.google.android.gms.internal.p002firebaseauthapi.zzvh;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzcs {
    private static final Charset zza = Charset.forName("UTF-8");

    public static zzvh zza(zzvg zzvgVar) {
        zzvh.zza zzaVarZza = zzvh.zza().zza(zzvgVar.zzb());
        for (zzvg.zza zzaVar : zzvgVar.zze()) {
            zzaVarZza.zza((zzvh.zzb) ((zzaje) zzvh.zzb.zzb().zza(zzaVar.zzb().zzf()).zza(zzaVar.zzc()).zza(zzaVar.zzf()).zza(zzaVar.zza()).zzf()));
        }
        return (zzvh) ((zzaje) zzaVarZza.zzf());
    }

    public static void zzb(zzvg zzvgVar) throws GeneralSecurityException {
        int iZzb = zzvgVar.zzb();
        int i10 = 0;
        boolean z2 = false;
        boolean z10 = true;
        for (zzvg.zza zzaVar : zzvgVar.zze()) {
            if (zzaVar.zzc() == zzva.ENABLED) {
                if (!zzaVar.zzg()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zzf() == zzvs.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zzc() == zzva.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzaVar.zza())));
                }
                if (zzaVar.zza() == iZzb) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                if (zzaVar.zzb().zzb() != zzuw.zzb.ASYMMETRIC_PUBLIC) {
                    z10 = false;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z10) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
