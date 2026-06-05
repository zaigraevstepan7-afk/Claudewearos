package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzadg {
    public static void zza(long j, zzen zzenVar, zzaez[] zzaezVarArr) {
        int iZzg;
        while (true) {
            if (zzenVar.zza() <= 1) {
                return;
            }
            int iZzc = zzc(zzenVar);
            int iZzc2 = zzc(zzenVar);
            int iZzc3 = zzenVar.zzc() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzenVar.zza()) {
                zzea.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzc3 = zzenVar.zzd();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzm = zzenVar.zzm();
                int iZzq = zzenVar.zzq();
                if (iZzq == 49) {
                    iZzg = zzenVar.zzg();
                    iZzq = 49;
                } else {
                    iZzg = 0;
                }
                int iZzm2 = zzenVar.zzm();
                if (iZzq == 47) {
                    zzenVar.zzM(1);
                    iZzq = 47;
                }
                boolean z2 = iZzm == 181 && (iZzq == 49 || iZzq == 47) && iZzm2 == 3;
                if (iZzq == 49) {
                    z2 &= iZzg == 1195456820;
                }
                if (z2) {
                    zzb(j, zzenVar, zzaezVarArr);
                }
            }
            zzenVar.zzL(iZzc3);
        }
    }

    public static void zzb(long j, zzen zzenVar, zzaez[] zzaezVarArr) {
        int iZzm = zzenVar.zzm();
        if ((iZzm & 64) != 0) {
            int i10 = iZzm & 31;
            zzenVar.zzM(1);
            int iZzc = zzenVar.zzc();
            for (zzaez zzaezVar : zzaezVarArr) {
                int i11 = i10 * 3;
                zzenVar.zzL(iZzc);
                zzaezVar.zzr(zzenVar, i11);
                zzdd.zzf(j != -9223372036854775807L);
                zzaezVar.zzt(j, 1, i11, 0, null);
            }
        }
    }

    private static int zzc(zzen zzenVar) {
        int i10 = 0;
        while (zzenVar.zza() != 0) {
            int iZzm = zzenVar.zzm();
            i10 += iZzm;
            if (iZzm != 255) {
                return i10;
            }
        }
        return -1;
    }
}
