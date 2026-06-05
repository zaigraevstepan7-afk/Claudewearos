package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgqh implements zzgok {
    private static final zzgqh zza = new zzgqh();
    private static final zzgoe zzb = zzgoe.zzb(new zzgoc() { // from class: com.google.android.gms.internal.ads.zzgqd
        @Override // com.google.android.gms.internal.ads.zzgoc
        public final Object zza(zzgen zzgenVar) {
            return zzgrb.zza((zzgmr) zzgenVar);
        }
    }, zzgmr.class, zzgez.class);

    public static void zzc() {
        zzgnj.zza().zzd(zza);
        zzgnj.zza().zzc(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zza() {
        return zzgez.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zzb() {
        return zzgez.class;
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
                zzgez zzgezVar = (zzgez) zzgofVar.zza(zzgeuVarZzb);
                zzgen zzgenVarZzb = zzgeuVarZzb.zzb();
                if (zzgenVarZzb instanceof zzgqb) {
                    zzgwsVarZzc = ((zzgqb) zzgenVarZzb).zzd();
                } else {
                    if (!(zzgenVarZzb instanceof zzgmr)) {
                        throw new GeneralSecurityException(f.b("Cannot get output prefix for key of class ", zzgenVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzgenVarZzb.zza())));
                    }
                    zzgwsVarZzc = ((zzgmr) zzgenVarZzb).zzc();
                }
                zzgnxVar.zza(zzgwsVarZzc, new zzgqe(zzgezVar, zzgeuVarZzb.zza()));
            }
        }
        if (zzgmvVar.zza()) {
            zzgmwVar = zzgmz.zza;
            zzgmwVarZza = zzgmwVar;
        } else {
            zzgmx zzgmxVarZza = zzgnh.zzb().zza();
            zzgmw zzgmwVarZza2 = zzgmxVarZza.zza(zzgmmVar, zzgmvVar, "mac", "compute");
            zzgmwVarZza = zzgmxVarZza.zza(zzgmmVar, zzgmvVar, "mac", "verify");
            zzgmwVar = zzgmwVarZza2;
        }
        zzgew zzgewVar = (zzgew) zzgmmVar;
        return new zzgqf(new zzgqe((zzgez) zzgofVar.zza(zzgewVar.zzc()), zzgewVar.zzc().zza()), zzgnxVar.zzb(), zzgmwVar, zzgmwVarZza, null);
    }
}
