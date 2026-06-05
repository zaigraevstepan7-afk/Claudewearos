package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgym extends zzgwz implements RandomAccess, zzgzc, zzhap {
    private static final float[] zza;
    private static final zzgym zzb;
    private float[] zzc;
    private int zzd;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        zzb = new zzgym(fArr, 0, false);
    }

    public zzgym() {
        this(zza, 0, true);
    }

    public static zzgym zze() {
        return zzb;
    }

    private static int zzj(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String zzk(int i10) {
        return gk.b.l(i10, this.zzd, "Index:", ", Size:");
    }

    private final void zzl(int i10) {
        if (i10 < 0 || i10 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float fFloatValue = ((Float) obj).floatValue();
        zzdJ();
        if (i10 < 0 || i10 > (i11 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.zzc;
        int length = fArr.length;
        if (i11 < length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr2, 0, i10);
            System.arraycopy(this.zzc, i10, fArr2, i12, this.zzd - i10);
            this.zzc = fArr2;
        }
        this.zzc[i10] = fFloatValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdJ();
        byte[] bArr = zzgzi.zzb;
        collection.getClass();
        if (!(collection instanceof zzgym)) {
            return super.addAll(collection);
        }
        zzgym zzgymVar = (zzgym) collection;
        int i10 = zzgymVar.zzd;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzd;
        if (f.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.zzc;
        if (i12 > fArr.length) {
            this.zzc = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(zzgymVar.zzc, 0, this.zzc, this.zzd, zzgymVar.zzd);
        this.zzd = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgym)) {
            return super.equals(obj);
        }
        zzgym zzgymVar = (zzgym) obj;
        if (this.zzd != zzgymVar.zzd) {
            return false;
        }
        float[] fArr = zzgymVar.zzc;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            if (Float.floatToIntBits(this.zzc[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzl(i10);
        return Float.valueOf(this.zzc[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.zzd; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzc[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i10 = this.zzd;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzc[i11] == fFloatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzdJ();
        zzl(i10);
        float[] fArr = this.zzc;
        float f10 = fArr[i10];
        if (i10 < this.zzd - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zzdJ();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzc;
        System.arraycopy(fArr, i11, fArr, i10, this.zzd - i11);
        this.zzd -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zzdJ();
        zzl(i10);
        float[] fArr = this.zzc;
        float f10 = fArr[i10];
        fArr[i10] = fFloatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final float zzd(int i10) {
        zzl(i10);
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgzc zzf(int i10) {
        if (i10 >= this.zzd) {
            return new zzgym(i10 == 0 ? zza : Arrays.copyOf(this.zzc, i10), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(float f10) {
        zzdJ();
        int i10 = this.zzd;
        int length = this.zzc.length;
        if (i10 == length) {
            float[] fArr = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr, 0, this.zzd);
            this.zzc = fArr;
        }
        float[] fArr2 = this.zzc;
        int i11 = this.zzd;
        this.zzd = i11 + 1;
        fArr2[i11] = f10;
    }

    public final void zzi(int i10) {
        int length = this.zzc.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new float[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzgym(float[] fArr, int i10, boolean z2) {
        super(z2);
        this.zzc = fArr;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }
}
