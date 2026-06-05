package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfxi extends AbstractSet {
    final /* synthetic */ zzfxo zza;

    public zzfxi(zzfxo zzfxoVar) {
        this.zza = zzfxoVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzfxo zzfxoVar = this.zza;
        Map mapZzl = zzfxoVar.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzw = zzfxoVar.zzw(entry.getKey());
            if (iZzw != -1 && zzfvb.zza(zzfxo.zzj(zzfxoVar, iZzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfxo zzfxoVar = this.zza;
        Map mapZzl = zzfxoVar.zzl();
        return mapZzl != null ? mapZzl.entrySet().iterator() : new zzfxg(zzfxoVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iZzv;
        int iZzb;
        zzfxo zzfxoVar = this.zza;
        Map mapZzl = zzfxoVar.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzfxoVar.zzr() || (iZzb = zzfxp.zzb(entry.getKey(), entry.getValue(), (iZzv = zzfxoVar.zzv()), zzfxo.zzi(zzfxoVar), zzfxoVar.zzA(), zzfxoVar.zzB(), zzfxoVar.zzC())) == -1) {
            return false;
        }
        zzfxoVar.zzq(iZzb, iZzv);
        zzfxoVar.zzg--;
        zzfxoVar.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
