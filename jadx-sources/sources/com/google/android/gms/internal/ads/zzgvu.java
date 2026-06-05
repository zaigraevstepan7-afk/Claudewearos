package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgvu implements zzgeh {
    private final zzgwk zza;
    private final zzgez zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgvu(zzgwk zzgwkVar, zzgez zzgezVar, int i10, byte[] bArr) {
        this.zza = zzgwkVar;
        this.zzb = zzgezVar;
        this.zzc = i10;
        this.zzd = bArr;
    }

    public static zzgeh zzb(zzgfw zzgfwVar) {
        zzgvn zzgvnVar = new zzgvn(zzgfwVar.zze().zzd(zzgem.zza()), zzgfwVar.zzd().zzd());
        String strValueOf = String.valueOf(zzgfwVar.zzd().zzg());
        return new zzgvu(zzgvnVar, new zzgwp(new zzgwo("HMAC".concat(strValueOf), new SecretKeySpec(zzgfwVar.zzf().zzd(zzgem.zza()), "HMAC")), zzgfwVar.zzd().zze()), zzgfwVar.zzd().zze(), zzgfwVar.zzb().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i10 = this.zzc;
        int length2 = bArr3.length;
        if (length < i10 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzgox.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i11 = length - i10;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        if (MessageDigest.isEqual(((zzgwp) this.zzb).zzc(zzgvs.zzb(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
