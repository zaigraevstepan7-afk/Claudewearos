package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzvz extends zzup {
    private static final zzap zza;
    private final zzvj[] zzb;
    private final List zzc;
    private final zzbl[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzvw zzh;
    private final zzus zzi;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zza("MergingMediaSource");
        zza = zzadVar.zzc();
    }

    public zzvz(boolean z2, boolean z10, zzus zzusVar, zzvj... zzvjVarArr) {
        this.zzb = zzvjVarArr;
        this.zzi = zzusVar;
        this.zze = new ArrayList(Arrays.asList(zzvjVarArr));
        this.zzc = new ArrayList(zzvjVarArr.length);
        int i10 = 0;
        while (true) {
            int length = zzvjVarArr.length;
            if (i10 >= length) {
                this.zzd = new zzbl[length];
                this.zzg = new long[0][];
                new HashMap();
                zzfzl.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzvj zzvjVar, zzbl zzblVar) {
        int iZzb;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzb = zzblVar.zzb();
            this.zzf = iZzb;
        } else {
            int iZzb2 = zzblVar.zzb();
            int i10 = this.zzf;
            if (iZzb2 != i10) {
                this.zzh = new zzvw(0);
                return;
            }
            iZzb = i10;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzb, this.zzd.length);
        }
        ArrayList arrayList = this.zze;
        arrayList.remove(zzvjVar);
        zzbl[] zzblVarArr = this.zzd;
        zzblVarArr[num.intValue()] = zzblVar;
        if (arrayList.isEmpty()) {
            zzo(zzblVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final void zzG(zzvf zzvfVar) {
        zzvv zzvvVar = (zzvv) zzvfVar;
        int i10 = 0;
        while (true) {
            zzvj[] zzvjVarArr = this.zzb;
            if (i10 >= zzvjVarArr.length) {
                return;
            }
            List list = (List) this.zzc.get(i10);
            zzvf zzvfVarZzn = zzvvVar.zzn(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((zzvx) list.get(i11)).zzb.equals(zzvfVarZzn)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            zzvjVarArr[i10].zzG(zzvvVar.zzn(i10));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final zzvf zzI(zzvh zzvhVar, zzzm zzzmVar, long j) {
        zzbl[] zzblVarArr = this.zzd;
        zzvj[] zzvjVarArr = this.zzb;
        int length = zzvjVarArr.length;
        zzvf[] zzvfVarArr = new zzvf[length];
        int iZza = zzblVarArr[0].zza(zzvhVar.zza);
        for (int i10 = 0; i10 < length; i10++) {
            zzvh zzvhVarZza = zzvhVar.zza(zzblVarArr[i10].zzf(iZza));
            zzvfVarArr[i10] = zzvjVarArr[i10].zzI(zzvhVarZza, zzzmVar, j - this.zzg[iZza][i10]);
            ((List) this.zzc.get(i10)).add(new zzvx(zzvhVarZza, zzvfVarArr[i10], null));
        }
        return new zzvv(this.zzi, this.zzg[iZza], zzvfVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final zzap zzJ() {
        zzvj[] zzvjVarArr = this.zzb;
        return zzvjVarArr.length > 0 ? zzvjVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzug
    public final void zzn(zzhj zzhjVar) {
        super.zzn(zzhjVar);
        int i10 = 0;
        while (true) {
            zzvj[] zzvjVarArr = this.zzb;
            if (i10 >= zzvjVarArr.length) {
                return;
            }
            zzB(Integer.valueOf(i10), zzvjVarArr[i10]);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzug
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        ArrayList arrayList = this.zze;
        arrayList.clear();
        Collections.addAll(arrayList, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzvj
    public final void zzt(zzap zzapVar) {
        this.zzb[0].zzt(zzapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final /* bridge */ /* synthetic */ zzvh zzy(Object obj, zzvh zzvhVar) {
        int iIntValue = ((Integer) obj).intValue();
        List list = this.zzc;
        List list2 = (List) list.get(iIntValue);
        for (int i10 = 0; i10 < list2.size(); i10++) {
            if (((zzvx) list2.get(i10)).zza.equals(zzvhVar)) {
                return ((zzvx) ((List) list.get(0)).get(i10)).zza;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzvj
    public final void zzz() throws zzvw {
        zzvw zzvwVar = this.zzh;
        if (zzvwVar != null) {
            throw zzvwVar;
        }
        super.zzz();
    }
}
