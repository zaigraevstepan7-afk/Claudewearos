package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzajo<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzajp> zza;

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzajp.zza();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzakp) {
            return this.zza.getValue().zza((zzakp) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzajp zza() {
        return this.zza.getValue();
    }

    private zzajo(Map.Entry<K, zzajp> entry) {
        this.zza = entry;
    }
}
