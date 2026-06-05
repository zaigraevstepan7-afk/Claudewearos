package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgka {
    private static final ThreadLocal zza = new zzgjz();

    public static AlgorithmParameterSpec zza(byte[] bArr, int i10, int i11) {
        int i12 = zzgox.zza;
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        return new GCMParameterSpec(128, bArr, i10, 12);
    }

    public static Cipher zzb() {
        return (Cipher) zza.get();
    }

    public static SecretKey zzc(byte[] bArr) throws InvalidAlgorithmParameterException {
        zzgwq.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
