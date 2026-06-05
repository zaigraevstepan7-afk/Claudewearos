package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhak implements zzhaz {
    private final zzhag zza;
    private final zzhbl zzb;
    private final boolean zzc;
    private final zzgyg zzd;

    private zzhak(zzhbl zzhblVar, zzgyg zzgygVar, zzhag zzhagVar) {
        this.zzb = zzhblVar;
        this.zzc = zzhagVar instanceof zzgyr;
        this.zzd = zzgygVar;
        this.zza = zzhagVar;
    }

    public static zzhak zzc(zzhbl zzhblVar, zzgyg zzgygVar, zzhag zzhagVar) {
        return new zzhak(zzhblVar, zzgygVar, zzhagVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final int zza(Object obj) {
        int iZzb = ((zzgyv) obj).zzt.zzb();
        return this.zzc ? iZzb + ((zzgyr) obj).zza.zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final int zzb(Object obj) {
        int iHashCode = ((zzgyv) obj).zzt.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzgyr) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Object zze() {
        zzhag zzhagVar = this.zza;
        return zzhagVar instanceof zzgyv ? ((zzgyv) zzhagVar).zzbj() : zzhagVar.zzcY().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzg(Object obj, Object obj2) {
        zzhbb.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzhbb.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzh(Object obj, zzhat zzhatVar, zzgyf zzgyfVar) {
        this.zzb.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgxb zzgxbVar) {
        zzgyv zzgyvVar = (zzgyv) obj;
        if (zzgyvVar.zzt == zzhbm.zzc()) {
            zzgyvVar.zzt = zzhbm.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final void zzj(Object obj, zzhca zzhcaVar) {
        Iterator itZzf = ((zzgyr) obj).zza.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzgyj zzgyjVar = (zzgyj) entry.getKey();
            if (zzgyjVar.zzc() != zzhbz.MESSAGE || zzgyjVar.zze() || zzgyjVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzgzn) {
                zzhcaVar.zzw(zzgyjVar.zza(), ((zzgzn) entry).zza().zzb());
            } else {
                zzhcaVar.zzw(zzgyjVar.zza(), entry.getValue());
            }
        }
        ((zzgyv) obj).zzt.zzk(zzhcaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzgyv) obj).zzt.equals(((zzgyv) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzgyr) obj).zza.equals(((zzgyr) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final boolean zzl(Object obj) {
        return ((zzgyr) obj).zza.zzi();
    }
}
