package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgfc {
    public static zzgfa zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgtt zzgttVarZzf = zzgtt.zzf(bArr, zzgyf.zza());
            zzgnm zzgnmVarZzc = zzgnm.zzc();
            zzgom zzgomVarZza = zzgom.zza(zzgttVarZzf);
            return !zzgnmVarZzc.zzk(zzgomVarZza) ? new zzgms(zzgomVarZza) : zzgnmVarZzc.zzb(zzgomVarZza);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] zzb(zzgfa zzgfaVar) {
        return ((zzgom) zzgnm.zzc().zze(zzgfaVar, zzgom.class)).zzc().zzaV();
    }
}
