package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzls {
    private static final zzvh zzu = new zzvh(new Object(), -1);
    public final zzbl zza;
    public final zzvh zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zzin zzf;
    public final boolean zzg;
    public final zzxk zzh;
    public final zzze zzi;
    public final List zzj;
    public final zzvh zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbb zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzls(zzbl zzblVar, zzvh zzvhVar, long j, long j4, int i10, zzin zzinVar, boolean z2, zzxk zzxkVar, zzze zzzeVar, List list, zzvh zzvhVar2, boolean z10, int i11, int i12, zzbb zzbbVar, long j10, long j11, long j12, long j13, boolean z11) {
        this.zza = zzblVar;
        this.zzb = zzvhVar;
        this.zzc = j;
        this.zzd = j4;
        this.zze = i10;
        this.zzf = zzinVar;
        this.zzg = z2;
        this.zzh = zzxkVar;
        this.zzi = zzzeVar;
        this.zzj = list;
        this.zzk = zzvhVar2;
        this.zzl = z10;
        this.zzm = i11;
        this.zzn = i12;
        this.zzo = zzbbVar;
        this.zzq = j10;
        this.zzr = j11;
        this.zzs = j12;
        this.zzt = j13;
    }

    public static zzls zzh(zzze zzzeVar) {
        zzbl zzblVar = zzbl.zza;
        zzvh zzvhVar = zzu;
        return new zzls(zzblVar, zzvhVar, -9223372036854775807L, 0L, 1, null, false, zzxk.zza, zzzeVar, zzfyf.zzn(), zzvhVar, false, 1, 0, zzbb.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzvh zzi() {
        return zzu;
    }

    public final zzls zza(boolean z2) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, z2, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzls zzb(zzvh zzvhVar) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzvhVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzls zzc(zzvh zzvhVar, long j, long j4, long j10, long j11, zzxk zzxkVar, zzze zzzeVar, List list) {
        zzvh zzvhVar2 = this.zzk;
        boolean z2 = this.zzl;
        int i10 = this.zzm;
        int i11 = this.zzn;
        zzbb zzbbVar = this.zzo;
        long j12 = this.zzq;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzls(this.zza, zzvhVar, j4, j10, this.zze, this.zzf, this.zzg, zzxkVar, zzzeVar, list, zzvhVar2, z2, i10, i11, zzbbVar, j12, j11, j, jElapsedRealtime, false);
    }

    public final zzls zzd(boolean z2, int i10, int i11) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z2, i10, i11, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzls zze(zzin zzinVar) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzinVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzls zzf(int i10) {
        return new zzls(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final zzls zzg(zzbl zzblVar) {
        return new zzls(zzblVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzj() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
