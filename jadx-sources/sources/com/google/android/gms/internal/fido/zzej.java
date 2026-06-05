package com.google.android.gms.internal.fido;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzej implements zzek {
    private final String zza;
    private final zzdn zzb;

    public zzej() {
        zzdo zzdoVar = zzdo.NO_OP;
        this.zza = "";
        this.zzb = zzdoVar;
    }

    @Override // com.google.android.gms.internal.fido.zzek
    public final zzdp zza(String str) {
        return new zzes(this.zza, str, true, this.zzb, true, true);
    }
}
