package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhab {
    public static final boolean zza(Object obj) {
        return !((zzhaa) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzhaa zzhaaVarZzb = (zzhaa) obj;
        zzhaa zzhaaVar = (zzhaa) obj2;
        if (!zzhaaVar.isEmpty()) {
            if (!zzhaaVarZzb.zze()) {
                zzhaaVarZzb = zzhaaVarZzb.zzb();
            }
            zzhaaVarZzb.zzd(zzhaaVar);
        }
        return zzhaaVarZzb;
    }
}
