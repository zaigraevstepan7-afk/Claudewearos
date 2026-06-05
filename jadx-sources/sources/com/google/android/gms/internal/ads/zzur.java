package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzur implements zzxb {
    private final zzfyf zza;
    private long zzb;

    public zzur(List list, List list2) {
        int i10 = zzfyf.zzd;
        zzfyc zzfycVar = new zzfyc();
        zzdd.zzd(list.size() == list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzfycVar.zzf(new zzuq((zzxb) list.get(i11), (List) list2.get(i11)));
        }
        this.zza = zzfycVar.zzi();
        this.zzb = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i10 >= zzfyfVar.size()) {
                break;
            }
            zzuq zzuqVar = (zzuq) zzfyfVar.get(i10);
            long jZzb = zzuqVar.zzb();
            if ((zzuqVar.zza().contains(1) || zzuqVar.zza().contains(2) || zzuqVar.zza().contains(4)) && jZzb != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzb);
            }
            if (jZzb != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jZzb);
            }
            i10++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.zzb = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.zzb;
        return j != -9223372036854775807L ? j : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        int i10 = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i10 >= zzfyfVar.size()) {
                break;
            }
            long jZzc = ((zzuq) zzfyfVar.get(i10)).zzc();
            if (jZzc != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzc);
            }
            i10++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j) {
        int i10 = 0;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i10 >= zzfyfVar.size()) {
                return;
            }
            ((zzuq) zzfyfVar.get(i10)).zzm(j);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        boolean zZzo;
        boolean z2 = false;
        do {
            long jZzc = zzc();
            if (jZzc == Long.MIN_VALUE) {
                break;
            }
            int i10 = 0;
            zZzo = false;
            while (true) {
                zzfyf zzfyfVar = this.zza;
                if (i10 >= zzfyfVar.size()) {
                    break;
                }
                long jZzc2 = ((zzuq) zzfyfVar.get(i10)).zzc();
                boolean z10 = jZzc2 != Long.MIN_VALUE && jZzc2 <= zzlaVar.zza;
                if (jZzc2 == jZzc || z10) {
                    zZzo |= ((zzuq) zzfyfVar.get(i10)).zzo(zzlaVar);
                }
                i10++;
            }
            z2 |= zZzo;
        } while (zZzo);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        int i10 = 0;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i10 >= zzfyfVar.size()) {
                return false;
            }
            if (((zzuq) zzfyfVar.get(i10)).zzp()) {
                return true;
            }
            i10++;
        }
    }
}
