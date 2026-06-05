package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgft implements zzgok {
    private static final zzgft zza = new zzgft();
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgfp
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzgla.zzb((zzgmr) zzgenVar);
        }
    }, zzgmr.class, zzgeh.class);

    public static void zzc() {
        zzgnj.zza().zzd(zza);
        zzgnj.zza().zzc(zzb);
    }

    public static void zzd(zzgog zzgogVar) {
        zzgogVar.zzb(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zza() {
        return zzgeh.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zzb() {
        return zzgeh.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final /* bridge */ /* synthetic */ Object zze(zzgmm zzgmmVar, zzgmv zzgmvVar, zzgof zzgofVar) throws GeneralSecurityException {
        zzgmw zzgmwVar;
        zzgmw zzgmwVarZza;
        zzgws zzgwsVarZzc;
        zzgnx zzgnxVar = new zzgnx();
        for (int i10 = 0; i10 < zzgmmVar.zza(); i10++) {
            zzgeu zzgeuVarZzb = ((zzgew) zzgmmVar).zzb(i10);
            if (zzgeuVarZzb.zzc().equals(zzgep.zza)) {
                zzgen zzgenVarZzb = zzgeuVarZzb.zzb();
                if (zzgenVarZzb instanceof zzgfn) {
                    zzgwsVarZzc = ((zzgfn) zzgenVarZzb).zzb();
                } else {
                    if (!(zzgenVarZzb instanceof zzgmr)) {
                        throw new GeneralSecurityException(f.b("Cannot get output prefix for key of class ", zzgenVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzgenVarZzb.zza())));
                    }
                    zzgwsVarZzc = ((zzgmr) zzgenVarZzb).zzc();
                }
                zzgnxVar.zza(zzgwsVarZzc, new zzgfq((zzgeh) zzgofVar.zza(zzgeuVarZzb), zzgeuVarZzb.zza()));
            }
        }
        if (zzgmvVar.zza()) {
            zzgmwVar = zzgmz.zza;
            zzgmwVarZza = zzgmwVar;
        } else {
            zzgmx zzgmxVarZza = zzgnh.zzb().zza();
            zzgmw zzgmwVarZza2 = zzgmxVarZza.zza(zzgmmVar, zzgmvVar, "aead", "encrypt");
            zzgmwVarZza = zzgmxVarZza.zza(zzgmmVar, zzgmvVar, "aead", "decrypt");
            zzgmwVar = zzgmwVarZza2;
        }
        zzgew zzgewVar = (zzgew) zzgmmVar;
        return new zzgfr(new zzgfq((zzgeh) zzgofVar.zza(zzgewVar.zzc()), zzgewVar.zzc().zza()), zzgnxVar.zzb(), zzgmwVar, zzgmwVarZza, null);
    }
}
