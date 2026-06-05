package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbch;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mc.n;
import nc.q3;
import nc.t;
import nc.v3;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfec implements zzfeb {
    private final ConcurrentHashMap zza;
    private final zzfei zzb;
    private final zzfee zzc = new zzfee();

    public zzfec(zzfei zzfeiVar) {
        this.zza = new ConcurrentHashMap(zzfeiVar.zzd);
        this.zzb = zzfeiVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfei> creator = zzfei.CREATOR;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgw)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            zzfei zzfeiVar = this.zzb;
            sb2.append(zzfeiVar.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzb());
            int i10 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i10++;
                sb2.append(i10);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfel) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i11 = 0; i11 < ((zzfea) entry.getValue()).zzb(); i11++) {
                    sb2.append("[O]");
                }
                for (int iZzb = ((zzfea) entry.getValue()).zzb(); iZzb < zzfeiVar.zzd; iZzb++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfea) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i10 < zzfeiVar.zzc) {
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
            }
            String string = sb2.toString();
            int i12 = l0.f13401b;
            k.b(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    public final zzfei zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    public final synchronized zzfek zzb(zzfel zzfelVar) {
        zzfek zzfekVarZze;
        try {
            zzfea zzfeaVar = (zzfea) this.zza.get(zzfelVar);
            if (zzfeaVar != null) {
                zzfekVarZze = zzfeaVar.zze();
                if (zzfekVarZze == null) {
                    this.zzc.zze();
                }
                zzfey zzfeyVarZzf = zzfeaVar.zzf();
                if (zzfekVarZze != null) {
                    zzbch.zzb.zzc zzcVarZzd = zzbch.zzb.zzd();
                    zzbch.zzb.zza.C0003zza c0003zzaZza = zzbch.zzb.zza.zza();
                    c0003zzaZza.zzf(zzbch.zzb.zzd.IN_MEMORY);
                    zzbch.zzb.zze.zza zzaVarZzb = zzbch.zzb.zze.zzb();
                    zzaVarZzb.zzd(zzfeyVarZzf.zza);
                    zzaVarZzb.zze(zzfeyVarZzf.zzb);
                    c0003zzaZza.zzg(zzaVarZzb);
                    zzcVarZzd.zzd(c0003zzaZza);
                    zzfekVarZze.zza.zzb().zzc().zzi(zzcVarZzd.zzbr());
                }
                zzf();
            } else {
                this.zzc.zzf();
                zzf();
                zzfekVarZze = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzfekVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    @Deprecated
    public final zzfel zzc(q3 q3Var, String str, v3 v3Var) {
        zzfei zzfeiVar = this.zzb;
        return new zzfem(q3Var, str, new zzbvr(zzfeiVar.zza).zza().zzj, zzfeiVar.zzf, v3Var);
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    public final synchronized boolean zzd(zzfel zzfelVar, zzfek zzfekVar) {
        boolean zZzh;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfea zzfeaVar = (zzfea) concurrentHashMap.get(zzfelVar);
            n.D.f11584k.getClass();
            zzfekVar.zzd = System.currentTimeMillis();
            if (zzfeaVar == null) {
                zzfei zzfeiVar = this.zzb;
                zzfea zzfeaVar2 = new zzfea(zzfeiVar.zzd, zzfeiVar.zze * zzbch.zzq.zzf);
                if (concurrentHashMap.size() == zzfeiVar.zzc) {
                    int i10 = zzfeiVar.zzg;
                    int i11 = i10 - 1;
                    zzfel zzfelVar2 = null;
                    if (i10 == 0) {
                        throw null;
                    }
                    long jZzc = Long.MAX_VALUE;
                    if (i11 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfea) entry.getValue()).zzc() < jZzc) {
                                jZzc = ((zzfea) entry.getValue()).zzc();
                                zzfelVar2 = (zzfel) entry.getKey();
                            }
                        }
                        if (zzfelVar2 != null) {
                            concurrentHashMap.remove(zzfelVar2);
                        }
                    } else if (i11 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfea) entry2.getValue()).zzd() < jZzc) {
                                jZzc = ((zzfea) entry2.getValue()).zzd();
                                zzfelVar2 = (zzfel) entry2.getKey();
                            }
                        }
                        if (zzfelVar2 != null) {
                            concurrentHashMap.remove(zzfelVar2);
                        }
                    } else if (i11 == 2) {
                        int iZza = f.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfea) entry3.getValue()).zza() < iZza) {
                                iZza = ((zzfea) entry3.getValue()).zza();
                                zzfelVar2 = (zzfel) entry3.getKey();
                            }
                        }
                        if (zzfelVar2 != null) {
                            concurrentHashMap.remove(zzfelVar2);
                        }
                    }
                    this.zzc.zzg();
                }
                concurrentHashMap.put(zzfelVar, zzfeaVar2);
                this.zzc.zzd();
                zzfeaVar = zzfeaVar2;
            }
            zZzh = zzfeaVar.zzh(zzfekVar);
            zzfee zzfeeVar = this.zzc;
            zzfeeVar.zzc();
            zzfed zzfedVarZza = zzfeeVar.zza();
            zzfey zzfeyVarZzf = zzfeaVar.zzf();
            zzbch.zzb.zzc zzcVarZzd = zzbch.zzb.zzd();
            zzbch.zzb.zza.C0003zza c0003zzaZza = zzbch.zzb.zza.zza();
            c0003zzaZza.zzf(zzbch.zzb.zzd.IN_MEMORY);
            zzbch.zzb.zzg.zza zzaVarZzb = zzbch.zzb.zzg.zzb();
            zzaVarZzb.zze(zzfedVarZza.zza);
            zzaVarZzb.zzf(zzfedVarZza.zzb);
            zzaVarZzb.zzg(zzfeyVarZzf.zzb);
            c0003zzaZza.zzi(zzaVarZzb);
            zzcVarZzd.zzd(c0003zzaZza);
            zzfekVar.zza.zzb().zzc().zzj(zzcVarZzd.zzbr());
            zzf();
        } catch (Throwable th2) {
            throw th2;
        }
        return zZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfeb
    public final synchronized boolean zze(zzfel zzfelVar) {
        zzfea zzfeaVar = (zzfea) this.zza.get(zzfelVar);
        if (zzfeaVar == null) {
            return true;
        }
        return zzfeaVar.zzb() < this.zzb.zzd;
    }
}
