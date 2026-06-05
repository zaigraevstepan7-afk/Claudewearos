package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zzil;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzik<MessageType extends zzil<MessageType, BuilderType>, BuilderType extends zzik<MessageType, BuilderType>> implements zzli {
    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* synthetic */ zzli zzaA(byte[] bArr, zzjo zzjoVar) {
        return zzax(bArr, 0, bArr.length, zzjoVar);
    }

    @Override // 
    public abstract zzik zzau();

    public abstract zzik zzav(zzil zzilVar);

    public zzik zzaw(byte[] bArr, int i10, int i11) {
        throw null;
    }

    public zzik zzax(byte[] bArr, int i10, int i11, zzjo zzjoVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzay(zzlj zzljVar) {
        if (zzbR().getClass().isInstance(zzljVar)) {
            return zzav((zzil) zzljVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* synthetic */ zzli zzaz(byte[] bArr) {
        return zzaw(bArr, 0, bArr.length);
    }
}
