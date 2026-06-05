package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzahr extends zzaht {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzaho zzc;

    public zzahr(zzaho zzahoVar) {
        this.zzc = zzahoVar;
        this.zzb = zzahoVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahu
    public final byte zza() {
        int i10 = this.zza;
        if (i10 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i10 + 1;
        return this.zzc.zzb(i10);
    }
}
