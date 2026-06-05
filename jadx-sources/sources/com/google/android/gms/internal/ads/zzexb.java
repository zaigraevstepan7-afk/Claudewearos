package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import nc.t;
import nc.v3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzexb implements zzelg {
    protected final zzcgz zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzexr zzd;
    private final zzezk zze;
    private final rc.a zzf;
    private final ViewGroup zzg;
    private final zzfhp zzh;
    private final zzfcm zzi;
    private mf.a zzj;

    public zzexb(Context context, Executor executor, zzcgz zzcgzVar, zzezk zzezkVar, zzexr zzexrVar, zzfcm zzfcmVar, rc.a aVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgzVar;
        this.zze = zzezkVar;
        this.zzd = zzexrVar;
        this.zzi = zzfcmVar;
        this.zzf = aVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgzVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcuw zzm(zzezi zzeziVar) {
        zzewz zzewzVar = (zzewz) zzeziVar;
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzit)).booleanValue()) {
            zzcok zzcokVar = new zzcok(this.zzg);
            zzcuy zzcuyVar = new zzcuy();
            zzcuyVar.zzf(this.zzb);
            zzcuyVar.zzk(zzewzVar.zza);
            zzcva zzcvaVarZzl = zzcuyVar.zzl();
            zzdbn zzdbnVar = new zzdbn();
            zzexr zzexrVar = this.zzd;
            Executor executor = this.zzc;
            zzdbnVar.zzc(zzexrVar, executor);
            zzdbnVar.zzl(zzexrVar, executor);
            return zze(zzcokVar, zzcvaVarZzl, zzdbnVar.zzn());
        }
        zzexr zzexrVarZzi = zzexr.zzi(this.zzd);
        zzdbn zzdbnVar2 = new zzdbn();
        Executor executor2 = this.zzc;
        zzdbnVar2.zzb(zzexrVarZzi, executor2);
        zzdbnVar2.zzg(zzexrVarZzi, executor2);
        zzdbnVar2.zzh(zzexrVarZzi, executor2);
        zzdbnVar2.zzi(zzexrVarZzi, executor2);
        zzdbnVar2.zzc(zzexrVarZzi, executor2);
        zzdbnVar2.zzl(zzexrVarZzi, executor2);
        zzdbnVar2.zzm(zzexrVarZzi);
        zzcok zzcokVar2 = new zzcok(this.zzg);
        zzcuy zzcuyVar2 = new zzcuy();
        zzcuyVar2.zzf(this.zzb);
        zzcuyVar2.zzk(zzewzVar.zza);
        return zze(zzcokVar2, zzcuyVar2.zzl(), zzdbnVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza() {
        mf.a aVar = this.zzj;
        return (aVar == null || aVar.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    @Override // com.google.android.gms.internal.ads.zzelg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zzb(nc.q3 r10, java.lang.String r11, com.google.android.gms.internal.ads.zzele r12, com.google.android.gms.internal.ads.zzelf r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexb.zzb(nc.q3, java.lang.String, com.google.android.gms.internal.ads.zzele, com.google.android.gms.internal.ads.zzelf):boolean");
    }

    public abstract zzcuw zze(zzcok zzcokVar, zzcva zzcvaVar, zzdbp zzdbpVar);

    public final void zzl(v3 v3Var) {
        this.zzi.zzu(v3Var);
    }
}
