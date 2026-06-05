package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Iterator;
import java.util.Map;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzuj implements zzwa {
    private final zzady zza;
    private zzadt zzb;
    private zzadu zzc;

    public zzuj(zzady zzadyVar) {
        this.zza = zzadyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final int zza(zzaep zzaepVar) {
        zzadt zzadtVar = this.zzb;
        zzadtVar.getClass();
        zzadu zzaduVar = this.zzc;
        zzaduVar.getClass();
        return zzadtVar.zzb(zzaduVar, zzaepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        zzadu zzaduVar = this.zzc;
        if (zzaduVar != null) {
            return zzaduVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzc() {
        zzadt zzadtVar = this.zzb;
        if (zzadtVar != null && (zzadtVar instanceof zzaic)) {
            ((zzaic) zzadtVar).zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzd(zzl zzlVar, Uri uri, Map map, long j, long j4, zzadw zzadwVar) throws zzxl {
        zzadj zzadjVar = new zzadj(zzlVar, j, j4);
        this.zzc = zzadjVar;
        if (this.zzb != null) {
            return;
        }
        zzadt[] zzadtVarArrZza = this.zza.zza(uri, map);
        int length = zzadtVarArrZza.length;
        zzfyc zzfycVarZzi = zzfyf.zzi(length);
        if (length == 1) {
            this.zzb = zzadtVarArrZza[0];
        } else {
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                zzadt zzadtVar = zzadtVarArrZza[i10];
                try {
                } catch (EOFException unused) {
                    if (this.zzb != null || zzadjVar.zzf() == j) {
                    }
                } catch (Throwable th2) {
                    zzdd.zzf(this.zzb != null || zzadjVar.zzf() == j);
                    zzadjVar.zzj();
                    throw th2;
                }
                if (zzadtVar.zzi(zzadjVar)) {
                    this.zzb = zzadtVar;
                    zzdd.zzf(true);
                    zzadjVar.zzj();
                    break;
                } else {
                    zzfycVarZzi.zzh(zzadtVar.zzd());
                    boolean z2 = this.zzb != null || zzadjVar.zzf() == j;
                    zzdd.zzf(z2);
                    zzadjVar.zzj();
                    i10++;
                }
            }
            if (this.zzb == null) {
                Iterator it = zzfyv.zzc(zzfyf.zzm(zzadtVarArrZza), new zzfut() { // from class: com.google.android.gms.internal.ads.zzui
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj) {
                        zzadt zzadtVar2 = (zzadt) obj;
                        zzadtVar2.zzc();
                        return zzadtVar2.getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb2 = new StringBuilder();
                zzfuw.zzc(sb2, it, ", ");
                throw new zzxl(m1.j("None of the available extractors (", sb2.toString(), ") could read the stream."), uri, zzfycVarZzi.zzi());
            }
        }
        this.zzb.zze(zzadwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzf(long j, long j4) {
        zzadt zzadtVar = this.zzb;
        zzadtVar.getClass();
        zzadtVar.zzf(j, j4);
    }
}
