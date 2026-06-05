package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgou {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgou(zzgoq zzgoqVar, zzgot zzgotVar) {
        this.zza = new HashMap(zzgoqVar.zza);
        this.zzb = new HashMap(zzgoqVar.zzb);
        this.zzc = new HashMap(zzgoqVar.zzc);
        this.zzd = new HashMap(zzgoqVar.zzd);
    }

    public final zzgen zza(zzgop zzgopVar, zzgfb zzgfbVar) throws GeneralSecurityException {
        zzgor zzgorVar = new zzgor(zzgopVar.getClass(), zzgopVar.zzd(), null);
        Map map = this.zzb;
        if (map.containsKey(zzgorVar)) {
            return ((zzgmh) map.get(zzgorVar)).zza(zzgopVar, zzgfbVar);
        }
        throw new GeneralSecurityException(m1.j("No Key Parser for requested key type ", zzgorVar.toString(), " available"));
    }

    public final zzgfa zzb(zzgop zzgopVar) throws GeneralSecurityException {
        zzgor zzgorVar = new zzgor(zzgopVar.getClass(), zzgopVar.zzd(), null);
        Map map = this.zzd;
        if (map.containsKey(zzgorVar)) {
            return ((zzgnr) map.get(zzgorVar)).zza(zzgopVar);
        }
        throw new GeneralSecurityException(m1.j("No Parameters Parser for requested key type ", zzgorVar.toString(), " available"));
    }

    public final zzgop zzc(zzgen zzgenVar, Class cls, zzgfb zzgfbVar) throws GeneralSecurityException {
        zzgos zzgosVar = new zzgos(zzgenVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzgosVar)) {
            return ((zzgml) map.get(zzgosVar)).zza(zzgenVar, zzgfbVar);
        }
        throw new GeneralSecurityException(m1.j("No Key serializer for ", zzgosVar.toString(), " available"));
    }

    public final zzgop zzd(zzgfa zzgfaVar, Class cls) throws GeneralSecurityException {
        zzgos zzgosVar = new zzgos(zzgfaVar.getClass(), cls, null);
        Map map = this.zzc;
        if (map.containsKey(zzgosVar)) {
            return ((zzgnv) map.get(zzgosVar)).zza(zzgfaVar);
        }
        throw new GeneralSecurityException(m1.j("No Key Format serializer for ", zzgosVar.toString(), " available"));
    }

    public final boolean zzi(zzgop zzgopVar) {
        return this.zzb.containsKey(new zzgor(zzgopVar.getClass(), zzgopVar.zzd(), null));
    }

    public final boolean zzj(zzgop zzgopVar) {
        return this.zzd.containsKey(new zzgor(zzgopVar.getClass(), zzgopVar.zzd(), null));
    }
}
