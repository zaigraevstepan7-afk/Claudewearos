package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzget {
    private final List zza = new ArrayList();
    private final zzgmv zzb = zzgmv.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzger) it.next()).zza = false;
        }
    }

    public final zzget zza(zzger zzgerVar) {
        if (zzgerVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgerVar.zza) {
            zzd();
        }
        zzgerVar.zzf = this;
        this.zza.add(zzgerVar);
        return this;
    }

    public final zzgew zzb() throws GeneralSecurityException {
        int i10;
        int i11;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c6 = 1;
        this.zzc = true;
        List<zzger> list = this.zza;
        zzgtx zzgtxVarZzc = zzgub.zzc();
        ArrayList arrayList = new ArrayList(list.size());
        int i12 = 0;
        int i13 = 0;
        while (i13 < list.size() - 1) {
            int i14 = i13 + 1;
            if (((zzger) list.get(i13)).zze == zzges.zza && ((zzger) list.get(i14)).zze != zzges.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i13 = i14;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzger zzgerVar : list) {
            zzgep unused = zzgerVar.zzb;
            if (zzgerVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzgerVar.zze == zzges.zza) {
                int i15 = i12;
                while (true) {
                    if (i15 != 0 && !hashSet.contains(Integer.valueOf(i15))) {
                        break;
                    }
                    int i16 = zzgox.zza;
                    i15 = i12;
                    while (i15 == 0) {
                        byte[] bArrZzb = zzgoo.zzb(4);
                        i15 = (bArrZzb[3] & 255) | ((bArrZzb[i12] & 255) << 24) | ((bArrZzb[c6] & 255) << 16) | ((bArrZzb[2] & 255) << 8);
                    }
                }
                i10 = i15;
            } else {
                zzges unused2 = zzgerVar.zze;
                i10 = i12;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(m6.a.e(i10, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzger.zza(zzgerVar);
            zzgen zzgenVarZza = zzgnc.zzb().zza(zzgerVar.zzd, c6 != zzgerVar.zzd.zza() ? null : numValueOf);
            zzgeu zzgeuVar = new zzgeu(zzgenVarZza, zzgerVar.zzb, i10, zzgerVar.zza, null);
            int i17 = i10;
            zzgep zzgepVar = zzgerVar.zzb;
            zzgol zzgolVar = (zzgol) zzgnm.zzc().zzd(zzgenVarZza, zzgol.class, zzgfb.zza());
            Integer numZzf = zzgolVar.zzf();
            if (numZzf != null && numZzf.intValue() != i17) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            zzgep zzgepVar2 = zzgep.zza;
            if (zzgepVar2.equals(zzgepVar)) {
                i11 = 3;
            } else if (zzgep.zzb.equals(zzgepVar)) {
                i11 = 4;
            } else {
                if (!zzgep.zzc.equals(zzgepVar)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i11 = 5;
            }
            zzgty zzgtyVarZzc = zzgtz.zzc();
            zzgtm zzgtmVarZza = zzgtp.zza();
            zzgtmVarZza.zzb(zzgolVar.zzg());
            zzgtmVarZza.zzc(zzgolVar.zze());
            zzgtmVarZza.zza(zzgolVar.zzb());
            zzgtyVarZzc.zza(zzgtmVarZza);
            zzgtyVarZzc.zzd(i11);
            zzgtyVarZzc.zzb(i17);
            zzgtyVarZzc.zzc(zzgolVar.zzc());
            zzgtxVarZzc.zza((zzgtz) zzgtyVarZzc.zzbr());
            if (zzgerVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgerVar.zzb != zzgepVar2) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzgeuVar);
            c6 = 1;
            i12 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzgtxVarZzc.zzb(num.intValue());
        zzgub zzgubVar = (zzgub) zzgtxVarZzc.zzbr();
        zzgew.zzj(zzgubVar);
        return new zzgew(zzgubVar, arrayList, this.zzb);
    }
}
