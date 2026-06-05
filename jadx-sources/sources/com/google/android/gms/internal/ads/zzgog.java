package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgog {
    private final Map zza;
    private final Map zzb;

    private zzgog() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgog zza(zzgoe zzgoeVar) throws GeneralSecurityException {
        if (zzgoeVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzgoh zzgohVar = new zzgoh(zzgoeVar.zzc(), zzgoeVar.zzd(), null);
        Map map = this.zza;
        if (!map.containsKey(zzgohVar)) {
            map.put(zzgohVar, zzgoeVar);
            return this;
        }
        zzgoe zzgoeVar2 = (zzgoe) map.get(zzgohVar);
        if (zzgoeVar2.equals(zzgoeVar) && zzgoeVar.equals(zzgoeVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgohVar.toString()));
    }

    public final zzgog zzb(zzgok zzgokVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZzb = zzgokVar.zzb();
        if (!map.containsKey(clsZzb)) {
            map.put(clsZzb, zzgokVar);
            return this;
        }
        zzgok zzgokVar2 = (zzgok) map.get(clsZzb);
        if (zzgokVar2.equals(zzgokVar) && zzgokVar.equals(zzgokVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZzb.toString()));
    }

    public final zzgoj zzc() {
        return new zzgoj(this, null);
    }

    public /* synthetic */ zzgog(zzgoi zzgoiVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgog(zzgoj zzgojVar, zzgoi zzgoiVar) {
        this.zza = new HashMap(zzgojVar.zza);
        this.zzb = new HashMap(zzgojVar.zzb);
    }
}
