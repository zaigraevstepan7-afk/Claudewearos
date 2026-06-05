package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhfw implements zzhfy {
    private zzhgh zza;

    public static void zza(zzhgh zzhghVar, zzhgh zzhghVar2) {
        zzhfw zzhfwVar = (zzhfw) zzhghVar;
        if (zzhfwVar.zza != null) {
            throw new IllegalStateException();
        }
        zzhfwVar.zza = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        zzhgh zzhghVar = this.zza;
        if (zzhghVar != null) {
            return zzhghVar.zzb();
        }
        throw new IllegalStateException();
    }
}
