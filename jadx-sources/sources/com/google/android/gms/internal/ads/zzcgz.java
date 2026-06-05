package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import mc.n;
import nc.t;
import qc.g0;
import qc.o0;
import xc.l;
import xc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzcgz implements zzcky {
    private static zzcgz zza;

    private static synchronized zzcgz zzE(Context context, zzbpo zzbpoVar, int i10, boolean z2, int i11, zzcif zzcifVar) {
        try {
            zzcgz zzcgzVar = zza;
            if (zzcgzVar != null) {
                return zzcgzVar;
            }
            n nVar = n.D;
            nVar.f11584k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbdc.zza(context);
            if (((Boolean) zzbeu.zze.zze()).booleanValue()) {
                zzbcm.zzd(context);
            }
            zzfdk zzfdkVarZzd = zzfdk.zzd(context);
            rc.a aVarZzc = zzfdkVarZzd.zzc(ModuleDescriptor.MODULE_VERSION, false, i11);
            zzfdkVarZzd.zzf(zzbpoVar);
            zzciu zzciuVar = new zzciu(null);
            zzcha zzchaVar = new zzcha();
            zzchaVar.zzf(aVarZzc);
            zzchaVar.zze(context);
            zzchaVar.zzd(jCurrentTimeMillis);
            zzciuVar.zzb(new zzchc(zzchaVar, null));
            zzciuVar.zzc(new zzcjo(zzcifVar));
            zzcgz zzcgzVarZza = zzciuVar.zza();
            zzbct zzbctVar = zzbdc.zznF;
            t tVar = t.f12227d;
            if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                nVar.f11579e.zzb(zzffm.zzc(), zzcgzVarZza.zzi());
                nVar.f11579e.zzc();
            }
            nVar.f11582h.zzu(context, aVarZzc);
            nVar.j.zzi(context);
            nVar.f11577c.C(context);
            nVar.f11577c.B(context);
            uk.c.i0(context);
            nVar.f11581g.zzd(context);
            nVar.A.a(context);
            ((g0) ((zzcij) zzcgzVarZza).zzaj.zzb()).a();
            zzbyn.zzb(context);
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzgq)).booleanValue()) {
                if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzaK)).booleanValue()) {
                    new zzebf(context, aVarZzc, new zzbca(new zzbcg(context)), new zzeak(new zzeag(context), (zzgdm) ((zzcij) zzcgzVarZza).zzd.zzb())).zzb(((o0) nVar.f11582h.zzi()).k());
                }
            }
            zza = zzcgzVarZza;
            return zzcgzVarZza;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static zzcgz zza(Context context, zzbpo zzbpoVar, int i10) {
        return zzE(context, zzbpoVar, ModuleDescriptor.MODULE_VERSION, false, i10, new zzcif());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzbzf zzC();

    @Override // com.google.android.gms.internal.ads.zzcky
    public final zzbzf zzD() {
        return zzC();
    }

    public abstract zzcjz zzb();

    public abstract zzcoa zzc();

    public abstract zzcpr zzd();

    public abstract zzcyo zze();

    public abstract zzdfx zzf();

    public abstract zzdgt zzg();

    public abstract zzdok zzh();

    public abstract zzdsc zzi();

    public abstract zzdtm zzj();

    public abstract zzdvb zzk();

    public abstract zzdvy zzl();

    public abstract zzecd zzm();

    public abstract l0 zzn();

    public abstract xc.b zzo();

    public abstract l zzp();

    @Override // com.google.android.gms.internal.ads.zzcky
    public final zzeux zzq(zzbvo zzbvoVar, int i10) {
        return zzr(new zzewa(zzbvoVar, i10));
    }

    public abstract zzeux zzr(zzewa zzewaVar);

    public abstract zzewt zzs();

    public abstract zzeyh zzt();

    public abstract zzezy zzu();

    public abstract zzfbm zzv();

    public abstract zzfdd zzw();

    public abstract zzfdn zzx();

    public abstract zzfhp zzy();

    public abstract zzfkb zzz();
}
