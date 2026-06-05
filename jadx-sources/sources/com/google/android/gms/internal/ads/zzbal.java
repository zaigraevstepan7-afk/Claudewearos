package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbal extends zzbac {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbal(int i10) {
        int i11 = i10 >> 3;
        this.zzc = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbac
    public final byte[] zzb(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest messageDigestZza = zza();
                this.zzb = messageDigestZza;
                if (messageDigestZza == null) {
                    return new byte[0];
                }
                messageDigestZza.reset();
                this.zzb.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] bArrDigest = this.zzb.digest();
                int length = bArrDigest.length;
                int i10 = this.zzc;
                if (length > i10) {
                    length = i10;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i11 = this.zzd & 7;
                if (i11 > 0) {
                    long j = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (i12 > 0) {
                            j <<= 8;
                        }
                        j += bArr[i12] & 255;
                    }
                    long j4 = j >>> (8 - i11);
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        bArr[i10] = (byte) (255 & j4);
                        j4 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
