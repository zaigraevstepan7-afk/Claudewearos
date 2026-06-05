package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbqo implements tc.c {
    final /* synthetic */ zzbpu zza;
    final /* synthetic */ zzbqp zzb;

    public zzbqo(zzbqp zzbqpVar, zzbpu zzbpuVar) {
        this.zza = zzbpuVar;
        this.zzb = zzbqpVar;
    }

    @Override // tc.c
    public final void onFailure(fc.a aVar) {
        try {
            String canonicalName = this.zzb.zza.getClass().getCanonicalName();
            int i10 = aVar.f6680a;
            int i11 = aVar.f6680a;
            String str = aVar.f6681b;
            k.b(canonicalName + "failed to load mediation ad: ErrorCode = " + i10 + ". ErrorMessage = " + str + ". ErrorDomain = " + aVar.f6682c);
            zzbpu zzbpuVar = this.zza;
            zzbpuVar.zzh(aVar.a());
            zzbpuVar.zzi(i11, str);
            zzbpuVar.zzg(i11);
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }

    public final /* synthetic */ Object onSuccess(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
        try {
            this.zzb.getClass();
            this.zza.zzo();
        } catch (RemoteException e10) {
            k.e("", e10);
        }
        return new zzbqf(this.zza);
    }

    public final void onFailure(String str) {
        try {
            k.b(this.zzb.zza.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
            zzbpu zzbpuVar = this.zza;
            zzbpuVar.zzi(0, str);
            zzbpuVar.zzg(0);
        } catch (RemoteException e10) {
            k.e("", e10);
        }
    }
}
