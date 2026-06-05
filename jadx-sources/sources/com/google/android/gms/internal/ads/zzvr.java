package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzvr {
    public final int zza;
    public final zzvh zzb;
    private final CopyOnWriteArrayList zzc;

    private zzvr(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzvh zzvhVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzvhVar;
    }

    public final zzvr zza(int i10, zzvh zzvhVar) {
        return new zzvr(this.zzc, 0, zzvhVar);
    }

    public final void zzb(Handler handler, zzvs zzvsVar) {
        this.zzc.add(new zzvq(handler, zzvsVar));
    }

    public final void zzc(final zzdn zzdnVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzvq zzvqVar = (zzvq) it.next();
            final zzvs zzvsVar = zzvqVar.zzb;
            zzex.zzP(zzvqVar.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzvp
                @Override // java.lang.Runnable
                public final void run() {
                    zzdnVar.zza(zzvsVar);
                }
            });
        }
    }

    public final void zzd(final zzvd zzvdVar) {
        zzc(new zzdn() { // from class: com.google.android.gms.internal.ads.zzvk
            @Override // com.google.android.gms.internal.ads.zzdn
            public final void zza(Object obj) {
                ((zzvs) obj).zzag(0, this.zza.zzb, zzvdVar);
            }
        });
    }

    public final void zze(final zzuy zzuyVar, final zzvd zzvdVar) {
        zzc(new zzdn() { // from class: com.google.android.gms.internal.ads.zzvo
            @Override // com.google.android.gms.internal.ads.zzdn
            public final void zza(Object obj) {
                ((zzvs) obj).zzah(0, this.zza.zzb, zzuyVar, zzvdVar);
            }
        });
    }

    public final void zzf(final zzuy zzuyVar, final zzvd zzvdVar) {
        zzc(new zzdn() { // from class: com.google.android.gms.internal.ads.zzvm
            @Override // com.google.android.gms.internal.ads.zzdn
            public final void zza(Object obj) {
                ((zzvs) obj).zzai(0, this.zza.zzb, zzuyVar, zzvdVar);
            }
        });
    }

    public final void zzg(final zzuy zzuyVar, final zzvd zzvdVar, final IOException iOException, final boolean z2) {
        zzc(new zzdn() { // from class: com.google.android.gms.internal.ads.zzvn
            @Override // com.google.android.gms.internal.ads.zzdn
            public final void zza(Object obj) {
                ((zzvs) obj).zzaj(0, this.zza.zzb, zzuyVar, zzvdVar, iOException, z2);
            }
        });
    }

    public final void zzh(final zzuy zzuyVar, final zzvd zzvdVar, final int i10) {
        zzc(new zzdn() { // from class: com.google.android.gms.internal.ads.zzvl
            @Override // com.google.android.gms.internal.ads.zzdn
            public final void zza(Object obj) {
                ((zzvs) obj).zzak(0, this.zza.zzb, zzuyVar, zzvdVar, i10);
            }
        });
    }

    public final void zzi(zzvs zzvsVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzvq zzvqVar = (zzvq) it.next();
            if (zzvqVar.zzb == zzvsVar) {
                copyOnWriteArrayList.remove(zzvqVar);
            }
        }
    }

    public zzvr() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
