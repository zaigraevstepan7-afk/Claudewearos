package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import nc.t;
import rc.j;
import rc.n;
import rc.o;
import rc.r;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfjh {
    private final r zza;
    private final o zzb;
    private final zzgdn zzc;
    private final zzfji zzd;

    public zzfjh(r rVar, o oVar, zzgdn zzgdnVar, zzfji zzfjiVar) {
        this.zza = rVar;
        this.zzb = oVar;
        this.zzc = zzgdnVar;
        this.zzd = zzfjiVar;
    }

    public static mf.a zzc(zzfjh zzfjhVar, int i10, long j, String str, n nVar) {
        if (nVar != n.f14355c) {
            return zzgdb.zzh(nVar);
        }
        r rVar = zzfjhVar.zza;
        long j4 = ((j) rVar).f14349b;
        if (i10 != 1) {
            j4 = (long) (((j) rVar).f14350c * j);
        }
        return zzfjhVar.zze(str, j4, i10 + 1);
    }

    private final mf.a zze(final String str, final long j, final int i10) {
        final String strW;
        r rVar = this.zza;
        if (i10 > ((j) rVar).f14348a) {
            zzfji zzfjiVar = this.zzd;
            if (zzfjiVar == null || !((j) rVar).f14351d) {
                return zzgdb.zzh(n.f14355c);
            }
            zzfjiVar.zza(str, "", 2);
            return zzgdb.zzh(n.f14356d);
        }
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zziO)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i10));
            strW = m1.w(String.valueOf(builderClearQuery.build()), "&", encodedQuery);
        } else {
            strW = str;
        }
        zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzfjg
            @Override // com.google.android.gms.internal.ads.zzgci
            public final mf.a zza(Object obj) {
                return zzfjh.zzc(this.zza, i10, j, str, (n) obj);
            }
        };
        if (j == 0) {
            zzgdn zzgdnVar = this.zzc;
            return zzgdb.zzn(zzgdnVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzb.zza(strW);
                }
            }), zzgciVar, zzgdnVar);
        }
        zzgdn zzgdnVar2 = this.zzc;
        return zzgdb.zzn(zzgdnVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfje
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb.zza(strW);
            }
        }, j, TimeUnit.MILLISECONDS), zzgciVar, zzgdnVar2);
    }

    public final mf.a zzd(String str) {
        try {
            return zze(str, 0L, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return zzgdb.zzh(n.f14354b);
        }
    }
}
