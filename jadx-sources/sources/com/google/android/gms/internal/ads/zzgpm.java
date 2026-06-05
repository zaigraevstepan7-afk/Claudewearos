package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import y8.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgpm implements zzgok {
    private static final zzgpm zza = new zzgpm();

    private zzgpm() {
    }

    public static void zzc() {
        zzgnj.zza().zzd(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zza() {
        return zzgpj.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final Class zzb() {
        return zzgpj.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgok
    public final /* bridge */ /* synthetic */ Object zze(zzgmm zzgmmVar, zzgmv zzgmvVar, zzgof zzgofVar) throws GeneralSecurityException {
        zzgws zzgwsVarZzc;
        zzgeu zzgeuVarZzc = ((zzgew) zzgmmVar).zzc();
        zzgnx zzgnxVar = new zzgnx();
        for (int i10 = 0; i10 < zzgmmVar.zza(); i10++) {
            zzgeu zzgeuVarZzb = ((zzgew) zzgmmVar).zzb(i10);
            if (zzgeuVarZzb.zzc().equals(zzgep.zza)) {
                zzgpj zzgpjVar = (zzgpj) zzgofVar.zza(zzgeuVarZzb);
                zzgen zzgenVarZzb = zzgeuVarZzb.zzb();
                if (zzgenVarZzb instanceof zzgqb) {
                    zzgwsVarZzc = ((zzgqb) zzgenVarZzb).zzd();
                } else {
                    if (!(zzgenVarZzb instanceof zzgmr)) {
                        throw new GeneralSecurityException(f.b("Cannot get output prefix for key of class ", zzgenVarZzb.getClass().getName(), " with parameters ", String.valueOf(zzgenVarZzb.zza())));
                    }
                    zzgwsVarZzc = ((zzgmr) zzgenVarZzb).zzc();
                }
                zzgnxVar.zza(zzgwsVarZzc, zzgpjVar);
            }
        }
        return new zzgpk(zzgnxVar.zzb(), (zzgpj) zzgofVar.zza(zzgeuVarZzc), null);
    }
}
