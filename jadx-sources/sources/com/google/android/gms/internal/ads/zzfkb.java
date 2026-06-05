package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import java.util.Map;
import nc.j3;
import nc.m0;
import nc.s0;
import nc.u0;
import nc.w0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfkb extends w0 {
    private final zzfkh zza;
    private final zzfju zzb;

    public zzfkb(zzfkh zzfkhVar, zzfju zzfjuVar) {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
        this.zza = zzfkhVar;
        this.zzb = zzfjuVar;
    }

    @Override // nc.x0
    public final int zze(int i10, String str) {
        fc.b bVarA = fc.b.a(i10);
        if (bVarA == null) {
            return 0;
        }
        return this.zzb.zza(bVarA, str);
    }

    @Override // nc.x0
    public final Bundle zzf(int i10) {
        Map mapZzf = this.zzb.zzf(i10);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapZzf.entrySet()) {
            String str = (String) entry.getKey();
            j3 j3Var = (j3) entry.getValue();
            Parcel parcelObtain = Parcel.obtain();
            j3Var.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            bundle.putByteArray(str, bArrMarshall);
        }
        return bundle;
    }

    @Override // nc.x0
    public final zzbau zzg(String str) {
        return this.zzb.zzb(str);
    }

    @Override // nc.x0
    public final zzbau zzh(String str) {
        return this.zza.zza(str);
    }

    @Override // nc.x0
    public final m0 zzi(String str) {
        return this.zzb.zzc(str);
    }

    @Override // nc.x0
    public final m0 zzj(String str) {
        return this.zza.zzb(str);
    }

    @Override // nc.x0
    public final j3 zzk(int i10, String str) {
        fc.b bVarA = fc.b.a(i10);
        if (bVarA == null) {
            return null;
        }
        return this.zzb.zzd(bVarA, str);
    }

    @Override // nc.x0
    public final zzbwt zzl(String str) {
        return this.zzb.zze(str);
    }

    @Override // nc.x0
    public final zzbwt zzm(String str) {
        return this.zza.zzc(str);
    }

    @Override // nc.x0
    public final void zzn(int i10) {
        this.zzb.zzg(i10);
    }

    @Override // nc.x0
    public final void zzo(zzbpo zzbpoVar) {
        zzfkh zzfkhVar = this.zza;
        zzfkhVar.zzg(zzbpoVar);
        zzfkhVar.zzi();
    }

    @Override // nc.x0
    public final void zzp(List list, s0 s0Var) {
        this.zza.zzh(list, s0Var);
    }

    @Override // nc.x0
    public final boolean zzq(int i10, String str) {
        fc.b bVarA = fc.b.a(i10);
        if (bVarA == null) {
            return false;
        }
        return this.zzb.zzh(bVarA, str);
    }

    @Override // nc.x0
    public final boolean zzr(int i10, String str) {
        fc.b bVarA = fc.b.a(i10);
        if (bVarA == null) {
            return false;
        }
        return this.zzb.zzi(bVarA, str);
    }

    @Override // nc.x0
    public final boolean zzs(String str) {
        return this.zza.zzj(str);
    }

    @Override // nc.x0
    public final boolean zzt(String str) {
        return this.zza.zzk(str);
    }

    @Override // nc.x0
    public final boolean zzu(String str) {
        return this.zza.zzl(str);
    }

    @Override // nc.x0
    public final boolean zzv(String str, j3 j3Var, u0 u0Var) {
        return this.zzb.zzj(str, j3Var, u0Var);
    }
}
