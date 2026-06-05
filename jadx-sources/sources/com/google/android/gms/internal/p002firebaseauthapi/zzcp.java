package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzcp {
    public static zzci zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzvc zzvcVarZza = zzvc.zza(bArr, zzaiq.zza());
            zzns zznsVarZza = zzns.zza();
            zzot zzotVarZza = zzot.zza(zzvcVarZza);
            return !zznsVarZza.zzc(zzotVarZza) ? new zznc(zzotVarZza) : zznsVarZza.zza((zzns) zzotVarZza);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] zza(zzci zzciVar) {
        if (zzciVar instanceof zznc) {
            return ((zznc) zzciVar).zzb().zza().a_();
        }
        return ((zzot) zzns.zza().zza((zzns) zzciVar, zzot.class)).zza().a_();
    }
}
