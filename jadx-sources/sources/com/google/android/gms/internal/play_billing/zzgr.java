package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzgr extends zzgc {
    private static final Logger zzb = Logger.getLogger(zzgr.class.getName());
    private static final boolean zzc = zzjq.zzx();
    zzgs zza;

    private zzgr() {
        throw null;
    }

    public static int zzA(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzw(int i10, zzim zzimVar, zzix zzixVar) {
        int iZzz = zzz(i10 << 3);
        return ((zzfv) zzimVar).zze(zzixVar) + iZzz + iZzz;
    }

    public static int zzx(zzim zzimVar, zzix zzixVar) {
        int iZze = ((zzfv) zzimVar).zze(zzixVar);
        return zzz(iZze) + iZze;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzjt.zzc(str);
        } catch (zzjs unused) {
            length = str.getBytes(zzhp.zza).length;
        }
        return zzz(length) + length;
    }

    public static int zzz(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public final void zzB() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzC(String str, zzjs zzjsVar) throws zzgp {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzjsVar);
        byte[] bytes = str.getBytes(zzhp.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgp(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z2);

    public abstract void zze(int i10, zzgk zzgkVar);

    public abstract void zzf(int i10, int i11);

    public abstract void zzg(int i10);

    public abstract void zzh(int i10, long j);

    public abstract void zzi(long j);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, zzim zzimVar, zzix zzixVar);

    public abstract void zzn(int i10, zzim zzimVar);

    public abstract void zzo(int i10, zzgk zzgkVar);

    public abstract void zzp(int i10, String str);

    public abstract void zzr(int i10, int i11);

    public abstract void zzs(int i10, int i11);

    public abstract void zzt(int i10);

    public abstract void zzu(int i10, long j);

    public abstract void zzv(long j);

    public /* synthetic */ zzgr(zzgq zzgqVar) {
    }
}
