package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;
import nc.j3;
import nc.s0;
import nc.t;
import nc.u0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfkw {
    private final Context zza;
    private final rc.a zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private zzbpo zze;
    private final ud.a zzf;

    public zzfkw(Context context, rc.a aVar, ScheduledExecutorService scheduledExecutorService, ud.a aVar2) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = scheduledExecutorService;
        this.zzf = aVar2;
    }

    private static zzfjy zzd() {
        zzbct zzbctVar = zzbdc.zzz;
        t tVar = t.f12227d;
        return new zzfjy(((Long) tVar.f12230c.zzb(zzbctVar)).longValue(), 2.0d, ((Long) tVar.f12230c.zzb(zzbdc.zzA)).longValue(), 0.2d);
    }

    public final zzfkv zza(j3 j3Var, s0 s0Var) {
        fc.b bVarA = fc.b.a(j3Var.f12130b);
        if (bVarA == null) {
            return null;
        }
        int iOrdinal = bVarA.ordinal();
        if (iOrdinal == 1) {
            return new zzfka(this.zzd, this.zza, this.zzb.f14323c, this.zze, j3Var, s0Var, this.zzc, zzd(), this.zzf);
        }
        if (iOrdinal == 2) {
            return new zzfkz(this.zzd, this.zza, this.zzb.f14323c, this.zze, j3Var, s0Var, this.zzc, zzd(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new zzfjx(this.zzd, this.zza, this.zzb.f14323c, this.zze, j3Var, s0Var, this.zzc, zzd(), this.zzf);
    }

    public final zzfkv zzb(String str, j3 j3Var, u0 u0Var) {
        fc.b bVarA = fc.b.a(j3Var.f12130b);
        if (bVarA == null) {
            return null;
        }
        int iOrdinal = bVarA.ordinal();
        if (iOrdinal == 1) {
            return new zzfka(str, this.zzd, this.zza, this.zzb.f14323c, this.zze, j3Var, u0Var, this.zzc, zzd(), this.zzf);
        }
        if (iOrdinal == 2) {
            return new zzfkz(str, this.zzd, this.zza, this.zzb.f14323c, this.zze, j3Var, u0Var, this.zzc, zzd(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        return new zzfjx(str, this.zzd, this.zza, this.zzb.f14323c, this.zze, j3Var, u0Var, this.zzc, zzd(), this.zzf);
    }

    public final void zzc(zzbpo zzbpoVar) {
        this.zze = zzbpoVar;
    }
}
