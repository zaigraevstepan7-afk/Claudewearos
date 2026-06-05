package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzlv implements zzlh {
    private final zzlb zza;

    public zzlv(zzlb zzlbVar) {
        this.zza = zzlbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zza(byte[] bArr, zzlk zzlkVar) throws GeneralSecurityException {
        byte[] bArrZza = zzxt.zza(zzlkVar.zza().zzb(), bArr);
        byte[] bArrZza2 = zzwh.zza(bArr, zzlkVar.zzb().zzb());
        byte[] bArrZza3 = zzln.zza(zzln.zzb);
        zzlb zzlbVar = this.zza;
        return zzlbVar.zza(null, bArrZza, "eae_prk", bArrZza2, "shared_secret", bArrZza3, zzlbVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzb(), zzln.zzf)) {
            return zzln.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
