package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzalm extends zzalu {
    private final /* synthetic */ zzali zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzalk(this.zza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzalm(zzali zzaliVar) {
        super(zzaliVar);
        this.zza = zzaliVar;
    }
}
