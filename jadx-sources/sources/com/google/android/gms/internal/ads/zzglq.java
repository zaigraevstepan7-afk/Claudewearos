package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzglq implements zzgeh {
    private static final ThreadLocal zza = new zzglp();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzglo] */
    public static zzgeh zzb(zzghd zzghdVar) {
        return zzgkg.zzc(zzghdVar, new Object() { // from class: com.google.android.gms.internal.ads.zzglo
        });
    }

    public static /* synthetic */ Cipher zzc() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
