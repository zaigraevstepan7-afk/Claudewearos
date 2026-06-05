package com.google.android.gms.internal.fido;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzca extends zzcc {
    private final transient zzcc zza;

    public zzca(zzcc zzccVar) {
        this.zza = zzccVar;
    }

    private final int zzl(int i10) {
        return (this.zza.size() - 1) - i10;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, com.google.android.gms.internal.fido.zzby, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzbm.zza(i10, this.zza.size(), "index");
        return this.zza.get(zzl(i10));
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.zza.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return zzl(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.zza.indexOf(obj);
        if (iIndexOf >= 0) {
            return zzl(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.fido.zzcc
    public final zzcc zzf() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzcc subList(int i10, int i11) {
        zzbm.zze(i10, i11, this.zza.size());
        zzcc zzccVar = this.zza;
        return zzccVar.subList(zzccVar.size() - i11, this.zza.size() - i10).zzf();
    }
}
