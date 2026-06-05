package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzamn implements zzakm {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzamn(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzamc zzamcVar = (zzamc) list.get(i10);
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            jArr[i11] = zzamcVar.zzb;
            jArr[i11 + 1] = zzamcVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final long zzb(int i10) {
        zzdd.zzd(i10 >= 0);
        long[] jArr = this.zzc;
        zzdd.zzd(i10 < jArr.length);
        return jArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzakm
    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.zza;
            if (i10 >= list.size()) {
                break;
            }
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            if (jArr[i11] <= j && j < jArr[i11 + 1]) {
                zzamc zzamcVar = (zzamc) list.get(i10);
                zzcu zzcuVar = zzamcVar.zza;
                if (zzcuVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzamcVar);
                } else {
                    arrayList.add(zzcuVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzamm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzamc) obj).zzb, ((zzamc) obj2).zzb);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            zzcs zzcsVarZzb = ((zzamc) arrayList2.get(i12)).zza.zzb();
            zzcsVarZzb.zze((-1) - i12, 1);
            arrayList.add(zzcsVarZzb.zzq());
        }
        return arrayList;
    }
}
