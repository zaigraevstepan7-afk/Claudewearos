package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaqu {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public zzaqu(String str, zzapk zzapkVar) {
        String str2 = zzapkVar.zzb;
        long j = zzapkVar.zzc;
        long j4 = zzapkVar.zzd;
        long j10 = zzapkVar.zze;
        long j11 = zzapkVar.zzf;
        List arrayList = zzapkVar.zzh;
        if (arrayList == 0) {
            Map map = zzapkVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzapt((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j4, j10, j11, arrayList);
    }

    public static zzaqu zza(zzaqv zzaqvVar) throws IOException {
        if (zzaqx.zze(zzaqvVar) != 538247942) {
            throw new IOException();
        }
        String strZzh = zzaqx.zzh(zzaqvVar);
        String strZzh2 = zzaqx.zzh(zzaqvVar);
        long jZzf = zzaqx.zzf(zzaqvVar);
        long jZzf2 = zzaqx.zzf(zzaqvVar);
        long jZzf3 = zzaqx.zzf(zzaqvVar);
        long jZzf4 = zzaqx.zzf(zzaqvVar);
        int iZze = zzaqx.zze(zzaqvVar);
        if (iZze < 0) {
            throw new IOException(m6.a.d(iZze, "readHeaderList size="));
        }
        List arrayList = iZze == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i10 = 0; i10 < iZze; i10++) {
            arrayList.add(new zzapt(zzaqx.zzh(zzaqvVar).intern(), zzaqx.zzh(zzaqvVar).intern()));
        }
        return new zzaqu(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, arrayList);
    }

    private zzaqu(String str, String str2, long j, long j4, long j10, long j11, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j4;
        this.zzf = j10;
        this.zzg = j11;
        this.zzh = list;
    }
}
