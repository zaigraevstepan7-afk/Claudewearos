package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends zzb {

    /* renamed from: a, reason: collision with root package name */
    public f f3633a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3634b;

    public g0(f fVar, int i10) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f3633a = fVar;
        this.f3634b = i10;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        int i12 = this.f3634b;
        if (i10 == 1) {
            int i13 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            e0.j(this.f3633a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f3633a.onPostInitHandler(i13, strongBinder, bundle, i12);
            this.f3633a = null;
        } else if (i10 == 2) {
            parcel.readInt();
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            k0 k0Var = (k0) zzc.zza(parcel, k0.CREATOR);
            zzc.zzb(parcel);
            f fVar = this.f3633a;
            e0.j(fVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            e0.i(k0Var);
            f.zzj(fVar, k0Var);
            Bundle bundle2 = k0Var.f3663a;
            e0.j(this.f3633a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f3633a.onPostInitHandler(i14, strongBinder2, bundle2, i12);
            this.f3633a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
