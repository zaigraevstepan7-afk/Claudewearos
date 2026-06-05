package com.google.android.gms.internal.ads;

import android.os.Bundle;
import pc.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzdne implements nc.a, zzbit, m, zzbiv, pc.c {
    private nc.a zza;
    private zzbit zzb;
    private m zzc;
    private zzbiv zzd;
    private pc.c zze;

    @Override // nc.a
    public final synchronized void onAdClicked() {
        nc.a aVar = this.zza;
        if (aVar != null) {
            aVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbit
    public final synchronized void zza(String str, Bundle bundle) {
        zzbit zzbitVar = this.zzb;
        if (zzbitVar != null) {
            zzbitVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final synchronized void zzb(String str, String str2) {
        zzbiv zzbivVar = this.zzd;
        if (zzbivVar != null) {
            zzbivVar.zzb(str, str2);
        }
    }

    @Override // pc.m
    public final synchronized void zzdH() {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzdH();
        }
    }

    @Override // pc.m
    public final synchronized void zzdk() {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzdk();
        }
    }

    @Override // pc.m
    public final synchronized void zzds() {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzds();
        }
    }

    @Override // pc.m
    public final synchronized void zzdt() {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzdt();
        }
    }

    @Override // pc.m
    public final synchronized void zzdv() {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzdv();
        }
    }

    @Override // pc.m
    public final synchronized void zzdw(int i10) {
        m mVar = this.zzc;
        if (mVar != null) {
            mVar.zzdw(i10);
        }
    }

    @Override // pc.c
    public final synchronized void zzg() {
        pc.c cVar = this.zze;
        if (cVar != null) {
            cVar.zzg();
        }
    }

    public final synchronized void zzh(nc.a aVar, zzbit zzbitVar, m mVar, zzbiv zzbivVar, pc.c cVar) {
        this.zza = aVar;
        this.zzb = zzbitVar;
        this.zzc = mVar;
        this.zzd = zzbivVar;
        this.zze = cVar;
    }
}
