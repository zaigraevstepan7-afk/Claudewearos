package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgxt {
    private static volatile int zza = 100;
    public static final /* synthetic */ int zze = 0;
    int zzb;
    final int zzc = zza;
    zzgxu zzd;

    private zzgxt() {
    }

    public static int zzD(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static int zzE(int i10, InputStream inputStream) throws IOException {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int i13 = inputStream.read();
            if (i13 == -1) {
                throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i11 |= (i13 & 127) << i12;
            if ((i13 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int i14 = inputStream.read();
            if (i14 == -1) {
                throw new zzgzk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i14 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw new zzgzk("CodedInputStream encountered a malformed varint.");
    }

    public static long zzF(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzgxt zzG(InputStream inputStream, int i10) {
        if (inputStream != null) {
            return new zzgxq(inputStream, 4096, null);
        }
        byte[] bArr = zzgzi.zzb;
        int length = bArr.length;
        return zzH(bArr, 0, 0, false);
    }

    public static zzgxt zzH(byte[] bArr, int i10, int i11, boolean z2) {
        zzgxo zzgxoVar = new zzgxo(bArr, i10, i11, z2, null);
        try {
            zzgxoVar.zzd(i11);
            return zzgxoVar;
        } catch (zzgzk e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract boolean zzA();

    public abstract boolean zzB();

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzc();

    public abstract int zzd(int i10);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzj();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzs();

    public abstract long zzt();

    public abstract long zzu();

    public abstract zzgxn zzv();

    public abstract String zzw();

    public abstract String zzx();

    public abstract void zzy(int i10);

    public abstract void zzz(int i10);

    public /* synthetic */ zzgxt(zzgxs zzgxsVar) {
    }
}
