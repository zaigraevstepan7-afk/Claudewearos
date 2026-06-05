package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaph {
    public static X509Certificate[][] zza(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        Pair pairZzc;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            pairZzc = zzapi.zzc(randomAccessFile2);
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = randomAccessFile2;
        }
        try {
            if (pairZzc == null) {
                throw new zzapd("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile2.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairZzc.first;
            long jLongValue = ((Long) pairZzc.second).longValue();
            long j = jLongValue - 20;
            if (j >= 0) {
                randomAccessFile2.seek(j);
                if (randomAccessFile2.readInt() == 1347094023) {
                    throw new zzapd("ZIP64 APK not supported");
                }
            }
            long jZza = zzapi.zza(byteBuffer);
            if (jZza >= jLongValue) {
                throw new zzapd("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (zzapi.zzb(byteBuffer) + jZza != jLongValue) {
                throw new zzapd("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jZza < 32) {
                throw new zzapd("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile2.seek(jZza - byteBufferAllocate.capacity());
            randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzapd("No APK Signing Block before ZIP Central Directory");
            }
            long j4 = byteBufferAllocate.getLong(0);
            if (j4 < byteBufferAllocate.capacity() || j4 > 2147483639) {
                throw new zzapd("APK Signing Block size out of range: " + j4);
            }
            int i10 = (int) (8 + j4);
            long j10 = jZza - i10;
            if (j10 < 0) {
                throw new zzapd("APK Signing Block offset out of range: " + j10);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile2.seek(j10);
            randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            randomAccessFile = randomAccessFile2;
            long j11 = byteBufferAllocate2.getLong(0);
            if (j11 != j4) {
                throw new zzapd("APK Signing Block sizes in header and footer do not match: " + j11 + " vs " + j4);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j10));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i11 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i11++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new zzapd("Insufficient data to read size of APK Signing Block entry #" + i11);
                    }
                    long j12 = byteBufferSlice.getLong();
                    if (j12 < 4 || j12 > 2147483647L) {
                        throw new zzapd("APK Signing Block entry #" + i11 + " size out of range: " + j12);
                    }
                    int i12 = (int) j12;
                    int iPosition2 = byteBufferSlice.position() + i12;
                    if (i12 > byteBufferSlice.remaining()) {
                        throw new zzapd("APK Signing Block entry #" + i11 + " size out of range: " + i12 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrZzl = zzl(randomAccessFile.getChannel(), new zzapc(zze(byteBufferSlice, i12 - 4), jLongValue2, jZza, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return x509CertificateArrZzl;
                    }
                    long j13 = jLongValue2;
                    long j14 = jZza;
                    long j15 = jLongValue;
                    byteBufferSlice.position(iPosition2);
                    jLongValue = j15;
                    jZza = j14;
                    jLongValue2 = j13;
                }
                throw new zzapd("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th3) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static int zzb(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException(m6.a.d(i10, "Unknown content digest algorthm: "));
    }

    private static int zzc(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    private static String zzd(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(m6.a.d(i10, "Unknown content digest algorthm: "));
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i10) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(m6.a.d(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return zze(byteBuffer, i10);
        }
        throw new IOException(gk.b.l(i10, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
    }

    private static void zzg(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j4, long j10, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzapb zzapbVar = new zzapb(fileChannel, 0L, j);
        zzapb zzapbVar2 = new zzapb(fileChannel, j4, j10 - j4);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzapi.zzd(byteBufferDuplicate, j);
        zzaoz zzaozVar = new zzaoz(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        try {
            byte[][] bArrZzk = zzk(iArr, new zzapa[]{zzapbVar, zzapbVar2, zzaozVar});
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), bArrZzk[i11])) {
                    throw new SecurityException(zzd(i12).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e10) {
            throw new SecurityException("Failed to compute digest(s) of contents", e10);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 > byteBuffer.remaining()) {
            throw new IOException(gk.b.l(i10, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
        }
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzf = zzf(byteBuffer);
        ByteBuffer byteBufferZzf2 = zzf(byteBuffer);
        byte[] bArrZzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        int i10 = -1;
        int i11 = 0;
        while (byteBufferZzf2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferZzf3 = zzf(byteBufferZzf2);
                if (byteBufferZzf3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferZzf3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (i12 != 513 && i12 != 514 && i12 != 769) {
                    switch (i12) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i10 != -1) {
                    int iZzc = zzc(i12);
                    int iZzc2 = zzc(i10);
                    if (iZzc != 1 && iZzc2 == 1) {
                    }
                }
                bArrZzi3 = zzi(byteBufferZzf3);
                i10 = i12;
            } catch (IOException e10) {
                e = e10;
                throw new SecurityException(m6.a.d(i11, "Failed to parse signature record #"), e);
            } catch (BufferUnderflowException e11) {
                e = e11;
                throw new SecurityException(m6.a.d(i11, "Failed to parse signature record #"), e);
            }
        }
        if (i10 == -1) {
            if (i11 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i10 == 513 || i10 == 514) {
            str = "EC";
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            str = "DSA";
        }
        if (i10 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i10 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i10 != 769) {
            switch (i10) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzi));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzf);
            if (!signature.verify(bArrZzi3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferZzf.clear();
            ByteBuffer byteBufferZzf4 = zzf(byteBufferZzf);
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (byteBufferZzf4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferZzf5 = zzf(byteBufferZzf4);
                    if (byteBufferZzf5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i14 = byteBufferZzf5.getInt();
                    arrayList2.add(Integer.valueOf(i14));
                    if (i14 == i10) {
                        bArrZzi2 = zzi(byteBufferZzf5);
                    }
                } catch (IOException e12) {
                    e = e12;
                    throw new IOException(m6.a.d(i13, "Failed to parse digest record #"), e);
                } catch (BufferUnderflowException e13) {
                    e = e13;
                    throw new IOException(m6.a.d(i13, "Failed to parse digest record #"), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZzc3 = zzc(i10);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzc3), bArrZzi2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzi2)) {
                throw new SecurityException(zzd(iZzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferZzf6 = zzf(byteBufferZzf);
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            while (byteBufferZzf6.hasRemaining()) {
                i15++;
                byte[] bArrZzi4 = zzi(byteBufferZzf6);
                try {
                    arrayList3.add(new zzape((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi4)), bArrZzi4));
                } catch (CertificateException e14) {
                    throw new SecurityException(m6.a.d(i15, "Failed to decode certificate #"), e14);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e15) {
            e = e15;
            throw new SecurityException(m1.j("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e16) {
            e = e16;
            throw new SecurityException(m1.j("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e17) {
            e = e17;
            throw new SecurityException(m1.j("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e18) {
            e = e18;
            throw new SecurityException(m1.j("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e19) {
            e = e19;
            throw new SecurityException(m1.j("Failed to verify ", str2, " signature"), e);
        }
    }

    private static byte[][] zzk(int[] iArr, zzapa[] zzapaVarArr) throws DigestException {
        long j;
        int i10;
        int length;
        char c6;
        int i11;
        String str;
        int i12 = 0;
        int i13 = 0;
        long jZza = 0;
        while (true) {
            j = 1048576;
            i10 = 3;
            if (i13 >= 3) {
                break;
            }
            jZza += (zzapaVarArr[i13].zza() + 1048575) / 1048576;
            i13++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(m1.g(jZza, "Too many chunks: "));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i14 = 0;
        while (true) {
            length = iArr.length;
            c6 = 5;
            i11 = 1;
            if (i14 >= length) {
                break;
            }
            int i15 = (int) jZza;
            byte[] bArr2 = new byte[(zzb(iArr[i14]) * i15) + 5];
            bArr2[0] = 90;
            zzg(i15, bArr2, 1);
            bArr[i14] = bArr2;
            i14++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i16 = 0;
        while (true) {
            str = " digest not supported";
            if (i16 >= iArr.length) {
                break;
            }
            String strZzd = zzd(iArr[i16]);
            try {
                messageDigestArr[i16] = MessageDigest.getInstance(strZzd);
                i16++;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strZzd.concat(" digest not supported"), e10);
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < i10) {
            zzapa zzapaVar = zzapaVarArr[i17];
            int i19 = i17;
            long jZza2 = zzapaVar.zza();
            byte[][] bArr4 = bArr;
            long j4 = 0;
            while (jZza2 > 0) {
                int i20 = i18;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j);
                zzg(iMin, bArr3, i11);
                for (int i21 = 0; i21 < length; i21++) {
                    messageDigestArr[i21].update(bArr3);
                }
                try {
                    zzapaVar.zzb(messageDigestArr, j4, iMin);
                    int i22 = 0;
                    while (i22 < iArr.length) {
                        int i23 = iArr[i22];
                        byte[] bArr5 = bArr4[i22];
                        int iZzb = zzb(i23);
                        char c10 = c6;
                        MessageDigest messageDigest = messageDigestArr[i22];
                        int iDigest = messageDigest.digest(bArr5, (i20 * iZzb) + 5, iZzb);
                        if (iDigest != iZzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i22++;
                        c6 = c10;
                    }
                    long j10 = iMin;
                    j4 += j10;
                    jZza2 -= j10;
                    i18 = i20 + 1;
                    str = str2;
                    j = 1048576;
                    i11 = 1;
                } catch (IOException e11) {
                    throw new DigestException(gk.b.l(i20, i12, "Failed to digest chunk #", " of section #"), e11);
                }
            }
            i12++;
            i17 = i19 + 1;
            bArr = bArr4;
            j = 1048576;
            i10 = 3;
            i11 = 1;
        }
        byte[][] bArr6 = bArr;
        String str3 = str;
        byte[][] bArr7 = new byte[iArr.length][];
        for (int i24 = 0; i24 < iArr.length; i24++) {
            int i25 = iArr[i24];
            byte[] bArr8 = bArr6[i24];
            String strZzd2 = zzd(i25);
            try {
                bArr7[i24] = MessageDigest.getInstance(strZzd2).digest(bArr8);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strZzd2.concat(str3), e12);
            }
        }
        return bArr7;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzapc zzapcVar) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferZzf = zzf(zzapcVar.zza);
                int i10 = 0;
                while (byteBufferZzf.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(zzj(zzf(byteBufferZzf), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException(m6.a.e(i10, "Failed to parse/verify signer #", " block"), e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzh(map, fileChannel, zzapcVar.zzb, zzapcVar.zzc, zzapcVar.zzd, zzapcVar.zze);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }
}
