package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzos {
    private final zzbj zza;
    private zzfyf zzb = zzfyf.zzn();
    private zzfyi zzc = zzfyi.zzd();
    private zzvh zzd;
    private zzvh zze;
    private zzvh zzf;

    public zzos(zzbj zzbjVar) {
        this.zza = zzbjVar;
    }

    private static zzvh zzj(zzbh zzbhVar, zzfyf zzfyfVar, zzvh zzvhVar, zzbj zzbjVar) {
        zzbl zzblVarZzo = zzbhVar.zzo();
        int iZzf = zzbhVar.zzf();
        Object objZzf = zzblVarZzo.zzo() ? null : zzblVarZzo.zzf(iZzf);
        int iZzc = -1;
        if (!zzbhVar.zzx() && !zzblVarZzo.zzo()) {
            iZzc = zzblVarZzo.zzd(iZzf, zzbjVar, false).zzc(zzex.zzs(zzbhVar.zzl()));
        }
        int i10 = iZzc;
        for (int i11 = 0; i11 < zzfyfVar.size(); i11++) {
            zzvh zzvhVar2 = (zzvh) zzfyfVar.get(i11);
            if (zzm(zzvhVar2, objZzf, zzbhVar.zzx(), zzbhVar.zzc(), zzbhVar.zzd(), i10)) {
                return zzvhVar2;
            }
        }
        if (zzfyfVar.isEmpty() && zzvhVar != null && zzm(zzvhVar, objZzf, zzbhVar.zzx(), zzbhVar.zzc(), zzbhVar.zzd(), i10)) {
            return zzvhVar;
        }
        return null;
    }

    private final void zzk(zzfyh zzfyhVar, zzvh zzvhVar, zzbl zzblVar) {
        if (zzvhVar == null) {
            return;
        }
        if (zzblVar.zza(zzvhVar.zza) != -1) {
            zzfyhVar.zza(zzvhVar, zzblVar);
            return;
        }
        zzbl zzblVar2 = (zzbl) this.zzc.get(zzvhVar);
        if (zzblVar2 != null) {
            zzfyhVar.zza(zzvhVar, zzblVar2);
        }
    }

    private final void zzl(zzbl zzblVar) {
        zzfyh zzfyhVar = new zzfyh();
        if (this.zzb.isEmpty()) {
            zzk(zzfyhVar, this.zze, zzblVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzfyhVar, this.zzf, zzblVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzfyhVar, this.zzd, zzblVar);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzfyhVar, (zzvh) this.zzb.get(i10), zzblVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfyhVar, this.zzd, zzblVar);
            }
        }
        this.zzc = zzfyhVar.zzc();
    }

    private static boolean zzm(zzvh zzvhVar, Object obj, boolean z2, int i10, int i11, int i12) {
        if (zzvhVar.zza.equals(obj)) {
            return z2 ? zzvhVar.zzb == i10 && zzvhVar.zzc == i11 : zzvhVar.zzb == -1 && zzvhVar.zze == i12;
        }
        return false;
    }

    public final zzbl zza(zzvh zzvhVar) {
        return (zzbl) this.zzc.get(zzvhVar);
    }

    public final zzvh zzb() {
        return this.zzd;
    }

    public final zzvh zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfyf zzfyfVar = this.zzb;
        if (zzfyfVar == null) {
            Iterator<E> it = zzfyfVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else {
            if (zzfyfVar.isEmpty()) {
                throw new NoSuchElementException();
            }
            obj = zzfyfVar.get(zzfyfVar.size() - 1);
        }
        return (zzvh) obj;
    }

    public final zzvh zzd() {
        return this.zze;
    }

    public final zzvh zze() {
        return this.zzf;
    }

    public final void zzg(zzbh zzbhVar) {
        this.zzd = zzj(zzbhVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzvh zzvhVar, zzbh zzbhVar) {
        this.zzb = zzfyf.zzl(list);
        if (!list.isEmpty()) {
            this.zze = (zzvh) list.get(0);
            zzvhVar.getClass();
            this.zzf = zzvhVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzbhVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzbhVar.zzo());
    }

    public final void zzi(zzbh zzbhVar) {
        this.zzd = zzj(zzbhVar, this.zzb, this.zze, this.zza);
        zzl(zzbhVar.zzo());
    }
}
