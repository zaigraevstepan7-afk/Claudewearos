package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzag extends zzaf {
    private final /* synthetic */ zzp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzad zzadVar, zzac zzacVar, CharSequence charSequence, zzp zzpVar) {
        super(zzacVar, charSequence);
        this.zzb = zzpVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaf
    public final int zza(int i10) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaf
    public final int zzb(int i10) {
        if (this.zzb.zza(i10)) {
            return this.zzb.zzb();
        }
        return -1;
    }
}
