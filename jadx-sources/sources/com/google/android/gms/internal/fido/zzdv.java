package com.google.android.gms.internal.fido;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdv {
    private static final zzdz zza = new zzds();
    private static final zzdy zzb = new zzdt();
    private final zzdz zze;
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdy zzf = null;

    public final zzdv zza(zzdy zzdyVar) {
        this.zzf = zzdyVar;
        return this;
    }

    public final zzea zzd() {
        return new zzdx(this, null);
    }

    public final void zzg(zzdk zzdkVar) {
        zzfk.zza(zzdkVar, "key");
        if (!zzdkVar.zzb()) {
            zzdz zzdzVar = zza;
            zzfk.zza(zzdkVar, "key");
            this.zzd.remove(zzdkVar);
            this.zzc.put(zzdkVar, zzdzVar);
            return;
        }
        zzdy zzdyVar = zzb;
        zzfk.zza(zzdkVar, "key");
        if (!zzdkVar.zzb()) {
            throw new IllegalArgumentException("key must be repeating");
        }
        this.zzc.remove(zzdkVar);
        this.zzd.put(zzdkVar, zzdyVar);
    }
}
