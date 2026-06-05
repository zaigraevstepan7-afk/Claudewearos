package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaaf {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaab
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzaad) obj).zza - ((zzaad) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzaac
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzaad) obj).zzc, ((zzaad) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzaad[] zzd = new zzaad[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzaaf(int i10) {
    }

    public final float zza(float f10) {
        int i10 = 0;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.zzc;
            if (i10 >= arrayList.size()) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((zzaad) arrayList.get(arrayList.size() - 1)).zzc;
            }
            float f12 = 0.5f * f11;
            zzaad zzaadVar = (zzaad) arrayList.get(i10);
            i11 += zzaadVar.zzb;
            if (i11 >= f12) {
                return zzaadVar.zzc;
            }
            i10++;
        }
    }

    public final void zzb(int i10, float f10) {
        zzaad zzaadVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzaad[] zzaadVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzaadVar = zzaadVarArr[i12];
        } else {
            zzaadVar = new zzaad(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzaadVar.zza = i13;
        zzaadVar.zzb = i10;
        zzaadVar.zzc = f10;
        ArrayList arrayList = this.zzc;
        arrayList.add(zzaadVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            zzaad zzaadVar2 = (zzaad) arrayList.get(0);
            int i16 = zzaadVar2.zzb;
            if (i16 <= i15) {
                this.zzg -= i16;
                arrayList.remove(0);
                int i17 = this.zzh;
                if (i17 < 5) {
                    zzaad[] zzaadVarArr2 = this.zzd;
                    this.zzh = i17 + 1;
                    zzaadVarArr2[i17] = zzaadVar2;
                }
            } else {
                zzaadVar2.zzb = i16 - i15;
                this.zzg -= i15;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
