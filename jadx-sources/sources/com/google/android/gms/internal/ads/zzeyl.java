package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeyl implements zzezk {
    private zzcux zza;
    private final Executor zzb = zzgdt.zzc();

    public final zzcux zza() {
        return this.zza;
    }

    public final mf.a zzb(zzezl zzezlVar, zzezj zzezjVar, zzcux zzcuxVar) {
        zzcuw zzcuwVarZza = zzezjVar.zza(zzezlVar.zzb);
        zzcuwVarZza.zzb(new zzezo(true));
        zzcux zzcuxVar2 = (zzcux) zzcuwVarZza.zzh();
        this.zza = zzcuxVar2;
        final zzcrz zzcrzVarZzb = zzcuxVar2.zzb();
        final zzfek zzfekVar = new zzfek();
        zzgcs zzgcsVarZzw = zzgcs.zzw(zzcrzVarZzb.zzi());
        zzgci zzgciVar = new zzgci(this) { // from class: com.google.android.gms.internal.ads.zzeyj
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                zzfcf zzfcfVar = (zzfcf) obj;
                zzfekVar.zzb = zzfcfVar;
                Iterator it = zzfcfVar.zzb.zza.iterator();
                boolean z2 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((zzfbt) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z2 = true;
                        }
                    } else if (z2) {
                        return zzcrzVarZzb.zzh(zzgdb.zzh(zzfcfVar));
                    }
                }
                return zzgdb.zzh(null);
            }
        };
        Executor executor = this.zzb;
        return (zzgcs) zzgdb.zzm((zzgcs) zzgdb.zzn(zzgcsVarZzw, zzgciVar, executor), new zzfut() { // from class: com.google.android.gms.internal.ads.zzeyk
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                zzfek zzfekVar2 = zzfekVar;
                zzfekVar2.zzc = (zzcqv) obj;
                return zzfekVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* bridge */ /* synthetic */ mf.a zzc(zzezl zzezlVar, zzezj zzezjVar, Object obj) {
        return zzb(zzezlVar, zzezjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
