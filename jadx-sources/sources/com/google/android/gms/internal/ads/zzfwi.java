package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfwi extends zzfyy {
    final /* synthetic */ zzfwk zza;

    public zzfwi(zzfwk zzfwkVar) {
        this.zza = zzfwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzfxe.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfwj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfyy, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzfwk zzfwkVar = this.zza;
        zzfwx.zzo(zzfwkVar.zzb, entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfyy
    public final Map zza() {
        return this.zza;
    }
}
