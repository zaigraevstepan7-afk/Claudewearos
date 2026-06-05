package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzly extends zzht {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbl[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzly(Collection collection, zzxc zzxcVar) {
        zzbl[] zzblVarArr = new zzbl[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            zzblVarArr[i11] = ((zzlg) it.next()).zza();
            i11++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i10] = ((zzlg) it2.next()).zzb();
            i10++;
        }
        this(zzblVarArr, objArr, zzxcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzht
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzht
    public final int zzq(int i10) {
        return zzex.zzc(this.zze, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzht
    public final int zzr(int i10) {
        return zzex.zzc(this.zzf, i10 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzht
    public final int zzs(int i10) {
        return this.zze[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzht
    public final int zzt(int i10) {
        return this.zzf[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzht
    public final zzbl zzu(int i10) {
        return this.zzg[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzht
    public final Object zzv(int i10) {
        return this.zzh[i10];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzly zzx(zzxc zzxcVar) {
        zzbl[] zzblVarArr = this.zzg;
        zzbl[] zzblVarArr2 = new zzbl[zzblVarArr.length];
        for (int i10 = 0; i10 < zzblVarArr.length; i10++) {
            zzblVarArr2[i10] = new zzlx(this, zzblVarArr[i10]);
        }
        return new zzly(zzblVarArr2, this.zzh, zzxcVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzly(zzbl[] zzblVarArr, Object[] objArr, zzxc zzxcVar) {
        super(false, zzxcVar);
        int i10 = 0;
        this.zzg = zzblVarArr;
        int length = zzblVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int iZzc = 0;
        int iZzb = 0;
        int i11 = 0;
        while (i10 < zzblVarArr.length) {
            zzbl zzblVar = zzblVarArr[i10];
            this.zzg[i11] = zzblVar;
            this.zzf[i11] = iZzc;
            this.zze[i11] = iZzb;
            iZzc += zzblVar.zzc();
            iZzb += this.zzg[i11].zzb();
            this.zzi.put(objArr[i11], Integer.valueOf(i11));
            i10++;
            i11++;
        }
        this.zzc = iZzc;
        this.zzd = iZzb;
    }
}
