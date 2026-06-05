package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzauq {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static zzaue zza(byte[] bArr, String str) {
        Vector vectorZzc = zzc(bArr, 255);
        if (vectorZzc == null || vectorZzc.isEmpty()) {
            return null;
        }
        zzaue zzaueVarZza = zzauf.zza();
        int size = vectorZzc.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzaueVarZza.zza(zzgxn.zzv(zzh((byte[]) vectorZzc.get(i10), str, false), 0, 256));
        }
        byte[] bArrZzf = zzf(bArr);
        zzgxn zzgxnVar = zzgxn.zzb;
        zzaueVarZza.zzb(zzgxn.zzv(bArrZzf, 0, bArrZzf.length));
        return zzaueVarZza;
    }

    public static String zzb(byte[] bArr, String str) {
        zzaue zzaueVarZza = zza(bArr, str);
        return zzauj.zza(zzaueVarZza == null ? zzh(zzg(4096).zzaV(), str, true) : ((zzauf) zzaueVarZza.zzbr()).zzaV(), true);
    }

    public static Vector zzc(byte[] bArr, int i10) {
        int length = bArr.length;
        if (length <= 0) {
            return null;
        }
        int i11 = length + 254;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11 / 255; i12++) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zze() {
        synchronized (zzf) {
            try {
                if (!zza) {
                    zza = true;
                    new Thread(new zzauo(null)).start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static byte[] zzf(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (zze) {
            try {
                zze();
                MessageDigest messageDigest2 = null;
                try {
                    if (zzb.await(2L, TimeUnit.SECONDS) && (messageDigest = zzd) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = zzd.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static zzato zzg(int i10) {
        zzasr zzasrVarZza = zzato.zza();
        zzasrVarZza.zzB(4096L);
        return (zzato) zzasrVarZza.zzbr();
    }

    private static byte[] zzh(byte[] bArr, String str, boolean z2) {
        byte[] bArrArray;
        int length = bArr.length;
        int i10 = true != z2 ? 255 : 239;
        if (length > i10) {
            bArr = zzg(4096).zzaV();
        }
        int i11 = i10 + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).array();
        }
        if (z2) {
            bArrArray = ByteBuffer.allocate(256).put(zzf(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        zzaur[] zzaurVarArr = new zzavf().zzcG;
        int length3 = zzaurVarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            zzaurVarArr[i12].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzauh(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
