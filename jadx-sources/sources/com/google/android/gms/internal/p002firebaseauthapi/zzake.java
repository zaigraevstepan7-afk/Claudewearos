package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzake implements zzakm {
    private zzakm[] zza;

    public zzake(zzakm... zzakmVarArr) {
        this.zza = zzakmVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final zzakn zza(Class<?> cls) {
        for (zzakm zzakmVar : this.zza) {
            if (zzakmVar.zzb(cls)) {
                return zzakmVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final boolean zzb(Class<?> cls) {
        for (zzakm zzakmVar : this.zza) {
            if (zzakmVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
