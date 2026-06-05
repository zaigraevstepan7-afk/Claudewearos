package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzkm implements zzbp {
    private final zzoo<zzbp> zza;
    private final zzro zzb;

    public zzkm(zzoo<zzbp> zzooVar) {
        this.zza = zzooVar;
        if (zzooVar.zzf()) {
            this.zzb = zznl.zza().zzb().zza(zzne.zza(zzooVar), "hybrid_decrypt", "decrypt");
        } else {
            this.zzb = zzne.zza;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzop<zzbp> zzopVar : this.zza.zza(Arrays.copyOfRange(bArr, 0, 5))) {
                try {
                    byte[] bArrZza = zzopVar.zzd().zza(bArr, bArr2);
                    this.zzb.zza(zzopVar.zza(), bArr.length);
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzop<zzbp> zzopVar2 : this.zza.zza(zzbo.zza)) {
            try {
                byte[] bArrZza2 = zzopVar2.zzd().zza(bArr, bArr2);
                this.zzb.zza(zzopVar2.zza(), bArr.length);
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
