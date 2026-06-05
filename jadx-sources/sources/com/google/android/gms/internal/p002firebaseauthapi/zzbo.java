package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvg;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzbo {
    public static final byte[] zza = new byte[0];

    public static byte[] zza(zzvg.zza zzaVar) throws GeneralSecurityException {
        int i10 = zzbn.zza[zzaVar.zzf().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return zznt.zza(zzaVar.zza()).zzb();
        }
        if (i10 == 3) {
            return zznt.zzb(zzaVar.zza()).zzb();
        }
        if (i10 == 4) {
            return zza;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
