package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgu extends zzfxv {
    private final Map zza;

    public zzgu(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, java.util.Map
    public final boolean containsValue(Object obj) {
        return zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, java.util.Map
    public final Set entrySet() {
        return zzgah.zzc(this.zza.entrySet(), new zzfvf() { // from class: com.google.android.gms.internal.ads.zzgs
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, java.util.Map
    public final int hashCode() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, java.util.Map
    public final Set keySet() {
        return zzgah.zzc(this.zza.keySet(), new zzfvf() { // from class: com.google.android.gms.internal.ads.zzgt
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxv, com.google.android.gms.internal.ads.zzfxw
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxv
    public final Map zzb() {
        return this.zza;
    }
}
