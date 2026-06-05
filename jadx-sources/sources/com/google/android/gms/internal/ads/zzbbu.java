package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbbu implements com.google.android.gms.common.internal.b {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbbm zza;
    final /* synthetic */ zzcai zzb;
    final /* synthetic */ zzbbw zzc;

    public zzbbu(zzbbw zzbbwVar, zzbbm zzbbmVar, zzcai zzcaiVar) {
        this.zza = zzbbmVar;
        this.zzb = zzcaiVar;
        this.zzc = zzbbwVar;
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        zzbbw zzbbwVar = this.zzc;
        synchronized (zzbbwVar.zzd) {
            try {
                if (zzbbwVar.zzb) {
                    return;
                }
                zzbbwVar.zzb = true;
                final zzbbl zzbblVar = zzbbwVar.zza;
                if (zzbblVar == null) {
                    return;
                }
                zzgdm zzgdmVar = zzcad.zza;
                final zzbbm zzbbmVar = this.zza;
                final zzcai zzcaiVar = this.zzb;
                final mf.a aVarZza = zzgdmVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbr
                    @Override // java.lang.Runnable
                    public final void run() throws IOException {
                        zzbbu zzbbuVar = this.zza;
                        zzbbl zzbblVar2 = zzbblVar;
                        zzcai zzcaiVar2 = zzcaiVar;
                        try {
                            zzbbo zzbboVarZzq = zzbblVar2.zzq();
                            boolean zZzp = zzbblVar2.zzp();
                            zzbbm zzbbmVar2 = zzbbmVar;
                            zzbbj zzbbjVarZzg = zZzp ? zzbboVarZzq.zzg(zzbbmVar2) : zzbboVarZzq.zzf(zzbbmVar2);
                            if (!zzbbjVarZzg.zze()) {
                                zzcaiVar2.zzd(new RuntimeException("No entry contents."));
                                zzbbw.zze(zzbbuVar.zzc);
                                return;
                            }
                            zzbbt zzbbtVar = new zzbbt(zzbbuVar, zzbbjVarZzg.zzc(), 1);
                            int i10 = zzbbtVar.read();
                            if (i10 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbbtVar.unread(i10);
                            zzcaiVar2.zzc(zzbby.zzb(zzbbtVar, zzbbjVarZzg.zzd(), zzbbjVarZzg.zzg(), zzbbjVarZzg.zza(), zzbbjVarZzg.zzf()));
                        } catch (RemoteException e10) {
                            e = e10;
                            int i11 = l0.f13401b;
                            k.e("Unable to obtain a cache service instance.", e);
                            zzcaiVar2.zzd(e);
                            zzbbw.zze(zzbbuVar.zzc);
                        } catch (IOException e11) {
                            e = e11;
                            int i112 = l0.f13401b;
                            k.e("Unable to obtain a cache service instance.", e);
                            zzcaiVar2.zzd(e);
                            zzbbw.zze(zzbbuVar.zzc);
                        }
                    }
                });
                zzcaiVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zzcaiVar.isCancelled()) {
                            aVarZza.cancel(true);
                        }
                    }
                }, zzcad.zzg);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i10) {
    }
}
