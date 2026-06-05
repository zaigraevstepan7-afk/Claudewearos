package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfwv extends zzfwt implements ListIterator {
    final /* synthetic */ zzfww zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwv(zzfww zzfwwVar) {
        super(zzfwwVar);
        this.zzd = zzfwwVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        zzfww zzfwwVar = this.zzd;
        boolean zIsEmpty = zzfwwVar.isEmpty();
        zza();
        ((ListIterator) this.zza).add(obj);
        zzfwwVar.zzf.zzb++;
        if (zIsEmpty) {
            zzfwwVar.zza();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        zza();
        return ((ListIterator) this.zza).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        zza();
        return ((ListIterator) this.zza).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        zza();
        return ((ListIterator) this.zza).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        zza();
        return ((ListIterator) this.zza).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        zza();
        ((ListIterator) this.zza).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwv(zzfww zzfwwVar, int i10) {
        super(zzfwwVar, ((List) zzfwwVar.zzb).listIterator(i10));
        this.zzd = zzfwwVar;
    }
}
