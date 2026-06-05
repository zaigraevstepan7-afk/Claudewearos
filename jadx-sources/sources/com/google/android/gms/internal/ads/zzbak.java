package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.PriorityQueue;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbak {
    public static long zza(long j, int i10) {
        if (i10 == 1) {
            return j;
        }
        int i11 = i10 >> 1;
        long j4 = (j * j) % 1073807359;
        return (i10 & 1) == 0 ? zza(j4, i11) % 1073807359 : ((zza(j4, i11) % 1073807359) * j) % 1073807359;
    }

    public static String zzb(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            int i13 = l0.f13401b;
            k.d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i14 = i12 - 1;
            if (i10 >= i14) {
                sb2.append(strArr[i14]);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            sb2.append(' ');
            i10++;
        }
    }

    public static void zzc(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) throws UnsupportedEncodingException {
        int length = strArr.length;
        if (length < 6) {
            zzd(i10, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jZze = zze(strArr, 0, 6);
        zzd(i10, jZze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i12 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i12 >= length2 - 5) {
                return;
            }
            long jZza = zzbag.zza(strArr[i12 - 1]);
            long jZza2 = zzbag.zza(strArr[i12 + 5]);
            String strZzb = zzb(strArr, i12, 6);
            jZze = (((jZza2 + 2147483647L) % 1073807359) + (((((jZze + 1073807359) - ((((jZza + 2147483647L) % 1073807359) * zza(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzd(i10, jZze, strZzb, length2, priorityQueue);
            i12++;
        }
    }

    public static void zzd(int i10, long j, String str, int i11, PriorityQueue priorityQueue) {
        zzbaj zzbajVar = new zzbaj(j, str, i11);
        if ((priorityQueue.size() != i10 || (((zzbaj) priorityQueue.peek()).zzc <= zzbajVar.zzc && ((zzbaj) priorityQueue.peek()).zza <= zzbajVar.zza)) && !priorityQueue.contains(zzbajVar)) {
            priorityQueue.add(zzbajVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long jZza = (zzbag.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            jZza = (((zzbag.zza(strArr[i12]) + 2147483647L) % 1073807359) + ((jZza * 16785407) % 1073807359)) % 1073807359;
        }
        return jZza;
    }
}
