package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzvv implements zzvf, zzve {
    private final zzvf[] zza;
    private final boolean[] zzb;
    private zzve zzf;
    private zzxk zzg;
    private final ArrayList zzd = new ArrayList();
    private final HashMap zze = new HashMap();
    private zzxb zzi = new zzur(zzfyf.zzn(), zzfyf.zzn());
    private final IdentityHashMap zzc = new IdentityHashMap();
    private zzvf[] zzh = new zzvf[0];

    public zzvv(zzus zzusVar, long[] jArr, zzvf... zzvfVarArr) {
        this.zza = zzvfVarArr;
        this.zzb = new boolean[zzvfVarArr.length];
        for (int i10 = 0; i10 < zzvfVarArr.length; i10++) {
            long j = jArr[i10];
            if (j != 0) {
                this.zzb[i10] = true;
                this.zza[i10] = new zzxh(zzvfVarArr[i10], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zza(long j, zzmi zzmiVar) {
        zzvf[] zzvfVarArr = this.zzh;
        return (zzvfVarArr.length > 0 ? zzvfVarArr[0] : this.zza[0]).zza(j, zzmiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzb() {
        return this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final long zzc() {
        return this.zzi.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzvf zzvfVar : this.zzh) {
            long jZzd = zzvfVar.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j != -9223372036854775807L && zzvfVar.zze(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zzvf zzvfVar2 : this.zzh) {
                    if (zzvfVar2 == zzvfVar) {
                        break;
                    }
                    if (zzvfVar2.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zze(long j) {
        long jZze = this.zzh[0].zze(j);
        int i10 = 1;
        while (true) {
            zzvf[] zzvfVarArr = this.zzh;
            if (i10 >= zzvfVarArr.length) {
                return jZze;
            }
            if (zzvfVarArr[i10].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final long zzf(zzyw[] zzywVarArr, boolean[] zArr, zzwz[] zzwzVarArr, boolean[] zArr2, long j) {
        int length;
        int[] iArr;
        int length2 = zzywVarArr.length;
        int[] iArr2 = new int[length2];
        int[] iArr3 = new int[length2];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = zzywVarArr.length;
            if (i11 >= length) {
                break;
            }
            zzwz zzwzVar = zzwzVarArr[i11];
            Integer num = zzwzVar == null ? null : (Integer) this.zzc.get(zzwzVar);
            iArr2[i11] = num == null ? -1 : num.intValue();
            zzyw zzywVar = zzywVarArr[i11];
            if (zzywVar != null) {
                String str = zzywVar.zzc().zzb;
                iArr3[i11] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i11] = -1;
            }
            i11++;
        }
        IdentityHashMap identityHashMap = this.zzc;
        identityHashMap.clear();
        zzvf[] zzvfVarArr = this.zza;
        zzwz[] zzwzVarArr2 = new zzwz[length];
        zzwz[] zzwzVarArr3 = new zzwz[length];
        zzyw[] zzywVarArr2 = new zzyw[length];
        ArrayList arrayList = new ArrayList(zzvfVarArr.length);
        long j4 = j;
        int i12 = 0;
        while (i12 < zzvfVarArr.length) {
            int i13 = i10;
            while (i13 < zzywVarArr.length) {
                zzwzVarArr3[i13] = iArr2[i13] == i12 ? zzwzVarArr[i13] : null;
                if (iArr3[i13] == i12) {
                    zzyw zzywVar2 = zzywVarArr[i13];
                    zzywVar2.getClass();
                    iArr = iArr3;
                    zzbm zzbmVar = (zzbm) this.zze.get(zzywVar2.zzc());
                    zzbmVar.getClass();
                    zzywVarArr2[i13] = new zzvu(zzywVar2, zzbmVar);
                } else {
                    iArr = iArr3;
                    zzywVarArr2[i13] = null;
                }
                i13++;
                iArr3 = iArr;
            }
            int[] iArr4 = iArr3;
            ArrayList arrayList2 = arrayList;
            int i14 = i12;
            long jZzf = zzvfVarArr[i12].zzf(zzywVarArr2, zArr, zzwzVarArr3, zArr2, j4);
            if (i14 == 0) {
                j4 = jZzf;
            } else if (jZzf != j4) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i15 = 0; i15 < zzywVarArr.length; i15++) {
                if (iArr4[i15] == i14) {
                    zzwz zzwzVar2 = zzwzVarArr3[i15];
                    zzwzVar2.getClass();
                    zzwzVarArr2[i15] = zzwzVar2;
                    identityHashMap.put(zzwzVar2, Integer.valueOf(i14));
                    z2 = true;
                } else if (iArr2[i15] == i14) {
                    zzdd.zzf(zzwzVarArr3[i15] == null);
                }
            }
            if (z2) {
                arrayList2.add(zzvfVarArr[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            iArr3 = iArr4;
            i10 = 0;
        }
        int i16 = i10;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzwzVarArr2, i16, zzwzVarArr, i16, length);
        this.zzh = (zzvf[]) arrayList3.toArray(new zzvf[i16]);
        this.zzi = new zzur(arrayList3, zzfyv.zzc(arrayList3, new zzfut() { // from class: com.google.android.gms.internal.ads.zzvt
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return ((zzvf) obj).zzg().zzc();
            }
        }));
        return j4;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final zzxk zzg() {
        zzxk zzxkVar = this.zzg;
        zzxkVar.getClass();
        return zzxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzh(long j, boolean z2) {
        for (zzvf zzvfVar : this.zzh) {
            zzvfVar.zzh(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxa
    public final /* bridge */ /* synthetic */ void zzi(zzxb zzxbVar) {
        zzve zzveVar = this.zzf;
        zzveVar.getClass();
        zzveVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzj() {
        int i10 = 0;
        while (true) {
            zzvf[] zzvfVarArr = this.zza;
            if (i10 >= zzvfVarArr.length) {
                return;
            }
            zzvfVarArr[i10].zzj();
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzk(zzvf zzvfVar) {
        ArrayList arrayList = this.zzd;
        arrayList.remove(zzvfVar);
        if (arrayList.isEmpty()) {
            zzvf[] zzvfVarArr = this.zza;
            int i10 = 0;
            for (zzvf zzvfVar2 : zzvfVarArr) {
                i10 += zzvfVar2.zzg().zzb;
            }
            zzbm[] zzbmVarArr = new zzbm[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < zzvfVarArr.length; i12++) {
                zzxk zzxkVarZzg = zzvfVarArr[i12].zzg();
                int i13 = zzxkVarZzg.zzb;
                int i14 = 0;
                while (i14 < i13) {
                    zzbm zzbmVarZzb = zzxkVarZzg.zzb(i14);
                    int i15 = zzbmVarZzb.zza;
                    zzz[] zzzVarArr = new zzz[i15];
                    for (int i16 = 0; i16 < i15; i16++) {
                        zzz zzzVarZzb = zzbmVarZzb.zzb(i16);
                        zzx zzxVarZzb = zzzVarZzb.zzb();
                        String str = zzzVarZzb.zza;
                        if (str == null) {
                            str = "";
                        }
                        zzxVarZzb.zzS(i12 + ":" + str);
                        zzzVarArr[i16] = zzxVarZzb.zzan();
                    }
                    zzbm zzbmVar = new zzbm(i12 + ":" + zzbmVarZzb.zzb, zzzVarArr);
                    this.zze.put(zzbmVar, zzbmVarZzb);
                    zzbmVarArr[i11] = zzbmVar;
                    i14++;
                    i11++;
                }
            }
            this.zzg = new zzxk(zzbmVarArr);
            zzve zzveVar = this.zzf;
            zzveVar.getClass();
            zzveVar.zzk(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zzl(zzve zzveVar, long j) {
        this.zzf = zzveVar;
        ArrayList arrayList = this.zzd;
        zzvf[] zzvfVarArr = this.zza;
        Collections.addAll(arrayList, zzvfVarArr);
        for (zzvf zzvfVar : zzvfVarArr) {
            zzvfVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final void zzm(long j) {
        this.zzi.zzm(j);
    }

    public final zzvf zzn(int i10) {
        return this.zzb[i10] ? ((zzxh) this.zza[i10]).zzn() : this.zza[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzo(zzla zzlaVar) {
        ArrayList arrayList = this.zzd;
        if (arrayList.isEmpty()) {
            return this.zzi.zzo(zzlaVar);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzvf) arrayList.get(i10)).zzo(zzlaVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzvf, com.google.android.gms.internal.ads.zzxb
    public final boolean zzp() {
        return this.zzi.zzp();
    }
}
