package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgnc {
    public static final /* synthetic */ int zza = 0;
    private static final zzgnb zzb = new zzgnb() { // from class: com.google.android.gms.internal.ads.zzgna
        @Override // com.google.android.gms.internal.ads.zzgnb
        public final zzgen zza(zzgfa zzgfaVar, Integer num) throws GeneralSecurityException {
            int i10 = zzgnc.zza;
            zzgtt zzgttVarZzc = ((zzgms) zzgfaVar).zzb().zzc();
            zzgeo zzgeoVarZzb = zzgmd.zzc().zzb(zzgttVarZzc.zzi());
            if (!zzgmd.zzc().zze(zzgttVarZzc.zzi())) {
                throw new GeneralSecurityException("Creating new keys is not allowed.");
            }
            zzgtp zzgtpVarZza = zzgeoVarZzb.zza(zzgttVarZzc.zzh());
            return new zzgmr(zzgol.zza(zzgtpVarZza.zzg(), zzgtpVarZza.zzf(), zzgtpVarZza.zzb(), zzgttVarZzc.zzg(), num), zzgem.zza());
        }
    };
    private static final zzgnc zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgnc zzb() {
        return zzc;
    }

    private final synchronized zzgen zzd(zzgfa zzgfaVar, Integer num) {
        zzgnb zzgnbVar;
        zzgnbVar = (zzgnb) this.zzd.get(zzgfaVar.getClass());
        if (zzgnbVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + zzgfaVar.toString() + ": no key creator for this class was registered.");
        }
        return zzgnbVar.zza(zzgfaVar, num);
    }

    private static zzgnc zze() {
        zzgnc zzgncVar = new zzgnc();
        try {
            zzgncVar.zzc(zzb, zzgms.class);
            return zzgncVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    public final zzgen zza(zzgfa zzgfaVar, Integer num) {
        return zzd(zzgfaVar, num);
    }

    public final synchronized void zzc(zzgnb zzgnbVar, Class cls) {
        try {
            Map map = this.zzd;
            zzgnb zzgnbVar2 = (zzgnb) map.get(cls);
            if (zzgnbVar2 != null && !zzgnbVar2.equals(zzgnbVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls.toString() + " already inserted");
            }
            map.put(cls, zzgnbVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
