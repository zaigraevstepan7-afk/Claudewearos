package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzamj implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzamh zzb;

    public zzamj(zzamh zzamhVar) {
        this.zzb = zzamhVar;
        this.zza = zzamhVar.zza.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
