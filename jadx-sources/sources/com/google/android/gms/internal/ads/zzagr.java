package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzagr implements zzau {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzagr(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = bArr;
    }

    public static zzagr zzb(zzen zzenVar) {
        int iZzg = zzenVar.zzg();
        String strZze = zzay.zze(zzenVar.zzB(zzenVar.zzg(), StandardCharsets.US_ASCII));
        String strZzB = zzenVar.zzB(zzenVar.zzg(), StandardCharsets.UTF_8);
        int iZzg2 = zzenVar.zzg();
        int iZzg3 = zzenVar.zzg();
        int iZzg4 = zzenVar.zzg();
        int iZzg5 = zzenVar.zzg();
        int iZzg6 = zzenVar.zzg();
        byte[] bArr = new byte[iZzg6];
        zzenVar.zzH(bArr, 0, iZzg6);
        return new zzagr(iZzg, strZze, strZzB, iZzg2, iZzg3, iZzg4, iZzg5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagr.class == obj.getClass()) {
            zzagr zzagrVar = (zzagr) obj;
            if (this.zza == zzagrVar.zza && this.zzb.equals(zzagrVar.zzb) && this.zzc.equals(zzagrVar.zzc) && this.zzd == zzagrVar.zzd && this.zze == zzagrVar.zze && this.zzf == zzagrVar.zzf && this.zzg == zzagrVar.zzg && Arrays.equals(this.zzh, zzagrVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza + 527;
        int iHashCode = this.zzb.hashCode() + (i10 * 31);
        int iHashCode2 = this.zzc.hashCode() + (iHashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((iHashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        zzarVar.zza(this.zzh, this.zza);
    }
}
