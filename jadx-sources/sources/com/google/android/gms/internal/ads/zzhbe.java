package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhbe implements Iterator {
    final /* synthetic */ zzhbh zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhbe(zzhbh zzhbhVar, zzhbg zzhbgVar) {
        this.zza = zzhbhVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzhbh zzhbhVar = this.zza;
        if (i10 >= zzhbhVar.zzb) {
            return !zzhbhVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzhbh zzhbhVar = this.zza;
        return i10 < zzhbhVar.zzb ? (zzhbd) zzhbhVar.zza[i10] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzhbh zzhbhVar = this.zza;
        zzhbhVar.zzo();
        int i10 = this.zzb;
        if (i10 >= zzhbhVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzhbhVar.zzm(i10);
        }
    }
}
