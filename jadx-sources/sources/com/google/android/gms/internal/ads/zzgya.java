package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgya extends zzgxe {
    private static final Logger zza = Logger.getLogger(zzgya.class.getName());
    private static final boolean zzb = zzhbs.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgyb zze;

    private zzgya() {
        throw null;
    }

    public static int zzA(zzhag zzhagVar, zzhaz zzhazVar) {
        int iZzaM = ((zzgww) zzhagVar).zzaM(zzhazVar);
        return zzD(iZzaM) + iZzaM;
    }

    public static int zzB(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhbx.zze(str);
        } catch (zzhbw unused) {
            length = str.getBytes(zzgzi.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzE(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzy(int i10, zzhag zzhagVar, zzhaz zzhazVar) {
        int iZzD = zzD(i10 << 3);
        return ((zzgww) zzhagVar).zzaM(zzhazVar) + iZzD + iZzD;
    }

    public static int zzz(zzhag zzhagVar) {
        int iZzaY = zzhagVar.zzaY();
        return zzD(iZzaY) + iZzaY;
    }

    public final void zzF() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzG(String str, zzhbw zzhbwVar) throws zzgxx {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhbwVar);
        byte[] bytes = str.getBytes(zzgzi.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxx(e10);
        }
    }

    public abstract void zzK();

    public abstract void zzL(byte b10);

    public abstract void zzM(int i10, boolean z2);

    public abstract void zzN(int i10, zzgxn zzgxnVar);

    @Override // com.google.android.gms.internal.ads.zzgxe
    public abstract void zza(byte[] bArr, int i10, int i11);

    public abstract int zzb();

    public abstract void zzh(int i10, int i11);

    public abstract void zzi(int i10);

    public abstract void zzj(int i10, long j);

    public abstract void zzk(long j);

    public abstract void zzl(int i10, int i11);

    public abstract void zzm(int i10);

    public abstract void zzn(int i10, zzhag zzhagVar, zzhaz zzhazVar);

    public abstract void zzo(int i10, zzhag zzhagVar);

    public abstract void zzp(int i10, zzgxn zzgxnVar);

    public abstract void zzq(int i10, String str);

    public abstract void zzs(int i10, int i11);

    public abstract void zzt(int i10, int i11);

    public abstract void zzu(int i10);

    public abstract void zzv(int i10, long j);

    public abstract void zzw(long j);

    public /* synthetic */ zzgya(zzgxz zzgxzVar) {
    }
}
