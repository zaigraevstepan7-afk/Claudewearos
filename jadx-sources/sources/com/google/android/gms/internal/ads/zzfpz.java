package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzfpz {
    final zzfqc zza;
    final boolean zzb;

    private zzfpz(zzfqc zzfqcVar) {
        this.zza = zzfqcVar;
        this.zzb = zzfqcVar != null;
    }

    public static zzfpz zzb(Context context, String str, String str2) throws zzfpb {
        zzfqc zzfqaVar;
        try {
            try {
                try {
                    IBinder iBinderB = yd.e.c(context, yd.e.f20281b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderB == null) {
                        zzfqaVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfqaVar = iInterfaceQueryLocalInterface instanceof zzfqc ? (zzfqc) iInterfaceQueryLocalInterface : new zzfqa(iBinderB);
                    }
                    zzfqaVar.zze(new xd.b(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfpz(zzfqaVar);
                } catch (Exception e10) {
                    throw new zzfpb(e10);
                }
            } catch (RemoteException | zzfpb | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfpz(new zzfqd());
            }
        } catch (Exception e11) {
            throw new zzfpb(e11);
        }
    }

    public static zzfpz zzc() {
        zzfqd zzfqdVar = new zzfqd();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfpz(zzfqdVar);
    }

    public final zzfpx zza(byte[] bArr) {
        return new zzfpx(this, bArr, null);
    }
}
